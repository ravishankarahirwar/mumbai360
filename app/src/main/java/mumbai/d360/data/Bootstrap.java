package mumbai.d360.data;

import com.google.android.gms.maps.model.LatLng;

public class Bootstrap {
public LatLng stationLocation;
public String stationName;
public String code;
public String lineName;
public LatLng getStationLocation() {
	return stationLocation;
}
public void setStationLocation(LatLng stationLocation) {
	this.stationLocation = stationLocation;
}
public String getStationName() {
	return stationName;
}
public void setStationName(String stationName) {
	this.stationName = stationName;
}
public Bootstrap(){

}
public Bootstrap(LatLng stationLocation, String stationName) {
	super();
	this.stationLocation = stationLocation;
	this.stationName = stationName;
}
public Bootstrap(LatLng stationLocation, String stationName, String lineName) {
	super();
	this.stationLocation = stationLocation;
	this.stationName = stationName;
	this.lineName = lineName;
}

public Bootstrap(LatLng stationLocation, String stationName, String code,String lineName) {
	super();
	this.stationLocation = stationLocation;
	this.stationName = stationName;
	this.code = code;
	this.lineName = lineName;
}

}
