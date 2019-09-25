package com.example.dagger2tutorial.DI

import com.example.dagger2tutorial.MainActivity
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Named

@PerActivity
@Subcomponent(modules = [WheelsModule::class, ElectricEngineModule::class])
interface ActivityComponent{

    fun inject(mainActivity: MainActivity)
}