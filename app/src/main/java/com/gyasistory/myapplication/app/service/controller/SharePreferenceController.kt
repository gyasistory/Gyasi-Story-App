package com.gyasistory.myapplication.app.service.controller

import android.content.Context
import com.gyasistory.myapplication.app.R

object SharePreferenceController {
    @JvmStatic
    fun getSyncDelayValue(context: Context): Int {
        val preferences = context.getSharedPreferences(
            context
                .getString(R.string.pref_key_sync_frequency), Context.MODE_PRIVATE
        )
        return (preferences.getInt(context.getString(R.string.pref_key_sync_frequency), 5)
                * 1000 * 60)
    }
}