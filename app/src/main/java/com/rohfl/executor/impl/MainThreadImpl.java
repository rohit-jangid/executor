package com.rohfl.executor.impl;

import android.os.Handler;
import android.os.Looper;

import com.rohfl.executor.interfaces.MainThread;

import javax.inject.Inject;

public class MainThreadImpl implements MainThread {

    private Handler handler;

    @Inject
    MainThreadImpl() {
        this.handler = new Handler(Looper.getMainLooper());
    }

    public void post(Runnable runnable) {
        handler.postDelayed(runnable, 2000);
    }

}