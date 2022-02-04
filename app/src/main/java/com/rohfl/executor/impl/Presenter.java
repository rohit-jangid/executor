package com.rohfl.executor.impl;

import com.rohfl.executor.interfaces.FetchHelloWorld;
import com.rohfl.executor.interfaces.PresenterView;

import javax.inject.Inject;

public class Presenter implements PresenterView.Presenter{

    FetchHelloWorld fetchHelloWorld;

    FetchHelloWorld.HelloWorldCallBack helloWorldCallBack;

    PresenterView.View view;

    @Inject
    public Presenter(FetchHelloWorld fetchHelloWorld) {
        this.fetchHelloWorld = fetchHelloWorld;
    }

    @Override
    public void takeView(PresenterView.View view) {
        this.view = view;
    }

    @Override
    public void fetchHelloWorld() {
        fetchHelloWorld.fetchHelloWorld(() -> {
            view.showToast("Hello World");
        });
    }

    @Override
    public void dropView() {
        this.view = null;
    }
}
