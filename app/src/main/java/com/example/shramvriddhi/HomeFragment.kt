package com.example.shramvriddhi

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment(R.layout.fragment_home){



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



              ivHome7.setOnClickListener{
                  val i = Intent(this@HomeFragment.requireContext(),DykActivity1::class.java).also {
                      startActivity(it)
                  }
              }

             ivHome8.setOnClickListener{
                 val u = Intent(this@HomeFragment.requireContext(),DykActicvity2::class.java).also {
                       startActivity(it)
                 }
             }




        val images = listOf(
            R.drawable.bannerfirst,
            R.drawable.bannersecond,
            R.drawable.bannerthird,
            R.drawable.bannerfourth,
            R.drawable.bannerfifth,
            R.drawable.bannersixth,
            R.drawable.bannerseventh,
            R.drawable.bannereigth,
            R.drawable.bannerninth,
            R.drawable.bannertenth,
            R.drawable.bannereleventhj
        )


        val adapter =  ViewPagerAdapter(images)
        bannerPager.adapter= adapter




        bannerPager.beginFakeDrag()
        bannerPager.fakeDragBy(-6f)
        bannerPager.endFakeDrag()

    }





    }
