package com.example.myapplication

import dagger.Subcomponent

@Subcomponent
interface SomeComponent {

    fun inject(fragment: SomeFragment)

}
