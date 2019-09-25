package com.example.dagger2tutorial

import android.app.Application
import com.example.dagger2tutorial.DI.CarComponent
import com.example.dagger2tutorial.DI.DaggerCarComponent

class Dagger2Tutorial : Application() {

    lateinit var carComponent : CarComponent
    override fun onCreate() {
        super.onCreate()

        carComponent = DaggerCarComponent
            .builder()
            .horsePower(120)
            .engineCapacity(80)
            .build()
    }


}