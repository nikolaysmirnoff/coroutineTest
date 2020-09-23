package com.example.coroutinetv.com.example.coroutinetv

import android.app.Application
import android.content.Context
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MainApp:Application() {
    private val TAG = this.javaClass.simpleName


    override fun onCreate() {
        super.onCreate()
        setContext(this.applicationContext)

    }
    companion object{
        private lateinit var context: Context
        fun setContext(con: Context) {
            context =con
        }
        fun getContext(): Context {
            return context
        }

    }
}