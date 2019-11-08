package com.example.kaanapos.repository;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;


@Database(entities = {}, version = 1 )

public abstract class MyDatabase extends RoomDatabase {

    public static final String CATEGORY_LIST_TABLE_NAME = "category_list";
    public static final String MENU_ITEM_TABLE_NAME = "menu_item";
    private static MyDatabase INSTANCE = null;


//    public abstract CategorylistDao categorylistDao();
//    public abstract CartItemDao cartItemDao();
//    public abstract SalesDao salesDao();


    public static MyDatabase getDatabase(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context, MyDatabase.class,  MyDatabase.CATEGORY_LIST_TABLE_NAME)
//Room.inMemoryDatabaseBuilder(context.getApplicationContext(), AppDatabase.class)
                            // To simplify the exercise, allow queries on the main thread.
                            // Don't do this on a real app!
//                            .allowMainThreadQueries()
                            // recreate the database if necessary
                            .fallbackToDestructiveMigration()
                            .build();
        }
        return INSTANCE;
    }

    public static void destroyInstance() {
        INSTANCE = null;
    }

}
