package com.hitherejoe.mvpboilerplate.ui.detail;

import com.hitherejoe.mvpboilerplate.data.model.Pokemon;
import com.hitherejoe.mvpboilerplate.data.model.Statistic;
import com.hitherejoe.mvpboilerplate.ui.base.MvpView;

public interface DetailMvpView extends MvpView {

    void showPokemon(Pokemon pokemon);

    void showStat(Statistic statistic);

    void showProgress(boolean show);

    void showError();

}