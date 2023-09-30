package com.example.shramvriddhi.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.shramvriddhi.databinding.ActivityDykActicvity2Binding


class DykActivity2 : AppCompatActivity() {
    private lateinit var binding:ActivityDykActicvity2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDykActicvity2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.ivDyk2Cancel.setOnClickListener {
            finish()
        }
    }
}