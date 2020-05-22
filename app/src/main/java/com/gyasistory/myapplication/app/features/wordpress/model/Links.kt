package com.gyasistory.myapplication.app.features.wordpress.model

import com.google.gson.annotations.SerializedName

data class Links(
    @SerializedName("help")
    val help: String = "",
    @SerializedName("site")
    val site: String = "",
    @SerializedName("replies")
    val replies: String = "",
    @SerializedName("self")
    val self: String = "",
    @SerializedName("likes")
    val likes: String = ""
)