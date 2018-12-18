package com.example.rxdemo;

/**
 * @author sunwei
 *         邮箱：tianmu19@gmail.com
 *         时间：2018/12/18 15:44
 *         包名：com.example.rxdemo
 *         <p>description:            </p>
 */

public class Event {
    private String msg ;

    public String getMsg() {
        return msg == null ? "" : msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
