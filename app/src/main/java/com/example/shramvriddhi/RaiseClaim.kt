package com.example.shramvriddhi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_raise_claim.*

class RaiseClaim : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_raise_claim)

      buttonRaiseClaim.setOnClickListener{
          val i = Intent(this,RaiseClaim2::class.java).also {
              startActivity(it)
          }
      }
    }
}