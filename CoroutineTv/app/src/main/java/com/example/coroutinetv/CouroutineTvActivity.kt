package com.example.coroutinetv.com.example.coroutinetv

import android.os.Bundle
import android.os.PersistableBundle
import androidx.fragment.app.FragmentActivity
import com.example.coroutinetv.com.example.coroutinetv.CouroutineTvViewModel
import dagger.hilt.android.AndroidEntryPoint
import androidx.activity.viewModels

@AndroidEntryPoint
class CouroutineTvActivity:FragmentActivity() {

    private val viewModel: CouroutineTvViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        subscribeObservers()
    }

    private fun subscribeObservers(){
        viewModel.tvState.observe(this){

        }
    }
}