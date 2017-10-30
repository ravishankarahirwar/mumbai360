package mumbai.d360.managers;

import android.content.Context;

/**
 * @author Ravishankar
 * @version 1.0
 * @since 20-01-2017
 */

public class SharedPreferenceManager {

    private static PreferenceManager mSPreferenceManager;

    public static void init(Context context) {
        mSPreferenceManager = PreferenceManager.getInstance(context);
    }

    public static synchronized PreferenceManager getPreference() {
        return mSPreferenceManager;
    }
}
