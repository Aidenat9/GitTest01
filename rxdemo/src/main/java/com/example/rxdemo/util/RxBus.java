package com.example.rxdemo.util;

import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.Subject;

public class RxBus {

    private static volatile RxBus mInstance;
    private final Subject<Object> bus;
    public RxBus() {
        bus = PublishSubject.create().toSerialized();

    }
    // 单例RxBus
    public static RxBus getDefault() {
        if (mInstance == null) {
            synchronized (RxBus.class) {
                if (mInstance == null) {
                    mInstance = new RxBus();
                }
            }
        }
        return mInstance;
    }
    // 发送事件
    public void post(Object o) {
        bus.onNext(o);
    }
    public <T> Observable<T> toObservable(Class<T> eventType) {
        return bus.ofType(eventType);
    }
}