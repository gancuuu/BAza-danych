package com.onaar.myapplication;

import androidx.room3.Database;
import androidx.room3.RoomDatabase;

@Database(entities = {Gra.class},version = 1)
public abstract class GryDataBase extends RoomDatabase {
    public abstract GryDao zwrocGryDao();
}
