package com.example.android.pictureinpicture

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.open_pip_btn).setOnClickListener {
            startActivity(
                Intent(
                    this,
                    PiPActivity::class.java
                )
            )
        }
    }
}