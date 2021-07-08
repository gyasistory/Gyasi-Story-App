package com.gyasistory.myapplication.app.features.wordpress.model

import com.google.gson.annotations.SerializedName

data class Author(
    @SerializedName("avatar_URL")
    val avatarURL: String = "",
    @SerializedName("profile_URL")
    val profileURL: String = "",
    @SerializedName("name")
    val name: String = "",
    @SerializedName("last_name")
    val lastName: String = "",
    @SerializedName("ID")
    val id: Int = 0,
    @SerializedName("ip_address")
    val ipAddress: Boolean = false,
    @SerializedName("login")
    val login: String = "",
    @SerializedName("first_name")
    val firstName: String = "",
    @SerializedName("email")
    val email: Boolean = false,
    @SerializedName("nice_name")
    val niceName: String = "",
    @SerializedName("URL")
    val url: String = ""
)