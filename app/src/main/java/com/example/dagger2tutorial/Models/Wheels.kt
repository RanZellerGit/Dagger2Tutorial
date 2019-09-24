package com.example.dagger2tutorial.Models

import com.example.dagger2tutorial.Models.Rims
import com.example.dagger2tutorial.Models.Tires

class Wheels(rims: Rims, tires: Tires){
    // we don't own this class so we can't annotate it with @Inject
}