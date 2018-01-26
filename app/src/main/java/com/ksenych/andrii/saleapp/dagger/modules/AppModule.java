package com.ksenych.andrii.saleapp.dagger.modules;

import android.content.Context;

import com.ksenych.andrii.saleapp.api.ApiProvider;
import com.ksenych.andrii.saleapp.api.RetrofitApiProvider;
import com.ksenych.andrii.saleapp.app.App;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Andriy Ksenych on 12.07.2017.
 */

@Module
public class AppModule {

    private App mApplication;

    public AppModule(App app) {
        mApplication = app;
    }

    @Provides
    public Context getContext() {
        return mApplication.getApplicationContext();
    }

    @Provides
    @Singleton
    public ApiProvider getApiProvider() {
        return new RetrofitApiProvider();
    }

}