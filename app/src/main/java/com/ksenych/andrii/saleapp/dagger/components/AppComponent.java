package com.ksenych.andrii.saleapp.dagger.components;

import android.content.Context;

import com.ksenych.andrii.saleapp.ui.activities.MainActivity;
import com.ksenych.andrii.saleapp.dagger.modules.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Andriy Ksenych on 12.07.2017.
 */
@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject(MainActivity activity);

    Context getContext();
}
