package com.example.shramvriddhi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        BtnRegisterNext.setOnClickListener {
            val i = Intent(this,RegisterActivity2::class.java).also {
                startActivity(it)
            }
        }
    }
}