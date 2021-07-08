package com.gyasistory.myapplication.app.features.wordpress.model

import com.google.gson.annotations.SerializedName


data class Community(
    @SerializedName("parent")
    val parent: Int = 0,
    @SerializedName("meta")
    val meta: Meta,
    @SerializedName("name")
    val name: String = "",
    @SerializedName("description")
    val description: String = "",
    @SerializedName("feed_url")
    val feedUrl: String = "",
    @SerializedName("ID")
    val id: Int = 0,
    @SerializedName("post_count")
    val postCount: Int = 0,
    @SerializedName("slug")
    val slug: String = ""
)