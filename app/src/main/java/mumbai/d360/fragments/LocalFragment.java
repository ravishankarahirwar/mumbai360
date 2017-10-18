package mumbai.d360.fragments;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.v4.app.Fragment;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.amulyakhare.textdrawable.TextDrawable;
import com.arlib.floatingsearchview.FloatingSearchView;
import com.arlib.floatingsearchview.suggestions.SearchSuggestionsAdapter;
import com.arlib.floatingsearchview.suggestions.model.SearchSuggestion;
import com.arlib.floatingsearchview.util.Util;

import java.util.ArrayList;
import java.util.List;

import mumbai.d360.R;
import mumbai.d360.activity.MainActivity;
import mumbai.d360.activity.UpDownActivity;
import mumbai.d360.adapter.StationNameAdapter;
import mumbai.d360.callbacks.OnStationSelect;
import mumbai.d360.database.offlinedb.MessageDBAdapter;
import mumbai.d360.dataprovider.metro.MetroStationDataProvider;
import mumbai.d360.dataprovider.search.SearchData;
import mumbai.d360.model.Station;
import mumbai.d360.searchdata.ColorSuggestion;
import mumbai.d360.searchdata.DataHelper;
import mumbai.d360.utils.LineIndicator;

import static android.app.Activity.RESULT_OK;
import static mumbai.d360.activity.MainActivity.FIND_SUGGESTION_SIMULATED_DELAY;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link LocalFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link LocalFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LocalFragment extends BaseFragment implements AppBarLayout.OnOffsetChangedListener {
    public static final int VOICE_RECOGNITION_REQUEST_CODE = 1234;

    private RecyclerView mHarberLine;
    private RecyclerView mCentralLine;
    private RecyclerView mWestrnLine;

    private OnStationSelect mListener;
    private Context mContext;
    MessageDBAdapter mMessageDBAdapter;
    private AppBarLayout mAppBar;
    private FloatingSearchView mSearchView;
    private SearchData mSearchData;


    public LocalFragment() {
        // Required empty public constructor
    }

    public static LocalFragment newInstance(String param1, String param2) {
        LocalFragment fragment = new LocalFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mSearchData = new SearchData();
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        mSearchView = (FloatingSearchView) view.findViewById(R.id.floating_search_view);
//        mAppBar = (AppBarLayout) view.findViewById(R.id.appbar);
//
//        mAppBar.addOnOffsetChangedListener(this);

        setupDrawer();
//        setupSearchBar();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_local, container, false);
        mSearchView =  rootView.findViewById(R.id.floating_search_view);

        mAppBar = rootView.findViewById(R.id.appbar);
        mAppBar.addOnOffsetChangedListener(this);

        mHarberLine = rootView.findViewById(R.id.harbour_line);
        mCentralLine = rootView.findViewById(R.id.center_line);
        mWestrnLine = rootView.findViewById(R.id.western_line);

        mMessageDBAdapter = MessageDBAdapter.getInstance(mContext.getApplicationContext());
        mMessageDBAdapter.open();
        List<Station> wrStations = mMessageDBAdapter.retriveAllWesternLineStation();
        List<Station> crStations = mMessageDBAdapter.retriveAllCentralLineStation();
        List<Station> hrStations = mMessageDBAdapter.retriveAllHarberLineStation();

        Context context = rootView.getContext();

        StationNameAdapter wrStationAdapter = new StationNameAdapter(wrStations, mListener);
        mWestrnLine.setLayoutManager(new LinearLayoutManager(context));
        mHarberLine.setHasFixedSize(true);
        mWestrnLine.setAdapter(wrStationAdapter);

        StationNameAdapter crStationAdapter = new StationNameAdapter(crStations, mListener);
        mCentralLine.setLayoutManager(new LinearLayoutManager(context));
        mHarberLine.setHasFixedSize(true);
        mCentralLine.setAdapter(crStationAdapter);


        StationNameAdapter hrStationAdapter = new StationNameAdapter(hrStations, mListener);
        mHarberLine.setLayoutManager(new LinearLayoutManager(context));
        mHarberLine.setHasFixedSize(true);
        mHarberLine.setAdapter(hrStationAdapter);

        setupSearchBar();
        return rootView;
    }




    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnStationSelect) {
            mContext = context;
            mListener = (OnStationSelect) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
        mSearchView.setTranslationY(verticalOffset);
    }
    private void setupDrawer() {
        attachSearchViewActivityDrawer(mSearchView);
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
                    mSearchData.findSuggestions(mContext, newQuery, 5,
                            FIND_SUGGESTION_SIMULATED_DELAY, new DataHelper.OnFindSuggestionsListener() {

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

//                Log.d(TAG, "onSearchTextChanged()");
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
//                Log.d(TAG, "onSuggestionClicked()");
//
//                mLastQuery = searchSuggestion.getBody();
            }

            @Override
            public void onSearchAction(String query) {
//                startUpDownActivity(new Station("39", "Mumbai CST", "CSTM", LineIndicator.CENTER));

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
        //handle menu clicks the same way as you would
        //in a regular activity
        mSearchView.setOnMenuItemClickListener(new FloatingSearchView.OnMenuItemClickListener() {
            @Override
            public void onActionMenuItemSelected(MenuItem item) {

                if (item.getItemId() == R.id.action_voice_rec) {
                    startVoiceRecognitionActivity();
                } else {
                    //just print action
                    Toast.makeText(getActivity().getApplicationContext(), item.getTitle(),
                            Toast.LENGTH_SHORT).show();
                }

            }
        });
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
        /*
         * Here you have access to the left icon and the text of a given suggestion
         * item after as it is bound to the suggestion list. You can utilize this
         * callback to change some properties of the left icon and the text. For example, you
         * can load the left icon images using your favorite image loading library, or change text color.
         *
         *
         * Important:
         * Keep in mind that the suggestion list is a RecyclerView, so views are reused for different
         * items in the list.
         */
        mSearchView.setOnBindSuggestionCallback(new SearchSuggestionsAdapter.OnBindSuggestionCallback() {
            @Override
            public void onBindSuggestion(View suggestionView, ImageView leftIcon,
                                         TextView textView, SearchSuggestion item, int itemPosition) {
                Station station = (Station) item;

                String textColor = true ? "#bfbfbf" : "#000000";
                String textLight = true ? "#FF4675" : "#787878";
                TextDrawable lineIndicator = null;
                switch (station.getLineIndicator()) {
                    case LineIndicator.WESTERN :
                        lineIndicator = TextDrawable.builder()
                                .buildRound("W", R.color.colorPrimary);
                        break;
                    case LineIndicator.CENTER :
                        lineIndicator = TextDrawable.builder()
                                .buildRound("C", R.color.colorPrimary);
                        break;
                    case LineIndicator.HARBOUR :
                        lineIndicator = TextDrawable.builder()
                                .buildRound("H", R.color.colorPrimary);
                        break;
                    case LineIndicator.METRO :
                        lineIndicator = TextDrawable.builder()
                                .buildRound("M", R.color.colorPrimary);
                        break;
                    case LineIndicator.MONO :
                        lineIndicator = TextDrawable.builder()
                                .buildRound("MO", R.color.colorPrimary);
                        break;
                }

                leftIcon.setImageDrawable(lineIndicator);
                Spannable word = new SpannableString(mSearchView.getQuery());

                word.setSpan(new ForegroundColorSpan(Color.BLUE), 0, word.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

                textView.setText(word);
                Spannable wordTwo = new SpannableString(station.getBody().toLowerCase().replaceFirst(mSearchView.getQuery().toLowerCase(), ""));

                wordTwo.setSpan(new ForegroundColorSpan(Color.RED), 0, wordTwo.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                textView.append(wordTwo);

            }

        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == VOICE_RECOGNITION_REQUEST_CODE && resultCode == RESULT_OK) {
            // Fill the list view with the strings the recognizer thought it
            // could have heard
            ArrayList matches = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
            Toast.makeText(mContext, matches.get(0).toString(), Toast.LENGTH_SHORT).show();
            String enquiry = matches.get(0).toString();
        }
    }

    //-------------------- Voice -----------
    public void startVoiceRecognitionActivity() {
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT,
                "Are you at ?");
        startActivityForResult(intent, VOICE_RECOGNITION_REQUEST_CODE);
    }

    private void startUpDownActivity(Station station) {
        Intent intent = new Intent(mContext, UpDownActivity.class);
        intent.putExtra("station_name", station.getName());
        intent.putExtra("stKey", station.getStationCode());
        intent.putExtra("line", station.getLineIndicator());
        startActivity(intent);
    }

    @Override
    public boolean onActivityBackPress() {
        //if mSearchView.setSearchFocused(false) causes the focused search
        //to close, then we don't want to close the activity. if mSearchView.setSearchFocused(false)
        //returns false, we know that the search was already closed so the call didn't change the focus
        //state and it makes sense to call supper onBackPressed() and close the activity
        if (!mSearchView.setSearchFocused(false)) {
            return false;
        }
        return true;
    }
}
