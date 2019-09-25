package com.example.dagger2tutorial.DI

import java.lang.annotation.Documented
import javax.inject.Scope

@Scope
@Documented
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
annotation class PerActivity