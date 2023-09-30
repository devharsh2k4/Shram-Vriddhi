package com.example.shramvriddhi.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.shramvriddhi.databinding.ActivityClaimStatusBinding


class ClaimStatus : AppCompatActivity() {
    private lateinit var binding : ActivityClaimStatusBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         binding = ActivityClaimStatusBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.ivBackClaim.setOnClickListener {
            finish()
        }

    }
}