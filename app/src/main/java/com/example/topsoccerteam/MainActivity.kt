package com.example.topsoccerteam

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Arrays
import kotlin.toString

class MainActivity : AppCompatActivity() {
    val teams = arrayOf<String>("Man Sundowns Fc","Orlando Pirates","Liverpool","Man city","Chelsea")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val name = findViewById<TextView>(R.id.name)
        //reassigning top soccer team in array
        teams [0] = "Man Sundowns Fc"
        // displaying top soccer team in text view on UI
        name.text = Arrays.toString(teams)



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}