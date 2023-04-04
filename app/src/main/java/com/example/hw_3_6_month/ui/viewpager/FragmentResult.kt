package com.example.hw_3_6_month.ui.viewpager
import android.view.LayoutInflater
import com.example.hw_3_6_month.BaseFragment
import com.example.hw_3_6_month.databinding.FragmentCheckBinding
import com.example.hw_3_6_month.viewmodel.ViewModelCounter


class FragmentResult : BaseFragment<FragmentCheckBinding>() {

    override fun inflateViewBinding(layoutInflater: LayoutInflater): FragmentCheckBinding {
       return FragmentCheckBinding.inflate(layoutInflater)
    }

    override fun initViews() {
        viewModel.counter.observe(viewLifecycleOwner) {
            binding.tvCount.text = it.toString()
        }
    }
}