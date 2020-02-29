package com.abecerra.feature_sample


import android.os.Bundle
import android.view.View
import com.abecerra.base.PresenterConfigurator
import com.abecerra.base.presentation.BasePresenterFragment

class SampleFragment(presenterConfigurator: PresenterConfigurator<SamplePresenter>) :
    BasePresenterFragment<SamplePresenter>(presenterConfigurator), SampleView {

    override fun getLayout(): Int = R.layout.fragment_sample

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getPresenter()?.setView(this)
    }
}
