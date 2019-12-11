package com.dam2.myproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_color.*
import org.jetbrains.anko.longToast

class ActivityColor : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color)

        //Recojo colores del archivo colors.xml y los utilizo en ImageView
        btnRespond.setOnClickListener { view ->
            //Se recogen las tres repuestas
            val color1 = txtColor1.text.toString()
            val color2 = txtColor2.text.toString()
            val color3 = txtColor3.text.toString()

            //Si las tres respuestas son correctas, se muestra un longToast acorde a ello
            if(color1 == "naranja" && color2 == "morado" && color3 == "gris") {
                longToast("Todas las repuestas correctas")
            }
            else{longToast("Alguna/s de las repuestas es incorrecta")}
        }
    }
}
