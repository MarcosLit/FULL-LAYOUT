package com.example.trabajo3grupo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var botonMap = findViewById<ImageButton>(R.id.buttonMap)
        var botonLlamada = findViewById<ImageButton>(R.id.buttonCall)
        var botonSpotify = findViewById<ImageButton>(R.id.buttonPlay)

        botonMap.setOnClickListener(){
            var intent = Intent(this, Mapa::class.java)
            startActivity(intent)
        }

        botonLlamada.setOnClickListener(){
            var intent2 = Intent(this, Llamada::class.java)
            startActivity(intent2)
        }

        botonSpotify.setOnClickListener(){
            var intent3 = Intent(this, Spotify::class.java)
            startActivity(intent3)
        }


    }
}