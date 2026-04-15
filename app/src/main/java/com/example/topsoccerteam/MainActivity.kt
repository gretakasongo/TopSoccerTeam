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
import kotlin.math.log

// create function to log array values
@SuppressLint("SuspiciousIndentation")
//fun logArrValues(arr: Array<String>, limit: Int=0){
//        // if statement to check if limit is 0
//        if (limit == 0)
//            Log.v("Array Values", Arrays.toString(arr))
//        else
//
//        Log.v("Array Values", Arrays.toString(arr.sliceArray(0..limit-1)))
//    }
// looks for the longest entry in string array
//fun getLongestString(arr: Array<String>): String {
//    var longestLength = 0
//    var longestElement = ""
//    for (element in arr) {
//        if (element.count() > longestLength) {
//            longestLength = element.count()
//            longestElement = element
//        }
//        }
//    return longestElement
//}
// looks for the shortest entry in string array
fun getShortestString(arr: Array<String>): String {
    var shortestLength = 0
    var shortestElement = ""
    for (element in arr) {
        if (element.count() < shortestLength) {
            shortestLength = element.count()
            shortestElement = element
        }
    }
    return shortestElement
}
class MainActivity : AppCompatActivity() {
    val teams = arrayOf<String>("Manchester united","Real Madrid","PSG","Bayern Munich","Liverpool")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val teamsTxt = findViewById<TextView>(R.id.teamsTxt)
        var teamsDisplay = ""
        var count = 0
//        //calling log array Values function
//        logArrValues(teams)
//        logArrValues(teams,3)
        //call the method to find the longest name in array
//        var longestName = getLongestString(teams)
//        Log.v("Longest Name",longestName)
        // call the method to find the shortest name in array
        var shortestName = getShortestString(teams)
        Log.v("Shortest Name",shortestName)

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