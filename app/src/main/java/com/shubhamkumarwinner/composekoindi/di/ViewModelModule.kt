package com.shubhamkumarwinner.composekoindi.di

import com.shubhamkumarwinner.composekoindi.view_model.MainViewModel
import com.shubhamkumarwinner.composekoindi.view_model.Test
import com.shubhamkumarwinner.composekoindi.view_model.TestImpl
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.bind
import org.koin.dsl.module

val viewModelModule = module {
    single { TestImpl() } bind Test::class

    viewModel {MainViewModel(get())}
}