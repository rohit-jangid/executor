package com.rohfl.executor.interfaces;

public interface FetchHelloWorld {

    interface HelloWorldCallBack {
        void gotHelloWorld();
    }

    void fetchHelloWorld(HelloWorldCallBack helloWorldCallBack);

}
