package com.example.dagger2tutorial.Models

import android.util.Log
import javax.inject.Inject

interface Engine{
    fun startEngine()
}


class PetrolEngine @Inject constructor(val horsePower : Int) : Engine {
    override fun startEngine() {
        Log.d("Car", "PetrolEngine started horsePower =$horsePower")
    }

}

class ElectricEngine @Inject constructor(val horsePower : Int) : Engine {

    override fun startEngine() {
        Log.d("Car", "Electric engine started with horsePower = $horsePower")
    }

}