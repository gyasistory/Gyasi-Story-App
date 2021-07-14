package com.gyasistory.myapplication.app

import com.facebook.stetho.Stetho

class GyasiDebugApplication : GyasiApplication() {
    override fun onCreate() {
        Stetho.initializeWithDefaults(this)
        super.onCreate()
    }
}