package com.example.dagger2tutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger2tutorial.DI.ApplicationComponent
import com.example.dagger2tutorial.DI.ElectricEngineModule
import com.example.dagger2tutorial.Models.Car
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car1 : Car

    @Inject
    lateinit var car2 : Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = (application as Dagger2Tutorial).appComponent
            .getActivityComponent(ElectricEngineModule(120))

        component.inject(this)

        car1.engine.startEngine()
        car1.drive()

        car2.engine.startEngine()
        car2.drive()
    }
}
