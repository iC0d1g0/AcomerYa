package com.example.acomerya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Almuerzo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_almuerzo)


        val imagen0: ImageView = findViewById(R.id.almuerzo_croquetas)
        val  resource0  = R.drawable.arroz_senorito
        val text0= "Arroz Seniorito"

        clickeame(imagen0, resource0, text0)

        val imagen00: ImageView = findViewById(R.id.almuerzo_tresgolpe)
        val  resource00  = R.drawable.arroz_verduras
        val text00 = "Arroz con Verduras, saludable"

        clickeame(imagen00, resource00, text00)


        val imagen1: ImageView = findViewById(R.id.almuerzo_bollos)
        val  resource1  = R.drawable.tres_recetas
        val text1= "Tres en uno"

        clickeame(imagen1, resource1, text1)



        val imagen2: ImageView = findViewById(R.id.almuerzo_avena_banana)
        val  resource2 = R.drawable.ensalada
        val text2 = "Tu Ensalada con Atun"

        clickeame(imagen2, resource2, text2)



        var imagen5: ImageView = findViewById(R.id.almuerzo_avena)
        val  resource5  = R.drawable.huevos_rellenos
        val text5 = "Los Maravillosos Huevos Rellenos"
        clickeame(imagen5, resource5, text5)



        val imagen7: ImageView = findViewById(R.id.almuerzo_crumble)
        val  resource7  = R.drawable.pad_thai
        val text7="Visitante, PAD THAI"
        clickeame(imagen7, resource7, text7)


        val imagen8: ImageView = findViewById(R.id.almuerzo_jugo_avena)
        val  resource8  = R.drawable.puerros_en_vinagre
        val text8 = "La delicia en tu mesa, puerros en vinagre"
        clickeame(imagen8, resource8, text8)


        val imagen21: ImageView = findViewById(R.id.almuerzo_picapollo)
        val  resource21  = R.drawable.picapollo
        val text21 = "Tu favorito!!, el picapollo! "
        clickeame(imagen21, resource21, text21)


        var imagen9: ImageView = findViewById(R.id.almuerzo_yogur)
        val  resource9 = R.drawable.aros_cebolla
        val text9 = "CrujientesAros de cebollas"
        clickeame(imagen9, resource9, text9)

        val imagen60: ImageView = findViewById(R.id.almuerzo_pasteles)
        val  resource60= R.drawable.ensalada_papa
        val text60= "Mis ensaladas de papa"
        clickeame(imagen60, resource60, text60)


        var imagen01: ImageView = findViewById(R.id.almuerzo_chocolate)
        val  resource01  = R.drawable.garbanzos
        val text01= "Mmmmm.... Garbanzos"
        clickeame(imagen01, resource01, text01)


        var imagen02: ImageView = findViewById(R.id.almuerzo_pan_maiz)
        val  resource02  = R.drawable.hamburguesa
        val text02 = "Mi comida americana!!"
        clickeame(imagen02, resource02, text02)


        var imagen03: ImageView = findViewById(R.id.almuerzo_yuca_caliente)
        val  resource03  = R.drawable.lentejas
        val text03 = "Lentejas saludables!!"
        clickeame(imagen03, resource03, text03)



        var imagen04: ImageView = findViewById(R.id.almuerzo_tortilla_huevo)
        val  resource04  = R.drawable.pan_maiz
        val text04 ="Para acompaniar!, pan de Maiz"
        clickeame(imagen04, resource04, text04)



        var imagen05: ImageView = findViewById(R.id.almuerzo_arepa)
        val  resource05  = R.drawable.sopa_de_pollos
        val text05 = "Buen probecho!!, Sopa de pollo"
        clickeame(imagen05, resource05, text05)


        var imagen06: ImageView = findViewById(R.id.almuerzo_empanada)
        val  resource06  = R.drawable.empanadas
        val text06 = "Empanadas del Cubano! "
        clickeame(imagen06, resource06, text06)


        var imagen07: ImageView = findViewById(R.id.almuerzo_mangu)
        val  resource07 = R.drawable.mangu
        val text07 = "Mangu dominicano! "
        clickeame(imagen07, resource07, text07)





        var imagen08: ImageView = findViewById(R.id.almuerzo_sandwich_otro)
        val  resource08= R.drawable.sandwich_otro
        val textt08 = "Otros Tipos de Sandwiches"
        clickeame(imagen08, resource08, textt08)


        var imagen09: ImageView = findViewById(R.id.almuerzo_sandwich)
        val  resource09 = R.drawable.sandwich
        val text09 = "Sandwich delicioso"
        clickeame(imagen09, resource09, text09)


        var imagen10: ImageView = findViewById(R.id.almuerzo_imageView14)
        val  resource10 = R.drawable.aguacate
        val text10 = "Con aguacate!!"
        clickeame(imagen10, resource10, text10)


        var imagen11: ImageView = findViewById(R.id.almuerzo_batidos_uva)
        val  resource11 = R.drawable.batidos_uva
        val text11 = "Batidas de Uva"
        clickeame(imagen11, resource11, text11)

        //mi imagen
        //para enviar :

        val  resource13  = R.drawable.batidos
        val imagen13: ImageView = findViewById(R.id.almuerzo_batidos)
        val texto13="Las batidas de siempre"
        clickeame(imagen13, resource13, texto13)


        val imagen14: ImageView = findViewById(R.id.almuerzo_tarta)
        val resource14=R.drawable.tarta
        val texto14="Tartas Maravillas"

        clickeame(imagen14, resource14,texto14 )



    }
    private fun reseteaImagen(objecto:ImageView, resourc:Int){
        objecto.setImageResource(resourc)
    }

    private fun clickeame(imagen: ImageView, resource:Int, texto: String) {
        reseteaImagen(imagen,resource)
        imagen.setOnClickListener {

            val resourceId = resource
            val intent = Intent(this, RecetaActivity::class.java).apply {

                putExtra("imagen_uri", resourceId)
                putExtra("titulo", texto)

            }


            startActivity(intent)

        }
    }
}