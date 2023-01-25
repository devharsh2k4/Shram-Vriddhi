package com.example.shramvriddhi

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.fragment_profile.*

class ProfileFragment : Fragment(R.layout.fragment_profile) {

    private lateinit var auth : FirebaseAuth

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        auth = FirebaseAuth.getInstance()

        profileLogout.setOnClickListener{
            auth.signOut()
            startActivity(Intent(this@ProfileFragment.requireContext(),LoginActivity::class.java))
        }


        textView69.setOnClickListener{
             val i = Intent(this@ProfileFragment.requireContext(),ModifyBasicDetails::class.java).also {
                 startActivity(it)
             }
        }

        textView71.setOnClickListener{
            val j = Intent(this@ProfileFragment.requireContext(),KycActivity::class.java).also{
                startActivity(it)
            }
        }

        textView77.setOnClickListener{
            val k = Intent(this@ProfileFragment.requireContext(),MarkExit::class.java).also{
                startActivity(it)
            }
        }
    }
}