package com.example.topsoccerteam

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Arrays

class MainActivity : AppCompatActivity() {
    val teams = arrayOf<String>("Manchester united","Real Madrid","PSG","Bayern Munich","Liverpool")
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val teamsTxt = findViewById<TextView>(R.id.teamsDisplay)
        var count = 0


        //reassigning top soccer team in array
        teams [0] = "Man Sundowns Fc"
        // while loop to display top soccer team in array
        while (count < teams.count()){
            var teamsDisplay = "${teams[count]}\n"
            count++
        }
        // variable to display top soccer team
        var teamsDisplay = ""
        teamsDisplay += "${teams[0]}\n"
        teamsDisplay += "${teams[1]}\n"
        teamsDisplay += "${teams[2]}\n"
        teamsDisplay += "${teams[3]}\n"
        teamsDisplay += "${teams[4]}\n"
        // displaying top soccer team in text view on UI
        teamsTxt.text = teamsDisplay
        teamsTxt.text = Arrays.toString(teams)
        while (teamsDisplay.length > 0)



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}