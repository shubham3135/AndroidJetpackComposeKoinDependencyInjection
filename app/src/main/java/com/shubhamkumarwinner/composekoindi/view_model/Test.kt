package com.shubhamkumarwinner.composekoindi.view_model

import android.util.Log

interface Test{
    fun getTest()
}

class TestImpl: Test{
    override fun getTest() {
        Log.d("TAG", "Hey ViewModel...")
    }
}