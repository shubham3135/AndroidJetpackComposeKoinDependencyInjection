package com.shubhamkumarwinner.composekoindi.container

import com.shubhamkumarwinner.composekoindi.demo.Car
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class Component: KoinComponent {
    val car: Car by inject()
}