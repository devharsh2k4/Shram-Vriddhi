package com.example.shramvriddhi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_claim_status.*

class ClaimStatus : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_claim_status)


        ivBackClaim.setOnClickListener {
            finish()
        }

    }
}