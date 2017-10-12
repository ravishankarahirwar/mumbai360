package mumbai.d360.data;



import java.util.List;

import mumbai.d360.database.contentvalue.TrainInfo;

public class TrackTracerDataManager {


//    public StationDataList westernlinestations;
//    public StationDataList centrallinestations;
//    public StationDataList harberlinestations;
//
//    public TrainData westernuptrains;
//    public TrainData centraluptrains;
//    public TrainData harberuptrains;
//
//    public TrainData westerndowntrains;
//    public TrainData centraldowntrains;
//    public TrainData harberdowntrains;
//
//    public TimeTableData westernuptimetable;
//    public TimeTableData centraluptimetable;
//    public TimeTableData harberuptimetable;
//
//    public TimeTableData westerndowntimetable;
//    public TimeTableData centraldowntimetable;
//    public TimeTableData harberdowntimetable;

    /**
     * Metro up means Ghatkopar to Versova
     */
    public List<TrainInfo> metrouptimetable;
    public List<TrainInfo> metrodowntimetable;

    /**
     * Mono up means Chambur to Wadala
     */
    public List<TrainInfo> monouptimetable;
    public List<TrainInfo> monodowntimetable;
}
