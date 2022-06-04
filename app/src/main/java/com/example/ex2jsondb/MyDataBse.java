package com.example.ex2jsondb;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDataBse extends SQLiteOpenHelper {
    public static String DBNAME = "stgs.db";
    public static String TBNAME = "Stagiaire";
    public static String COL1 = "nom";
    public static String COL2 = "age";
    public static String COL3 = "filiere";
    public MyDataBse(Context c){
        super(c,DBNAME,null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql = "create table " + TBNAME + "(" + COL1 + " text primary key, " + COL2 + " int, " + COL3 + " text )";
        sqLiteDatabase.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String sql=" DROP TABLE "+TBNAME;
        sqLiteDatabase.execSQL(sql);
        onCreate(sqLiteDatabase);
    }

    public static long insertStagiaire(SQLiteDatabase sqLiteDatabase, Stagiaire s){
        ContentValues ct = new ContentValues();
        ct.put(COL1,s.getNom());
        ct.put(COL2,s.getAge());
        ct.put(COL3,s.getFiliere());
        return sqLiteDatabase.insert(TBNAME,null,ct);
    }
}
