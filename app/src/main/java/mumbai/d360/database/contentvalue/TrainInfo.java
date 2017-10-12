package mumbai.d360.database.contentvalue;

public class TrainInfo {
	public String trainId;
	public String[] stationName;
	public String[] time;
	public String type;

	public TrainInfo() {
	}
	public TrainInfo(String trainId) {
		this.trainId = trainId;

	}
	public TrainInfo(String trainId, String type) {
		this(trainId);
		this.type = type;
	}
	public TrainInfo(String trainId,String type, String[] stationName) {
		this(trainId,type);
		this.stationName = stationName;

	}
	public TrainInfo(String trainId, String type,String[] stationName, String[] time) {
		this(trainId,type,stationName);
		this.time = time;

	}

	public String getTrainId() {
		return trainId;
	}
	public void setTrainId(String trainId) {
		this.trainId = trainId;
	}
	public String[] getStationName() {
		return stationName;
	}
	public void setStationName(String[] stationName) {
		this.stationName = stationName;
	}
	public String[] getTime() {
		return time;
	}
	public void setTime(String[] time) {
		this.time = time;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}



}
