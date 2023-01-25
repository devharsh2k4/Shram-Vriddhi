package com.example.shramvriddhi

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_withdrawal.*

class WithdrawalFragment : Fragment(R.layout.fragment_withdrawal) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonClaimVerify.setOnClickListener{
            val i = Intent(this@WithdrawalFragment.requireContext(),RaiseClaim::class.java).also{
                startActivity(it)
            }
        }
    }
}