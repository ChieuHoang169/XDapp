package com.example.xdapp.ui.calendar

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class CalendarViewModel:ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is Calendar Fragment"
    }
    val text: LiveData<String> = _text
}