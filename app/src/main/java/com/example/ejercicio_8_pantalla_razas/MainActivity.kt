package com.example.ejercicio_8_pantalla_razas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio_8_pantalla_razas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botonElfo.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.elfo)
        }
        binding.botonGoblin.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.goblin)
        }
        binding.botonEnano.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.enano)
        }
        binding.botonHumano.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.humamo)
        }
        binding.botonAceptar.setOnClickListener {
            val intent= Intent(this, pantalla2::class.java)
            startActivity(intent)
        }
    }
}