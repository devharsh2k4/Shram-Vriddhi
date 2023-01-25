package com.example.shramvriddhi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dyk1.*

class DykActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dyk1)


        ivDyk1Close.setOnClickListener {
            finish()
        }
    }
}