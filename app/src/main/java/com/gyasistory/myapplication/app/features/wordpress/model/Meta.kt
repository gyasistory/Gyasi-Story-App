package com.gyasistory.myapplication.app.features.wordpress.model

import com.google.gson.annotations.SerializedName
import com.gyasistory.myapplication.app.features.wordpress.model.Links

data class Meta(
    @SerializedName("links")
    val links: Links
)