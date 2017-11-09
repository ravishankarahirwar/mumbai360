package mumbai.d360.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.google.firebase.analytics.FirebaseAnalytics;

import mumbai.d360.R;
import mumbai.d360.managers.PreferenceManager;
import mumbai.d360.managers.SharedPreferenceManager;
import mumbai.d360.model.Station;
import mumbai.d360.utils.Language;

public class LanguagePreferenceActivity extends AppCompatActivity {
    private RadioGroup radioGroup;
    protected PreferenceManager mPreference;
    private RadioButton mHindi, mEnglish, mMarathi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_preference);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mPreference = SharedPreferenceManager.getPreference();
        radioGroup = (RadioGroup)findViewById(R.id.languageGroup);
        mHindi = (RadioButton) findViewById(R.id.lan_hindi);
        mEnglish = (RadioButton) findViewById(R.id.lan_english);
        mMarathi = (RadioButton) findViewById(R.id.lan_marathi);

        int languageId = mPreference.getLanguage();
        setUpView(languageId);

        if(mPreference.isNewUser()) {
            radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    // find which radio button is selected
                    setLanguagePreference();
                }
            });
        } else {
            startMainActivity();
        }

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setLanguagePreference();
            }
        });

    }

   private void startMainActivity() {
        Intent intent = new Intent(LanguagePreferenceActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    private void setLanguagePreference() {
        int checkedId = radioGroup.getCheckedRadioButtonId();
        if (checkedId == R.id.lan_english) {
            mPreference.setLanguage(Language.ENGLISH);
        } else if (checkedId == R.id.lan_hindi) {
            mPreference.setLanguage(Language.HINDI);
        } else if (checkedId == R.id.lan_marathi) {
            mPreference.setLanguage(Language.MARATHI);
        } else {
            mPreference.setLanguage(Language.ENGLISH);
        }
        startMainActivity();
    }

    private void setUpView(int languageId) {
        switch (languageId) {
            case Language.ENGLISH :
                mEnglish.setChecked(true);
                break;
            case Language.HINDI :
                mHindi.setChecked(true);
                break;
            case Language.MARATHI :
                mMarathi.setChecked(true);
                break;
        }
    }
}
