package com.onaar.myapplication;

import androidx.room3.Entity;
import androidx.room3.PrimaryKey;

@Entity(tableName = "gry")
public class Gra {
    @PrimaryKey(autoGenerate = true)
    public int id;
    public String nazwa;
    public int minLiczbaOsob;

    public int maxLiczbaOsob;

    public int kategoriaWiekowa;

    public String kategoria;

    public Gra(String nazwa, int maxLiczbaOsob, int minLiczbaOsob, int kategoriaWiekowa, String kategoria) {
        this.nazwa = nazwa;
        this.maxLiczbaOsob = maxLiczbaOsob;
        this.minLiczbaOsob = minLiczbaOsob;
        this.kategoriaWiekowa = kategoriaWiekowa;
        this.kategoria = kategoria;
    }
}
