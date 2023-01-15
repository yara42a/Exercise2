package com.example.prooject2

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        var name = findViewById<TextView>(R.id.name)
        var toolbar = findViewById<Toolbar>(R.id.toolBar)
        val username = intent.getStringExtra("PersonName")
        name.setText(username)

        toolbar.setNavigationOnClickListener{
            finish()
        }



       }
}