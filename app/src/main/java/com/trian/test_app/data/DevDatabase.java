package com.trian.test_app.data;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.trian.test_app.data.dao.QuestionDao;
import com.trian.test_app.data.entity.QuestionEntity;

@Database(entities = {QuestionEntity.class},exportSchema = false,version = 1)
public abstract class DevDatabase extends RoomDatabase {
    private static final String DB_NAME= "db.test";
    private static DevDatabase instance;
    public static synchronized DevDatabase getInstance(Context context){
        if(instance == null){
            instance = Room.databaseBuilder(context.getApplicationContext(),DevDatabase.class,DB_NAME).fallbackToDestructiveMigration().build();
        }
        return instance;
    }
    public abstract QuestionDao questionDao();
}
