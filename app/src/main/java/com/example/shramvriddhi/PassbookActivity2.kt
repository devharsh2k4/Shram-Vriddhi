package com.example.shramvriddhi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_passbook2.*

class PassbookActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_passbook2)

        textView16.setOnClickListener{
            val i = Intent(this,PassbookActivity3::class.java).also {
                startActivity(it)
            }
        }
        textView17.setOnClickListener{
            val i = Intent(this,PassbookActivity3::class.java).also {
                startActivity(it)
            }
        }
        ivBackPassbook2.setOnClickListener {
            finish()
        }

    }
}