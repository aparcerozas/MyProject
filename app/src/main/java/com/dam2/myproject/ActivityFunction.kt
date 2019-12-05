package com.dam2.myproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_function.*

class ActivityFunction : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_function)

        btnSuma.setOnClickListener{
            val num1 = Integer.parseInt(txtNum1.text.toString())
            val num2 = Integer.parseInt(txtNum2.text.toString())
            val suma = num1 + num2
            txtResult.setText(suma.toString())
        }

        btnResta.setOnClickListener{
            val num1 = Integer.parseInt(txtNum1.text.toString())
            val num2 = Integer.parseInt(txtNum2.text.toString())
            val resta = num1 - num2
            txtResult.setText(resta.toString())
        }

        btnProducto.setOnClickListener{
            val num1 = Integer.parseInt(txtNum1.text.toString())
            val num2 = Integer.parseInt(txtNum2.text.toString())
            val producto = num1 * num2
            txtResult.setText(producto.toString())
        }

        btnDivision.setOnClickListener{
            val num1 = Integer.parseInt(txtNum1.text.toString())
            val num2 = Integer.parseInt(txtNum2.text.toString())
            val division = num1 / num2
            txtResult.setText(division.toString())
        }
    }
}
