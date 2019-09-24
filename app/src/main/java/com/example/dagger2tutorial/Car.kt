package com.example.dagger2tutorial

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(
    val engine : Engine,
    val wheels : Wheels){

    val TAG = Car::class.java.simpleName
    fun drive(){
        Log.d(TAG,"driving...")
    }

}