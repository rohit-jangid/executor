package com.rohfl.executor.Module;

import com.rohfl.executor.impl.FetchHelloWorldImpl;
import com.rohfl.executor.impl.Presenter;
import com.rohfl.executor.interfaces.FetchHelloWorld;
import com.rohfl.executor.interfaces.PresenterView;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;

@Module
@InstallIn(ActivityComponent.class)
public abstract class ActivityModule {

    @Binds
    public abstract FetchHelloWorld getFetchHelloWorld(FetchHelloWorldImpl fetchHelloWorld);

    @Binds
    public abstract PresenterView.Presenter getPresenter(Presenter presenter);

}
