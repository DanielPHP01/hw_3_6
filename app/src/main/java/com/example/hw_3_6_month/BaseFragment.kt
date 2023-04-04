package com.example.hw_3_6_month

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding
import com.example.hw_3_6_month.viewmodel.ViewModelCounter

@Suppress("UNREACHABLE_CODE")
abstract class BaseFragment<VB : ViewBinding>: Fragment() {

    protected lateinit var viewModel: ViewModelCounter
    protected lateinit var binding: VB
    protected abstract fun inflateViewBinding(layoutInflater: LayoutInflater): VB

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = inflateViewBinding(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViewModel()
        initViews()
        initListener()
    }

    open fun initViewModel() {
       viewModel = ViewModelProvider(requireActivity())[ViewModelCounter::class.java]
    }
    open fun initListener() {}
    open fun initViews() {}
}