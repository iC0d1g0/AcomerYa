package com.example.acomerya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class RecetaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receta)
        val imageView = findViewById<ImageView>(R.id.presentacion)
        var titulo = findViewById<TextView>(R.id.titulo_receta)

        val resourceId:Int? = intent.getIntExtra("imagen_uri", 0)
        val texto: String?=intent.getStringExtra("titulo")
        if (resourceId != null && texto !=null) {

            titulo.setText(texto)
            imageView.setImageResource(resourceId)

            }

    }

}

