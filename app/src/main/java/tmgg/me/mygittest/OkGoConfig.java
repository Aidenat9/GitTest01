package tmgg.me.mygittest;

import android.content.Context;

import com.lzy.okgo.OkGo;
import com.lzy.okgo.cache.CacheEntity;
import com.lzy.okgo.https.HttpsUtils;
import com.lzy.okgo.interceptor.HttpLoggingInterceptor;
import com.lzy.okgo.model.Response;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import okhttp3.OkHttpClient;

/**
 * @author sunwei
 *         邮箱：tianmu19@gmail.com
 *         时间：2018/5/31 15:23
 *         包名：com.youtoo.publics.okgoconfig
 *         <p>description:            </p>
 */

public class OkGoConfig {
    private OkGoConfig() {
        throw new UnsupportedOperationException("不能初始化私有方法");
    }

    public static void init(Context context) {
        //1.构建OkHttpClient.Builder
        OkHttpClient.Builder builder = new OkHttpClient.Builder();

        //2.构建log
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor("OkGo");
        //log打印级别，决定了log显示的详细程度
        loggingInterceptor.setPrintLevel(HttpLoggingInterceptor.Level.BODY);
        //log颜色级别，决定了log在控制台显示的颜色
        loggingInterceptor.setColorLevel(Level.INFO);
        builder.addInterceptor(loggingInterceptor);
        //3.配置超时时间
        //全局的读取超时时间
        builder.readTimeout(33000, TimeUnit.MILLISECONDS);
        //全局的写入超时时间
        builder.writeTimeout(33000, TimeUnit.MILLISECONDS);
        //全局的连接超时时间
        builder.connectTimeout(33000, TimeUnit.MILLISECONDS);

        //4.配置Cookie
        //使用sp保持cookie，如果cookie不过期，则一直有效
//        builder.cookieJar(new CookieJarImpl(new SPCookieStore(this)));
        //5. Https配置
        //方法三：使用预埋证书，校验服务端证书（自签名证书）
        try {
            HttpsUtils.SSLParams sslParams1 = HttpsUtils.getSslSocketFactory(context.getAssets().open("youtoo365.com.crt"));
            builder.sslSocketFactory(sslParams1.sSLSocketFactory, sslParams1.trustManager);

        } catch (IOException e) {
            e.printStackTrace();
        }
        //6.配置OkGo
        OkGo.getInstance().init(MyApp.getInstance())                       //必须调用初始化
                .setOkHttpClient(builder.build())               //建议设置OkHttpClient，不设置将使用默认的
                .setCacheTime(CacheEntity.CACHE_NEVER_EXPIRE)   //全局统一缓存时间，默认永不过期，可以不传
                .setRetryCount(1)                               //全局统一超时重连次数，默认为三次，那么最差的情况会请求4次(一次原始请求，三次重连请求)，不需要可以设置为0
        ;                       //全局公共参数

    }

    public static void onErrorTips(Response response){

    }

}
