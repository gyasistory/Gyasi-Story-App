package com.gyasistory.myapplication.app.features.fragments

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import com.gyasistory.myapplication.app.R

class SettingsFragment : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.pref_headers, rootKey)
    }
}