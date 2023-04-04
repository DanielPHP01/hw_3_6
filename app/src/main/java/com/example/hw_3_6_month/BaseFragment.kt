package com.example.hw_3_6_month

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding
import com.example.hw_3_6_month.viewmodel.ViewModelCounter

abstract class BaseFragment<VB : ViewBinding>: Fragment() {

    protected lateinit var viewModel: ViewModelCounter
    protected lateinit var binding: VB
    protected abstract fun inflateViewBinding(): VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        inflateViewBinding()
        Log.w("ololo", "onCreate: ")
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