package com.wcp.bookingsappuitest

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) {
            Log.d("ex", e.toString())
        }
        super.onCreate(savedInstanceState)

    }
}