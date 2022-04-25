package com.lutfilah.diplayground

import android.content.Context

class Engine(private val context: Context) {
    fun startEngine() {
        /* Print output ke logcat */
        println("engine started")
    }

    /* for context injecting */
    fun stopEngine(){
        /* Print output ke logcat */
        println(context.getString(R.string.engine_stopped))
    }
}