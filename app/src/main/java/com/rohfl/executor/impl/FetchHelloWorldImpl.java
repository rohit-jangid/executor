package com.rohfl.executor.impl;

import android.os.Handler;

import com.rohfl.executor.interfaces.Executor;
import com.rohfl.executor.interfaces.FetchHelloWorld;
import com.rohfl.executor.interfaces.Interactor;
import com.rohfl.executor.interfaces.MainThread;

import javax.inject.Inject;

public class FetchHelloWorldImpl implements FetchHelloWorld, Interactor {

    Executor executor;
    MainThread mainThread;
    HelloWorldCallBack helloWorldCallBack;

    @Inject
    public FetchHelloWorldImpl(Executor executor, MainThread mainThread) {
        this.executor = executor;
        this.mainThread = mainThread;
    }

    @Override
    public void fetchHelloWorld(HelloWorldCallBack helloWorldCallBack) {
        this.helloWorldCallBack = helloWorldCallBack;
        executor.run(this);
    }

    @Override
    public void run() {
//        new Handler().postDelayed(() -> {
            mainThread.post(() -> helloWorldCallBack.gotHelloWorld());
//        }, 2000);
    }
}
