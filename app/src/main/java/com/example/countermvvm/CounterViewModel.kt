package com.example.countermvvm

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel() {
    private val _count = mutableStateOf(0);

    // Expose the count as immutable state  (to access it outside)
    val count: MutableState<Int> = _count // this is to access the _count from outside


    fun increment(){
        _count.value++
    }

    fun decrement(){
        _count.value--
    }
}