package mumbai.d360.adapter;

import java.util.List;

import mumbai.d360.R;
import mumbai.d360.model.Train;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;



public class SingleTrainInfoAdapter extends BaseAdapter{
	 private List<Train> mTrinInfoList;
	 private Context context;
	 private LayoutInflater mInflater;
	 String lastTime=null;
	 int bgColor;
	 Typeface ledFont,stationFont;
	 String stationName;
	public SingleTrainInfoAdapter(Context context,List<Train> trainInfoList,int color,String stationName) {
		this.context=context;
		this.mTrinInfoList=trainInfoList;
		mInflater=LayoutInflater.from(context);
		bgColor=color;
//		ledFont= Typeface.createFromAsset(context.getAssets(), "LCD-BOLD.TTF");
//		stationFont= Typeface.createFromAsset(context.getAssets(), "Roboto-Light.ttf");
		this.stationName=stationName;
		
	} 

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mTrinInfoList.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int location, View convertView, ViewGroup arg2) {
		ViewHolder tViewHolder = null;
		if(convertView==null||convertView.getTag()==null){
			
			convertView=mInflater.inflate(R.layout.show_singletrain_schedule, null);
			
			if (location % 2 == 0) {
				convertView.setBackgroundColor(Color.WHITE);
			} else {
				convertView.setBackgroundResource(R.color.colorPrimary);
			}
			
			tViewHolder=new ViewHolder();
			tViewHolder.no=(TextView)convertView.findViewById(R.id.no);
			tViewHolder.time=(TextView)convertView.findViewById(R.id.time);
			tViewHolder.station=(TextView)convertView.findViewById(R.id.station);
			tViewHolder.time.setTypeface(ledFont);
			tViewHolder.station.setTypeface(stationFont);
			tViewHolder.no.setTypeface(stationFont);
			
		}else{
			tViewHolder=(ViewHolder)convertView.getTag();
		}
		if(mTrinInfoList.get(location).getStationKey().toString().equalsIgnoreCase(stationName)){
		tViewHolder.no.setTextSize(18);
		tViewHolder.time.setTextSize(18);
		tViewHolder.station.setTextSize(18);
		}else{
			tViewHolder.no.setTextSize(14);
			tViewHolder.time.setTextSize(14);
			tViewHolder.station.setTextSize(14);
		}
		tViewHolder.no.setText(""+(location+1));
		tViewHolder.time.setText(mTrinInfoList.get(location).getTime());
		tViewHolder.station.setText(mTrinInfoList.get(location).getStationKey().toString());
		
		
		return convertView;
	}
	
	static class ViewHolder{
		 TextView no;
		 TextView time;
		 TextView station;
		 TextView duration;
	}
	
}
