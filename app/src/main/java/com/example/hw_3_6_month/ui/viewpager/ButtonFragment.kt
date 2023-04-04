package com.example.hw_3_6_month.ui.viewpager

import android.util.Log
import com.example.hw_3_6_month.BaseFragment
import com.example.hw_3_6_month.databinding.FragmentButtonBinding

class ButtonFragment : BaseFragment<FragmentButtonBinding>() {

    override fun inflateViewBinding(): FragmentButtonBinding {
        return FragmentButtonBinding.inflate(layoutInflater)
    }

    override fun initListener() {
        super.initListener()
        binding.increment.setOnClickListener {
            viewModel.increment()
        }
        binding.decrement.setOnClickListener {
            viewModel.decrement()
        }
    }
}
