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

import mumbai.d360.R;
import mumbai.d360.adapter.StationNameAdapter;
import mumbai.d360.callbacks.OnStationSelect;
import mumbai.d360.dataprovider.metro.MetroStationDataProvider;
import mumbai.d360.dataprovider.mono.MonoStationDataProvider;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link MonoFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MonoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MonoFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnStationSelect mListener;
    private StationNameAdapter mAdapter;
    private RecyclerView mRecyclerView;


    public MonoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MonoFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MonoFragment newInstance(String param1, String param2) {
        MonoFragment fragment = new MonoFragment();
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
        View rootView = inflater.inflate(R.layout.fragment_mono, container, false);


        mRecyclerView = (RecyclerView)rootView.findViewById(R.id.mono_station_list);

        mAdapter = new StationNameAdapter(MonoStationDataProvider.getMonoStation(), mListener);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(mAdapter);
        return rootView;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnStationSelect) {
            mListener = (OnStationSelect) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnStationSelect");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }
}
