package com.example.shramvriddhi

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_passbook.*

class PassbookFragment : Fragment(R.layout.fragment_passbook) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        textView13.setOnClickListener{
            val i = Intent(this@PassbookFragment.requireContext(),PassbookActivity2::class.java).also {
                startActivity(it)
            }
        }

        textView12.setOnClickListener{
            val j = Intent(this@PassbookFragment.requireContext(),ClaimStatus::class.java).also {
                startActivity(it)
            }
        }
    }
}