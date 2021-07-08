package com.gyasistory.myapplication.app.features.wordpress.db

import android.content.Context
import androidx.lifecycle.ViewModel

class PostItemviewModel(context: Context?) : ViewModel() {
    private val mReposistory by lazy {
        WordPressRepository(
            context
        )
    }
    val mAllPosts by lazy { mReposistory.allPost }

    fun insert(item: RoomPostItem?) {
        mReposistory.insertPostItem(item)
    }
}