package com.onaar.myapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.room3.Room;
import androidx.room3.RoomDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        GryDataBase gryDataBase = Room.databaseBuilder(
                getApplicationContext(), GryDataBase.class,"gry_db"
        ).allowMainThreadQueries().build();
        gryDataBase.zwrocGryDao().wstawGryDoBazy(new Gra("BlackJack",2,10,10,"Gra Karciana"));

    }
}