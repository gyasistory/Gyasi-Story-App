package com.gyasistory.myapplication.app.features.wordpress.model

import com.google.gson.annotations.SerializedName
import com.gyasistory.myapplication.app.features.wordpress.model.*


data class PostsItem(
    @SerializedName("date")
    val date: String = "",
    @SerializedName("comment_count")
    val commentCount: Int = 0,
    @SerializedName("parent")
    val parent: Boolean = false,
    @SerializedName("metadata")
    val metadata: List<MetadataItem>?,
    @SerializedName("menu_order")
    val menuOrder: Int = 0,
    @SerializedName("pings_open")
    val pingsOpen: Boolean = false,
    @SerializedName("title")
    val title: String = "",
    @SerializedName("type")
    val type: String = "",
    @SerializedName("URL")
    val url: String = "",
    @SerializedName("content")
    val content: String = "",
    @SerializedName("geo")
    val geo: Boolean = false,
    @SerializedName("password")
    val password: String = "",
    @SerializedName("current_user_can")
    val currentUserCan: CurrentUserCan,
    @SerializedName("is_reblogged")
    val isReblogged: Boolean = false,
    @SerializedName("modified")
    val modified: String = "",
    @SerializedName("ID")
    val id: Int = 0,
    @SerializedName("categories")
    val categories: Categories,
    @SerializedName("slug")
    val slug: String = "",
    @SerializedName("comments_open")
    val commentsOpen: Boolean = false,
    @SerializedName("like_count")
    val likeCount: Int = 0,
    @SerializedName("capabilities")
    val capabilities: Capabilities,
    @SerializedName("author")
    val author: Author,
    @SerializedName("global_ID")
    val globalID: String = "",
    @SerializedName("format")
    val format: String = "",
    @SerializedName("featured_image")
    val featuredImage: String = "",
    @SerializedName("likes_enabled")
    val likesEnabled: Boolean = false,
    @SerializedName("short_URL")
    val shortURL: String = "",
    @SerializedName("sharing_enabled")
    val sharingEnabled: Boolean = false,
    @SerializedName("meta")
    val meta: Meta,
    @SerializedName("i_like")
    val iLike: Boolean = false,
    @SerializedName("site_ID")
    val siteID: Int = 0,
    @SerializedName("sticky")
    val sticky: Boolean = false,
    @SerializedName("guid")
    val guid: String = "",
    @SerializedName("excerpt")
    val excerpt: String = "",
    @SerializedName("is_following")
    val isFollowing: Boolean = false,
    @SerializedName("status")
    val status: String = ""
)