package com.dam2.myproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_browser.*
import org.jetbrains.anko.browse
import org.jetbrains.anko.longToast

class ActivityBrowser : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_browser)

        //Este Button te permite acceder a Google con el método browse
        btnBrowse.setOnClickListener { view ->
            browse("https://www.google.com")
        }

        //Compruebo la repuesta de la caja de texto
        btnAnswer.setOnClickListener { view ->
            val year = Integer.parseInt(txtYear.text.toString())

            if (year == 2001) {
                longToast("Respuesta correcta. Google todo lo sabe")
            }
            else{longToast("Déjate de tonterías y busca en Google")}
        }
    }
}
