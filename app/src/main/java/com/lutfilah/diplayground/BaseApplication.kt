package com.lutfilah.diplayground

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/* Selalu membuat Application class
* karena dibalik layar Hilt perlu mengenerate class yang kita butuhkan.
* Jangan lupa untuk menambahkan anotasi @HiltAndroidApp
* serta mendeklarasikan Application class di manifest
*/
@HiltAndroidApp
class BaseApplication : Application() {
}