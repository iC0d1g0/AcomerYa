package com.example.acomerya

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.res.Resources
import android.os.Bundle
import android.text.Layout
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.GoogleApi
import com.google.android.gms.common.api.GoogleApiClient
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.auth.FirebaseAuth
class Activity_login_ : AppCompatActivity() {

    private var mFirebaseAnalytics: FirebaseAnalytics? = null
    private lateinit var auth: FirebaseAuth



    override fun onCreate(savedInstanceState: Bundle?) {


        //splash

        setTheme(R.style.SplashThem)
        Thread.sleep(2000)
        //login ACtivity

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this)
        val bundle = Bundle()
        bundle.putString("message", "Ingegracion de FireBase Completada")
        mFirebaseAnalytics!!.logEvent("InitScreen", bundle)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_)
        var AuthRelaive = findViewById<View>(R.id.RelaitveAuth)


        //Setup
        setup()
        sesscion()





    }
override  fun onBackPressed() {
    super.onBackPressed()

    finish()
}
    private fun setup() {
        val  registrar:Button=findViewById(R.id.registerbotn)
        val email:EditText = findViewById(R.id.username)
        val password:EditText = findViewById(R.id.password)
        val loginbtn:Button = findViewById(R.id.loginbn)
        loginbtn.setOnClickListener {
            if (email.text.isNotEmpty() && password.text.isNotEmpty()) {
                FirebaseAuth.getInstance().signInWithEmailAndPassword(
                    email.text.toString(),
                    password.text.toString()
                ).addOnCompleteListener {
                    if (it.isSuccessful) {
                        showHome(it.result?.user?.email ?: "", ProviderType.BASIC)

                    } else {
                        showAlert()

                    }
                }
            }
            else {
                showAlert()

            }

        registrar.setOnClickListener {
            if (email.text.isNotEmpty() && password.text.isNotEmpty()) {
                FirebaseAuth.getInstance().createUserWithEmailAndPassword(
                    email.text.toString(),
                    password.text.toString()
                ).addOnCompleteListener {
                    if (it.isSuccessful) {
                        showHome(it.result?.user?.email ?: "", ProviderType.BASIC)

                    } else {
                        showAlert()

                    }
                }
            } else {
                showAlert()
            }
        }

        }


    }
    private fun showAlert() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage("Se produjo un error de autenticacion, favor trat de nuevo...")
        builder.setPositiveButton("Aceptar", null)
        val dialog: AlertDialog = builder.create()
        dialog.show()

    }

    private fun showHome(email: String, provider: ProviderType) {
        val intent: Intent = Intent(this, MainActivity::class.java).apply {
            putExtra("email", email)
            putExtra("provider", provider.name)
        }
        startActivity(intent)




    }
    private  fun sesscion(){
        val prefs = getSharedPreferences(getString(R.string.prefs_file), Context.MODE_PRIVATE)
        val email:String? = prefs.getString("email", null)
        val provider:String? =prefs.getString("provider",null )
        val AuthRelaive = findViewById<View>(R.id.RelaitveAuth)


        if(email != null && provider != null){
            AuthRelaive.visibility=View.INVISIBLE
            showHome(email, ProviderType.valueOf(provider))



        }

        }
}
