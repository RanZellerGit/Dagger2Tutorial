package com.example.dagger2tutorial.Models

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

interface Engine{
    fun startEngine()
}


class PetrolEngine @Inject constructor(@Named("horsePower") val horsePower : Int,@Named("engineCapacity") val engineCapacity : Int) : Engine {
    override fun startEngine() {
        Log.d("Car", "PetrolEngine started horsePower = $horsePower engineCapacity = $engineCapacity")
    }

}

class ElectricEngine @Inject constructor(val horsePower : Int) : Engine {

    override fun startEngine() {
        Log.d("Car", "Electric engine started with horsePower = $horsePower")
    }

}