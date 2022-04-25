package com.lutfilah.diplayground

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/* Injecting viewmodel example
* Anotasi @HiltViewModel
* Berguna untuk memberitahukan Hilt class yang diberikan anotasi merupakan viewmodel yang ingin di inject
*/
@HiltViewModel
class MainViewModel
    /* Constructor inject */
    @Inject constructor(
        private val engine: Engine
    ) : ViewModel() {
        fun start() {
            engine.startEngine()
        }
}