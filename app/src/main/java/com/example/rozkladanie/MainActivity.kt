package com.example.rozkladanie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.rozklad).setOnClickListener{
            var rozkladIn = findViewById<TextView>(R.id.LiczbaIn).text.toString().toInt()
            var dziel = 2
                if (rozkladIn == 0 || rozkladIn == 1){
                    val czynnik=rozkladIn.toString()
                    findViewById<TextView>(R.id.LiczbaOut).text=(czynnik)}
                else{
                    val suma= mutableListOf<String>()
                        while(rozkladIn>1) {
                            while(rozkladIn%dziel==0){
                                val czynnik=dziel.toString()
                                suma+=czynnik
                                rozkladIn/=dziel
                            }
                            dziel+=1
                        }
                findViewById<TextView>(R.id.LiczbaOut).text=(suma).toString()
                }
        }
    }
}