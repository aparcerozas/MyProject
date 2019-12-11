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

        //Utilizo un Intent para acceder a la Activity de Internet
        btnBrowser.setOnClickListener{ view ->

        }

        //Utilizo un Intent para acceder a la Activity de la Calculadora
        btnMath.setOnClickListener{ view ->
            val intent = Intent(this, ActivityFunction::class.java)
            startActivity(intent)
        }

        //Utilizo un Intent para acceder a la Activity de la Cámara
        btnCamera.setOnClickListener{ view ->
            val intent = Intent(this, ActivityImageView::class.java)
            startActivity(intent)
        }

        //Utilizo un Intent para acceder a la Activity de los Colores
        btnOther.setOnClickListener{ view ->
            val intent = Intent(this, ActivityColor::class.java)
            startActivity(intent)
        }
    }

}
