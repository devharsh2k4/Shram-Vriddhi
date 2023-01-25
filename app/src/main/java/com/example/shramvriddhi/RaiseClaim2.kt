package com.example.shramvriddhi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_raise_claim2.*

class RaiseClaim2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_raise_claim2)


        imageView43.animate().apply {
            duration = 1500
            rotationY(360f)
        } .start()

        textView142.setOnClickListener{
            val i = Intent(this,MainActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}