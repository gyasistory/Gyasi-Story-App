package com.gyasistory.myapplication.app.model

import com.google.gson.annotations.SerializedName

data class Meta(
    @SerializedName("links")
    val links: Links
)