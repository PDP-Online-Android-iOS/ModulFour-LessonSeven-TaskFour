package dev.ogabek.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.widget.addTextChangedListener
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private lateinit var et_text: TextInputEditText
    private lateinit var tv_text: TextView
    private lateinit var tv_key: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

    }

    private fun initViews() {
        et_text = findViewById(R.id.et_text)
        tv_key = findViewById(R.id.tv_key)
        tv_text = findViewById(R.id.tv_text)

        et_text.setOnKeyListener { _, keyCode, _ ->
            tv_key.text = keyCode.toString()
            false
        }

        et_text.addTextChangedListener{
            tv_text.text = it.toString()
        }
    }
}