package com.example.dagger2tutorial.DI

import com.example.dagger2tutorial.Models.Rims
import com.example.dagger2tutorial.Models.Tires
import com.example.dagger2tutorial.Models.Wheels
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {

    @Provides
    fun provideRims() : Rims =
        Rims()

    @Provides
    fun provideTires() : Tires {
        val tires = Tires()
        tires.inflate()
        return tires
    }

    @Provides
    fun provideWheels(rims: Rims, tires: Tires) =
        Wheels(rims, tires)
}