package com.lutfilah.diplayground

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.lutfilah.diplayground.ui.theme.DependencyInjectionPlaygroundTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/* Anotasi @AndroidEntryPoint
* Berguna untuk memberitahukan Hilt untuk menginject dependency ke class yang diberikan anotasi.
*
*/
@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    /* Lateinit
    * simpelnya yaitu memberitahukan ke program bahawa variabel ini di isi nanti
    * jadi variabelnya masih kosong dan di isi nanti
    * karena kotlin tidak memperbolehkan membuat variabel kosong
    *
    * Anotasi @Inject
    * saat program berjalan variabel ini akan di inject/di isi di belakang layar
    * dengan object yang sudah di buat di class module
    */
    @Inject
    lateinit var engine: Engine

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DependencyInjectionPlaygroundTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }

        /* Normalnya membuat object secara manual
        * dan menjalankan function yang ada di objectnya
        */
//        val engine = Engine()
        engine.startEngine()
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DependencyInjectionPlaygroundTheme {
        Greeting("Android")
    }
}