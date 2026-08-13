package com.example.exercicio1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.exercicio1.databinding.ActivityMain2Binding
import com.example.exercicio1.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        //Captura o login enviado
        val loginUsuario = intent.getStringExtra("LOGIN_USUARIO")?:"Desconhecido"
        //Exibe o login
        binding.txtusuario.text="Bem-vindo(a), $loginUsuario!"
    }
}