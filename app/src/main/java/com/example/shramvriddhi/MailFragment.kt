package com.example.shramvriddhi

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_mail.*

class MailFragment : Fragment(R.layout.fragment_mail){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

       textView123.setOnClickListener{
           clInclude.visibility = View.VISIBLE
           textView93.setTextColor(resources.getColor(R.color.blue))
       }

         textView93.setOnClickListener{
             clInclude.visibility = View.INVISIBLE
         }
    }


}