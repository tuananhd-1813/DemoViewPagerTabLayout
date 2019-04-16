package com.asterisk.tuandao.demoviewpagertablayout

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.viewpager2.adapter.FragmentStateAdapter

class WelcomeFragmentStateAdapter(private val fm: FragmentManager): FragmentStateAdapter(fm) {
    val fragmentTransaction: FragmentTransaction

    init {
        fragmentTransaction = fm.beginTransaction()
    }

    companion object {
        private val ITEM_COUNT = 2
    }

    override fun getItem(position: Int): Fragment {
        if (position == 0) return WelcomeFragment1()
        else return WelcomeFragment2()
    }

    override fun getItemCount() = ITEM_COUNT
}
