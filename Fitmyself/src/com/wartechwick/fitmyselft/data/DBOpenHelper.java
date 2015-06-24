package com.wartechwick.fitmyselft.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.wartechwick.fitmyselft.data.FitContract.FitEntry;

public class DBOpenHelper extends SQLiteOpenHelper {
	
	private static final int DATABASE_VERSION = 1;
	
	static final String DATABASE_NAME = "fit.db";

	public DBOpenHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		final String SQL_CREATE_FIT_TABLE = "CREATE TABLE " + FitEntry.TABLE_NAME + " (" +
                FitEntry._ID + " INTEGER PRIMARY KEY," +
                FitEntry.COLUMN_GETUP_TIME + " REAL UNIQUE NOT NULL, " +
                FitEntry.COLUMN_RUN + " REAL NOT NULL, " +
                FitEntry.COLUMN_PUSHUP + " REAL NOT NULL, " +
                FitEntry.COLUMN_SWIM + " REAL NOT NULL " +
                " );";
		
		db.execSQL(SQL_CREATE_FIT_TABLE);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}

}
