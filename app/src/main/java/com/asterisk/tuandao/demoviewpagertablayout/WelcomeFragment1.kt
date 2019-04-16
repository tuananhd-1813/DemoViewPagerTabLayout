package com.asterisk.tuandao.demoviewpagertablayout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment1.*

class WelcomeFragment1: Fragment() {

    companion object {
        private val DEFAULT_TITLE = "WELCOME 1"
        private val DEFAULT_CONTENT = "CONTENT 1"
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment1, container, false)
    }

    override fun onStart() {
        super.onStart()
        textViewUserName.text = DEFAULT_TITLE
        textDateOfBirth.text = DEFAULT_CONTENT
    }
}
