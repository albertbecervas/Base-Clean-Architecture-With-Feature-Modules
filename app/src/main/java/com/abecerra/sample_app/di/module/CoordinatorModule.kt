package com.abecerra.sample_app.di.module

import android.content.Context
import com.abecerra.sample_app.navigation.coordinator.Coordinator
import com.abecerra.sample_app.navigation.coordinator.CoordinatorImpl
import dagger.Module
import dagger.Provides
import java.lang.ref.WeakReference

@Module
class CoordinatorModule {

    @Provides
    fun provideCoordinator(context: Context?): Coordinator {
        return CoordinatorImpl(WeakReference(context))
    }
}