package com.example.alice.splitedemo1.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class PersonSqliteOpenHelper extends SQLiteOpenHelper{
    public PersonSqliteOpenHelper(Context context){
        super(context, "person.db", null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL("create table person" +
                "(id integer primary key autoincrement," +
                "name varchar(20)," +
                "number varchar(20))");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }
    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion){
        super.onDowngrade(db, oldVersion, newVersion);
    }
}
