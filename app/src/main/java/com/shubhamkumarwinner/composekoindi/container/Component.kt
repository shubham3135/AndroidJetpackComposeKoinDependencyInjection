package com.shubhamkumarwinner.composekoindi.container

import com.shubhamkumarwinner.composekoindi.demo.Car
import com.shubhamkumarwinner.composekoindi.interfaces.DemoOneImpl
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class Component: KoinComponent {
    val car: Car by inject()
    val demoOneImpl: DemoOneImpl by inject()
}