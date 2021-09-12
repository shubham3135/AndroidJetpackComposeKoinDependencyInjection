package com.shubhamkumarwinner.composekoindi.view_model

import androidx.lifecycle.ViewModel

class MainViewModel(private val test: Test): ViewModel() {
    fun getViewModelTest(){
        test.getTest()
    }
}