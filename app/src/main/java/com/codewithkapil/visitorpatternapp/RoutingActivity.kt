package com.codewithkapil.visitorpatternapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.codewithkapil.home.HomeActivity

class RoutingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        routeToHome()
    }

    private fun routeToHome() {
        Intent(this, HomeActivity::class.java).also {
            startActivity(it)
        }
    }
}