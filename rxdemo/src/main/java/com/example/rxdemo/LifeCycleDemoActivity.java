package com.example.rxdemo;

import android.content.Intent;
import android.os.Bundle;

import com.example.rxdemo.util.RxBus;
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;


public class LifeCycleDemoActivity extends RxAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle_demo);
        initListen();
    }

    private void initListen() {
        Event event = new Event();
        event.setMsg("tonavigation`11111111111111111");
        RxBus.getDefault().post(event);
        findViewById(R.id.btn_navi).setOnClickListener(v->{
            startActivity(new Intent(getBaseContext(),NaviDemoActivity.class));
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        // 每隔1s执行一次事件
        Observable.interval(1, TimeUnit.SECONDS)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .compose(this.<Long>bindToLifecycle())
//                .compose(this.bindUntilEvent(ActivityEvent.DESTROY))
                .subscribe();

    }
}
