package mumbai.d360.model;

import android.os.Parcel;

import com.arlib.floatingsearchview.suggestions.model.SearchSuggestion;
import com.google.android.gms.maps.model.LatLng;

import mumbai.d360.searchdata.ColorSuggestion;

/**
 * Created by Ravishankar on 12/10/2016.
 */

public class Station implements SearchSuggestion {
    private String id;
    private String name;
    private String stationCode;
    private int lineIndicator;
    private LatLng location;
    private boolean mIsHistory = false;

    public Station() {
    }

    public Station(Parcel source) {
        this.name = source.readString();
        this.stationCode = source.readString();
        this.mIsHistory = source.readInt() != 0;
    }

    public Station(String id, String name, LatLng location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public Station(String id, String name, String stationCode, int lineIndicator) {
        this.id = id;
        this.name = name;
        this.stationCode = stationCode;
        this.lineIndicator = lineIndicator;
        this.location = location;
    }

    public boolean ismIsHistory() {
        return mIsHistory;
    }

    public void setmIsHistory(boolean mIsHistory) {
        this.mIsHistory = mIsHistory;
    }

    public String getStationCode() {
        return stationCode;
    }

    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }

    public int getLineIndicator() {
        return lineIndicator;
    }

    public void setLineIndicator(int lineIndicator) {
        this.lineIndicator = lineIndicator;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LatLng getLocation() {
        return location;
    }

    public void setLocation(LatLng location) {
        this.location = location;
    }



    public static final Creator<Station> CREATOR = new Creator<Station>() {
        @Override
        public Station createFromParcel(Parcel in) {
            return new Station(in);
        }

        @Override
        public Station[] newArray(int size) {
            return new Station[size];
        }
    };

    @Override
    public String getBody() {
        return name;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

    }
}
