package com.example.kotlingreetings

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txt = findViewById<TextView>(R.id.text)
        val btn = findViewById<Button>(R.id.button)
        val img = findViewById<ImageView>(R.id.image)
        var mor = false

        btn.setOnClickListener {
            if (mor){
                txt.text = "Good Morning, World"
                img.setImageResource(R.drawable.sunrise)
            }
            else{

                txt.text = "Good Night, World!"
                img.setImageResource(R.drawable.moon)
            }
            mor = !mor
        }


    }
}