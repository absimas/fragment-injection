package com.example.myapplication

import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun provideAny() = Any()

}
