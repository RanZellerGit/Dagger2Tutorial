package com.example.dagger2tutorial.DI

import com.example.dagger2tutorial.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

@PerActivity
@Component(dependencies = [ApplicationComponent::class], modules = [WheelsModule::class, PetrolEngineModule::class])
interface ActivityComponent{

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun horsePower(@Named("horsePower") horsePower : Int) : Builder

        @BindsInstance
        fun engineCapacity(@Named("engineCapacity") engineCapacity : Int) : Builder

        fun appComponent(applicationComponent: ApplicationComponent) : Builder

        fun build() : ActivityComponent
    }
}