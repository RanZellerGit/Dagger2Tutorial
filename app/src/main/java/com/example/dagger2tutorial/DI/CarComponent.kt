package com.example.dagger2tutorial.DI

import com.example.dagger2tutorial.MainActivity
import com.example.dagger2tutorial.Models.ElectricEngine
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

@Component(modules = [WheelsModule::class, PetrolEngineModule::class])
interface CarComponent{

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun horsePower(@Named("horsePower") horsePower : Int) : Builder

        @BindsInstance
        fun engineCapacity(@Named("engineCapacity") engineCapacity : Int) : Builder

        fun build() : CarComponent
    }
}