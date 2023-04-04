package com.example.hw_3_6_month.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelCounter : ViewModel() {

    private var count = 0
    private var plus = ""

    val counter = MutableLiveData<String>()
    val operation = MutableLiveData<String>()

    fun increment(){
        ++count
        counter.value = count.toString()
        plus = "\n +$plus"
        operation.value = plus
    }

    fun decrement(){
        --count
        counter.value = count.toString()
        plus = "\n -$plus"
        operation.value = plus
    }
}