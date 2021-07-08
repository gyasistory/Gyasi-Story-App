package com.gyasistory.myapplication.app.features.wordpress.db

import android.content.Context
import android.os.AsyncTask

class WordPressRepository(context: Context?) {
    private val mPostItemDoa: PostItemDoa by lazy { WordPressDatabase.getINSTANCE(
        context
    ).postDoa }
    val allPost by lazy { mPostItemDoa.allPost }

    fun insertPostItem(postsItem: RoomPostItem?) {
        AsyncTask.execute { mPostItemDoa.insert(postsItem) }
    }
}