package com.rohfl.executor.interfaces;

public interface PresenterView {

    interface View {
        void showToast(String s);
    }

    interface Presenter {
        void fetchHelloWorld();
        void takeView(PresenterView.View view);
        void dropView();
    }

}
