package tmgg.me.mygittest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import tmgg.me.mygittest.rx.RxDemoActivity;


public class MainActivity extends AppCompatActivity {

    private MainActivity mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
    }

    public void RxClick(View view) {
        startActivity(new Intent(mContext, RxDemoActivity.class));
    }
}
