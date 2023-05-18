package com.example.lemonade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageBtn : ImageView = findViewById(R.id.imageLemonade)
        val textResult : TextView = findViewById(R.id.text_clickMe)
        var count = 0
        imageBtn.setOnClickListener {
            count++
            when (count) {
                2 -> {

                    imageBtn.setImageResource(R.drawable.lemon_squeeze)
                    textResult.text = "Click to juice the lemon!"
                }
                10 -> {
                    imageBtn.setImageResource(R.drawable.lemon_drink)
                    textResult.text = "Click to drink your lemonade!"
                }
                12 -> {
                    imageBtn.setImageResource(R.drawable.lemon_restart)
                    textResult.text = "Click to start again!"

                }
                14 -> {
                    count = 0
                    imageBtn.setImageResource(R.drawable.lemon_tree)
                    textResult.text = "Click to select a lemon!"
                }
            }

        }


    }

    fun onClickImageBtn() {
        TODO("Not yet implemented")
    }

}