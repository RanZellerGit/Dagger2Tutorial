package com.example.dagger2tutorial.DI

import com.example.dagger2tutorial.MainActivity
import com.example.dagger2tutorial.Models.ElectricEngine
import dagger.Component

@Component(modules = [WheelsModule::class, ElectricEngineModule::class])
interface CarComponent{

    fun inject(mainActivity: MainActivity)
}