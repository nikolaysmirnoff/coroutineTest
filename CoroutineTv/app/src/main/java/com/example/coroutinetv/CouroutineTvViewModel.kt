package com.example.coroutinetv.com.example.coroutinetv

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.coroutinetv.TvState

class CouroutineTvViewModel@ViewModelInject constructor(
    @Assisted private val savedStateHandle: SavedStateHandle
): ViewModel(){


    private val _tvState = MutableLiveData<TvState>()
    val tvState = _tvState as LiveData<TvState>
}
