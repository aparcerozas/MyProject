package com.dam2.myproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_function.*

class ActivityFunction : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_function)

        //Función de suma de los números especificados en las dos cajas de texto numéricas superiores
        btnSuma.setOnClickListener{
            val num1 = Integer.parseInt(txtNum1.text.toString())
            val num2 = Integer.parseInt(txtNum2.text.toString())
            val suma = num1 + num2
            txtResult.setText(suma.toString())
        }

        //Función de resta de los números especificados en las dos cajas de texto numéricas superiores
        btnResta.setOnClickListener{
            val num1 = Integer.parseInt(txtNum1.text.toString())
            val num2 = Integer.parseInt(txtNum2.text.toString())
            val resta = num1 - num2
            txtResult.setText(resta.toString())
        }

        //Función de multiplicación de los números especificados en las dos cajas de texto numéricas superiores
        btnProducto.setOnClickListener{
            val num1 = Integer.parseInt(txtNum1.text.toString())
            val num2 = Integer.parseInt(txtNum2.text.toString())
            val producto = num1 * num2
            txtResult.setText(producto.toString())
        }

        //Función de división de los números especificados en las dos cajas de texto numéricas superiores
        btnDivision.setOnClickListener{
            val num1 = Integer.parseInt(txtNum1.text.toString())
            val num2 = Integer.parseInt(txtNum2.text.toString())
            val division = num1 / num2
            txtResult.setText(division.toString())
        }
    }
}
