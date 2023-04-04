package com.example.hw_3_6_month.ui.viewpager
import android.view.LayoutInflater
import com.example.hw_3_6_month.BaseFragment
import com.example.hw_3_6_month.databinding.FragmentHistoryBinding


class FragmentHistory : BaseFragment<FragmentHistoryBinding>() {

    override fun inflateViewBinding(layoutInflater: LayoutInflater): FragmentHistoryBinding {
        return FragmentHistoryBinding.inflate(layoutInflater)
    }

    override fun initViews() {
        super.initViews()
        viewModel.operation.observe(viewLifecycleOwner) {
            binding.tvHistory.text = it
        }
    }
}

