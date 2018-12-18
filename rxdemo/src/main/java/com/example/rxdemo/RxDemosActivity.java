package com.example.rxdemo;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.jakewharton.rxbinding.view.RxView;
import com.jakewharton.rxbinding.widget.RxTextView;

import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func2;


public class RxDemosActivity extends AppCompatActivity {

    private static final String TAG = "tag";
    private static int SECONDS = 20;
    EditText mEtPhone;
    EditText mEtPassword;
    Button mBtLogin;
    private AppCompatButton mBtnThrottle;
    private Observable<Void> verifyCodeObservable;
    private Button mBtnLifecycle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rx_demos);
        mBtnThrottle = findViewById(R.id.btn_thorttleFirst);
        initView();
        initListen();
    }

    private void initView() {
        mEtPhone = findViewById(R.id.et_phone);
        mEtPassword = findViewById(R.id.et_password);
        mBtLogin = findViewById(R.id.bt_login);
        mBtnLifecycle = findViewById(R.id.btn_lifecycle);
    }

    private void initListen() {
        RxView.clicks(findViewById(R.id.btn_lifecycle)).throttleFirst(800, TimeUnit.MILLISECONDS)
                .subscribe(new Action1<Void>() {
                    @Override
                    public void call(Void aVoid) {
                        startActivity(new Intent(getBaseContext(), LifeCycleDemoActivity.class));
                    }
                });
        RxView.clicks(findViewById(R.id.btn_navigation)).subscribe(new Action1<Void>() {
            @Override
            public void call(Void aVoid) {
                startActivity(new Intent(getBaseContext(),NaviDemoActivity.class));
            }
        });

        // TODO: 2018/12/17 防止多次点击 2s.
//        RxView.clicks(mBtnThrottle).throttleFirst(2, TimeUnit.SECONDS)
//                .subscribe(new Action1<Void>() {
//                    @Override
//                    public void call(Void aVoid) {
//                        Log.e(TAG, "call: btn_thorttleFirst" );
//                    }
//                });
        // TODO: 2018/12/17 点击的多次监听
//        Observable<Void> share = RxView.clicks(mBtnThrottle).share();
//        Subscription subscribe1 = share.subscribe(new Action1<Void>() {
//            @Override
//            public void call(Void aVoid) {
//                Log.e(TAG, "call: first click...");
//            }
//        });
//        Subscription subscribe2 = share.subscribe(new Action1<Void>() {
//            @Override
//            public void call(Void aVoid) {
//                Log.e(TAG, "call: second click...");
//            }
//        });
//        CompositeSubscription compositeSubscription = new CompositeSubscription();
//        compositeSubscription.add(subscribe1);
//        compositeSubscription.add(subscribe2);
        // TODO: 2018/12/17 验证码倒计时
//        verifyCodeObservable = RxView.clicks(mBtnThrottle).throttleFirst(SECONDS,TimeUnit.SECONDS)
//                .subscribeOn(AndroidSchedulers.mainThread())
//                .doOnNext(new Action1<Void>() {
//                    @Override
//                    public void call(Void aVoid) {
//                        RxView.enabled(mBtnThrottle).call(false);
//                    }
//                });
//        verifyCodeObservable.subscribe(new Action1<Void>() {
//            @Override
//            public void call(Void aVoid) {
//                Observable.interval(1,TimeUnit.SECONDS,AndroidSchedulers.mainThread())
//                        .take(SECONDS)
//                        .subscribe(new Observer<Long>() {
//                            @Override
//                            public void onCompleted() {
//                                RxTextView.text(mBtnThrottle).call("获取验证码");
//                                RxView.enabled(mBtnThrottle).call(true);
//                            }
//
//                            @Override
//                            public void onError(Throwable e) {
//
//                            }
//
//                            @Override
//                            public void onNext(Long aLong) {
//                                RxTextView.text(mBtnThrottle).call("剩余" + (SECONDS - aLong) + "秒");
//                            }
//                        });
//            }
//        });
        // TODO: 2018/12/17 登录验证
        Observable<CharSequence> phoneChange = RxTextView.textChanges(mEtPhone);
        Observable<CharSequence> pwdChange = RxTextView.textChanges(mEtPassword);
        Observable.combineLatest(phoneChange, pwdChange, new Func2<CharSequence, CharSequence, Boolean>() {

            @Override
            public Boolean call(CharSequence s, CharSequence s2) {

                return s.length() == 11 && s2.length() >= 6;
            }
        }).subscribe(new Action1<Boolean>() {
            @Override
            public void call(Boolean b) {
                RxView.enabled(mBtLogin).call(b);
            }
        });
        RxView.clicks(mBtLogin).throttleFirst(1, TimeUnit.SECONDS)
                .subscribe(new Action1<Void>() {
                    @Override
                    public void call(Void aVoid) {
                        Toast.makeText(getBaseContext(), "登录成功！", Toast.LENGTH_SHORT).show();
                    }
                });
        getLifecycle().addObserver(new LifecycleObserver() {
            @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
            public void onCreate() {
                Log.e(TAG, "onCreate: ");
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
            void onPause() {
                Log.e(TAG, "onPause: ");
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            void onDestroy() {
                Log.e(TAG, "onDestroy: ");
            }
        });
    }


    @Override
    protected void onDestroy() {
        verifyCodeObservable.unsubscribeOn(AndroidSchedulers.mainThread());

        super.onDestroy();
    }
}
















