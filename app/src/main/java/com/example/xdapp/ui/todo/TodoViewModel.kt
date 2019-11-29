package com.example.xdapp.ui.todo

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class TodoViewModel:ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This isTo DO Fragment"
    }
    val text: LiveData<String> = _text
}