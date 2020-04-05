package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        done_btn.setOnClickListener {
            addNickName(it)
        }
    }

    private fun addNickName(view: View){
        val editText= nickname_edit
        val nicknameTextView= nickname_text

        nicknameTextView.text=editText.text
        editText.visibility= View.GONE
        view.visibility=View.GONE
        nicknameTextView.visibility = View.VISIBLE

        // To hide the keyboard
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken,0)

    }
}
