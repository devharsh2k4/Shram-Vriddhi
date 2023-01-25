package com.example.shramvriddhi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dyk1.*
import kotlinx.android.synthetic.main.activity_dyk_acticvity2.*

class DykActicvity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dyk_acticvity2)


        ivDyk2Cancel.setOnClickListener {
            finish()
        }
    }
}