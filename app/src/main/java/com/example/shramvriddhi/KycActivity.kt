package com.example.shramvriddhi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_kyc.*

class KycActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kyc)

        textView130.setOnClickListener{
            clSecond.visibility = View.INVISIBLE
           clFirst.visibility = View.VISIBLE
        }

        textView110.setOnClickListener{
            clFirst.visibility = View.INVISIBLE
            clSecond.visibility = View.VISIBLE
        }

        textView122.setOnClickListener{
            clFourth.visibility= View.VISIBLE
        }
        imageView32.setOnClickListener {
            clFourth.visibility = View.INVISIBLE
        }

        textView124.setOnClickListener{
            clFourth.visibility= View.VISIBLE
        }

        imageView34.setOnClickListener {
            clFourth.visibility = View.INVISIBLE
        }

    }
}