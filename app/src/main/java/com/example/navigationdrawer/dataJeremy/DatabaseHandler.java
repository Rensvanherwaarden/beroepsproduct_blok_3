package com.example.navigationdrawer.dataJeremy;

import java.util.ArrayList;
import java.util.List;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHandler extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "Cliënten";
    private static final String Cliënten = "labels";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_NAAM = "name";
    private static final String COLUMN_WOONPLAATS = "woonplaats";
    private static final String COLUMN_GEBOORTEDATUM = "geboortedatum";
    private static final String COLUMN_INTERESSE1 = "interesse1";
    private static final String COLUMN_INTERESSE2 = "interesse2";
    private static final String COLUMN_INTERESSE3 = "interesse3";
    private static final String COlUMN_WACHTWOORD = "wachtwoord";
    private static final String COlUMN_EXTRA = "extra";

    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_ITEM_TABLE = "CREATE TABLE " + Cliënten + "(" + COLUMN_ID + " INTEGER PRIMARY KEY," + COLUMN_NAAM +","+COLUMN_WOONPLAATS+","
                + COLUMN_GEBOORTEDATUM + "," + COLUMN_INTERESSE1 + "," + COLUMN_INTERESSE2 + "," + COLUMN_INTERESSE3 + "," + COlUMN_WACHTWOORD +","+COlUMN_EXTRA+")";
        db.execSQL(CREATE_ITEM_TABLE);

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + Cliënten);

        onCreate(db);
    }


    public void insertLabel(String label, String label1, String label2, String label3, String label4, String label5, String label6){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_NAAM, label);
        values.put(COLUMN_GEBOORTEDATUM, label1);
        values.put(COLUMN_WOONPLAATS, label2);
        values.put(COLUMN_INTERESSE1, label3);
        values.put(COLUMN_INTERESSE2, label4);
        values.put(COLUMN_INTERESSE3, label5);
        values.put(COlUMN_WACHTWOORD, label6);


        db.insert(Cliënten, null, values);
        db.close();
    }



    public List getAllLabels() {
        List listjeremy = new ArrayList();
        String selectQuery = "SELECT " + COLUMN_ID + " ," + COLUMN_NAAM +","+COLUMN_WOONPLAATS+", " + COLUMN_GEBOORTEDATUM + "," + COLUMN_INTERESSE1 + "," + COLUMN_INTERESSE2 +"," + COLUMN_INTERESSE3 + "," + COlUMN_WACHTWOORD +","+ COlUMN_EXTRA +" FROM " + Cliënten+ ""  ;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);//selectQuery,selectedArguments
        if (cursor.moveToFirst()) {
            do {
                listjeremy.add(cursor.getString(1));//adding 2nd column data
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return listjeremy;
    }


    public List getcolumnwoonplaats() {
        List listjeremy = new ArrayList();
        String selectQuery = "SELECT " + COLUMN_ID + " ," + COLUMN_NAAM +","+COLUMN_WOONPLAATS+", " + COLUMN_GEBOORTEDATUM + "," + COLUMN_INTERESSE1 + "," + COLUMN_INTERESSE2 +"," + COLUMN_INTERESSE3 + "," + COlUMN_WACHTWOORD +","+COlUMN_EXTRA+" FROM " + Cliënten;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);//selectQuery,selectedArguments
        if (cursor.moveToFirst()) {
            do {
                listjeremy.add(cursor.getString(3));//adding 2nd column data
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return listjeremy;
    }


    public List getcolumngeboortedatum() {
        List listjeremy = new ArrayList();
        String selectQuery = "SELECT " + COLUMN_ID + " ," + COLUMN_NAAM +","+COLUMN_WOONPLAATS+", " + COLUMN_GEBOORTEDATUM + "," + COLUMN_INTERESSE1 + "," + COLUMN_INTERESSE2 +"," + COLUMN_INTERESSE3 + "," + COlUMN_WACHTWOORD +","+COlUMN_EXTRA+" FROM " + Cliënten;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);//selectQuery,selectedArguments
        if (cursor.moveToFirst()) {
            do {
                listjeremy.add(cursor.getString(4));//adding 2nd column data
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return listjeremy;
    }


    public List getcolumninteresse1() {
        List listjeremy = new ArrayList();
        String selectQuery = "SELECT " + COLUMN_ID + " ," + COLUMN_NAAM +","+COLUMN_WOONPLAATS+", " + COLUMN_GEBOORTEDATUM + "," + COLUMN_INTERESSE1 + "," + COLUMN_INTERESSE2 +"," + COLUMN_INTERESSE3 + "," + COlUMN_WACHTWOORD +","+COlUMN_EXTRA+" FROM " + Cliënten;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);//selectQuery,selectedArguments
        if (cursor.moveToFirst()) {
            do {
                listjeremy.add(cursor.getString(4));//adding 2nd column data
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return listjeremy;
    }


    public List getcolumninteresse2() {
        List listjeremy = new ArrayList();
        String selectQuery = "SELECT " + COLUMN_ID + " ," + COLUMN_NAAM +","+COLUMN_WOONPLAATS+", " + COLUMN_GEBOORTEDATUM + "," + COLUMN_INTERESSE1 + "," + COLUMN_INTERESSE2 +"," + COLUMN_INTERESSE3 + "," + COlUMN_WACHTWOORD +","+COlUMN_EXTRA+" FROM " + Cliënten;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);//selectQuery,selectedArguments
        if (cursor.moveToFirst()) {
            do {
                listjeremy.add(cursor.getString(5));//adding 2nd column data
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return listjeremy;
    }


    public List getcolumninteresse3() {
        List listjeremy = new ArrayList();
        String selectQuery = "SELECT " + COLUMN_ID + " ," + COLUMN_NAAM +","+COLUMN_WOONPLAATS+", " + COLUMN_GEBOORTEDATUM + "," + COLUMN_INTERESSE1 + "," + COLUMN_INTERESSE2 +"," + COLUMN_INTERESSE3 + "," + COlUMN_WACHTWOORD +","+COlUMN_EXTRA+" FROM " + Cliënten;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);//selectQuery,selectedArguments
        if (cursor.moveToFirst()) {
            do {
                listjeremy.add(cursor.getString(5));//adding 2nd column data
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return listjeremy;
    }


    public List getcolumnwachtwoord() {
        List listjeremy = new ArrayList();
        String selectQuery = "SELECT " + COLUMN_ID + " ," + COLUMN_NAAM +","+COLUMN_WOONPLAATS+", " + COLUMN_GEBOORTEDATUM + "," + COLUMN_INTERESSE1 + "," + COLUMN_INTERESSE2 +"," + COLUMN_INTERESSE3 + "," + COlUMN_WACHTWOORD +","+COlUMN_EXTRA+" FROM " + Cliënten;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);//selectQuery,selectedArguments
        if (cursor.moveToFirst()) {
            do {
                listjeremy.add(cursor.getString(6));//adding 2nd column data
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return listjeremy;
    }
}
