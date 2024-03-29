package com.example.shramvriddhi.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.shramvriddhi.R
import com.example.shramvriddhi.databinding.FragmentProfileBinding
import com.google.firebase.auth.FirebaseAuth


class ProfileFragment : Fragment(R.layout.fragment_profile) {
    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root

    }

    private lateinit var auth : FirebaseAuth

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        auth = FirebaseAuth.getInstance()

        binding.profileLogout.setOnClickListener{
            auth.signOut()
            startActivity(Intent(this@ProfileFragment.requireContext(), LoginActivity::class.java))
        }


        binding.textView69.setOnClickListener{
             Intent(this@ProfileFragment.requireContext(), ModifyBasicDetails::class.java).also {
                 startActivity(it)
             }
        }

        binding.textView71.setOnClickListener{
             Intent(this@ProfileFragment.requireContext(), KycActivity::class.java).also{
                startActivity(it)
            }
        }

        binding.textView77.setOnClickListener{
             Intent(this@ProfileFragment.requireContext(), MarkExit::class.java).also{
                startActivity(it)
            }
        }
        binding.textView74.setOnClickListener {
            Intent(this@ProfileFragment.requireContext(),LocationActivity::class.java).also{
                startActivity(it)
            }
        }
    }
}