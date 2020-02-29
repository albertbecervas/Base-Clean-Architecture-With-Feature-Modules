package com.abecerra.core.di.module.presentation

import android.content.Context
import com.abecerra.base.PresenterConfigurator
import com.abecerra.feature_sample.SampleFragment
import com.abecerra.feature_sample.SamplePresenter
import dagger.Module
import dagger.Provides

@Module
class ViewModule(private val context: Context) {

    @Provides
    fun provideContext(): Context {
        return context
    }

    @Provides
    fun provideLoginFragment(samplePresenter: SamplePresenter): SampleFragment {
        return SampleFragment(object : PresenterConfigurator<SamplePresenter> {
            override fun getPresenter(): SamplePresenter? = samplePresenter
        })
    }
}