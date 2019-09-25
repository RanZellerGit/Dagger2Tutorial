package com.example.dagger2tutorial.DI

import com.example.dagger2tutorial.MainActivity
import dagger.Component

@Component(modules = [WheelsModule::class, PetrolEngineModule::class])
interface CarComponent{

    fun inject(mainActivity: MainActivity)
}