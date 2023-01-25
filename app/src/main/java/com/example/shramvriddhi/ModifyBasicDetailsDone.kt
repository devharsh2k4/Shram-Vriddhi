package com.example.shramvriddhi


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_modify_basic_details_done.*

class ModifyBasicDetailsDone : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modify_basic_details_done)


            imageView17.animate().apply{
                duration = 1500
                rotationBy(360f)
            }.start()

        textView90.setOnClickListener{
           val i = Intent(this,MainActivity::class.java).also{
               startActivity(it)
           }
            }
        }
    }
