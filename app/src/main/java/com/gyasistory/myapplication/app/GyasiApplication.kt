package com.gyasistory.myapplication.app

import android.app.Application
import com.facebook.flipper.android.AndroidFlipperClient
import com.facebook.flipper.android.utils.FlipperUtils
import com.facebook.flipper.plugins.inspector.DescriptorMapping
import com.facebook.flipper.plugins.inspector.InspectorFlipperPlugin
import com.facebook.soloader.SoLoader
import com.gyasistory.myapplication.app.service.WordPressService


open class GyasiApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        WordPressService.instance?.start(applicationContext)


    }
}