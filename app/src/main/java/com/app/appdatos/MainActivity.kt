package com.app.appdatos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var nombre : EditText? = null
    var documento : EditText? = null
    var edad : EditText? = null
    var telefono : EditText? = null
    var direccion : EditText? = null
    var email : EditText? = null

    override fun onCreate(guardarInstancia: Bundle?) {
        super.onCreate(guardarInstancia)
        setContentView(R.layout.activity_main)


        nombre=findViewById(R.id.Nombre)
        documento=findViewById(R.id.Documento)
        edad=findViewById(R.id.Edad)
        telefono=findViewById(R.id.Telefono)
        direccion=findViewById(R.id.Direccion)
        email=findViewById(R.id.Email)

        val buttonEnviar: Button = findViewById(R.id.btnEnviar)
        buttonEnviar.setOnClickListener{onclick()}


    }

    private fun onclick() {

        val nombrePersonas: EditText = findViewById(R.id.Nombre)
        val documentoPersonas: EditText = findViewById(R.id.Documento)
        val edadPersonas: EditText = findViewById(R.id.Edad)
        val telefonoPersonas: EditText = findViewById(R.id.Telefono)
        val direccionPersonas: EditText = findViewById(R.id.Direccion)
        val emailPersonas: EditText = findViewById(R.id.Email)


        val nombre: String = nombrePersonas.text.toString()
        val documento: Int = documentoPersonas.text.toString().toInt()
        val edad: Int = edadPersonas.text.toString().toInt()
        val telefono: Int = telefonoPersonas.text.toString().toInt()
        val direccion: String = direccionPersonas.text.toString()
        val email: String = emailPersonas.text.toString()



        Log.i("Respuesta", "Informaciòn : Nombre : $nombre ,  Documento : $documento ,  Edad :  $edad , Telefono :  $telefono ,  Direcciòn :  $direccion ,   correo :  $email")

        var result = ""

        if(edad >= 0 && edad<= 15) {
            Log.i("Respuesta", result)
            result = "Usted es una persona infante :  $edad"
        }else if (edad> 15 && edad <= 18) {
            Log.i("Respuesta", result)
            result = "Usted es una persona adolescente:  $edad"
        }else if (edad > 18 && edad < 65) {
            Log.i("Respuesta", result)
            result = "Usted es una persona adulta :  $edad"
        } else {
            Log.i("Respuesta", result)
            result = "Usted es una persona adulta mayor $edad"
        }


        val intent = Intent (  this, APPDatos2::class.java )

        val miBundle: Bundle = Bundle()
        miBundle.putString("Nombre", nombrePersonas!!.text.toString())
        miBundle.putString("Documento", documentoPersonas!!.text.toString())
        miBundle.putString("Edad", edadPersonas!!.text.toString())
        miBundle.putString("Telefono", telefonoPersonas!!.text.toString())
        miBundle.putString("Direccion", direccionPersonas!!.text.toString())
        miBundle.putString("Email", emailPersonas!!.text.toString())
        miBundle.putString("Resultado", result!!.toString())


        intent.putExtras(miBundle)

        startActivity(intent)

    }
}