package com.app.appdatos

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class APPDatos2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(guardarInstancia: Bundle?) {
        super.onCreate(guardarInstancia)
        setContentView(R.layout.activity_appdatos2)

        val nombre = findViewById<TextView>(R.id.txtNombre)
        val documento = findViewById<TextView>(R.id.txtDocumento)
        val edad = findViewById<TextView>(R.id.txtEdad)
        val telefono = findViewById<TextView>(R.id.txtTelefono)
        val direccion = findViewById<TextView>(R.id.txtDireccion)
        val email = findViewById<TextView>(R.id.txtEmail)
        val resultado = findViewById<TextView>(R.id.txtResultado)


        var miBundle : Bundle? = this.intent.extras

        if (miBundle != null) {
            nombre.text = "${miBundle.getString("Nombre",)} "
            documento.text = "${miBundle.getString("Documento",)} "
            edad.text = "${miBundle.getString("Edad",)} "
            telefono.text = "${miBundle.getString("Telefono",)} "
            direccion.text = "${miBundle.getString("Direccion",)} "
            email.text = "${miBundle.getString("Email",)} "
            resultado.text = "${miBundle.getString("Resultado",)} "


        }

        val buttonsalir : Button = findViewById(R.id.btnSalir)
        buttonsalir.setOnClickListener{ onclick() }

    }

    private fun onclick() {
        finish()
    }

}