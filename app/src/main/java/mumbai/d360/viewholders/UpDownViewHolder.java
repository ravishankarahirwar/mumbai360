package mumbai.d360.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import mumbai.d360.R;
import mumbai.d360.model.Station;
import mumbai.d360.model.Train;

/**
 * Created by Ravishankar on 12/10/2016.
 */

public class UpDownViewHolder extends RecyclerView.ViewHolder {
    public View rootView;
    public TextView fromStationName;
    public TextView toStationName;
    public TextView noOfBogi;
    public TextView stationName;
    public TextView time;
    public Train train;

    public UpDownViewHolder(View view) {
        super(view);
        rootView = view;
        fromStationName = (TextView) view.findViewById(R.id.from_stationname);
        toStationName = (TextView) view.findViewById(R.id.to_stationname);
        noOfBogi = (TextView) view.findViewById(R.id.no_of_bogi);
        time = (TextView) view.findViewById(R.id.time);


    }
}
