package com.example.dagger2tutorial.DI

import com.example.dagger2tutorial.Models.Engine
import com.example.dagger2tutorial.Models.PetrolEngine
import dagger.Module
import dagger.Provides

@Module
class PetrolEngineModule {

    @Provides
    fun providePetrolEngine(engine : PetrolEngine) : Engine{
        return engine
    }
}