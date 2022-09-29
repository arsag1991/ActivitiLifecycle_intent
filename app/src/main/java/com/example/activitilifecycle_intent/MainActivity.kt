package com.example.activitilifecycle_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.activitilifecycle_intent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val list = MutableList(5, { x -> "Item$x" })
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list)
        binding.listView.adapter = adapter

        binding.listView.setOnItemClickListener { adapterView, view, i, l ->
            val i = Intent(this@MainActivity, SecondActivity::class.java)
            var item = (view as TextView).text
            i.putExtra("key1", item)
            startActivity(i)

        }
    }


}


