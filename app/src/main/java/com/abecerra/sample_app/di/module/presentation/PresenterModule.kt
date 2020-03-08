package com.abecerra.sample_app.di.module.presentation

import com.abecerra.sample_app.scenes.main.presenter.MainPresenter
import com.abecerra.sample_app.scenes.main.presenter.MainPresenterImpl
import dagger.Module
import dagger.Provides

@Module
open class PresenterModule {

    @Provides
    fun provideMainPresenter(): MainPresenter {
        return MainPresenterImpl()
    }
}