package com.gyasistory.myapplication.app.model.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface PostItemDoa {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(item: RoomPostItem?)

    @get:Query("SELECT * from post_item ORDER BY title ASC")
    val allPost: LiveData<List<RoomPostItem>>?

    @Query("DELETE from post_item")
    fun deleteAllPost()
}