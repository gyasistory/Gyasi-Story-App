package com.gyasistory.myapplication.app.model.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = RoomPostItem.class, version = 1, exportSchema = false)
public abstract class WordPressDatabase extends RoomDatabase {

    public abstract PostItemDoa getPostDoa();

    private static volatile WordPressDatabase INSTANCE;

    static WordPressDatabase getINSTANCE(Context context) {
        if (INSTANCE != null) {
            return INSTANCE;
        }

        synchronized (WordPressDatabase.class) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(), WordPressDatabase.class,
                    "wordpress_db").build();
            return INSTANCE;
        }
    }
}
