package com.example.managementclientadmin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.managementclientadmin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.add.setOnClickListener {
            startActivity(Intent(this@MainActivity, Add::class.java))
            finish()
        }
        binding.update.setOnClickListener {  }
        binding.delete.setOnClickListener {  }
    }
}