package mumbai.d360.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;

import com.github.paolorotolo.appintro.AppIntro2;
import com.github.paolorotolo.appintro.AppIntroFragment;

import mumbai.d360.R;


/**
 * Created by Yogesh N. Tikam on 10/25/2017.
 */

public class TutorialScreensActivity extends AppIntro2 {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(AppIntroFragment.newInstance("Search", "", "Search All Station/Train in one place", "", R.drawable.ic_search,
                ContextCompat.getColor(this, R.color.colorPrimary),
                Color.WHITE,
                Color.WHITE));
        addSlide(AppIntroFragment.newInstance("Google Map", "", "All stations are on google map", "", R.drawable.ic_map_black_24dp,
                ContextCompat.getColor(this, R.color.colorPrimary),
                Color.WHITE,
                Color.WHITE));
        addSlide(AppIntroFragment.newInstance("Local Language", "", "Hindi, Marathi and English language support for the app", "", R.drawable.ic_language_black_24dp,
                ContextCompat.getColor(this, R.color.colorPrimary),
                Color.WHITE,
                Color.WHITE));
//        addSlide(AppIntroFragment.newInstance("Rate & Review", "", "Coming Soon..", "", R.drawable.image,
//                ContextCompat.getColor(this, R.color.colorPrimary),
//                Color.WHITE,
//                Color.WHITE));
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        startLanguagePreferenceActivity();
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        startLanguagePreferenceActivity();
    }

    /**
     * If user Already Login then start Home Activity
     */
    private void startLanguagePreferenceActivity() {
        Intent i = new Intent(TutorialScreensActivity.this, LanguagePreferenceActivity.class);
        startActivity(i);
        finish();
    }

    @Override
    public void onBackPressed() {
    }
}
