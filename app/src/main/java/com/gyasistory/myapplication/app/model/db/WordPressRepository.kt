package com.gyasistory.myapplication.app.model.db

import android.content.Context
import android.os.AsyncTask
import androidx.lifecycle.LiveData

class WordPressRepository(context: Context?) {
    private val mPostItemDoa: PostItemDoa by lazy { WordPressDatabase.getINSTANCE(context).postDoa }
    val allPost by lazy { mPostItemDoa.allPost }

    fun insertPostItem(postsItem: RoomPostItem?) {
        AsyncTask.execute { mPostItemDoa.insert(postsItem) }
    }
}