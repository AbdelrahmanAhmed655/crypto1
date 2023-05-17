package com.example.cryptocurrency

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.cryptocurrency.databinding.ActivityLoginBinding

class LoginA : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.loginBtn.setOnClickListener {
            setVariable()

        }

    }
    private fun setVariable(){
        if(binding.editTextText.text.trim().toString().isEmpty()||binding.editTextPassword.text.trim().toString().isEmpty())
        {
            Toast.makeText(this,"please fill the Login form",Toast.LENGTH_LONG).show()

        }else if(binding.editTextText.text.trim().toString().equals("admin")&& binding.editTextPassword.text.trim().toString().equals("admin")){
            val intent=Intent(this,Crypto::class.java)
            startActivity(intent)


        }

    }
}