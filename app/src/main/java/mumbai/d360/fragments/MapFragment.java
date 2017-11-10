package mumbai.d360.fragments;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.amulyakhare.textdrawable.TextDrawable;
import com.arlib.floatingsearchview.FloatingSearchView;
import com.arlib.floatingsearchview.suggestions.SearchSuggestionsAdapter;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.gun0912.tedpermission.PermissionListener;
import com.gun0912.tedpermission.TedPermission;

import java.util.ArrayList;
import java.util.List;

import mumbai.d360.R;
import mumbai.d360.activity.MainActivity;
import mumbai.d360.activity.UpDownActivity;
import mumbai.d360.data.StationCollection;
import mumbai.d360.database.offlinedb.MessageDBAdapter;
import mumbai.d360.dataprovider.metro.MetroStationDataProvider;
import mumbai.d360.dataprovider.mono.MonoStationDataProvider;
import mumbai.d360.dataprovider.search.SearchData;
import mumbai.d360.model.Station;
import mumbai.d360.searchdata.SearchSuggestion;
import mumbai.d360.searchdata.DataHelper;
import mumbai.d360.utils.LineIndicator;

import static mumbai.d360.activity.MainActivity.FIND_SUGGESTION_SIMULATED_DELAY;

public class MapFragment extends BaseFragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    MapView mMapView;
    private GoogleMap googleMap;

    private FloatingSearchView mSearchView;
    private SearchData mSearchData;
    private Context mContext;
    private MessageDBAdapter mMessageDBAdapter;
    List<Station> combined;
    private boolean isLocationPermissionGranted;

    public MapFragment() {
        // Required empty public constructor
    }


    public static MapFragment newInstance(String param1, String param2) {
        MapFragment fragment = new MapFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mSearchData = new SearchData();
        isLocationPermissionGranted = false;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
//        SupportMapFragment mapFragment = (SupportMapFragment) getActivity().getSupportFragmentManager()
//                .findFragmentById(R.id.map);
//        mapFragment.getMapAsync(this);

        PermissionListener permissionlistener = new PermissionListener() {
            @Override
            public void onPermissionGranted() {
                isLocationPermissionGranted = true;
                if(googleMap != null) {
                    googleMap.setMyLocationEnabled(true);
                }
            }

            @Override
            public void onPermissionDenied(ArrayList<String> deniedPermissions) {
                isLocationPermissionGranted = false;
                Toast.makeText(mContext, "Permission Denied\n" + deniedPermissions.toString(), Toast.LENGTH_SHORT).show();
            }


        };

        TedPermission.with(mContext)
                .setPermissionListener(permissionlistener)
                .setDeniedMessage("If you reject permission,you can not use this service\n\nPlease turn on permissions at [Setting] > [Permission]")
                .setPermissions(Manifest.permission.ACCESS_COARSE_LOCATION)
                .check();

        View rootView = inflater.inflate(R.layout.fragment_map, container, false);
        mMapView = (MapView) rootView.findViewById(R.id.mapView);
        mMapView.onCreate(savedInstanceState);

        mSearchView =  rootView.findViewById(R.id.floating_search_view);

        mMessageDBAdapter = MessageDBAdapter.getInstance(mContext.getApplicationContext());
        mMessageDBAdapter.open();

        List<Station> wrStations = mMessageDBAdapter.retriveAllWesternLineStation();
        List<Station> crStations = mMessageDBAdapter.retriveAllCentralLineStation();
        List<Station> hrStations = mMessageDBAdapter.retriveAllHarberLineStation();

        combined = new ArrayList<Station>();
        combined.addAll(wrStations);
        combined.addAll(crStations);
        combined.addAll(hrStations);

        mMapView.onResume(); // needed to get the map to display immediately

        try {
            MapsInitializer.initialize(getActivity().getApplicationContext());
        } catch (Exception e) {
            e.printStackTrace();
        }

        mMapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap mMap) {
                googleMap = mMap;
                if (isLocationPermissionGranted) {

                }

                if (mMapView != null &&
                        mMapView.findViewById(Integer.parseInt("1")) != null) {
                    // Get the button view
                    View locationButton = ((View) mMapView.findViewById(Integer.parseInt("1")).getParent()).findViewById(Integer.parseInt("2"));
                    // and next place it, on bottom right (as Google Maps app)
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams)
                            locationButton.getLayoutParams();
                    // position on right bottom
                    layoutParams.addRule(RelativeLayout.ALIGN_PARENT_TOP, 0);
                    layoutParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
                    layoutParams.setMargins(0, 0, 30, 30);
                }

                StationCollection tStationCollection=new StationCollection();
                List<Station> allLocalStationList=  tStationCollection.getAllStationLocationList();
                List<LatLng> wStationLocations = new ArrayList<LatLng>();
                List<LatLng> cStationLocations = new ArrayList<LatLng>();
                List<LatLng> hStationLocations = new ArrayList<LatLng>();

                for(Station station : combined) {
                    if(station.getLocation() != null) {
                        googleMap.addMarker(new MarkerOptions().position(station.getLocation())
                                .title(station.getName())
                                .icon(BitmapDescriptorFactory
                                        .fromResource(R.drawable.ic_train_map))
                                .flat(true)
                        ).setTag(station);
                        switch (station.getLineIndicator()) {
                            case LineIndicator.WESTERN:
                                wStationLocations.add(station.getLocation());
                                break;
                            case LineIndicator.CENTER:
                                cStationLocations.add(station.getLocation());
                                break;
                            case LineIndicator.HARBOUR:
                                hStationLocations.add(station.getLocation());
                                break;
                        }
                    }
                }
                googleMap.addPolyline(new PolylineOptions().geodesic(true).addAll(wStationLocations).color(Color.GREEN));
                googleMap.addPolyline(new PolylineOptions().geodesic(true).addAll(cStationLocations).color(Color.MAGENTA));
                googleMap.addPolyline(new PolylineOptions().geodesic(true).addAll(hStationLocations).color(Color.BLACK));


                List<Station> stations = MetroStationDataProvider.getMetroStations();
                List<LatLng> metorStationLocations = new ArrayList<LatLng>();
                for(int i=0; i < stations.size(); i++) {
                 Marker added =  googleMap.addMarker(new MarkerOptions().position(stations.get(i).getLocation())
                            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))
