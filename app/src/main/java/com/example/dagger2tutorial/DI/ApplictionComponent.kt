package com.example.dagger2tutorial.DI

import com.example.dagger2tutorial.Models.Driver
import dagger.Component

@ApplicationScope
@Component
interface ApplicationComponent{

    fun getActivityComponent() : ActivityComponent.Builder
}