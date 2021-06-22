package com.wcp.bookingsappuitest

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ScreenThreeActivity : BaseActivity(){

    companion object{
        fun start(context: Activity) {
            val starter = Intent(context, ScreenThreeActivity::class.java)
            context.startActivity(starter)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_three)
    }
}