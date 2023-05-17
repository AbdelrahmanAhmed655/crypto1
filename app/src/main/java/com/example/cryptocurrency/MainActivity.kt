package com.example.cryptocurrency

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cryptocurrency.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setVariable()

    }

    private fun setVariable (){
        binding.getStart.setOnClickListener {
            val intent =Intent(this,LoginA::class.java)
            startActivity(intent)
        }
    }
}