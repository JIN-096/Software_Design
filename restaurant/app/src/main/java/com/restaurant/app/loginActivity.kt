package com.restaurant.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.login_button

open class loginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_page)

        login_button.setOnClickListener {
            val nextIntent = Intent(this, ManagementActivity::class.java)
            startActivity(nextIntent)
        }
    }
}