package com.gyasistory.myapplication.app.features.wordpress.model

import com.google.gson.annotations.SerializedName

data class MetadataItem(
    @SerializedName("id")
    val id: String = "",
    @SerializedName("value")
    val value: String = "",
    @SerializedName("key")
    val key: String = ""
)