package com.example.dagger2tutorial.Models

import android.util.Log

class Tires {
// we don't own this class so we can't annotate it with @Inject

    fun inflate(){
        Log.d("Car", "Tires inflated")
    }
}