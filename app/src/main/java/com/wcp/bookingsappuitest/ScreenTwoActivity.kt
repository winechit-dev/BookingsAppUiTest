package com.wcp.bookingsappuitest

import android.app.Activity
import android.content.Intent
import android.os.Bundle

class ScreenTwoActivity : BaseActivity() {

    companion object{
        fun start(context: Activity) {
            val starter = Intent(context, ScreenTwoActivity::class.java)
            context.startActivity(starter)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_two)
    }
}