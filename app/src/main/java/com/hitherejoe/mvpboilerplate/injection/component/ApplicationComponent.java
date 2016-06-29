package com.hitherejoe.mvpboilerplate.injection.component;

import android.app.Application;
import android.content.Context;

import com.hitherejoe.mvpboilerplate.data.DataManager;
import com.hitherejoe.mvpboilerplate.data.remote.MvpBoilerplateService;
import com.hitherejoe.mvpboilerplate.injection.ApplicationContext;
import com.hitherejoe.mvpboilerplate.injection.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    @ApplicationContext
    Context context();
    Application application();
    DataManager dataManager();
    MvpBoilerplateService mvpBoilerplateService();
}
