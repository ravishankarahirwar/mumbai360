package mumbai.d360.preferences;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by ravi on 16-2-17.
 */
public class Mumbai360Prefrences {

    public static final String SHARED_PREFERENCE_KEY="SMSBOOK_PREFERENCE";
    private static final String LAST_DATABASE_VERSION = "last_DB_version";
    private static final String LAST_CATEGORY_ID = "last_category_id";
    private static final String LAST_CATEGORY_NAME = "last_category_name";
    private static final String IS_FIRST_TIME_USE = "is_user_coming_first_time";
    private static final String IS_EXIT_DIALOG_SHOW = "exit_dialog_nevershow_again";

    private static SharedPreferences mPrefs;
    private static Context mContext;
    SharedPreferences.Editor mEditor;

    private static Mumbai360Prefrences mHindiMessagePrefrences;

    public static Mumbai360Prefrences getInstance(Context context) {
        if (mHindiMessagePrefrences == null) {
            mHindiMessagePrefrences = new Mumbai360Prefrences(context);
        }

        return mHindiMessagePrefrences;
    }

    public Mumbai360Prefrences(Context context) {
        mContext = context;
        if (mPrefs == null) {
            mPrefs = mContext.getSharedPreferences(SHARED_PREFERENCE_KEY, Context.MODE_PRIVATE);
            mEditor = mPrefs.edit();
        }
    }

    public SharedPreferences getSharedPreferences() {
        return mPrefs;
    }

    public int getLastDataBaseVersion() {
        int lastDataBaseVersion = mPrefs.getInt(LAST_DATABASE_VERSION, 0);
        return lastDataBaseVersion;
    }

    public void setLastDataBaseVersion(int lastDataBaseVersion) {
        mEditor.putInt(LAST_DATABASE_VERSION, lastDataBaseVersion);
        mEditor.commit();
    }

    public int getLastCategoryId() {
        int lastCategoryId = mPrefs.getInt(LAST_CATEGORY_ID, 1);
        return lastCategoryId;
    }

    public void setLastCategoryId(int lastCategoryId) {
        mEditor.putInt(LAST_CATEGORY_ID, lastCategoryId);
        mEditor.commit();
    }

    public String getLastCategoryName() {
        String lastCategoryName = mPrefs.getString(LAST_CATEGORY_NAME, "प्यार !");
        return lastCategoryName;
    }

    public void setLastCategoryName(String lastCategoryName) {
        mEditor.putString(LAST_CATEGORY_NAME, lastCategoryName);
        mEditor.commit();
    }

    public boolean getIsFirstTimeUse() {
        boolean isFirstTime = mPrefs.getBoolean(IS_FIRST_TIME_USE, true);
        return isFirstTime;
    }

    public void setIsFirstTimeUse(boolean isFirstTime) {
        mEditor.putBoolean(IS_FIRST_TIME_USE, isFirstTime);
        mEditor.commit();
    }

    public void setIsExitDialogShow(boolean isShow) {
        mEditor.putBoolean(IS_EXIT_DIALOG_SHOW, isShow);
        mEditor.commit();
    }

    public boolean getIsExitDialogShow() {
        boolean isExitDialogShow = mPrefs.getBoolean(IS_EXIT_DIALOG_SHOW, false);
        return isExitDialogShow;
    }
}
