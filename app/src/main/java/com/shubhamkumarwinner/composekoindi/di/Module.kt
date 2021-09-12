package com.shubhamkumarwinner.composekoindi.di

import com.shubhamkumarwinner.composekoindi.demo.Car
import com.shubhamkumarwinner.composekoindi.demo.Engine
import com.shubhamkumarwinner.composekoindi.demo.Wheel
import org.koin.dsl.module

val demoModule = module {
    single { Engine() }
    single { Wheel() }
    single { Car(get(), get()) }
}