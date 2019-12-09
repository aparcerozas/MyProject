package com.dam2.myproject

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_image_view.*
import org.jetbrains.anko.longToast

class ActivityImageView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_view)

        btnImage.setOnClickListener{ view ->
            camera(view)
        }
    }


    //Función de la cámara que analiza si el permiso de ésta ha sido adquirido
    // y realiza una petición para abrir la cámara
    private fun camera (y: View?) {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
            != PackageManager.PERMISSION_GRANTED) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.CAMERA)) {
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
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == Activity.RESULT_OK){
            val imageBitmap = data!!.extras!!.get("data") as Bitmap
            imgCamera.setImageBitmap(imageBitmap)
        }

    }
}
