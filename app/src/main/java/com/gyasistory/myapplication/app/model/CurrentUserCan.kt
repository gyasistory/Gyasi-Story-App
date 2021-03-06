package com.gyasistory.myapplication.app.model

import com.google.gson.annotations.SerializedName

data class CurrentUserCan(
    @SerializedName("edit_post")
    val editPost: Boolean = false,
    @SerializedName("delete_post")
    val deletePost: Boolean = false,
    @SerializedName("publish_post")
    val publishPost: Boolean = false
)