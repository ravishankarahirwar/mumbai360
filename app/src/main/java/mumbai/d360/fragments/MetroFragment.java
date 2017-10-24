package mumbai.d360.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mumbai.d360.R;
import mumbai.d360.adapter.MetroMonoAdapter;
import mumbai.d360.adapter.StationNameAdapter;
import mumbai.d360.callbacks.OnStationSelect;
import mumbai.d360.dataprovider.metro.MetroStationDataProvider;
import mumbai.d360.model.Station;

import com.arlib.floatingsearchview.FloatingSearchView;
import com.google.android.gms.plus.PlusOneButton;


public class MetroFragment extends BaseFragment implements AppBarLayout.OnOffsetChangedListener {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final int PLUS_ONE_REQUEST_CODE = 0;
    private final String PLUS_ONE_URL = "http://developer.android.com";
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private PlusOneButton mPlusOneButton;

    private OnStationSelect mListener;
    private MetroMonoAdapter mAdapter;
    private RecyclerView mRecyclerView;
    private FloatingSearchView mSearchView;
    private AppBarLayout mAppBar;

    public MetroFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MetroFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MetroFragment newInstance(String param1, String param2) {
        MetroFragment fragment = new MetroFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_metro, container, false);
        mSearchView =  rootView.findViewById(R.id.floating_search_view);

        mAppBar = rootView.findViewById(R.id.appbar);
        mAppBar.addOnOffsetChangedListener(this);

        //Find the +1 button
//        mPlusOneButton = (PlusOneButton) rootView.findViewById(R.id.plus_one_button);
        mRecyclerView = (RecyclerView)rootView.findViewById(R.id.metro_station_list);

        mAdapter = new MetroMonoAdapter(MetroStationDataProvider.getMetroStations(), mListener);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(mAdapter);

        return rootView;
    }

    @Override
    public void onResume() {
        super.onResume();

        // Refresh the state of the +1 button each time the activity receives focus.
//        mPlusOneButton.initialize(PLUS_ONE_URL, PLUS_ONE_REQUEST_CODE);
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnStationSelect) {
            mListener = (OnStationSelect) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnMetroStationClickListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnMetroStationClickListener {
        // TODO: Update argument type and name
        void onMetroStationSelect(Station station);
    }

    @Override
    public boolean onActivityBackPress() {
        return false;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setupDrawer();
    }

    private void setupDrawer() {
        attachSearchViewActivityDrawer(mSearchView);
    }

    @Override
    public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
        mSearchView.setTranslationY(verticalOffset);
    }
}
