package com.example.myapplication

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface BuilderModule {

    @ContributesAndroidInjector
    fun bindMainActivity(): MainActivity

//    @ContributesAndroidInjector
//    fun bindSomeFragment(): SomeFragment

}
