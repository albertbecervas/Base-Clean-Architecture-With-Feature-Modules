package com.abecerra.sample_app.di.component

import com.abecerra.sample_app.di.module.CoordinatorModule
import com.abecerra.sample_app.di.module.NetworkModule
import com.abecerra.sample_app.di.module.data.RepositoryModule
import com.abecerra.sample_app.di.module.domain.InteractorModule
import com.abecerra.sample_app.di.module.presentation.PresenterModule
import com.abecerra.sample_app.di.module.presentation.RouterModule
import com.abecerra.sample_app.di.module.presentation.ViewModule
import com.abecerra.sample_app.scenes.main.view.MainActivity
import dagger.Component

@Component(
    modules = [ViewModule::class, PresenterModule::class, RouterModule::class,
        CoordinatorModule::class, InteractorModule::class, RepositoryModule::class,
        NetworkModule::class]
)
interface ViewComponent {

    fun inject(mainActivity: MainActivity)
}