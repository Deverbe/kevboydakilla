package com.example.kevboydakilla

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


var mKartenList = mutableSetOf<Int>(
    R.drawable.karte1,
    R.drawable.karte2,
    R.drawable.karte3,
    R.drawable.karte4,
    R.drawable.karte5,
    R.drawable.karte6,
    R.drawable.karte7,
    R.drawable.karte8
)


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }
}
