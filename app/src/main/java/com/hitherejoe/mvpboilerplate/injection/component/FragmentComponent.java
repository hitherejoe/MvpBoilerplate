package com.hitherejoe.mvpboilerplate.injection.component;

import com.hitherejoe.mvpboilerplate.injection.PerFragment;
import com.hitherejoe.mvpboilerplate.injection.module.FragmentModule;

import dagger.Subcomponent;

/**
 * This component inject dependencies to all Fragments across the application
 */
@PerFragment
@Subcomponent(modules = FragmentModule.class)
public interface FragmentComponent {

}