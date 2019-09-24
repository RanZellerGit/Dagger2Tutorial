package com.example.dagger2tutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger2tutorial.DI.DaggerCarComponent
import com.example.dagger2tutorial.Models.Car
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car : Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerCarComponent.create()
        component.inject(this)

        car.drive()
    }
}
