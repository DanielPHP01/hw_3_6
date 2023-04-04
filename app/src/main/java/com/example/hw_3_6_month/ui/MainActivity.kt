package com.example.hw_3_6_month.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw_3_6_month.databinding.ActivityMainBinding
import com.example.hw_3_6_month.ui.viewpager.adapter.AdapterVP

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: AdapterVP


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = AdapterVP(this)
        binding.viewPager2.adapter = adapter
    }
}