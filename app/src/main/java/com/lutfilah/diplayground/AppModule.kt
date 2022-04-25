package com.lutfilah.diplayground

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

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
    /* Membuat blueprint dari dependency-dependency yang dibutuhkan
    * atau memberitahukan Hilt bagaimana dependency-dependencynya dibuat yang kemudian akan di inject
    *
    * Anotasi @Singleton
    * beguna untuk memmberitahu kepada Hilt bahwa object tersebut hanya dibuat SATU KALI selama aplikasi berjalan
    * ! SANGAT PENTING KARENA JIKA TIDAK ADA
    * ! AKAN MEMBUAT OBJECT TERUS MENERUS KETIKA DI INJECT DAN AKAN TERJADI MEMORY LEAK
    *
    * Anotasi @Provides
    * berguna untuk meberitahukan kepada Hilt bahwa ini adalah module yang disediakan untuk di inject ke class yang membutuhkan
    */
    @Singleton
    @Provides
    fun provideEngine(): Engine {
        return Engine()
    }
}