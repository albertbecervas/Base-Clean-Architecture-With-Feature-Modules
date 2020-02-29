package com.abecerra.core.di.module.presentation

import com.abecerra.core.scenes.main.domain.MainInteractor
import com.abecerra.core.scenes.main.presentation.presenter.MainPresenter
import com.abecerra.core.scenes.main.presentation.presenter.MainPresenterImpl
import com.abecerra.core.scenes.main.presentation.router.MainRouter
import com.abecerra.feature_sample.SamplePresenter
import com.abecerra.feature_sample.SamplePresenterImpl
import dagger.Module
import dagger.Provides

@Module
class PresenterModule {

    @Provides
    fun provideMainPresenter(router: MainRouter, interactor: MainInteractor): MainPresenter {
        return MainPresenterImpl(
            router,
            interactor
        )
    }

    @Provides
    fun provideSamplePresenter(): SamplePresenter {
        return SamplePresenterImpl()
    }
}