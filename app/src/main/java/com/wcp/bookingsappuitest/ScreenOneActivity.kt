package com.wcp.bookingsappuitest

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class ScreenOneActivity : BaseActivity() {

    companion object{
        fun start(context: Activity) {
            val starter = Intent(context, ScreenOneActivity::class.java)
            context.startActivity(starter)
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_one)
    }
}