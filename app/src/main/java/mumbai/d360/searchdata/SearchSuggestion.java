package mumbai.d360.searchdata;

import android.os.Parcel;

import com.google.android.gms.maps.model.LatLng;

/**
 * Copyright (C) 2015 Ari C.
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

public class SearchSuggestion implements com.arlib.floatingsearchview.suggestions.model.SearchSuggestion {
    private String id;
    private String name;
    private String stationCode;
    private int lineIndicator;
    private LatLng location;

    private String mColorName;
    private boolean mIsHistory = false;

    public SearchSuggestion(String suggestion, String stationCode) {
        this.mColorName = suggestion.toLowerCase();
        this.stationCode = stationCode;
    }

    public SearchSuggestion(Parcel source) {
        this.mColorName = source.readString();
        this.stationCode = source.readString();
        this.mIsHistory = source.readInt() != 0;
    }

    public void setIsHistory(boolean isHistory) {
        this.mIsHistory = isHistory;
    }

    public boolean getIsHistory() {
        return this.mIsHistory;
    }

    public String getStationCode() {
        return stationCode;
    }

    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }

    @Override
    public String getBody() {
        return mColorName;
    }

    public static final Creator<SearchSuggestion> CREATOR = new Creator<SearchSuggestion>() {
        @Override
        public SearchSuggestion createFromParcel(Parcel in) {
            return new SearchSuggestion(in);
        }

        @Override
        public SearchSuggestion[] newArray(int size) {
            return new SearchSuggestion[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mColorName);
        dest.writeString(stationCode);
        dest.writeInt(mIsHistory ? 1 : 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLineIndicator() {
        return lineIndicator;
    }

    public void setLineIndicator(int lineIndicator) {
        this.lineIndicator = lineIndicator;
    }
}