package com.example.android.pets.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.android.pets.data.PetContract.PetEntry;

/**
 * Created by HP-PC on 26-01-2017.
 */

public class PetDbHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "shelter.db";

    public PetDbHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "
         + PetEntry.TABLE_NAME + " ("
         + PetEntry._ID + " INTEGER PRIMARY KEY NOT NULL, "
         + PetEntry.COLUMN_PET_NAME + " TEXT NOT NULL, "
         + PetEntry.COLUMN_PET_BREED + " TEXT, "
         + PetEntry.COLUMN_PET_GENDER + " INTEGER NOT NULL, "
         + PetEntry.COLUMN_PET_WEIGHT + " INTEGER NOT NULL DEFAULT 0 );");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
