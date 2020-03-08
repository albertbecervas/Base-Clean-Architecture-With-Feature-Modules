package com.abecerra.sample_app.di.module.presentation

import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class ViewModule(private val context: Context?) {

    @Provides
    fun provideContext(): Context? = context
}