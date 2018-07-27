package com.example.myapplication

import dagger.android.support.DaggerFragment
import javax.inject.Inject

class SomeFragment : DaggerFragment() {

    @Inject lateinit var o: Any

}
