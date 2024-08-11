package com.example.eduresource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Dbhelper extends SQLiteOpenHelper {
    public static final String DBNAME="Login.db";
    public Dbhelper(Context context){
        super(context,"Login.db",null,1);

    }

    @Override
    public void onCreate(SQLiteDatabase MyDB) {
        MyDB.execSQL("CREATE TABLE USER(username TEXT primary key,name TEXT,password TEXT,email TEXT,PhoneNo TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase MyDB, int i, int i1) {
        MyDB.execSQL("drop table if exists user");
        onCreate(MyDB);
    }
    public boolean insertData(String username,String name,String password,String email,String phoneNo){
        SQLiteDatabase mydb=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("username",username);
        contentValues.put("name",name);
        contentValues.put("password",password);
        contentValues.put("email",email);
        contentValues.put("phoneNO",phoneNo);
        long result=mydb.insert("user",null,contentValues);
        if(result==-1)
            return false;
        else
            return true;
    }
    public boolean checkusername(String username){
        SQLiteDatabase mydb=this.getWritableDatabase();
        Cursor cur=mydb.rawQuery("SELECT * FROM USER where username=?",new String[]{username});
        if(cur.getCount()>0){
            return true;
        }
        else
            return false;
    }
    public boolean checkusername(String username,String password){
        SQLiteDatabase mydb=this.getWritableDatabase();
        Cursor cur=mydb.rawQuery("SELECT * FROM USER where username=? and password=?",new String[]{username,password});
        if(cur.getCount()>0){
            return true;
        }
        else
            return false;
    }

}