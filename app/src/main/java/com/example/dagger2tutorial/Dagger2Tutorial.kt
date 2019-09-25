package com.example.dagger2tutorial

import android.app.Application
import com.example.dagger2tutorial.DI.ActivityComponent
import com.example.dagger2tutorial.DI.ApplicationComponent
import com.example.dagger2tutorial.DI.DaggerApplicationComponent

class Dagger2Tutorial : Application() {

    lateinit var appComponent : ApplicationComponent
    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerApplicationComponent.create()
    }


}