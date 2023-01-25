package com.example.shramvriddhi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_register2.*

class RegisterActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register2)

        BtnSubmitRegister.setOnClickListener {
            val i = Intent(this,LoginActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}