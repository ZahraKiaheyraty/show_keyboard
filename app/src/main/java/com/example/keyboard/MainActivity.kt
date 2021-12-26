package com.example.keyboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var ed: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ed = findViewById(R.id.edit)
        showKeyboard()
    }

    private fun showKeyboard() {
        ed.requestFocus()
        KeyboardManagingUtil.showKeyboard(ed)
    }


    private fun hideKeyboard() {
        ed.clearFocus()
        KeyboardManagingUtil.hideKeyboard(ed)
    }

}

