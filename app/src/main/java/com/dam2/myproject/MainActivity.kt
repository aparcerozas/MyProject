package com.dam2.myproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.browse
import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.provider.MediaStore
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import org.jetbrains.anko.longToast
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T



val REQUEST_IMAGE_CAPTURE = 1

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnBrowser.setOnClickListener{ view ->
            val url = txtBrowse.text.toString()
            browse(url)
        }

        btnMath.setOnClickListener{ view ->
            val intent = Intent(this, ActivityFunction::class.java)
            startActivity(intent)
        }

        btnCamera.setOnClickListener{ view ->
            camera(view)
        }
    }

    private fun camera (y: View?) {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
            != PackageManager.PERMISSION_GRANTED) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(this,Manifest.permission.CAMERA)) {
                longToast("Acceso a camara permitido")
                ActivityCompat.requestPermissions(this,
                    arrayOf(Manifest.permission.CAMERA),0)
            } else {
                longToast("Permiso de camara rechazado")

            }
        } else {
            longToast("Acceso a camara permitido")
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intent, REQUEST_IMAGE_CAPTURE)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK){
            val imageBitmap = data!!.extras!!.get("data") as Bitmap
            imgCamera.setImageBitmap(imageBitmap)
        }

    }
}
