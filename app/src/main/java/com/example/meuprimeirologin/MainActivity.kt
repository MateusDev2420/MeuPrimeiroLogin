package com.example.meuprimeirologin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.meuprimeirologin.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val campoUsuario = findViewById<EditText>(R.id.et_usuario)
        val campoSenha = findViewById<EditText>(R.id.et_senha)
        val botaoEntrar = findViewById<Button>(R.id.btn_entrar)


        botaoEntrar.setOnClickListener {


            val usuarioDigitado = campoUsuario.text.toString()
            val senhaDigitada = campoSenha.text.toString()


            if (usuarioDigitado == "admin" && senhaDigitada == "1234") {

                Toast.makeText(this, "Bem-vindo(a), $usuarioDigitado!", Toast.LENGTH_SHORT).show()
            } else {

                Toast.makeText(this, "Usuário ou senha incorretos!", Toast.LENGTH_SHORT).show()


                campoSenha.text.clear()
            }
        }
    }
}