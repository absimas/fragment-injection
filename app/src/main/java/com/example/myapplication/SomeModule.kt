package com.example.myapplication

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface SomeModule {

    @ContributesAndroidInjector
    fun bindSomeFragment(): SomeFragment

}
