package com.example.acomerya

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import com.google.firebase.auth.FirebaseAuth
import java.security.KeyStore.TrustedCertificateEntry

enum class ProviderType{
    BASIC,
    GOOGLE,
    FACEBOOK,
    TWITTER
}


class miCuenta_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mi_cuenta)
        //Reciviendo
        val bundle:Bundle?=intent.extras
        val email3:String?=bundle?.getString("email2")
        val provider3:String?=bundle?.getString("provider2")

        editar(email3?:"", provider3?:"")



        val logout:Button=findViewById(R.id.logoutbtn)
        logout.setOnClickListener {


            val loginIntent: Intent=Intent(this, Activity_login_::class.java)
            startActivity(loginIntent)
            val prefs = getSharedPreferences(getString(R.string.prefs_file), Context.MODE_PRIVATE).edit()
            prefs.clear()
            prefs.apply()
            FirebaseAuth.getInstance().signOut()
            finish()
        }


    }

    private fun editar(email:String, provider:String){
        val usuario:TextView = findViewById(R.id.nombre_usuario)
        val proveedor:TextView=findViewById(R.id.proveedor)
        usuario.text=email
        proveedor.text=provider

    }


}