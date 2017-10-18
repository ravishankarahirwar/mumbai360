package mumbai.d360.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import mumbai.d360.R;
import mumbai.d360.callbacks.OnStationSelect;
import mumbai.d360.callbacks.OnTrainSelect;
import mumbai.d360.model.Station;
import mumbai.d360.model.Train;
import mumbai.d360.viewholders.UpDownViewHolder;

/**
 * Created by Ravishankar on 12/10/2016.
 */

public class UpDownAdapter extends RecyclerView.Adapter<UpDownViewHolder> {
    private List<Train> mValues;
    private OnTrainSelect mListener;
    Typeface custom_font,ledFont,fireFont;


    public UpDownAdapter(Context context, List<Train> values, OnTrainSelect listener) {
        this.mValues = values;
        this.mListener = listener;
        fireFont= Typeface.createFromAsset(context.getAssets(), "FasterOne-Regular.ttf");
    }

    @Override
    public UpDownViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
               .inflate(R.layout.item_updown, parent, false);

        return new UpDownViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final UpDownViewHolder holder, int position) {
        holder.train = mValues.get(position);
        holder.fromStationName.setText(holder.train.getSource());
        holder.toStationName.setText(holder.train.getDestination());
        holder.time.setText(holder.train.getTime());
        holder.noOfBogi.setText(holder.train.getCars());
        if(holder.train.getSpeed().equalsIgnoreCase("Fast")){
            holder.time.setTypeface(fireFont);
        }
        holder.rootView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.onTrainSelect(holder.train);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }
}
