package com.wcp.bookingsappuitest

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_screen_one.setOnClickListener {
            ScreenOneActivity.start(this)
        }

        btn_screen_two.setOnClickListener {
            ScreenTwoActivity.start(this)
        }

        btn_screen_three.setOnClickListener {
            ScreenThreeActivity.start(this)
        }

    }


}