package com.gyasistory.myapplication.app.model

import com.google.gson.annotations.SerializedName

data class Categories(
    @SerializedName("Community")
    val community: Community
)