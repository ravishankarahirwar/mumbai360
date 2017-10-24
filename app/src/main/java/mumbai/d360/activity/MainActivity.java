package mumbai.d360.activity;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.speech.RecognizerIntent;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.arlib.floatingsearchview.FloatingSearchView;
import com.arlib.floatingsearchview.suggestions.model.SearchSuggestion;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crash.FirebaseCrash;

import java.util.ArrayList;
import java.util.List;

import mumbai.d360.R;
import mumbai.d360.callbacks.OnStationSelect;
import mumbai.d360.database.TrackTracerDataBaseAdapter;
import mumbai.d360.database.offlinedb.MessageDBAdapter;
import mumbai.d360.dataprovider.search.SearchData;
import mumbai.d360.dialog.TransparentProgressDialog;
import mumbai.d360.fragments.BaseFragment;
import mumbai.d360.fragments.LocalFragment;
import mumbai.d360.fragments.MapFragment;
import mumbai.d360.fragments.MetroFragment;
import mumbai.d360.fragments.MonoFragment;
import mumbai.d360.model.Station;
import mumbai.d360.searchdata.ColorSuggestion;
import mumbai.d360.utils.LineIndicator;

import static mumbai.d360.searchdata.DataHelper.*;


public class MainActivity extends AppCompatActivity
        implements BaseFragment.BaseFragmentCallbacks, NavigationView.OnNavigationItemSelectedListener, OnStationSelect {
    private final String TAG = "BlankFragment";
    public static final long FIND_SUGGESTION_SIMULATED_DELAY = 250;

    public static TrackTracerDataBaseAdapter mDbHelper;
    Boolean isSearch;
    DrawerLayout mDrawerLayout;
    private Context mContext;
    private MapFragment mapFragment;
    private TransparentProgressDialog pd;
    MessageDBAdapter mMessageDBAdapter;

    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = MainActivity.this;
        FirebaseCrash.log("Activity created");
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        mMessageDBAdapter = MessageDBAdapter.getInstance(mContext.getApplicationContext());
        mMessageDBAdapter.open();

//        List<Station> wrStations = mMessageDBAdapter.retriveAllWesternLineStation();

        pd = new TransparentProgressDialog(this, R.drawable.p4);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        fragmentTransaction.replace(R.id.fragment_container, mMetroFragment);
//        fragmentTransaction.commit();

//        search.setSearchListener(new SearchBox.SearchListener() {
//
//            @Override
//            public void onSearchOpened() {
//                //Use this to tint the screen
//            }
//
//            @Override
//            public void onSearchClosed() {
//                //Use this to un-tint the screen
//            }
//
//            @Override
//            public void onSearchTermChanged(String term) {
//                //React to the search term changing
//                //Called after it has updated results
////				Toast.makeText(MainActivity.this, "onSearchTermChanged", Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onSearch(String searchTerm) {
//                Toast.makeText(MainActivity.this, searchTerm + " Searched", Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onResultClick(SearchResult result) {
//                //React to a result being clicked
//                Toast.makeText(MainActivity.this, result.title, Toast.LENGTH_SHORT).show();
//
//            }
//
//            @Override
//            public void onSearchCleared() {
//                //Called when the clear button is clicked
//
//            }
//
//        });


//        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
//                this, mDrawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
//        mDrawerLayout.setDrawerListener(toggle);
//        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        LocalFragment localFragment = LocalFragment.newInstance("", "");
        showFragment(localFragment);
    }

    private void showFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, fragment).commit();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
//    SearchView searchView;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        // Associate searchable configuration with the SearchView
//        SearchManager searchManager =
//                (SearchManager) getSystemService(Context.SEARCH_SERVICE);
//        searchView =
//                (SearchView) menu.findItem(R.id.search);
//        searchView.setSearchableInfo(
//                searchManager.getSearchableInfo(getComponentName()));
//        //Create the search view
//        searchView.setQueryHint(Html.fromHtml("<font color = #ffffff>" + "Your station ?" + "</font>"));
////      searchView.setQueryHint("You are at ?");
//        searchView.setOnQueryTextListener(this);
//        searchView.setOnSuggestionListener(this);
//        searchView.setIconifiedByDefault(false);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

//        //noinspection SimplifiableIfStatement
//        if (id == R.id.search) {
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        switch (id) {
            case R.id.nav_map:
                Bundle bundle = new Bundle();
                bundle.putString(FirebaseAnalytics.Param.ITEM_ID, "Navigation Menu");
                bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "Train Google Map");
                bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "Nav_Menu");

                mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
                mapFragment = MapFragment.newInstance("", "");

                showFragment(mapFragment);
                break;
            case R.id.nav_local:
                bundle = new Bundle();
                bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "Local Train");
                bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "Nav_Menu");
                mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);

                LocalFragment mLocalFragment = LocalFragment.newInstance("", "");
                showFragment(mLocalFragment);

                break;
            case R.id.nav_metro:
                bundle = new Bundle();
                bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "Metro Train");
                bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "Nav_Menu");
                mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);

                MetroFragment mMetroFragment = MetroFragment.newInstance("", "");
                showFragment(mMetroFragment);

                break;
            case R.id.nav_mono:
                bundle = new Bundle();
                bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "Mono Train");
                bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "Nav_Menu");
                mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);

                MonoFragment mMonoFragment = MonoFragment.newInstance("", "");
                showFragment(mMonoFragment);
                break;
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onStationSelect(Station station) {
        startUpDownActivity(station);
    }

    private void startUpDownActivity(Station station) {
        Intent intent = new Intent(MainActivity.this, UpDownActivity.class);
        intent.putExtra("station_name", station.getName());
        intent.putExtra("stKey", station.getStationCode());
        intent.putExtra("line", station.getLineIndicator());
        intent.putExtra("id", station.getId());

        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, "Station Select");
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, station.getStationCode());
        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "Nav_Menu");
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);

        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();

        new Handler().post(new Runnable() {
            @Override
            public void run() {

                new ShowingProgress().execute(null, null, null);


            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1234 && resultCode == RESULT_OK) {
            ArrayList<String> matches = data
                    .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
//            Toast.makeText(MainActivity.this, "OnActivityResult", Toast.LENGTH_SHORT).show();
            mapFragment.setCamera();
        }
        super.onActivityResult(requestCode, resultCode, data);
    }


    class ShowingProgress extends AsyncTask<Object, Object, Object> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            pd.show();

//			ringProgressDialog = ProgressDialog.show(SplashScreen.this, "Please wait ...", "First time it take time in configuration", true);
//			ringProgressDialog.show();

        }

        @Override
        protected Object doInBackground(Object... params) {

            mDbHelper = new TrackTracerDataBaseAdapter(MainActivity.this);
            mDbHelper.open();
            return null;
        }

        @Override
        protected void onPostExecute(Object result) {
            super.onPostExecute(result);
            pd.dismiss();

        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mMessageDBAdapter.close();
    }


    @Override
    public void onAttachSearchViewToDrawer(FloatingSearchView searchView) {
        searchView.attachNavigationDrawerToMenuButton(mDrawerLayout);
    }
}
