package com.dam2.myproject

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_function.*
import org.jetbrains.anko.longToast

class ActivityFunction : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_function)

        //El usuario debe responder a las 3 preguntas matemáticas planteadas

        btnRespond.setOnClickListener { view ->
            //Se recogen las tres repuestas
            val num1 = txtResult.text.toString()
            val num2 = txtColor2.text.toString()
            val num3 = txtColor3.text.toString()

            //Si la repuesta es correcta, la caja de la pregunta se colorea de verde
            //Si no, se colorea de rojo
            if (num1 == "42") {
                txtQuestion1.setBackgroundColor(Color.parseColor("#00FF00"))
            }
            else{txtQuestion1.setBackgroundColor(Color.parseColor("#FF0000"))}

            if (num2 == "9") {
                txtQuestion2.setBackgroundColor(Color.parseColor("#00FF00"))
            }
            else{txtQuestion2.setBackgroundColor(Color.parseColor("#FF0000"))}

            if (num3 == "5050") {
                txtQuestion3.setBackgroundColor(Color.parseColor("#00FF00"))
            }
            else{txtQuestion3.setBackgroundColor(Color.parseColor("#FF0000"))}

            //Si las tres respuestas son correctas, se muestra un longToast acorde a ello
            if(num1 == "42" && num2 == "9" && num3 == "5050") {
                longToast("Todas las repuestas correctas")
            }
            else{longToast("Alguna/s de las repuestas es incorrecta")}

        }
    }
}
