package com.shubhamkumarwinner.composekoindi

import android.app.Application
import com.shubhamkumarwinner.composekoindi.di.demoModule
import com.shubhamkumarwinner.composekoindi.di.interfaceModule
import com.shubhamkumarwinner.composekoindi.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class BaseApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(demoModule, interfaceModule, viewModelModule)
        }
    }
}