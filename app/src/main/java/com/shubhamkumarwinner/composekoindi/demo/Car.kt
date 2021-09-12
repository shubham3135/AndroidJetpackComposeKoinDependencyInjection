package com.shubhamkumarwinner.composekoindi.demo

import android.util.Log

class Car constructor(private val engine: Engine, private val wheel: Wheel) {
    fun getCar(){
        engine.getEngine()
        wheel.getWheel()
        Log.d("TAG", "car is running...")
    }
}

class Engine {
    fun getEngine(){
        Log.d("TAG", "engine is started...")
    }
}

class Wheel {
    fun getWheel(){
        Log.d("TAG", "wheel is started...")
    }
}