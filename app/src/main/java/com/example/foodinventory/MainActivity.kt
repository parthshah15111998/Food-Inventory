package com.example.foodinventory

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.text.style.StyleSpan
import android.view.View
import com.example.foodinventory.databinding.ActivityMainBinding
import com.example.foodinventory.databinding.ActivityResetPasswordBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val ss = SpannableString("Reset Your Password")
        val clickableSpan: ClickableSpan = object : ClickableSpan() {
            override fun onClick(p0: View) {
                val intent = Intent(this@MainActivity,ResetPasswordActivity::class.java)
                startActivity(intent)
            }
        }
        ss.setSpan(clickableSpan, 0, 19, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        ss.setSpan(StyleSpan(Typeface.BOLD_ITALIC), 0, 19, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        binding.tvResetYourPassword.text = ss
        binding.tvResetYourPassword.movementMethod = LinkMovementMethod.getInstance()
        binding.tvResetYourPassword.highlightColor = Color.TRANSPARENT

    }
}