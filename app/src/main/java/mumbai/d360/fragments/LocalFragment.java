package mumbai.d360.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import mumbai.d360.R;
import mumbai.d360.adapter.StationNameAdapter;
import mumbai.d360.callbacks.OnStationSelect;
import mumbai.d360.database.offlinedb.MessageDBAdapter;
import mumbai.d360.dataprovider.metro.MetroStationDataProvider;
import mumbai.d360.model.Station;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link LocalFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link LocalFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LocalFragment extends Fragment {

    private RecyclerView mHarberLine;
    private RecyclerView mCentralLine;
    private RecyclerView mWestrnLine;

    private OnStationSelect mListener;
    private Context mContext;
    MessageDBAdapter mMessageDBAdapter;


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
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_local, container, false);
        mHarberLine = (RecyclerView)rootView.findViewById(R.id.harbour_line);
        mCentralLine = (RecyclerView)rootView.findViewById(R.id.center_line);
        mWestrnLine = (RecyclerView)rootView.findViewById(R.id.western_line);

        mMessageDBAdapter = MessageDBAdapter.getInstance(mContext.getApplicationContext());
        mMessageDBAdapter.open();
        List<Station> wrStations = mMessageDBAdapter.retriveAllWesternLineStation();
        List<Station> crStations = mMessageDBAdapter.retriveAllCentralLineStation();
        List<Station> hrStations = mMessageDBAdapter.retriveAllHarberLineStation();


        StationNameAdapter wrStationAdapter = new StationNameAdapter(wrStations, mListener);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        mWestrnLine.setLayoutManager(mLayoutManager);
        mWestrnLine.setItemAnimator(new DefaultItemAnimator());
        mWestrnLine.setAdapter(wrStationAdapter);

        StationNameAdapter crStationAdapter = new StationNameAdapter(crStations, mListener);
        RecyclerView.LayoutManager mLayoutManager1 = new LinearLayoutManager(getActivity().getApplicationContext());
        mCentralLine.setLayoutManager(mLayoutManager1);
        mCentralLine.setItemAnimator(new DefaultItemAnimator());
        mCentralLine.setAdapter(crStationAdapter);


        StationNameAdapter hrStationAdapter = new StationNameAdapter(hrStations, mListener);
        RecyclerView.LayoutManager mLayoutManager2 = new LinearLayoutManager(getActivity().getApplicationContext());
        mHarberLine.setLayoutManager(mLayoutManager2);
        mHarberLine.setItemAnimator(new DefaultItemAnimator());
        mHarberLine.setAdapter(hrStationAdapter);
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

}
