package com.abecerra.sample_app.navigation.routers

import com.abecerra.sample_app.navigation.coordinator.Coordinator
import com.abecerra.sample_app.scenes.main.router.MainRouter
import javax.inject.Inject

class MainRouterImpl @Inject constructor(private val coordinator: Coordinator) : MainRouter {
    override fun loadDefaultFragment(layout: Int) {
    }
}