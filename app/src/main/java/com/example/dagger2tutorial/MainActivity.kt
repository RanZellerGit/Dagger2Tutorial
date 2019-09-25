package com.example.dagger2tutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger2tutorial.DI.DaggerCarComponent
import com.example.dagger2tutorial.DI.ElectricEngineModule
import com.example.dagger2tutorial.Models.Car
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car : Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerCarComponent
            .builder()
            .electricEngineModule(ElectricEngineModule(120))
            .build()
        component.inject(this)

        car.engine.startEngine()
        car.drive()
    }
}
