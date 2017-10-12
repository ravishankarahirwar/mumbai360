package mumbai.d360.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


import java.util.List;

import mumbai.d360.database.contentvalue.HarberLineUpTrain;

public class MySQLiteHelper extends SQLiteOpenHelper {

  public static final String TABLE_COMMENTS = "comments";
  public static final String COLUMN_ID = "_id";
  public static final String COLUMN_TRAIN_ID = "train_id";
  public static final String COLUMN_STATION = "station";
  public static final String COLUMN_TIME = "time";
  public static final String COLUMN_TRAIN_TYPE = "type";

  private static final String DATABASE_NAME = "commments.db";
  private static final int DATABASE_VERSION = 1;

  HarberLineUpTrain mHarberLineUp;
  // Database creation sql statement
  private static final String DATABASE_CREATE = "create table "
      + TABLE_COMMENTS + "(" + COLUMN_ID
      + " integer primary key autoincrement, " + COLUMN_TRAIN_ID
      + " text not null," + COLUMN_STATION
      + " text not null," + COLUMN_TIME
      + " text not null," + COLUMN_TRAIN_TYPE
      + " text not null);";

  public MySQLiteHelper(Context context) {
    super(context, DATABASE_NAME, null, DATABASE_VERSION);
    mHarberLineUp=new HarberLineUpTrain();
  }

  @Override
  public void onCreate(SQLiteDatabase database) {
    database.execSQL(DATABASE_CREATE);
  List<ContentValues> allTrain=mHarberLineUp.getAllUpTrains();
    for(int i=0;i<allTrain.size();i++){
    	long insertId = database.insert(MySQLiteHelper.TABLE_COMMENTS, null,
    			allTrain.get(i));
    }
  }

  @Override
  public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    Log.w(MySQLiteHelper.class.getName(),
        "Upgrading database from version " + oldVersion + " to "
            + newVersion + ", which will destroy all old data");
    db.execSQL("DROP TABLE IF EXISTS " + TABLE_COMMENTS);
    onCreate(db);
  }

}