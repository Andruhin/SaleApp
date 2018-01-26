package com.ksenych.andrii.saleapp.app;

import android.app.Application;

import com.ksenych.andrii.saleapp.dagger.components.AppComponent;
import com.ksenych.andrii.saleapp.dagger.components.DaggerAppComponent;
import com.ksenych.andrii.saleapp.dagger.modules.AppModule;

/**
 * Created by Andrii on 26.01.2018.
 */

public class App extends Application {
    private static App sInstance;
    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;

        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public static App getInstance(){
        return sInstance;
    }

    public AppComponent getAppComponent(){
        return mAppComponent;
    }
}
