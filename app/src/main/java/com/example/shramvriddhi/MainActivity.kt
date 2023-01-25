package com.example.shramvriddhi


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_home.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val firstFragment = HomeFragment()
        val secondFragment = PassbookFragment()
        val thirdFragment = WithdrawalFragment()
        val fourthFragment = MailFragment()
        val fifthFragment = ProfileFragment()

        setCurrentFragment(firstFragment)

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId)  {
                R.id.miHome -> setCurrentFragment(firstFragment)
                R.id.miPassbook -> setCurrentFragment(secondFragment)
                R.id.miWithdraw -> setCurrentFragment(thirdFragment)
                R.id.miMails -> setCurrentFragment(fourthFragment)
                R.id.miProfile -> setCurrentFragment(fifthFragment)
            }
            true
        }
         bottomNavigationView.getOrCreateBadge(R.id.miMails).apply {
             number = 2
             isVisible=true
         }
    }

 private fun setCurrentFragment(fragment: Fragment) =
     supportFragmentManager.beginTransaction().apply {
         replace(R.id.flfragment,fragment)
         commit()
     }


}