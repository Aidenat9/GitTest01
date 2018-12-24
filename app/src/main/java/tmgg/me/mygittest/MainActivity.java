package tmgg.me.mygittest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import tmgg.me.mygittest.flatbuffer.FlatBufferDemoActivity;
import tmgg.me.mygittest.rx.RxDemoActivity;
import tmgg.me.mygittest.testLibrary.BigImageActivity;


public class MainActivity extends AppCompatActivity {

    private MainActivity mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        findViewById(R.id.btn_bigImg).setOnClickListener(v->{
            startActivity(new Intent(getBaseContext(), BigImageActivity.class));
        });
        findViewById(R.id.btn_flatbuffer).setOnClickListener(v->{
            startActivity(new Intent(getBaseContext(), FlatBufferDemoActivity.class));
        });
        findViewById(R.id.btn_rebound).setOnClickListener(v->{
            startActivity(new Intent(getBaseContext(),ReboundActivity.class));
        });
    }

    public void RxClick(View view) {
        startActivity(new Intent(mContext, RxDemoActivity.class));
    }
}
