package tmgg.me.mygittest;

import android.app.Application;

/**
 * @author sunwei
 *         邮箱：tianmu19@gmail.com
 *         时间：2018/12/21 12:24
 *         包名：tmgg.me.mygittest
 *         <p>description:            </p>
 */

public class MyApp extends Application {
    private static MyApp mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        OkGoConfig.init(this);
    }
    public static MyApp getInstance() {
        return mInstance;
    }


}
