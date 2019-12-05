package com.dam2.myproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.browse

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnBrowser.setOnClickListener{ view ->
            val url = txtBrowse.text.toString()
            browse(url)
        }

        btnMath.setOnClickListener{ view ->

        }

        btnCamera.setOnClickListener{ view ->

        }
    }

    private fun camera (y: View?) {

    }
}
