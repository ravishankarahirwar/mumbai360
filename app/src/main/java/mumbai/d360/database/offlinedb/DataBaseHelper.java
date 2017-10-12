package mumbai.d360.database.offlinedb;

import android.content.Context;
import android.content.res.AssetManager;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import mumbai.d360.preferences.Mumbai360Prefrences;


public class DataBaseHelper extends SQLiteOpenHelper {
    private static String TAG = "DataBaseHelper";
    private static String DATABASE_PATH = "/data/data/mumbai.d360/databases/";
    private static String DATABASE_NAME = "mumbai_360_latest.db";
    private static final int DATABASE_VERSION = 1;//this version with Market version 46, android:versionCode="4.8"
    private SQLiteDatabase mDataBase;
    private final Context mContext;
    private Mumbai360Prefrences mHindiMessagePrefrences;

    public DataBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        DATABASE_PATH = "/data/data/" + context.getPackageName() + "/databases/";
        this.mContext = context;
        mHindiMessagePrefrences = Mumbai360Prefrences.getInstance(mContext);
    }

    public void createDataBase() throws IOException {
        boolean mDataBaseExist = checkDataBase();
        if (!mDataBaseExist) {
            this.getReadableDatabase();
            try {
                copyDataBase();
                mHindiMessagePrefrences.setLastDataBaseVersion(DATABASE_VERSION);
            } catch (IOException mIOException) {
                mIOException.printStackTrace();
                throw new Error("ErrorCopyingDataBase");
            }
        } else {
            if (DATABASE_VERSION != mHindiMessagePrefrences.getLastDataBaseVersion()) {
                copyDataBase();
                mHindiMessagePrefrences.setLastDataBaseVersion(DATABASE_VERSION);
            }

        }
    }

    private boolean checkDataBase() {
        SQLiteDatabase mCheckDataBase = null;
        try {
            String myPath = DATABASE_PATH + DATABASE_NAME;
            mCheckDataBase = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.NO_LOCALIZED_COLLATORS);
        } catch (SQLiteException mSQLiteException) {
            Log.e(TAG, "DatabaseNotFound " + mSQLiteException.toString());
        }

        if (mCheckDataBase != null) {
            mCheckDataBase.close();
        }
        return mCheckDataBase != null;
    }

    private void copyDataBase() throws IOException {
        AssetManager assetManager = mContext.getAssets();

        InputStream mInput = assetManager.open(DATABASE_NAME);
        String outFileName = DATABASE_PATH + DATABASE_NAME;
        OutputStream mOutput = new FileOutputStream(outFileName);
        byte[] mBuffer = new byte[1024];
        int mLength;
        while ((mLength = mInput.read(mBuffer)) > 0) {
            mOutput.write(mBuffer, 0, mLength);
        }
        mOutput.flush();
        mOutput.close();
        mInput.close();
    }

    public boolean openDataBase() throws SQLException {
        String mPath = DATABASE_PATH + DATABASE_NAME;
        mDataBase = SQLiteDatabase.openDatabase(mPath, null, SQLiteDatabase.NO_LOCALIZED_COLLATORS);
        return mDataBase != null;
    }

    @Override
    public synchronized void close() {
        if (mDataBase != null)
            mDataBase.close();
        super.close();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        // create fresh books table
//    this.onCreate(db);
        Log.v(TAG, "UpgradingDatabase, This will drop current database and will recreate it");
    }
}