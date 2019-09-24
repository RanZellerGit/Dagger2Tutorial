package com.example.dagger2tutorial

import dagger.Component

@Component
interface CarComponent{
    fun getCar() : Car
}