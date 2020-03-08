package com.abecerra.sample_app.di.module.presentation

import com.abecerra.sample_app.navigation.coordinator.Coordinator
import com.abecerra.sample_app.navigation.routers.MainRouterImpl
import com.abecerra.sample_app.scenes.main.router.MainRouter
import dagger.Module
import dagger.Provides

@Module
open class RouterModule {

    @Provides
    open fun provideMainRouter(coordinator: Coordinator): MainRouter {
        return MainRouterImpl(coordinator)
    }
}