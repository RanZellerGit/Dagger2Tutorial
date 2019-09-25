package com.example.dagger2tutorial.DI

import com.example.dagger2tutorial.Models.Engine
import com.example.dagger2tutorial.Models.PetrolEngine
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun bindPetrolEngine(engine : PetrolEngine) : Engine
}