package mumbai.d360.activity;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.speech.RecognizerIntent;
import android.support.design.widget.NavigationView;
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
import com.quinny898.library.persistentsearch.SearchBox;

import java.util.ArrayList;
import java.util.List;

import mumbai.d360.R;
import mumbai.d360.callbacks.OnStationSelect;
import mumbai.d360.database.TrackTracerDataBaseAdapter;
import mumbai.d360.database.offlinedb.MessageDBAdapter;
import mumbai.d360.dataprovider.search.SearchData;
import mumbai.d360.dialog.TransparentProgressDialog;
import mumbai.d360.fragments.LocalFragment;
import mumbai.d360.fragments.MapFragment;
import mumbai.d360.fragments.MetroFragment;
import mumbai.d360.fragments.MonoFragment;
import mumbai.d360.model.Station;
import mumbai.d360.searchdata.ColorSuggestion;
import mumbai.d360.searchdata.DataHelper;
import mumbai.d360.utils.LineIndicator;

import static mumbai.d360.searchdata.DataHelper.*;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, OnStationSelect {
    private final String TAG = "BlankFragment";
    public static final long FIND_SUGGESTION_SIMULATED_DELAY = 250;

    public static TrackTracerDataBaseAdapter mDbHelper;
    Boolean isSearch;
    DrawerLayout mDrawerLayout;
    private SearchBox search;
    private Context mContext;
    private MapFragment mapFragment;
    private TransparentProgressDialog pd;
    MessageDBAdapter mMessageDBAdapter;
    private FloatingSearchView mSearchView;
    SearchData mSearchData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = MainActivity.this;
        mMessageDBAdapter = MessageDBAdapter.getInstance(mContext.getApplicationContext());
        mMessageDBAdapter.open();
        List<Station> wrStations = mMessageDBAdapter.retriveAllWesternLineStation();

        pd = new TransparentProgressDialog(this, R.drawable.p4);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mSearchView = (FloatingSearchView) findViewById(R.id.floating_search_view);
        mSearchView.attachNavigationDrawerToMenuButton(mDrawerLayout);

        setupSearchBar();
//        search = (SearchBox) findViewById(R.id.searchbox);
//        search.enableVoiceRecognition(this);
        mSearchData = new SearchData();
//        search.setSearchables(mSearchData.getSearchResult(mContext));
//        search.setMenuListener(new SearchBox.MenuListener() {
//
//            @Override
//            public void onMenuClick() {
//                //Hamburger has been clicked
//                mDrawerLayout.openDrawer(GravityCompat.START);
//                Toast.makeText(MainActivity.this, "Menu click", Toast.LENGTH_LONG).show();
//            }
//
//        });

        LocalFragment mMetroFragment = LocalFragment.newInstance("", "");
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.content_main, mMetroFragment);
        fragmentTransaction.commit();

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
//                search.setBackgroundResource(android.R.color.transparent);
                mapFragment = MapFragment.newInstance("", "");
                fragmentTransaction.replace(R.id.content_main, mapFragment);
                fragmentTransaction.commit();
                break;
            case R.id.nav_local:
