package com.gyasistory.myapplication.app

import android.app.Application
import com.gyasistory.myapplication.app.service.WordPressService

open class GyasiApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        WordPressService.instance?.start(applicationContext)


    }
}