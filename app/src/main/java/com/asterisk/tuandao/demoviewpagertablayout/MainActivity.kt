package com.asterisk.tuandao.demoviewpagertablayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var mList: List<WelcomeContent>
    private lateinit var mAdapter: WelcomeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initData()
        initViews()
    }

    private fun initData() {
        mList = ArrayList()
        val welcomes = mList as ArrayList
        welcomes.add(WelcomeContent(getString(R.string.welcome_1),getString(R.string.content_1)))
        welcomes.add(WelcomeContent(getString(R.string.wellcome_2), getString(R.string.content_2)))
    }

    private fun initViews() {
        mAdapter = WelcomeAdapter(mList)
        viewPager.adapter = mAdapter
        viewPager.registerOnPageChangeCallback(object :
            ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {

            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

            }

            override fun onPageScrollStateChanged(state: Int) {
            }

        })
    }
}
