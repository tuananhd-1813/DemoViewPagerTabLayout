package com.asterisk.tuandao.demoviewpagertablayout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_welcome_fragment.*
import kotlinx.android.synthetic.main.fragment2.*

class WelcomeFragmentActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_fragment)

        initViews()
    }

    private fun initViews() {
        viewPager.adapter = WelcomeFragmentStateAdapter(supportFragmentManager)
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->

        }.attach()
    }

}
