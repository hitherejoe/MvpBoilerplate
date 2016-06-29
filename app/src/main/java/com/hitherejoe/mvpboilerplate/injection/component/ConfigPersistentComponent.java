package com.hitherejoe.mvpboilerplate.injection.component;

import com.hitherejoe.mvpboilerplate.injection.ConfigPersistent;
import com.hitherejoe.mvpboilerplate.injection.module.ActivityModule;
import com.hitherejoe.mvpboilerplate.injection.module.FragmentModule;
import com.hitherejoe.mvpboilerplate.ui.base.BaseActivity;
import com.hitherejoe.mvpboilerplate.ui.base.BaseFragment;

import dagger.Component;

/**
 * A dagger component that will live during the lifecycle of an Activity or Fragment but it won't
 * be destroy during configuration changes. Check {@link BaseActivity} and {@link BaseFragment} to
 * see how this components survives configuration changes.
 * Use the {@link ConfigPersistent} scope to annotate dependencies that need to survive
 * configuration changes (for example Presenters).
 */
@ConfigPersistent
@Component(dependencies = ApplicationComponent.class)
public interface ConfigPersistentComponent {

    ActivityComponent activityComponent(ActivityModule activityModule);

    FragmentComponent fragmentComponent(FragmentModule fragmentModule);

}
