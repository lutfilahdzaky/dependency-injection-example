package com.lutfilah.diplayground

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

/* Anotasi @Module
* Berguna untuk memberitahukan Hilt class yang diberikan anotasi merupakan modul dependency untuk Hilt
*
* Anotasi Scope
* Kita juga perlu menambahkan anotasi scope(cakupan) dari dependencynya dengan menggunakan anotasi @InstallIn(scope)
* Contoh:
* - SingletonComponent - Dependency di modul ini akan hidup selama aplikasi berjalan
* - ActivityComponent - Maka modul/dependency di dalamnya akah hidup selama activity tertentu hidup
* Lainnya bisa dilihat di dalam dokumentasi
* (https://developer.android.com/training/dependency-injection/hilt-android)
*/
@Module
@InstallIn(SingletonComponent::class)
object AppModule {
}