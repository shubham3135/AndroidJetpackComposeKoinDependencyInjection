package com.shubhamkumarwinner.composekoindi.interfaces

import android.util.Log

interface DemoOne{
    fun getDemoOne()
}

interface DemoTwo{
    fun getDemoTwo()
}

class DemoImpl : DemoOne, DemoTwo{
    override fun getDemoOne() {
        Log.d("TAG", "This is demo one...")
    }

    override fun getDemoTwo() {
        Log.d("TAG", "This is demo two...")
    }
}

class DemoOneImpl(private val demoOne: DemoOne, private val demoTwo: DemoTwo){
    fun getDemo(){
        demoOne.getDemoOne()
        demoTwo.getDemoTwo()
    }
}

