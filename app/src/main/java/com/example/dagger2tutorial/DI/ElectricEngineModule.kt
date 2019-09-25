package com.example.dagger2tutorial.DI

import com.example.dagger2tutorial.Models.ElectricEngine
import com.example.dagger2tutorial.Models.Engine
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class ElectricEngineModule(val horsePower : Int) {

    @Provides
    fun provideElectricEnging() : Engine = ElectricEngine(horsePower)
}