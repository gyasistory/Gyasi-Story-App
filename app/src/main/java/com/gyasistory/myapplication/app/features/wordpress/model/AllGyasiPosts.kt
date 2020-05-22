package com.gyasistory.myapplication.app.features.wordpress.model

import com.google.gson.annotations.SerializedName

data class AllGyasiPosts(
    @SerializedName("found")
    val found: Int = 0,
    @SerializedName("posts")
    val posts: List<PostsItem>?
)