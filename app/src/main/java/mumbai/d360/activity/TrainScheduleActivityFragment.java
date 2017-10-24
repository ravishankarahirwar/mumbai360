package mumbai.d360.activity;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Typeface;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

import mumbai.d360.R;
import mumbai.d360.adapter.SingleTrainInfoAdapter;
import mumbai.d360.database.TrackTracerDataBaseAdapter;
import mumbai.d360.database.contentvalue.TrainInfo;
import mumbai.d360.database.offlinedb.MessageDBAdapter;
import mumbai.d360.model.Train;
import mumbai.d360.utils.Direction;
import mumbai.d360.utils.LineIndicator;

/**
 * A placeholder fragment containing a simple view.
 */
public class TrainScheduleActivityFragment extends Fragment {

    List<TrainInfo> mTrinInfoList;
//    UpTrainAdapter mUpTrainAdapter;
    ListView mListView;
    Cursor mCursor;
    int bgColor;
    int line,direction;
    String trainShareText="";
    String trainShareSubject="";
    String trainSourceDestination;
    List<Train> singleTrainInfo = null;
//    private ShareActionProvider mShareActionProvider;
    String stationName;
    TextView no,time,station;
    Typeface custom_font;
    Context mContext;

    public TrackTracerDataBaseAdapter mTrackTracerDataBaseAdapter;
    private MessageDBAdapter mMessageDBAdapter;
    
    public TrainScheduleActivityFragment() {
    }
    
    

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mTrackTracerDataBaseAdapter = new TrackTracerDataBaseAdapter(getContext());
        mTrackTracerDataBaseAdapter.open();

        mMessageDBAdapter = MessageDBAdapter.getInstance(getContext().getApplicationContext());
        mMessageDBAdapter.open();

        View rootView = inflater.inflate(R.layout.fragment_train_schedule, container, false);



        mListView = (ListView) rootView.findViewById(R.id.list1);
        no = (TextView) rootView.findViewById(R.id.no);
        time = (TextView) rootView.findViewById(R.id.time);
        station = (TextView) rootView.findViewById(R.id.station);
//        custom_font= Typeface.createFromAsset(this.getAssets(), "Roboto-Light.ttf");
//        no.setTypeface(custom_font);
//        time.setTypeface(custom_font);
//        station.setTypeface(custom_font);


        return rootView;
        
    }

    public void onTrainSeclected(String trainkey,String source_destination,int lineindicator,int traindirection) {

        String trainNo= trainkey;
        trainSourceDestination =source_destination;
        line = lineindicator;
        direction = traindirection;

        if(line == LineIndicator.WESTERN && direction == Direction.UP){
            singleTrainInfo= mMessageDBAdapter.retriveSingleTrain(trainNo,line,direction);
        }else if(line == LineIndicator.WESTERN && direction == Direction.DOWN){
            singleTrainInfo= mMessageDBAdapter.retriveSingleTrain(trainNo,line,direction);
        }else if(line == LineIndicator.CENTER && direction == Direction.UP){
            singleTrainInfo= mMessageDBAdapter.retriveSingleTrain(trainNo,line,direction);
        }else if(line == LineIndicator.CENTER && direction == Direction.DOWN){
            singleTrainInfo= mMessageDBAdapter.retriveSingleTrain(trainNo,line,direction);
        }else if(line == LineIndicator.HARBOUR && direction == Direction.UP){
            singleTrainInfo= mMessageDBAdapter.retriveSingleTrain(trainNo,line,direction);
        }else if(line == LineIndicator.HARBOUR && direction == Direction.DOWN){
            singleTrainInfo= mMessageDBAdapter.retriveSingleTrain(trainNo,line,direction);
        }
        else if(line == LineIndicator.METRO && direction == Direction.UP){
            singleTrainInfo = mTrackTracerDataBaseAdapter.retriveSingleTrain(trainNo,LineIndicator.METRO,direction);
        }else if(line == LineIndicator.METRO && direction == Direction.DOWN){
            singleTrainInfo = mTrackTracerDataBaseAdapter.retriveSingleTrain(trainNo,LineIndicator.METRO,direction);
        }
        else if(line == LineIndicator.MONO && direction == Direction.UP){
            singleTrainInfo= mTrackTracerDataBaseAdapter.retriveSingleTrain(trainNo,line,direction);
        }else if(line == LineIndicator.MONO && direction == Direction.DOWN){
            singleTrainInfo= mTrackTracerDataBaseAdapter.retriveSingleTrain(trainNo,line,direction);
        }

        mListView.setAdapter(new SingleTrainInfoAdapter(getContext(),singleTrainInfo,bgColor,stationName));
    }

    // Call to update the share intent
    public void setShareIntent() {
            trainShareSubject="[ "+trainSourceDestination+" ]\n";

            for(int i=0;i<singleTrainInfo.size();i++){
                if(singleTrainInfo.get(i).getStationKey().equalsIgnoreCase(stationName))
                    trainShareText+="[ "+singleTrainInfo.get(i).getStationKey() +"* - "+singleTrainInfo.get(i).getTime() +" ]\n";
                else
                    trainShareText+="[ "+singleTrainInfo.get(i).getStationKey() +" - "+singleTrainInfo.get(i).getTime() +" ]\n";
            }
        Intent shareIntent = new Intent();
         shareIntent.setAction(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            String shareBody = trainShareText;
            shareIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, trainShareSubject);
            shareIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
            mContext.startActivity(Intent.createChooser(shareIntent, "Share Train"));
        }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
    }
}
