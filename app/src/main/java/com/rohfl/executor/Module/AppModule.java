package com.rohfl.executor.Module;

import com.rohfl.executor.impl.ExecutorImpl;
import com.rohfl.executor.impl.MainThreadImpl;
import com.rohfl.executor.interfaces.Executor;
import com.rohfl.executor.interfaces.MainThread;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public abstract class AppModule {

    @Binds
    @Singleton
    abstract Executor getExecutor(ExecutorImpl executor);

    @Binds
    @Singleton
    abstract MainThread getMainThread(MainThreadImpl mainThread);

}
