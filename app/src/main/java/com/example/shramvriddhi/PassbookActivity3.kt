package com.example.shramvriddhi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_passbook3.*

class PassbookActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_passbook3)

        ivBackPassbook3.setOnClickListener {
            finish()
        }
    }
}