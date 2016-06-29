package com.hitherejoe.mvpboilerplate.injection.component;

import com.hitherejoe.mvpboilerplate.injection.PerActivity;
import com.hitherejoe.mvpboilerplate.injection.module.ActivityModule;
import com.hitherejoe.mvpboilerplate.ui.base.BaseActivity;
import com.hitherejoe.mvpboilerplate.ui.detail.DetailActivity;
import com.hitherejoe.mvpboilerplate.ui.main.MainActivity;

import dagger.Subcomponent;

@PerActivity
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(BaseActivity baseActivity);
    void inject(MainActivity mainActivity);
    void inject(DetailActivity detailActivity);
}
