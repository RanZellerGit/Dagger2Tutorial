package com.example.dagger2tutorial.DI

import com.example.dagger2tutorial.MainActivity
import com.example.dagger2tutorial.Models.ElectricEngine
import dagger.BindsInstance
import dagger.Component

@Component(modules = [WheelsModule::class, PetrolEngineModule::class])
interface CarComponent{

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun horsePower(horsePower : Int) : Builder

        fun build() : CarComponent
    }
}