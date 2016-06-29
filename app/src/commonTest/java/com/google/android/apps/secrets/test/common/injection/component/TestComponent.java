package com.google.android.apps.secrets.test.common.injection.component;

import com.google.android.apps.secrets.test.common.injection.module.ApplicationTestModule;
import com.hitherejoe.mvpboilerplate.injection.component.ApplicationComponent;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationTestModule.class)
public interface TestComponent extends ApplicationComponent {

}