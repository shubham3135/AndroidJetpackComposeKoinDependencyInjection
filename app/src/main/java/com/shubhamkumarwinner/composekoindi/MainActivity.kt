package com.shubhamkumarwinner.composekoindi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.shubhamkumarwinner.composekoindi.container.Component
import com.shubhamkumarwinner.composekoindi.demo.Car
import com.shubhamkumarwinner.composekoindi.ui.theme.ComposeKoinDITheme
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject
import org.koin.java.KoinJavaComponent.get
import org.koin.java.KoinJavaComponent.inject

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeKoinDITheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
    @Composable
    fun Greeting(
        name: String,
        // recommended by koin
        component: Component = Component()
        //for constructor injection
//        car: Car = get(),
    ) {
        // for field injection
//        val car = get<Car>()
//        car.getCar()
        Text(text = "Hello $name!")
//        component.car.getCar()
        component.demoOneImpl.getDemo()
    }
}