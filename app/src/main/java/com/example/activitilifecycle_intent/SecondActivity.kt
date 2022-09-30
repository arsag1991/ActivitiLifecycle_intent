package com.example.activitilifecycle_intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.activitilifecycle_intent.databinding.ActivityMainBinding
import com.example.activitilifecycle_intent.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}