package com.example.acomerya

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import com.google.android.gms.common.internal.safeparcel.SafeParcelable
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Boton flotante, que te lleva a la cuenta
        val flotin: FloatingActionButton= findViewById(R.id.cuenta_flotin)

        //btn, boton o imagen que te lleva al desayuno

        val btn: ImageView = findViewById(R.id.boton_almuerzos)
        actividades(btn,DesayunoActivity())

        //Boton o imagen que te lleva a los aperitivos
        val aperitivo:ImageView=findViewById(R.id.boton_aperitivos)
        actividades(aperitivo,Aperitivos_activity())


        val almuerzo_:ImageView=findViewById(R.id.almuerzo)
        actividades(almuerzo_,Almuerzo())




        //setUP
        val bundle:Bundle? =intent.extras
        val email2: String? =bundle?.getString("email")
        val provider2: String?=bundle?.getString("provider")
        val prefs = getSharedPreferences(getString(R.string.prefs_file),Context.MODE_PRIVATE).edit()
        prefs.putString("email", email2)
        prefs.putString("provider",provider2)
        prefs.apply()


        flotin.setOnClickListener {
            recibidor(email2 ?:"", provider2 ?:"")


        }


        val seRealizoLogout =true


    }

    private fun actividades(objeto : ImageView, actividad:Activity){
        objeto.setOnClickListener{
            val intent: Intent = Intent(this, actividad:: class.java)
            startActivity(intent)

        }



    }
    private fun recibidor(email:String, provider:String){


            val intent: Intent =
                Intent(this, miCuenta_Activity::class.java).apply {
                putExtra("email2", email)
                putExtra("provider2", provider)
            }
            startActivity(intent)
        }

    }




