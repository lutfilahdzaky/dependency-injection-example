package com.lutfilah.diplayground

import android.content.Context

class Engine(private val context: Context, private val owner: String) {
    fun startEngine() {
        /* Print output ke logcat */
        println("engine started by $owner")
    }

    /* for context injecting */
    fun stopEngine(){
        /* Print output ke logcat */
        println("${context.getString(R.string.engine_stopped)} by $owner")
    }
}