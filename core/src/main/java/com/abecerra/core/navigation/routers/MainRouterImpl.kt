package com.abecerra.core.navigation.routers

import com.abecerra.core.navigation.navigator.Navigator
import com.abecerra.core.scenes.main.presentation.router.MainRouter
import com.abecerra.feature_sample.SampleFragment
import javax.inject.Inject

class MainRouterImpl @Inject constructor(
    private val sampleFragment: SampleFragment, private val navigator: Navigator
) : MainRouter {
    override fun loadDefaultFragment(layout: Int) {
        navigator.replaceFragment(sampleFragment, layout)
    }
}