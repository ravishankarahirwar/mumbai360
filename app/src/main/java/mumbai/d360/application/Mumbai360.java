package mumbai.d360.application;

import android.content.Context;
import android.support.multidex.MultiDexApplication;

import mumbai.d360.managers.SharedPreferenceManager;

/**
 * @author Ravishankar
 * @version 1.0
 * @modified by Yogesh N. Tikam
 * @since 27-02-2017
 * Added : Segment Analytics initialization
 */

public class Mumbai360 extends MultiDexApplication {


    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        SharedPreferenceManager.init(getApplicationContext());
    }

}
