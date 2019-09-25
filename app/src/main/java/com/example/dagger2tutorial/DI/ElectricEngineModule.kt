package com.example.dagger2tutorial.DI

import com.example.dagger2tutorial.Models.ElectricEngine
import com.example.dagger2tutorial.Models.Engine
import dagger.Binds
import dagger.Module

@Module
abstract class ElectricEngineModule {

    @Binds
   abstract fun bineEnging(electricEngine: ElectricEngine) : Engine
}