package mumbai.d360.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import mumbai.d360.R;
import mumbai.d360.managers.PreferenceManager;

public class SplashActivity extends AppCompatActivity {
    private static final String TAG = SplashActivity.class.getSimpleName();
    private static int SPLASH_SHOW_TIME = 1000;
    private Context mContext;
    private PreferenceManager mPreference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        init();
    }

    public void init() {
        mContext = SplashActivity.this;
        mPreference = PreferenceManager.getInstance(mContext);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                callAppropriateActivity();
            }
        }, SPLASH_SHOW_TIME);
    }

    /**
     * If user Already Login then start Home Activity
     */
    private void startTutorialScreensActivity() {
        Intent i = new Intent(mContext, TutorialScreensActivity.class);
        startActivity(i);
    }

    /**
     * If user not login/first time login this screen will appear
     */
    private void startMainActivity() {
        Intent i = new Intent(mContext, MainActivity.class);
        startActivity(i);
    }

    private void callAppropriateActivity() {
        if (mPreference.isNewUser()) {
            startTutorialScreensActivity();
        } else {
            startMainActivity();
        }
        finish();
    }
}
