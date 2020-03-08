package com.abecerra.sample_app.navigation.coordinator

import androidx.fragment.app.Fragment

interface Coordinator {

    fun replaceFragment(fragment: Fragment, layout: Int)
}