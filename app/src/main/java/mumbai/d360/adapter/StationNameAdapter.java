package mumbai.d360.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import mumbai.d360.R;
import mumbai.d360.callbacks.OnStationSelect;
import mumbai.d360.fragments.MetroFragment;
import mumbai.d360.model.Station;
import mumbai.d360.viewholders.StationNameViewHolder;
import mumbai.d360.fragments.MetroFragment.OnMetroStationClickListener;

/**
 * Created by Ravishankar on 12/10/2016.
 */

public class StationNameAdapter extends RecyclerView.Adapter<StationNameViewHolder> {
    private List<Station> mValues;
    private OnStationSelect mListener;

    public StationNameAdapter(List<Station> values, OnStationSelect listener) {
        this.mValues = values;
        this.mListener = listener;
    }

    @Override
    public StationNameViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
               .inflate(R.layout.item_station_name, parent, false);

        return new StationNameViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final StationNameViewHolder holder, int position) {
        holder.station = mValues.get(position);
        holder.stationName.setText(holder.station.getName());
        holder.stationName.setSelected(true);
        holder.rootView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.onStationSelect(holder.station);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }
}