//                            .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_name))
                            .title(stations.get(i).getName()));
                    metorStationLocations.add(stations.get(i).getLocation());
                }
                googleMap.addPolyline(new PolylineOptions().geodesic(true).addAll(metorStationLocations).color(Color.GRAY));

                stations = MonoStationDataProvider.getMonoStation();
                List<LatLng> monoStationLocations = new ArrayList<LatLng>();
                for(int i=0; i < stations.size(); i++) {
                    Marker added =  googleMap.addMarker(new MarkerOptions().position(stations.get(i).getLocation())
                            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
//                            .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_name))
                            .title(stations.get(i).getName()));
                    monoStationLocations.add(stations.get(i).getLocation());
                }
                googleMap.addPolyline(new PolylineOptions().geodesic(true).addAll(monoStationLocations).color(Color.BLUE));

                CameraPosition cameraPosition = new CameraPosition.Builder().target(stations.get(0).getLocation()).zoom(12).build();
                googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));

                googleMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
                    @Override
                    public void onInfoWindowClick(Marker marker) {
                        Station station = (Station) marker.getTag();
                        startUpDownActivity(station);
                    }
                });

            }
        });
        setupSearchBar();
        setupDrawer();


        return rootView;
    }

    private void setupDrawer() {
        attachSearchViewActivityDrawer(mSearchView);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
    }


    @Override
    public void onResume() {
        super.onResume();
//        mMapView.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
//        mMapView.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
//        mMapView.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
//        mMapView.onLowMemory();
    }

    public void setCamera() {

        LatLng VERSOVA = new LatLng(19.13035, 72.82145);
        CameraPosition cameraPosition = new CameraPosition.Builder().target(VERSOVA).zoom(20).build();
        googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
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
                    findSuggestions(mContext, newQuery, 5,
                            FIND_SUGGESTION_SIMULATED_DELAY, new DataHelper.OnFindSuggestionsListener() {

                                @Override
                                public void onResults(List<Station> results) {

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
            public void onSuggestionClicked(final com.arlib.floatingsearchview.suggestions.model.SearchSuggestion searchSuggestion) {
                Station stationLocation = ((Station) searchSuggestion);
                CameraPosition cameraPosition = new CameraPosition.Builder().target(stationLocation.getLocation()).zoom(20).build();
                googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                mSearchView.clearSearchFocus();
                mSearchView.setSearchBarTitle(searchSuggestion.getBody());

                Marker added = googleMap.addMarker(new MarkerOptions().position(stationLocation.getLocation())
                                .title(stationLocation.getName())
                                .icon(BitmapDescriptorFactory
                                        .fromResource(R.drawable.ic_train_map)));
                added.setTag(stationLocation);
                added.showInfoWindow();


//                startUpDownActivity( (Station) searchSuggestion);
//
//                SearchSuggestion colorSuggestion = (SearchSuggestion) searchSuggestion;
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
//                    startVoiceRecognitionActivity();
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
                                         TextView textView, com.arlib.floatingsearchview.suggestions.model.SearchSuggestion item, int itemPosition) {
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

    private void startUpDownActivity(Station station) {
        Intent intent = new Intent(mContext, UpDownActivity.class);
        intent.putExtra("station_name", station.getName());
        intent.putExtra("stKey", station.getStationCode());
        intent.putExtra("line", station.getLineIndicator());
        startActivity(intent);
    }

    public void findSuggestions(Context context, String query, final int limit, final long simulatedDelay,
                                final DataHelper.OnFindSuggestionsListener listener) {
        new Filter() {

            @Override
            protected FilterResults performFiltering(CharSequence constraint) {

                try {
                    Thread.sleep(simulatedDelay);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                DataHelper.resetSuggestionsHistory();
                List<Station> suggestionList = new ArrayList<>();
                if (!(constraint == null || constraint.length() == 0)) {

                    for (Station station : combined) {
                        if (station.getBody().toUpperCase()
                                .startsWith(constraint.toString().toUpperCase())) {

                            suggestionList.add(station);
                            if (limit != -1 && suggestionList.size() == limit) {
                                break;
                            }
                        }
                    }
                }

                FilterResults results = new FilterResults();
//                Collections.sort(suggestionList, new Comparator<SearchSuggestion>() {
//                    @Override
//                    public int compare(SearchSuggestion lhs, SearchSuggestion rhs) {
//                        return lhs.getIsHistory() ? -1 : 0;
//                    }
//                });
                results.values = suggestionList;
                results.count = suggestionList.size();

                return results;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {
                if (listener != null) {
                    listener.onResults((List<Station>) results.values);
                }
            }
        }.filter(query);

    }

    @Override
    public boolean onActivityBackPress() {
        if (!mSearchView.setSearchFocused(false)) {
            return false;
        }
        return true;
    }

}
