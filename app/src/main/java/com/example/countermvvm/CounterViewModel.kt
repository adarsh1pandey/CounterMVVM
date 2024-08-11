package com.example.countermvvm

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel(): ViewModel() {
    private val _repository: CounterRepository = CounterRepository()
    private val _count = mutableStateOf(_repository.getCounter().count);



    // Expose the count as immutable state  (to access it outside)
    val count: MutableState<Int> = _count // this is to access the _count from outside


    fun increment(){
        _repository.incrementCounter()
        _count.value = _repository.getCounter().count
    }

    fun decrement(){
        _repository.decrementCounter()
        _count.value = _repository.getCounter().count
    }
}