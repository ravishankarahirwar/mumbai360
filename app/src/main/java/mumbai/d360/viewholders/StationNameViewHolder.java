package mumbai.d360.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import mumbai.d360.R;
import mumbai.d360.model.Station;

/**
 * Created by Ravishankar on 12/10/2016.
 */

public class StationNameViewHolder extends RecyclerView.ViewHolder {
    public View rootView;
    public TextView stationName;
    public Station station;

    public StationNameViewHolder(View view) {
        super(view);
        rootView = view;
        stationName = (TextView) view.findViewById(R.id.station_name);
    }
}
