package com.abecerra.sample_app.scenes.main.view

import android.os.Bundle
import com.abecerra.base.presentation.BaseActivity
import com.abecerra.sample_app.R
import com.abecerra.sample_app.di.component.DaggerViewComponent
import com.abecerra.sample_app.scenes.main.presenter.MainPresenter
import javax.inject.Inject

class MainActivity : BaseActivity(), MainView {

    @Inject
    lateinit var presenter: MainPresenter

    override fun getLayout(): Int = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DaggerViewComponent.builder().build().inject(this)

        presenter.setView(this)
    }
}
