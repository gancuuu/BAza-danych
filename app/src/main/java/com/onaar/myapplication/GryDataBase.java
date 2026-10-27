package com.onaar.myapplication;



@Data(entities = {Gra.class},version = 1)
public abstract class GryDataBase extends RoomDatabase {
    public abstract GryDao zwrocGryDao();
}
