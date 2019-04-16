package com.asterisk.tuandao.demoviewpagertablayout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment2.*

class WelcomeFragment2: Fragment() {

    companion object {
        private val DEFAULT_TITLE = "WELCOME 2"
        private val DEFAULT_CONTENT = "CONTENT 2"
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment2,container,false)
    }

    override fun onStart() {
        super.onStart()
        textViewUserName.text = DEFAULT_TITLE
        textDateOfBirth.text = DEFAULT_CONTENT
    }
}
