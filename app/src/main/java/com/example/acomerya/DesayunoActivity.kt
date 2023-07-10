package com.example.acomerya

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class DesayunoActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.desayuno_activity)

        val imagen0: ImageView = findViewById(R.id.croquetas)
        val  resource0  = R.drawable.croquetas
        val text0= "Las Croquetas"
        clickeame(imagen0, resource0, text0)

        val imagen00: ImageView = findViewById(R.id.tresgolpe)
        val  resource00  = R.drawable.tresgolpe
        val text00 = "Los mentados TresGolpe "
        clickeame(imagen00, resource00, text00)


        val imagen1: ImageView = findViewById(R.id.bollos)
        val  resource1  = R.drawable.bollos
        val text1= "Los bollitos"
        clickeame(imagen1, resource1, text1)


        val imagen2: ImageView = findViewById(R.id.avena_banana)
        val  resource2 = R.drawable.avena_banana
        val text2 = "Avena con bananas"
        clickeame(imagen2, resource2, text2)


        var imagen5: ImageView = findViewById(R.id.avena)
        val  resource5  = R.drawable.avena
        val text5 = "Mas Avena"
        clickeame(imagen5, resource5, text5)



        val imagen7: ImageView = findViewById(R.id.crumble)
        val  resource7  = R.drawable.crumble
        val text7="Crumbles delicia en tu mesa"
        clickeame(imagen7, resource7, text7)


        val imagen8: ImageView = findViewById(R.id.jugo_avena)
        val  resource8  = R.drawable.jugo_avena
        val text8 = "Suculento Jugo de vena"
        clickeame(imagen8, resource8, text8)


        var imagen9: ImageView = findViewById(R.id.yogur)
        val  resource9 = R.drawable.yogur
        val text9 = "Yogurt del campo"
        clickeame(imagen9, resource9, text9)

        val imagen60: ImageView = findViewById(R.id.pasteles)
        val  resource60= R.drawable.pasteles
        val text60= "Mis pasteles en Hojas"
        clickeame(imagen60, resource60, text60)


        var imagen01: ImageView = findViewById(R.id.chocolate)
        val  resource01  = R.drawable.chocolate
        val text01= "Mmmmm.... Chocolate"
        clickeame(imagen01, resource01, text01)


        var imagen02: ImageView = findViewById(R.id.pan_maiz)
        val  resource02  = R.drawable.pan_maiz
        val text02 = "Pan de Maiz, mi favorito!  "
        clickeame(imagen02, resource02, text02)


        var imagen03: ImageView = findViewById(R.id.yuca_caliente)
        val  resource03  = R.drawable.yuca_caliente
        val text03 = "Yucas Calientes!"
        clickeame(imagen03, resource03, text03)

        val imagen21: ImageView = findViewById(R.id.picapollo)
        val  resource21  = R.drawable.picapollo
        val text21 = "Tu favorito!!, el picapollo! "
        clickeame(imagen21, resource21, text21)

        var imagen04: ImageView = findViewById(R.id.tortilla_huevo)
        val  resource04  = R.drawable.tortilla_de_huevo
        val text04 ="Tortillas con Huevo"
        clickeame(imagen04, resource04, text04)



        var imagen05: ImageView = findViewById(R.id.arepa)
        val  resource05  = R.drawable.arepa
        val text05 = "Arepas de la Abuela"
        clickeame(imagen05, resource05, text05)


        var imagen06: ImageView = findViewById(R.id.empanada)
        val  resource06  = R.drawable.empanadas
        val text06 = "Empanadas del Cubano! "
        clickeame(imagen06, resource06, text06)


        var imagen07: ImageView = findViewById(R.id.mangu)
        val  resource07 = R.drawable.mangu
        val text07 = "Mangu dominicano! "
        clickeame(imagen07, resource07, text07)





        var imagen08: ImageView = findViewById(R.id.sandwich_otro)
        val  resource08= R.drawable.sandwich_otro
        val textt08 = "Otros Tipos de Sandwiches"
        clickeame(imagen08, resource08, textt08)


        var imagen09: ImageView = findViewById(R.id.sandwich)
        val  resource09 = R.drawable.sandwich
        val text09 = "Sandwich delicioso"
        clickeame(imagen09, resource09, text09)


        var imagen10: ImageView = findViewById(R.id.imageView14)
        val  resource10 = R.drawable.aguacate
        val text10 = "Con aguacate!!"
        clickeame(imagen10, resource10, text10)


        var imagen11: ImageView = findViewById(R.id.batidos_uva)
        val  resource11 = R.drawable.batidos_uva
        val text11 = "Batidas de Uva"
        clickeame(imagen11, resource11, text11)

        //mi imagen
        //para enviar :

        val  resource13  = R.drawable.batidos
        val imagen13: ImageView = findViewById(R.id.batidos)
        val texto13="Las batidas de siempre"
        clickeame(imagen13, resource13, texto13)


        val imagen14: ImageView = findViewById(R.id.tarta)
        val resource14=R.drawable.tarta
        val texto14="Tartas Maravillas"

        clickeame(imagen14, resource14,texto14 )



    }

    private fun clickeame(imagen: ImageView, imagen2:Int, texto: String) {
        imagen.setOnClickListener {

            val resourceId = imagen2
            val intent = Intent(this, RecetaActivity::class.java).apply {

                putExtra("imagen_uri", resourceId)
                putExtra("titulo", texto)

            }


            startActivity(intent)

        }
    }
 }
