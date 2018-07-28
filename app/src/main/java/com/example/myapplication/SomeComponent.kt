package com.example.myapplication

import dagger.Subcomponent
import javax.inject.Singleton

@Singleton
@Subcomponent(modules = [SomeModule::class])
interface SomeComponent {

}
