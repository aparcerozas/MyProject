package com.dam2.myproject

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.browse
import android.app.Activity
import android.content.Intent
import android.graphics.Color


val REQUEST_IMAGE_CAPTURE = 1

class MainActivity : Activity() {

    //En la función onCreate es dónde he realizado los Listeners de los botones
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Búsqueda en Google Chrome de la página web escrita en la caja de texto del programa
        btnBrowser.setOnClickListener{ view ->
            val url = txtBrowse.text.toString()
            browse(url)
        }

        //Utilizo un Intent para acceder a la Activity de la Calculadora
        btnMath.setOnClickListener{ view ->
            val intent = Intent(this, ActivityFunction::class.java)
            startActivity(intent)
        }

        //Utilizo un Intent para acceder a la Activity de la cámara
        btnCamera.setOnClickListener{ view ->
            val intent = Intent(this, ActivityImageView::class.java)
            startActivity(intent)
        }

        //Cambio el color de fondo del Layout principal con el código de color especificado en la caja de texto
        btnOther.setOnClickListener{ view ->
            val colortxt = txtOther.text.toString()
            layout.setBackgroundColor(Color.parseColor(colortxt))
        }
    }

}
