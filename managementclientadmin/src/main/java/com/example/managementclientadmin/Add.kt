package com.example.managementclientadmin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.managementclientadmin.databinding.ActivityAddBinding

class Add : AppCompatActivity() {
    val binding by lazy {
        ActivityAddBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}