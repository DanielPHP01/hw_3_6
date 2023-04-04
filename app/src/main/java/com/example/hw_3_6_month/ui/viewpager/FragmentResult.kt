package com.example.hw_3_6_month.ui.viewpager
import com.example.hw_3_6_month.BaseFragment
import com.example.hw_3_6_month.databinding.FragmentCheckBinding


class FragmentResult : BaseFragment<FragmentCheckBinding>() {

    override fun inflateViewBinding(): FragmentCheckBinding {
       return FragmentCheckBinding.inflate(layoutInflater)
    }

    override fun initViews() {
        super.initViews()
        viewModel.counter.observe(viewLifecycleOwner) {
            binding.tvCount.text = it.toString()
        }
    }
}