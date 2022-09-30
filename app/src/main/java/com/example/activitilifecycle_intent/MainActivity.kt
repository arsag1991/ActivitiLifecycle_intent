package com.example.activitilifecycle_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import android.widget.TextView
import com.example.activitilifecycle_intent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var x = 0
    var list = mutableListOf<String>()
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list)
        binding.listView.adapter = adapter


        binding.seekBar.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                binding.tvSeekNumber.text = binding.seekBar.progress.toString()
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                list.clear()
                square()
                adapter.notifyDataSetChanged()

            }
        })


    }
    fun square() {
        var seek = binding.seekBar.progress
        if (seek != 0) {
            for (i in 1..seek) {
                x = i * i
                list.add("$x")
            }
        } else list.clear()

    }

}


