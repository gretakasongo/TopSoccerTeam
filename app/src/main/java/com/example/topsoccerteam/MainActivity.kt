package com.example.topsoccerteam

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.util.Log.v
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Arrays
// create function to log array values
@SuppressLint("SuspiciousIndentation")
fun logArrValues(arr: Array<String>, limit: Int=0){
        // if statement to check if limit is 0
        if (limit == 0)
            Log.v("Array Values", Arrays.toString(arr))
        else

        Log.v("Array Values", Arrays.toString(arr.sliceArray(0..limit-1)))
    }
    // Create function or longest array display here


class MainActivity : AppCompatActivity() {
    val teams = arrayOf<String>("Manchester united","Real Madrid","PSG","Bayern Munich","Liverpool")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val teamsTxt = findViewById<TextView>(R.id.teamsTxt)
        var teamsDisplay = ""
        var count = 0
        //calling logArrValues function
        logArrValues(teams)
        logArrValues(teams,3)
        // Call longest array function here

        //reassigning top soccer team in array
        teams [0] = "Man Sundowns Fc"

        // while loop to display top soccer team in array
//        while (count < teams.count()){
//            var teamsDisplay = "${teams[count]}\n"
//            count++
       // }
        //for loop to display top soccer team in array
    for (team in teams){
        teamsDisplay += "${teams}\n"
    }
        // displaying top soccer team in text view on UI
        teamsTxt.text = teamsDisplay

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}