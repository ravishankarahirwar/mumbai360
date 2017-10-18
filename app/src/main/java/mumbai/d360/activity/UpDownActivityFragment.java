package mumbai.d360.activity;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

import mumbai.d360.R;
import mumbai.d360.adapter.StationNameAdapter;
import mumbai.d360.adapter.UpDownAdapter;
import mumbai.d360.callbacks.OnStationSelect;
import mumbai.d360.callbacks.OnTrainSelect;
import mumbai.d360.data.StationCode;
import mumbai.d360.database.TrackTracerDataBaseAdapter;
import mumbai.d360.database.offlinedb.MessageDBAdapter;
import mumbai.d360.dataprovider.local.LocalStationsName;
import mumbai.d360.dataprovider.metro.MetroStationDataProvider;
import mumbai.d360.dataprovider.metro.MetroStationNames;
import mumbai.d360.dataprovider.mono.MonoStationName;
import mumbai.d360.model.Station;
import mumbai.d360.model.Train;
import mumbai.d360.utils.LineIndicator;
import mumbai.d360.utils.TrainConstants;

import static android.R.attr.lines;

/**
 * A placeholder fragment containing a simple view.
 */
public class UpDownActivityFragment extends Fragment {
    private Context mContext;
    private RecyclerView mUpList;
    private RecyclerView mDownList;
    private OnTrainSelect mListener;
    private UpDownAdapter mAdapterUp, mAdapterDown;
    private List<Train> tAllUpTrain,tAllDownTrain;
    public TrackTracerDataBaseAdapter mTrackTracerDataBaseAdapter;
    private MessageDBAdapter mMessageDBAdapter;

    public UpDownActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_up_down, container, false);
        mUpList = (RecyclerView)rootView.findViewById(R.id.up_list);
        mDownList = (RecyclerView)rootView.findViewById(R.id.down_list);

        mTrackTracerDataBaseAdapter = new TrackTracerDataBaseAdapter(mContext);
        mTrackTracerDataBaseAdapter.open();

        mMessageDBAdapter = MessageDBAdapter.getInstance(mContext.getApplicationContext());
        mMessageDBAdapter.open();


        return rootView;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnTrainSelect) {
            mListener = (OnTrainSelect) context;
            mContext = context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnMetroStationClickListener");
        }
    }

    public void onStationSelect(Station station) {

        switch (station.getLineIndicator()) {
            case LineIndicator.WESTERN :
                tAllUpTrain = mMessageDBAdapter.retriveAllWesternUPTrainByStation(station.getStationCode());
                tAllDownTrain = mMessageDBAdapter.retriveAllWesternDownTrainByStation(station.getStationCode());

                break;
            case LineIndicator.CENTER :

                tAllUpTrain = mMessageDBAdapter.retriveAllCentralUPTrainByStation(station.getStationCode());
                tAllDownTrain = mMessageDBAdapter.retriveAllCentralDownTrainByStation(station.getStationCode());

                break;
            case LineIndicator.HARBOUR :
                tAllUpTrain = mMessageDBAdapter.retriveAllHarberUPTrainByStation(station.getStationCode());
                tAllDownTrain = mMessageDBAdapter.retriveAllHarberDownTrainByStation(station.getStationCode());
                break;
            case LineIndicator.METRO :
                break;
            case LineIndicator.MONO :
                break;
        }

//        tAllUpTrain = mTrackTracerDataBaseAdapter.retriveAllMONOUPTrainByStation(MonoStationName.WADALA);
//        tAllDownTrain = mTrackTracerDataBaseAdapter.retriveAllMONODownTrainByStation(MonoStationName.WADALA);

        mAdapterUp = new UpDownAdapter(mContext, tAllUpTrain, mListener);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        mUpList.setLayoutManager(mLayoutManager);
        mUpList.setItemAnimator(new DefaultItemAnimator());
        mUpList.setAdapter(mAdapterUp);
//        mUpList.smoothScrollToPosition(TrainConstants.UP_SELECTED_TRAIN_POSITION);
        mUpList.getLayoutManager().scrollToPosition(TrainConstants.UP_SELECTED_TRAIN_POSITION);


        mAdapterDown = new UpDownAdapter(mContext, tAllDownTrain, mListener);
        RecyclerView.LayoutManager mLayoutManager1 = new LinearLayoutManager(getActivity().getApplicationContext());
        mDownList.setLayoutManager(mLayoutManager1);
        mDownList.setItemAnimator(new DefaultItemAnimator());
        mDownList.setAdapter(mAdapterDown);
        mDownList.getLayoutManager().scrollToPosition(TrainConstants.DOWN_SELECTED_TRAIN_POSITION);
    }
}
