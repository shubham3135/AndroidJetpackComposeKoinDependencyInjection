package com.shubhamkumarwinner.composekoindi.di

import com.shubhamkumarwinner.composekoindi.interfaces.DemoImpl
import com.shubhamkumarwinner.composekoindi.interfaces.DemoOne
import com.shubhamkumarwinner.composekoindi.interfaces.DemoOneImpl
import com.shubhamkumarwinner.composekoindi.interfaces.DemoTwo
import org.koin.dsl.binds
import org.koin.dsl.module

val interfaceModule = module {
//    single <DemoOne>{ DemoImpl() }
    // injecting one interface
//    single{ DemoImpl() } bind DemoOne::class

    //injecting two interfaces
    single{ DemoImpl() } binds  arrayOf(DemoOne::class, DemoTwo::class)
    single { DemoOneImpl(get(), get()) }
}