//                search.setBackgroundResource(R.color.colorPrimary);
                LocalFragment mLocalFragment = LocalFragment.newInstance("", "");
                fragmentTransaction.replace(R.id.content_main, mLocalFragment);
                fragmentTransaction.commit();
                break;
            case R.id.nav_metro:
                MetroFragment mMetroFragment = MetroFragment.newInstance("", "");
                fragmentTransaction.replace(R.id.content_main, mMetroFragment);
                fragmentTransaction.commit();
                break;
            case R.id.nav_mono:
                MonoFragment mMonoFragment = MonoFragment.newInstance("", "");
                fragmentTransaction.replace(R.id.content_main, mMonoFragment);
                fragmentTransaction.commit();
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
        Toast.makeText(MainActivity.this, station.getName(), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, UpDownActivity.class);
        intent.putExtra("station_name", station.getName());
        intent.putExtra("stKey", station.getStationCode());
        intent.putExtra("line", station.getLineIndicator());
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
            Toast.makeText(MainActivity.this, "OnActivityResult", Toast.LENGTH_SHORT).show();
            search.populateEditText(matches.get(0));
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



    private void setupSearchBar() {
        mSearchView.setOnQueryChangeListener(new FloatingSearchView.OnQueryChangeListener() {

            @Override
            public void onSearchTextChanged(String oldQuery, final String newQuery) {

                if (!oldQuery.equals("") && newQuery.equals("")) {
                    mSearchView.clearSuggestions();
                } else {

                    //this shows the top left circular progress
                    //you can call it where ever you want, but
                    //it makes sense to do it when loading something in
                    //the background.
                    mSearchView.showProgress();

                    //simulates a query call to a data source
                    //with a new query.
                    mSearchData.findSuggestions(MainActivity.this, newQuery, 5,
                            FIND_SUGGESTION_SIMULATED_DELAY, new OnFindSuggestionsListener() {

                                @Override
                                public void onResults(List<ColorSuggestion> results) {

                                    //this will swap the data and
                                    //render the collapse/expand animations as necessary
                                    mSearchView.swapSuggestions(results);
//                                    Log.d(TAG, "360" + results.get(0).getStationCode());

                                    //let the users know that the background
                                    //process has completed
                                    mSearchView.hideProgress();
                                }
                            });
                }

                Log.d(TAG, "onSearchTextChanged()");
            }
        });

        mSearchView.setOnSearchListener(new FloatingSearchView.OnSearchListener() {
            @Override
            public void onSuggestionClicked(final SearchSuggestion searchSuggestion) {
                        startUpDownActivity( (Station) searchSuggestion);
//
//                ColorSuggestion colorSuggestion = (ColorSuggestion) searchSuggestion;
//                DataHelper.findColors(getActivity(), colorSuggestion.getBody(),
//                        new DataHelper.OnFindColorsListener() {
//
//                            @Override
//                            public void onResults(List<ColorWrapper> results) {
//                                //show search results
//                            }
//
//                        });
                Log.d(TAG, "onSuggestionClicked()");
//
//                mLastQuery = searchSuggestion.getBody();
            }

            @Override
            public void onSearchAction(String query) {
                startUpDownActivity(new Station("39", "Mumbai CST", "CSTM", LineIndicator.CENTER));

//                mLastQuery = query;
//
//                DataHelper.findColors(getActivity(), query,
//                        new DataHelper.OnFindColorsListener() {
//
//                            @Override
//                            public void onResults(List<ColorWrapper> results) {
//                                //show search results
//                            }
//
//                        });
//                Log.d(TAG, "onSearchAction()");
            }
        });

//        mSearchView.setOnFocusChangeListener(new FloatingSearchView.OnFocusChangeListener() {
//            @Override
//            public void onFocus() {
//
//                //show suggestions when search bar gains focus (typically history suggestions)
//                mSearchView.swapSuggestions(DataHelper.getHistory(getActivity(), 3));
//
//                Log.d(TAG, "onFocus()");
//            }
//
//            @Override
//            public void onFocusCleared() {
//
//                //set the title of the bar so that when focus is returned a new query begins
//                mSearchView.setSearchBarTitle(mLastQuery);
//
//                //you can also set setSearchText(...) to make keep the query there when not focused and when focus returns
//                //mSearchView.setSearchText(searchSuggestion.getBody());
//
//                Log.d(TAG, "onFocusCleared()");
//            }
//        });
//
//
//        //handle menu clicks the same way as you would
//        //in a regular activity
//        mSearchView.setOnMenuItemClickListener(new FloatingSearchView.OnMenuItemClickListener() {
//            @Override
//            public void onActionMenuItemSelected(MenuItem item) {
//
//                if (item.getItemId() == R.id.action_change_colors) {
//
//                    mIsDarkSearchTheme = true;
//
//                    //demonstrate setting colors for items
//                    mSearchView.setBackgroundColor(Color.parseColor("#787878"));
//                    mSearchView.setViewTextColor(Color.parseColor("#e9e9e9"));
//                    mSearchView.setHintTextColor(Color.parseColor("#e9e9e9"));
//                    mSearchView.setActionMenuOverflowColor(Color.parseColor("#e9e9e9"));
//                    mSearchView.setMenuItemIconColor(Color.parseColor("#e9e9e9"));
//                    mSearchView.setLeftActionIconColor(Color.parseColor("#e9e9e9"));
//                    mSearchView.setClearBtnColor(Color.parseColor("#e9e9e9"));
//                    mSearchView.setDividerColor(Color.parseColor("#BEBEBE"));
//                    mSearchView.setLeftActionIconColor(Color.parseColor("#e9e9e9"));
//                } else {
//
//                    //just print action
//                    Toast.makeText(getActivity().getApplicationContext(), item.getTitle(),
//                            Toast.LENGTH_SHORT).show();
//                }
//
//            }
//        });
//
//        //use this listener to listen to menu clicks when app:floatingSearch_leftAction="showHome"
//        mSearchView.setOnHomeActionClickListener(new FloatingSearchView.OnHomeActionClickListener() {
//            @Override
//            public void onHomeClicked() {
//
//                Log.d(TAG, "onHomeClicked()");
//            }
//        });
//
//        /*
//         * Here you have access to the left icon and the text of a given suggestion
//         * item after as it is bound to the suggestion list. You can utilize this
//         * callback to change some properties of the left icon and the text. For example, you
//         * can load the left icon images using your favorite image loading library, or change text color.
//         *
//         *
//         * Important:
//         * Keep in mind that the suggestion list is a RecyclerView, so views are reused for different
//         * items in the list.
//         */
//        mSearchView.setOnBindSuggestionCallback(new SearchSuggestionsAdapter.OnBindSuggestionCallback() {
//            @Override
//            public void onBindSuggestion(View suggestionView, ImageView leftIcon,
//                                         TextView textView, SearchSuggestion item, int itemPosition) {
//                ColorSuggestion colorSuggestion = (ColorSuggestion) item;
//
//                String textColor = mIsDarkSearchTheme ? "#ffffff" : "#000000";
//                String textLight = mIsDarkSearchTheme ? "#bfbfbf" : "#787878";
//
//                if (colorSuggestion.getIsHistory()) {
//                    leftIcon.setImageDrawable(ResourcesCompat.getDrawable(getResources(),
//                            R.drawable.ic_history_black_24dp, null));
//
//                    Util.setIconColor(leftIcon, Color.parseColor(textColor));
//                    leftIcon.setAlpha(.36f);
//                } else {
//                    leftIcon.setAlpha(0.0f);
//                    leftIcon.setImageDrawable(null);
//                }
//
//                textView.setTextColor(Color.parseColor(textColor));
//                String text = colorSuggestion.getBody()
//                        .replaceFirst(mSearchView.getQuery(),
//                                "<font color=\"" + textLight + "\">" + mSearchView.getQuery() + "</font>");
//                textView.setText(Html.fromHtml(text));
//            }
//
//        });
    }
}
