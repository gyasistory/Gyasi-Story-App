package com.gyasistory.myapplication.app.features.wordpress.model

import com.google.gson.annotations.SerializedName

data class Categories(
    @SerializedName("Community")
    val community: Community
)