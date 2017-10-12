package mumbai.d360.database;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import mumbai.d360.dataprovider.metro.MetroStationNames;
import mumbai.d360.dataprovider.mono.MonoStationName;
import mumbai.d360.model.Train;
import mumbai.d360.utils.TrainConstants;

@SuppressLint("SimpleDateFormat")
public class TrackTracerDataBaseAdapter {
    protected static final String TAG = "MessageDBAdapter";

    private SQLiteDatabase mTrackTracerDataBase;

    private TrackTracerDataBase mTrackTracerHelper;
    private SimpleDateFormat simpleDateFormat;

    @SuppressLint("SimpleDateFormat")
    public TrackTracerDataBaseAdapter(Context context) {
        mTrackTracerHelper = new TrackTracerDataBase(context);
        simpleDateFormat = new SimpleDateFormat("HH:mm");
    }


    public TrackTracerDataBaseAdapter open() throws SQLException {
        try {

            mTrackTracerDataBase = mTrackTracerHelper.getReadableDatabase();
//        simpleDateFormat = new SimpleDateFormat("HH:mm");

        } catch (SQLException mSQLException) {
            Log.e(TAG, mSQLException.toString());
            throw mSQLException;
        }
        return this;
    }

    public void closargCatArre() {
        mTrackTracerHelper.close();
    }


//*******************************************************

////*****************WESTERN LINE OPERATION START************************
//
//    public List<Station> retriveAllWesternLineStation() {
//        List<Station> tAllHarberLineStation = new ArrayList<Station>();
//        Cursor mCursor = mTrackTracerDataBase.query(Asm.WESTERN_LINE_STATIONS, new String[]{ColumnsName.STATIONS.NAME, ColumnsName.STATIONS.CODE}, null, null, null, null, null);
//        mCursor.moveToFirst();
//        for (int i = 0; i < mCursor.getCount(); i++) {
//            Station tStation = new Station();
//            tStation.stationName = mCursor.getString(0);
//            tStation.code = mCursor.getString(1);
//            tAllHarberLineStation.add(tStation);
//            mCursor.moveToNext();
//        }
//        mCursor.close();
//
//        return tAllHarberLineStation;
//    }
//
//    public List<Train> retriveAllWesternUPTrainByStation(String stationKey) {
//
//        List<String> trainsTime = new ArrayList<String>();
//        List<String> allWesternUPTrainTimeShortedList = new ArrayList<String>();
//
//        boolean tempFindListSelection = true;
//        String currentDateandTime = simpleDateFormat.format(new Date());
//        Date currentTime = null;
//        try {
//            currentTime = simpleDateFormat.parse(currentDateandTime);
//        } catch (ParseException e1) {
//            e1.printStackTrace();
//        }
//
//        List<Train> tAllHarberLineUpTrain = new ArrayList<Train>();
//        Cursor mCursor = mTrackTracerDataBase.query(Asm.WESTERN_UP_TRAIN_TIMETABLE, new String[]{"trainkey", "time"}, "stkey='" + stationKey + "'", null, null, null, "time");
//        while (mCursor.moveToNext()) {
//            Train tTrain = new Train();
//
//            tTrain.trainKey = mCursor.getString(0);
//
//            tTrain.time = mCursor.getString(1);
//            trainsTime.add(tTrain.time);
//            allWesternUPTrainTimeShortedList.add(tTrain.time);
//
//            SourceDestination tSourceDestination = getSourceDestinationByTrainNo(mCursor.getString(0));
//            ;
//            tTrain.source = tSourceDestination.source;
//            tTrain.destination = tSourceDestination.destination;
//            tTrain.cars = tSourceDestination.cars;
//            tTrain.feature = tSourceDestination.feature;
//            tTrain.speed = tSourceDestination.speed;
//
//            tAllHarberLineUpTrain.add(tTrain);
//
//        }
//        /**
//         * Findind first train accordint to current time
//         * */
//        Collections.sort(allWesternUPTrainTimeShortedList);
//        try {
//            for (int i = 0; i < allWesternUPTrainTimeShortedList.size(); i++) {
//                Date trainTime = simpleDateFormat.parse(allWesternUPTrainTimeShortedList.get(i).toString());
//                if (tempFindListSelection && ((trainTime.compareTo(currentTime) > 0) || (trainTime.compareTo(currentTime) == 0))) {
//                    TrainConstants.UP_SELECTED_TRAIN_POSITION = trainsTime.indexOf(allWesternUPTrainTimeShortedList.get(i).toString());
//                    tempFindListSelection = false;
//                    break;
//                }
//
//            }
//        } catch (ParseException e) {
//            TrainConstants.UP_SELECTED_TRAIN_POSITION = 0;
//            e.printStackTrace();
//        }
//        mCursor.close();
//        return tAllHarberLineUpTrain;
//    }
//
//    public List<Train> retriveAllWesternDownTrainByStation(String stationKey) {
//        List<String> trainsTime = new ArrayList<String>();
//        List<Train> tAllWesternLineUpTrain = new ArrayList<Train>();
//        List<String> allWesternDownTrainTimeShortedList = new ArrayList<String>();
//
//        boolean tempFindListSelection = true;
//        String currentDateandTime = simpleDateFormat.format(new Date());
//        Date currentTime = null;
//        try {
//            currentTime = simpleDateFormat.parse(currentDateandTime);
//        } catch (ParseException e1) {
//            e1.printStackTrace();
//        }
//
//
//        Cursor mCursor = mTrackTracerDataBase.query(Asm.WESTERN_DOWN_TRAIN_TIMETABLE, new String[]{ColumnsName.TIMETABLE.TRAINKEY, ColumnsName.TIMETABLE.TIME}, ColumnsName.TIMETABLE.STKEY + "='" + stationKey + "'", null, null, null, "time");
//        while (mCursor.moveToNext()) {
//            Train tTrain = new Train();
//
//            tTrain.trainKey = mCursor.getString(0);
//            tTrain.time = mCursor.getString(1);
//
//            trainsTime.add(tTrain.time);
//            allWesternDownTrainTimeShortedList.add(tTrain.time);
//
//            final Cursor srecCursor = mTrackTracerDataBase.query(Asm.WESTERN_DOWN_TRAINS, new String[]{ColumnsName.TRAINS.STARTST, ColumnsName.TRAINS.DESTST, ColumnsName.TRAINS.CARS, ColumnsName.TRAINS.FEATURE, ColumnsName.TRAINS.SPEED}, ColumnsName.TRAINS.TRAINKEY + "='" + mCursor.getString(0) + "'", null, null, null, null);
//
//            try {
//                if (srecCursor.moveToFirst()) {
//
//                    tTrain.source = Boot.getHarberStationNameByCode(srecCursor.getString(0));
//                    tTrain.destination = Boot.getHarberStationNameByCode(srecCursor.getString(1));
//                    tTrain.cars = srecCursor.getString(2);
//                    tTrain.feature = srecCursor.getString(3);
//                    tTrain.speed = srecCursor.getString(4);
//                    tAllWesternLineUpTrain.add(tTrain);
//                }
//            } finally {
//                srecCursor.close();
//            }
//
//        }
//
//        /**
//         * Findind first train accordint to current time
//         * */
//        Collections.sort(allWesternDownTrainTimeShortedList);
//        try {
//            for (int i = 0; i < allWesternDownTrainTimeShortedList.size(); i++) {
//                Date trainTime = simpleDateFormat.parse(allWesternDownTrainTimeShortedList.get(i).toString());
//                if (tempFindListSelection && ((trainTime.compareTo(currentTime) > 0) || (trainTime.compareTo(currentTime) == 0))) {
//                    TrainConstants.DOWN_SELECTED_TRAIN_POSITION = trainsTime.indexOf(allWesternDownTrainTimeShortedList.get(i).toString());
//                    tempFindListSelection = false;
//                    break;
//                }
//
//            }
//        } catch (ParseException e) {
//            TrainConstants.UP_SELECTED_TRAIN_POSITION = 0;
//            e.printStackTrace();
//        }
//
//        mCursor.close();
//
//        return tAllWesternLineUpTrain;
//    }
//
//    public String getWesternUPTrainSourceDestinationByTrainNo(String TrainNo) {
//        String source_destination = null;
//        final Cursor srecCursor = mTrackTracerDataBase.query(Asm.WESTERN_UP_TRAINS, new String[]{ColumnsName.TRAINS.STARTST, ColumnsName.TRAINS.DESTST}, ColumnsName.TRAINS.TRAINKEY + "='" + TrainNo + "'", null, null, null, null);
//
//
//        if (srecCursor != null) {
//            try {
//                if (srecCursor.moveToFirst()) {
//                    source_destination = Boot.getHarberStationNameByCode(srecCursor.getString(0));
//                    source_destination += (" - " + Boot.getHarberStationNameByCode(srecCursor.getString(1)));
//                }
//            } finally {
//                srecCursor.close();
//            }
//        }
//
//
//        return source_destination;
//    }
//
//    public SourceDestination getSourceDestinationByTrainNo(String TrainNo) {
//        SourceDestination tSourceDestination = null;
//        final Cursor srecCursor = mTrackTracerDataBase.query(Asm.WESTERN_UP_TRAINS, new String[]{ColumnsName.TRAINS.STARTST, ColumnsName.TRAINS.DESTST, ColumnsName.TRAINS.CARS, ColumnsName.TRAINS.FEATURE, ColumnsName.TRAINS.SPEED}, ColumnsName.TRAINS.TRAINKEY + "='" + TrainNo + "'", null, null, null, null);
//
//
//        if (srecCursor != null) {
//            try {
//                if (srecCursor.moveToFirst()) {
//                    tSourceDestination = new SourceDestination();
//
//                    tSourceDestination.source = Boot.getHarberStationNameByCode(srecCursor.getString(0));
//                    tSourceDestination.destination = Boot.getHarberStationNameByCode(srecCursor.getString(1));
//
//                    tSourceDestination.cars = srecCursor.getString(2);
//                    tSourceDestination.feature = srecCursor.getString(3);
//                    tSourceDestination.speed = srecCursor.getString(4);
//                }
//            } finally {
//                srecCursor.close();
//            }
//        }
//
//
//        return tSourceDestination;
//    }
//
//    public SourceDestination getWesternDownTrainSourceDestinationByTrainNo(String TrainNo) {
//        SourceDestination tSourceDestination = null;
//        final Cursor srecCursor = mTrackTracerDataBase.query(Asm.WESTERN_DOWN_TRAINS, new String[]{ColumnsName.TRAINS.STARTST, ColumnsName.TRAINS.DESTST, ColumnsName.TRAINS.CARS, ColumnsName.TRAINS.FEATURE, ColumnsName.TRAINS.SPEED}, ColumnsName.TRAINS.TRAINKEY + "='" + TrainNo + "'", null, null, null, null);
//        if (srecCursor != null) {
//            try {
//                if (srecCursor.moveToFirst()) {
//                    tSourceDestination = new SourceDestination();
//
//                    tSourceDestination.source = Boot.getHarberStationNameByCode(srecCursor.getString(0));
//                    tSourceDestination.destination = Boot.getHarberStationNameByCode(srecCursor.getString(1));
//
//                    tSourceDestination.cars = srecCursor.getString(2);
//                    tSourceDestination.feature = srecCursor.getString(3);
//                    tSourceDestination.speed = srecCursor.getString(4);
//                }
//            } finally {
//                srecCursor.close();
//            }
//        }
//
//
//        return tSourceDestination;
//    }
//
//
////*****************WESTERN LINE OPERATION END************************
//
//    //*****************CENTRAL LINE OPERATION START************************
//    public List<Station> retriveAllCentralLineStation() {
//        List<Station> tAllHarberLineStation = new ArrayList<Station>();
//        Cursor mCursor = mTrackTracerDataBase.query(Asm.CENTRAL_LINE_STATIONS, new String[]{ColumnsName.STATIONS.NAME, ColumnsName.STATIONS.CODE}, null, null, null, null, null);
//
//        while (mCursor.moveToNext()) {
//            Station tStation = new Station();
//            tStation.stationName = mCursor.getString(0);
//            tStation.code = mCursor.getString(1);
//            tAllHarberLineStation.add(tStation);
//
//        }
//        mCursor.close();
//
//        return tAllHarberLineStation;
//    }
//
//    public List<Train> retriveAllCentralUPTrainByStation(String stationKey) {
//
//        List<String> trainsTime = new ArrayList<String>();
//        List<String> allCentralDownTrainTimeShortedList = new ArrayList<String>();
//
//        boolean tempFindListSelection = true;
//        String currentDateandTime = simpleDateFormat.format(new Date());
//        Date currentTime = null;
//        try {
//            currentTime = simpleDateFormat.parse(currentDateandTime);
//        } catch (ParseException e1) {
//            e1.printStackTrace();
//        }
//
//        List<Train> tAllCentralLineUpTrain = new ArrayList<Train>();
//        Cursor mCursor = mTrackTracerDataBase.query(Asm.CENTRAL_UP_TRAIN_TIMETABLE, new String[]{ColumnsName.TIMETABLE.TRAINKEY, ColumnsName.TIMETABLE.TIME}, ColumnsName.TIMETABLE.STKEY + "='" + stationKey + "'", null, null, null, "time");
//        while (mCursor.moveToNext()) {
//            Train tTrain = new Train();
//            tTrain.trainKey = mCursor.getString(0);
//            tTrain.time = mCursor.getString(1);
//
//            trainsTime.add(tTrain.time);
//            allCentralDownTrainTimeShortedList.add(tTrain.time);
//
//
//            SourceDestination tSourceDestination = getCentralUPTrainSourceDestinationByTrainNo(mCursor.getString(0));
//            tTrain.source = tSourceDestination.source;
//            tTrain.destination = tSourceDestination.destination;
//            tTrain.cars = tSourceDestination.cars;
//            tTrain.feature = tSourceDestination.feature;
//            tTrain.speed = tSourceDestination.speed;
//
//
//            tAllCentralLineUpTrain.add(tTrain);
//
//        }
//
//        /**
//         * Finding first train according to current time
//         * */
//        Collections.sort(allCentralDownTrainTimeShortedList);
//        try {
//            for (int i = 0; i < allCentralDownTrainTimeShortedList.size(); i++) {
//                Date trainTime = simpleDateFormat.parse(allCentralDownTrainTimeShortedList.get(i).toString());
//                if (tempFindListSelection && ((trainTime.compareTo(currentTime) > 0) || (trainTime.compareTo(currentTime) == 0))) {
//                    TrainConstants.UP_SELECTED_TRAIN_POSITION = trainsTime.indexOf(allCentralDownTrainTimeShortedList.get(i).toString());
//                    tempFindListSelection = false;
//                    break;
//                }
//
//            }
//        } catch (ParseException e) {
//            TrainConstants.UP_SELECTED_TRAIN_POSITION = 0;
//            e.printStackTrace();
//        }
//
//        mCursor.close();
//
//        mCursor.close();
//        return tAllCentralLineUpTrain;
//    }
//
//    public List<Train> retriveAllCentralDownTrainByStation(String stationKey) {
//        List<String> trainsTime = new ArrayList<String>();
//        List<String> allCentralDownTrainTimeShortedList = new ArrayList<String>();
//
//        boolean tempFindListSelection = true;
//        String currentDateandTime = simpleDateFormat.format(new Date());
//        Date currentTime = null;
//        try {
//            currentTime = simpleDateFormat.parse(currentDateandTime);
//        } catch (ParseException e1) {
//            e1.printStackTrace();
//        }
//
//        List<Train> tAllHarberLineUpTrain = new ArrayList<Train>();
//        Cursor mCursor = mTrackTracerDataBase.query(Asm.CENTRAL_DOWN_TRAIN_TIMETABLE, new String[]{ColumnsName.TIMETABLE.TRAINKEY, ColumnsName.TIMETABLE.TIME}, ColumnsName.TIMETABLE.STKEY + "='" + stationKey + "'", null, null, null, "time");
//        while (mCursor.moveToNext()) {
//            Train tTrain = new Train();
//            tTrain.trainKey = mCursor.getString(0);
//            tTrain.time = mCursor.getString(1);
//
//            trainsTime.add(tTrain.time);
//            allCentralDownTrainTimeShortedList.add(tTrain.time);
//
//            SourceDestination tSourceDestination = getCentralDownTrainSourceDestinationByTrainNo(mCursor.getString(0));
//            tTrain.source = tSourceDestination.source;
//            tTrain.destination = tSourceDestination.destination;
//            tTrain.cars = tSourceDestination.cars;
//            tTrain.feature = tSourceDestination.feature;
//            tTrain.speed = tSourceDestination.speed;
//
//            tAllHarberLineUpTrain.add(tTrain);
//        }
//
//        /**
//         * Findind first train accordint to current time
//         * */
//        Collections.sort(allCentralDownTrainTimeShortedList);
//        try {
//            for (int i = 0; i < allCentralDownTrainTimeShortedList.size(); i++) {
//                Date trainTime = simpleDateFormat.parse(allCentralDownTrainTimeShortedList.get(i).toString());
//                if (tempFindListSelection && ((trainTime.compareTo(currentTime) > 0) || (trainTime.compareTo(currentTime) == 0))) {
//                    TrainConstants.DOWN_SELECTED_TRAIN_POSITION = trainsTime.indexOf(allCentralDownTrainTimeShortedList.get(i).toString());
//                    tempFindListSelection = false;
//                    break;
//                }
//
//            }
//        } catch (ParseException e) {
//            TrainConstants.UP_SELECTED_TRAIN_POSITION = 0;
//            e.printStackTrace();
//        }
//
//
//        mCursor.close();
//
//        return tAllHarberLineUpTrain;
//    }
//
//    public SourceDestination getCentralDownTrainSourceDestinationByTrainNo(String TrainNo) {
//        SourceDestination tSourceDestination = null;
//
//        final Cursor srecCursor = mTrackTracerDataBase.query(Asm.CENTRAL_DOWN_TRAINS, new String[]{ColumnsName.TRAINS.STARTST, ColumnsName.TRAINS.DESTST, ColumnsName.TRAINS.CARS, ColumnsName.TRAINS.FEATURE, ColumnsName.TRAINS.SPEED}, ColumnsName.TRAINS.TRAINKEY + "='" + TrainNo + "'", null, null, null, null);
//
//
//        if (srecCursor != null) {
//            try {
//                if (srecCursor.moveToFirst()) {
//                    tSourceDestination = new SourceDestination();
//
//                    tSourceDestination.source = Boot.getHarberStationNameByCode(srecCursor.getString(0));
//                    tSourceDestination.destination = Boot.getHarberStationNameByCode(srecCursor.getString(1));
//
//                    tSourceDestination.cars = srecCursor.getString(2);
//                    tSourceDestination.feature = srecCursor.getString(3);
//                    tSourceDestination.speed = srecCursor.getString(4);
//                }
//            } finally {
//                srecCursor.close();
//            }
//        }
//
//
//        return tSourceDestination;
//    }
//
//    public SourceDestination getCentralUPTrainSourceDestinationByTrainNo(String TrainNo) {
//        SourceDestination tSourceDestination = null;
//        final Cursor srecCursor = mTrackTracerDataBase.query(Asm.CENTRAL_UP_TRAINS, new String[]{ColumnsName.TRAINS.STARTST, ColumnsName.TRAINS.DESTST, ColumnsName.TRAINS.CARS, ColumnsName.TRAINS.FEATURE, ColumnsName.TRAINS.SPEED}, ColumnsName.TRAINS.TRAINKEY + "='" + TrainNo + "'", null, null, null, null);
//
//
//        if (srecCursor != null) {
//            try {
//                if (srecCursor.moveToFirst()) {
//                    tSourceDestination = new SourceDestination();
//
//                    tSourceDestination.source = Boot.getHarberStationNameByCode(srecCursor.getString(0));
//                    tSourceDestination.destination = Boot.getHarberStationNameByCode(srecCursor.getString(1));
//
//                    tSourceDestination.cars = srecCursor.getString(2);
//                    tSourceDestination.feature = srecCursor.getString(3);
//                    tSourceDestination.speed = srecCursor.getString(4);
//                }
//            } finally {
//                srecCursor.close();
//            }
//        }
//
//
//        return tSourceDestination;
//    }
//
////*****************CENTRAL LINE OPERATION END************************
//
////*****************HARBOUR LINE OPERATION START************************
//
//    public List<Station> retriveAllHarberLineStation() {
//        List<Station> tAllHarberLineStation = new ArrayList<Station>();
//        Cursor mCursor = mTrackTracerDataBase.query(Asm.HARBER_LINE_STATIONS, new String[]{ColumnsName.STATIONS.NAME, ColumnsName.STATIONS.CODE}, null, null, null, null, null);
//        while (mCursor.moveToNext()) {
//            Station tStation = new Station();
//            tStation.stationName = mCursor.getString(0);
//            tStation.code = mCursor.getString(1);
//            tAllHarberLineStation.add(tStation);
//
//        }
//        mCursor.close();
//
//        return tAllHarberLineStation;
//    }
//
//
//    public List<Train> retriveAllHarberUPTrainByStation(String stationKey) {
//        List<String> trainsTime = new ArrayList<String>();
//        List<String> allHarberlUPTrainTimeShortedList = new ArrayList<String>();
//
//        boolean tempFindListSelection = true;
//
//        String currentDateandTime = simpleDateFormat.format(new Date());
//        Date currentTime = null;
//        try {
//            currentTime = simpleDateFormat.parse(currentDateandTime);
//        } catch (ParseException e1) {
//            e1.printStackTrace();
//        }
//
//
//        List<Train> tAllHarberLineUpTrain = new ArrayList<Train>();
//        Cursor mCursor = mTrackTracerDataBase.query(Asm.HARBER_UP_TRAIN_TIMETABLE, new String[]{ColumnsName.TIMETABLE.TRAINKEY, ColumnsName.TIMETABLE.TIME}, ColumnsName.TIMETABLE.STKEY + "='" + stationKey + "'", null, null, null, "time");
//        while (mCursor.moveToNext()) {
//            Train tTrain = new Train();
//            tTrain.trainKey = mCursor.getString(0);
//            tTrain.time = mCursor.getString(1);
//
//            trainsTime.add(tTrain.time);
//            allHarberlUPTrainTimeShortedList.add(tTrain.time);
//
//            SourceDestination tSourceDestination = getHarberUPTrainSourceDestinationByTrainNo(mCursor.getString(0));
//            tTrain.source = tSourceDestination.source;
//            tTrain.destination = tSourceDestination.destination;
//            tTrain.cars = tSourceDestination.cars;
//            tTrain.feature = tSourceDestination.feature;
//            tTrain.speed = tSourceDestination.speed;
//
//            tAllHarberLineUpTrain.add(tTrain);
//
//        }
//
//        /**
//         * Finding first train according to current time
//         * */
//        Collections.sort(allHarberlUPTrainTimeShortedList);
//        try {
//            for (int i = 0; i < allHarberlUPTrainTimeShortedList.size(); i++) {
//                Date trainTime = simpleDateFormat.parse(allHarberlUPTrainTimeShortedList.get(i).toString());
//                if (tempFindListSelection && ((trainTime.compareTo(currentTime) > 0) || (trainTime.compareTo(currentTime) == 0))) {
//                    TrainConstants.UP_SELECTED_TRAIN_POSITION = trainsTime.indexOf(allHarberlUPTrainTimeShortedList.get(i).toString());
//                    tempFindListSelection = false;
//                    break;
//                }
//
//            }
//        } catch (ParseException e) {
//            TrainConstants.UP_SELECTED_TRAIN_POSITION = 0;
//            e.printStackTrace();
//        }
//
//        mCursor.close();
//        return tAllHarberLineUpTrain;
//    }
//
//    public List<Train> retriveAllHarberDownTrainByStation(String stationKey) {
//        List<String> trainsTime = new ArrayList<String>();
//        List<String> allHarberlDownTrainTimeShortedList = new ArrayList<String>();
//
//        boolean tempFindListSelection = true;
//        String currentDateandTime = simpleDateFormat.format(new Date());
//        Date currentTime = null;
//        try {
//            currentTime = simpleDateFormat.parse(currentDateandTime);
//        } catch (ParseException e1) {
//            e1.printStackTrace();
//        }
//
//        List<Train> tAllHarberLineUpTrain = new ArrayList<Train>();
//        Cursor mCursor = mTrackTracerDataBase.query(Asm.HARBER_DOWN_TRAIN_TIMETABLE, new String[]{ColumnsName.TIMETABLE.TRAINKEY, ColumnsName.TIMETABLE.TIME}, ColumnsName.TIMETABLE.STKEY + "='" + stationKey + "'", null, null, null, ColumnsName.TIMETABLE.TIME);
//        while (mCursor.moveToNext()) {
//            Train tTrain = new Train();
//            tTrain.trainKey = mCursor.getString(0);
//            tTrain.time = mCursor.getString(1);
//
//            trainsTime.add(tTrain.time);
//            allHarberlDownTrainTimeShortedList.add(tTrain.time);
//
//
//            SourceDestination tSourceDestination = getHarberDownTrainSourceDestinationByTrainNo(mCursor.getString(0));
//            tTrain.source = tSourceDestination.source;
//            tTrain.destination = tSourceDestination.destination;
//            tTrain.cars = tSourceDestination.cars;
//            tTrain.feature = tSourceDestination.feature;
//            tTrain.speed = tSourceDestination.speed;
//
//            tAllHarberLineUpTrain.add(tTrain);
//        }
//
//
//        /**
//         * Finding first train according to current time
//         * */
//        Collections.sort(allHarberlDownTrainTimeShortedList);
//        try {
//            for (int i = 0; i < allHarberlDownTrainTimeShortedList.size(); i++) {
//                Date trainTime = simpleDateFormat.parse(allHarberlDownTrainTimeShortedList.get(i).toString());
//                if (tempFindListSelection && ((trainTime.compareTo(currentTime) > 0) || (trainTime.compareTo(currentTime) == 0))) {
//                    TrainConstants.DOWN_SELECTED_TRAIN_POSITION = trainsTime.indexOf(allHarberlDownTrainTimeShortedList.get(i).toString());
//                    tempFindListSelection = false;
//                    break;
//                }
//
//            }
//        } catch (ParseException e) {
//            TrainConstants.UP_SELECTED_TRAIN_POSITION = 0;
//            e.printStackTrace();
//        }
//
//        mCursor.close();
//
//        return tAllHarberLineUpTrain;
//    }
//
//    public SourceDestination getHarberDownTrainSourceDestinationByTrainNo(String TrainNo) {
//        SourceDestination tSourceDestination = null;
//        final Cursor srecCursor = mTrackTracerDataBase.query(Asm.HARBER_DOWN_TRAINS, new String[]{ColumnsName.TRAINS.STARTST, ColumnsName.TRAINS.DESTST, ColumnsName.TRAINS.CARS, ColumnsName.TRAINS.FEATURE, ColumnsName.TRAINS.SPEED}, ColumnsName.TRAINS.TRAINKEY + "='" + TrainNo + "'", null, null, null, null);
//
//        if (srecCursor != null) {
//            try {
//                if (srecCursor.moveToFirst()) {
//                    tSourceDestination = new SourceDestination();
//
//                    tSourceDestination.source = Boot.getHarberStationNameByCode(srecCursor.getString(0));
//                    tSourceDestination.destination = Boot.getHarberStationNameByCode(srecCursor.getString(1));
//
//                    tSourceDestination.cars = srecCursor.getString(2);
//                    tSourceDestination.feature = srecCursor.getString(3);
//                    tSourceDestination.speed = srecCursor.getString(4);
//                }
//            } finally {
//                srecCursor.close();
//            }
//        }
//
//
//        return tSourceDestination;
//    }
//
//    public SourceDestination getHarberUPTrainSourceDestinationByTrainNo(String TrainNo) {
//        SourceDestination tSourceDestination = null;
//        final Cursor srecCursor = mTrackTracerDataBase.query(Asm.HARBER_UP_TRAINS, new String[]{ColumnsName.TRAINS.STARTST, ColumnsName.TRAINS.DESTST, ColumnsName.TRAINS.CARS, ColumnsName.TRAINS.FEATURE, ColumnsName.TRAINS.SPEED}, ColumnsName.TRAINS.TRAINKEY + "='" + TrainNo + "'", null, null, null, null);
//
//
//        if (srecCursor != null) {
//            try {
//                if (srecCursor.moveToFirst()) {
//                    tSourceDestination = new SourceDestination();
//
//                    tSourceDestination.source = Boot.getHarberStationNameByCode(srecCursor.getString(0));
//                    tSourceDestination.destination = Boot.getHarberStationNameByCode(srecCursor.getString(1));
//
//                    tSourceDestination.cars = srecCursor.getString(2);
//                    tSourceDestination.feature = srecCursor.getString(3);
//                    tSourceDestination.speed = srecCursor.getString(4);
//                }
//            } finally {
//                srecCursor.close();
//            }
//        }
//
//
//        return tSourceDestination;
//    }
//
//    public List<Train> retriveSingleTrain(String trainKey, String line, String direction) {
//        List<Train> tAllHarberLineUpTrain = new ArrayList<Train>();
//        Cursor mCursor = null;
//        if (line.equalsIgnoreCase("western") && direction.equalsIgnoreCase("up")) {
//            mCursor = mTrackTracerDataBase.query(Asm.WESTERN_UP_TRAIN_TIMETABLE, new String[]{ColumnsName.TIMETABLE.STKEY, ColumnsName.TIMETABLE.TIME}, ColumnsName.TIMETABLE.TRAINKEY + "='" + trainKey + "'", null, null, null, null);
//        } else if (line.equalsIgnoreCase("western") && direction.equalsIgnoreCase("down")) {
//            mCursor = mTrackTracerDataBase.query(Asm.WESTERN_DOWN_TRAIN_TIMETABLE, new String[]{ColumnsName.TIMETABLE.STKEY, ColumnsName.TIMETABLE.TIME}, ColumnsName.TIMETABLE.TRAINKEY + "='" + trainKey + "'", null, null, null, null);
//        } else if (line.equalsIgnoreCase("central") && direction.equalsIgnoreCase("up")) {
//            mCursor = mTrackTracerDataBase.query(Asm.CENTRAL_UP_TRAIN_TIMETABLE, new String[]{ColumnsName.TIMETABLE.STKEY, ColumnsName.TIMETABLE.TIME}, ColumnsName.TIMETABLE.TRAINKEY + "='" + trainKey + "'", null, null, null, null);
//        } else if (line.equalsIgnoreCase("central") && direction.equalsIgnoreCase("down")) {
//            mCursor = mTrackTracerDataBase.query(Asm.CENTRAL_DOWN_TRAIN_TIMETABLE, new String[]{ColumnsName.TIMETABLE.STKEY, ColumnsName.TIMETABLE.TIME}, ColumnsName.TIMETABLE.TRAINKEY + "='" + trainKey + "'", null, null, null, null);
//        } else if (line.equalsIgnoreCase("harbour") && direction.equalsIgnoreCase("up")) {
//            mCursor = mTrackTracerDataBase.query(Asm.HARBER_UP_TRAIN_TIMETABLE, new String[]{ColumnsName.TIMETABLE.STKEY, ColumnsName.TIMETABLE.TIME}, ColumnsName.TIMETABLE.TRAINKEY + "='" + trainKey + "'", null, null, null, null);
//        } else if (line.equalsIgnoreCase("harbour") && direction.equalsIgnoreCase("down")) {
//            mCursor = mTrackTracerDataBase.query(Asm.HARBER_DOWN_TRAIN_TIMETABLE, new String[]{ColumnsName.TIMETABLE.STKEY, ColumnsName.TIMETABLE.TIME}, ColumnsName.TIMETABLE.TRAINKEY + "='" + trainKey + "'", null, null, null, null);
//        } else if (line.equalsIgnoreCase("metro") && direction.equalsIgnoreCase("up")) {
//            mCursor = mTrackTracerDataBase.query(Asm.METRO_UP_TRAIN_TIMETABLE, new String[]{ColumnsName.TIMETABLE.STKEY, ColumnsName.TIMETABLE.TIME}, ColumnsName.TIMETABLE.TRAINKEY + "='" + trainKey + "'", null, null, null, null);
//        } else if (line.equalsIgnoreCase("metro") && direction.equalsIgnoreCase("down")) {
//            mCursor = mTrackTracerDataBase.query(Asm.METRO_DOWN_TRAIN_TIMETABLE, new String[]{ColumnsName.TIMETABLE.STKEY, ColumnsName.TIMETABLE.TIME}, ColumnsName.TIMETABLE.TRAINKEY + "='" + trainKey + "'", null, null, null, null);
//        } else if (line.equalsIgnoreCase("mono") && direction.equalsIgnoreCase("up")) {
//            mCursor = mTrackTracerDataBase.query(Asm.MONO_UP_TRAIN_TIMETABLE, new String[]{ColumnsName.TIMETABLE.STKEY, ColumnsName.TIMETABLE.TIME}, ColumnsName.TIMETABLE.TRAINKEY + "='" + trainKey + "'", null, null, null, null);
//        } else if (line.equalsIgnoreCase("mono") && direction.equalsIgnoreCase("down")) {
//            mCursor = mTrackTracerDataBase.query(Asm.MONO_DOWN_TRAIN_TIMETABLE, new String[]{ColumnsName.TIMETABLE.STKEY, ColumnsName.TIMETABLE.TIME}, ColumnsName.TIMETABLE.TRAINKEY + "='" + trainKey + "'", null, null, null, null);
//        }
//
//        while (mCursor.moveToNext()) {
//            Train tTrain = new Train();
//            tTrain.trainKey = trainKey;
//            tTrain.stationKey = Boot.getHarberStationNameByCode(mCursor.getString(0));
//            tTrain.time = mCursor.getString(1);
//            tAllHarberLineUpTrain.add(tTrain);
//        }
//        mCursor.close();
//
//        return tAllHarberLineUpTrain;
//    }
//
//
////*****************HARBOUR LINE OPERATION END************************
//
//
//    public List<Stations> getStationLatLon() {
//        Stations tStations = null;
//        List<Stations> mStationsList = new ArrayList<Stations>();
//        final Cursor srecCursor = mTrackTracerDataBase.query(Asm.WESTERN_LINE_STATIONS, new String[]{ColumnsName.STATIONS.CODE, ColumnsName.STATIONS.LATITUDE, ColumnsName.STATIONS.LONGITUDE}, null, null, null, null, null);
//        if (srecCursor != null) {
//            try {
//                if (srecCursor.moveToFirst()) {
//                    for (int i = 0; i < srecCursor.getCount(); i++) {
//                        tStations = new Stations();
//                        tStations.stationCode = srecCursor.getString(0);
//                        tStations.stationlatLng = new LatLng(srecCursor.getDouble(1), srecCursor.getDouble(2));
//                        mStationsList.add(tStations);
//                    }
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            } finally {
//                srecCursor.close();
//            }
//        }
//        return mStationsList;
//    }

    //************METRO LINE OPERATION**********************
    public List<Train> retriveAllMetroUPTrainByStation(String stationKey) {

        List<String> trainsTime = new ArrayList<String>();
        List<String> allMetroUPTrainTimeShortedList = new ArrayList<String>();

        boolean tempFindListSelection = true;
        String currentDateandTime = simpleDateFormat.format(new Date());
        Date currentTime = null;
        try {
            currentTime = simpleDateFormat.parse(currentDateandTime);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }

        List<Train> tAllHarberLineUpTrain = new ArrayList<Train>();
        Cursor mCursor = mTrackTracerDataBase.query(Asm.METRO_UP_TRAIN_TIMETABLE, new String[]{"trainkey", "time"}, "stkey='" + stationKey + "'", null, null, null, "time");
        while (mCursor.moveToNext()) {
            Train tTrain = new Train();

            tTrain.setTrainKey(mCursor.getString(0));

            tTrain.setTime(mCursor.getString(1));
            trainsTime.add(tTrain.getTime());
            allMetroUPTrainTimeShortedList.add(tTrain.getTime());

//		  SourceDestination tSourceDestination = getSourceDestinationByTrainNo(mCursor.getString(0));;
            tTrain.setSource(MetroStationNames.GHATKOPAR);
            tTrain.setDestination(MetroStationNames.VERSOVA);
            tTrain.setCars(String.valueOf(9));
            //		  tTrain.feature=;
//		  tTrain.speed=fast;

            tAllHarberLineUpTrain.add(tTrain);

        }
        /**
         * Findind first train accordint to current time
         * */
        Collections.sort(allMetroUPTrainTimeShortedList);
        try {
            for (int i = 0; i < allMetroUPTrainTimeShortedList.size(); i++) {
                Date trainTime = simpleDateFormat.parse(allMetroUPTrainTimeShortedList.get(i).toString());
                if (tempFindListSelection && ((trainTime.compareTo(currentTime) > 0) || (trainTime.compareTo(currentTime) == 0))) {
                    TrainConstants.UP_SELECTED_TRAIN_POSITION = trainsTime.indexOf(allMetroUPTrainTimeShortedList.get(i).toString());
                    tempFindListSelection = false;
                    break;
                }

            }
        } catch (ParseException e) {
            TrainConstants.UP_SELECTED_TRAIN_POSITION = 0;
            e.printStackTrace();
        }
        mCursor.close();
        return tAllHarberLineUpTrain;
    }

    public List<Train> retriveAllMetroDownTrainByStation(String stationKey) {

        List<String> trainsTime = new ArrayList<String>();
        List<String> allMetroDownTrainTimeShortedList = new ArrayList<String>();

        boolean tempFindListSelection = true;
        String currentDateandTime = simpleDateFormat.format(new Date());
        Date currentTime = null;
        try {
            currentTime = simpleDateFormat.parse(currentDateandTime);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }

        List<Train> tAllMetroLineDownTrain = new ArrayList<Train>();
        Cursor mCursor = mTrackTracerDataBase.query(Asm.METRO_DOWN_TRAIN_TIMETABLE, new String[]{"trainkey", "time"}, "stkey='" + stationKey + "'", null, null, null, "time");
        while (mCursor.moveToNext()) {
            Train tTrain = new Train();

            tTrain.setTrainKey(mCursor.getString(0));

            tTrain.setTime(mCursor.getString(1));
            trainsTime.add(tTrain.getTime());
            allMetroDownTrainTimeShortedList.add(tTrain.getTime());

//		  SourceDestination tSourceDestination = getSourceDestinationByTrainNo(mCursor.getString(0));;
            tTrain.setSource(MetroStationNames.VERSOVA);
            tTrain.setDestination(MetroStationNames.GHATKOPAR);
            tTrain.setCars(String.valueOf(9));
//		  tTrain.feature=;
//		  tTrain.speed=fast;

            tAllMetroLineDownTrain.add(tTrain);

        }
        /**
         * Findind first train accordint to current time
         * */
        Collections.sort(allMetroDownTrainTimeShortedList);
        try {
            for (int i = 0; i < allMetroDownTrainTimeShortedList.size(); i++) {
                Date trainTime = simpleDateFormat.parse(allMetroDownTrainTimeShortedList.get(i).toString());
                if (tempFindListSelection && ((trainTime.compareTo(currentTime) > 0) || (trainTime.compareTo(currentTime) == 0))) {
                    TrainConstants.DOWN_SELECTED_TRAIN_POSITION = trainsTime.indexOf(allMetroDownTrainTimeShortedList.get(i).toString());
                    tempFindListSelection = false;
                    break;
                }

            }
        } catch (ParseException e) {
            TrainConstants.UP_SELECTED_TRAIN_POSITION = 0;
            e.printStackTrace();
        }
        mCursor.close();
        return tAllMetroLineDownTrain;
    }
//*****************************************************************

    //************MONO LINE OPERATION**********************
    public List<Train> retriveAllMONOUPTrainByStation(String stationKey) {

        List<String> trainsTime = new ArrayList<String>();
        List<String> allMetroUPTrainTimeShortedList = new ArrayList<String>();

        boolean tempFindListSelection = true;
        String currentDateandTime = simpleDateFormat.format(new Date());
        Date currentTime = null;
        try {
            currentTime = simpleDateFormat.parse(currentDateandTime);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }

        List<Train> tAllHarberLineUpTrain = new ArrayList<Train>();
        Cursor mCursor = mTrackTracerDataBase.query(Asm.MONO_UP_TRAIN_TIMETABLE, new String[]{"trainkey", "time"}, "stkey='" + stationKey + "'", null, null, null, "time");
        while (mCursor.moveToNext()) {
            Train tTrain = new Train();

            tTrain.setTrainKey(mCursor.getString(0));

            tTrain.setTime(mCursor.getString(1));
            trainsTime.add(tTrain.getTime());
            allMetroUPTrainTimeShortedList.add(tTrain.getTime());

//		  SourceDestination tSourceDestination = getSourceDestinationByTrainNo(mCursor.getString(0));;
            tTrain.setSource(MonoStationName.CHEMBUR);
            tTrain.setDestination(MonoStationName.WADALA);
            tTrain.setCars(String.valueOf(9));
//		  tTrain.feature=;
//		  tTrain.speed=fast;

            tAllHarberLineUpTrain.add(tTrain);

        }
        /**
         * Findind first train accordint to current time
         * */
        Collections.sort(allMetroUPTrainTimeShortedList);
        try {
            for (int i = 0; i < allMetroUPTrainTimeShortedList.size(); i++) {
                Date trainTime = simpleDateFormat.parse(allMetroUPTrainTimeShortedList.get(i).toString());
                if (tempFindListSelection && ((trainTime.compareTo(currentTime) > 0) || (trainTime.compareTo(currentTime) == 0))) {
                    TrainConstants.UP_SELECTED_TRAIN_POSITION = trainsTime.indexOf(allMetroUPTrainTimeShortedList.get(i).toString());
                    tempFindListSelection = false;
                    break;
                }

            }
        } catch (ParseException e) {
            TrainConstants.UP_SELECTED_TRAIN_POSITION = 0;
            e.printStackTrace();
        }
        mCursor.close();
        return tAllHarberLineUpTrain;
    }

    public List<Train> retriveAllMONODownTrainByStation(String stationKey) {

        List<String> trainsTime = new ArrayList<String>();
        List<String> allMetroUPTrainTimeShortedList = new ArrayList<String>();

        boolean tempFindListSelection = true;
        String currentDateandTime = simpleDateFormat.format(new Date());
        Date currentTime = null;
        try {
            currentTime = simpleDateFormat.parse(currentDateandTime);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }

        List<Train> tAllHarberLineUpTrain = new ArrayList<Train>();
        Cursor mCursor = mTrackTracerDataBase.query(Asm.MONO_DOWN_TRAIN_TIMETABLE, new String[]{"trainkey", "time"}, "stkey='" + stationKey + "'", null, null, null, "time");
        while (mCursor.moveToNext()) {
            Train tTrain = new Train();

            tTrain.setTrainKey(mCursor.getString(0));

            tTrain.setTime(mCursor.getString(1));
            trainsTime.add(tTrain.getTime());
            allMetroUPTrainTimeShortedList.add(tTrain.getTime());

//		  SourceDestination tSourceDestination = getSourceDestinationByTrainNo(mCursor.getString(0));;
            tTrain.setSource( MonoStationName.WADALA);
            tTrain.setDestination(MonoStationName.CHEMBUR);
            tTrain.setCars(String.valueOf(9));
//		  tTrain.feature=;
//		  tTrain.speed=fast;

            tAllHarberLineUpTrain.add(tTrain);

        }
        /**
         * Findind first train accordint to current time
         * */
        Collections.sort(allMetroUPTrainTimeShortedList);
        try {
            for (int i = 0; i < allMetroUPTrainTimeShortedList.size(); i++) {
                Date trainTime = simpleDateFormat.parse(allMetroUPTrainTimeShortedList.get(i).toString());
                if (tempFindListSelection && ((trainTime.compareTo(currentTime) > 0) || (trainTime.compareTo(currentTime) == 0))) {
                    TrainConstants.DOWN_SELECTED_TRAIN_POSITION = trainsTime.indexOf(allMetroUPTrainTimeShortedList.get(i).toString());
                    tempFindListSelection = false;
                    break;
                }

            }
        } catch (ParseException e) {
            TrainConstants.UP_SELECTED_TRAIN_POSITION = 0;
            e.printStackTrace();
        }
        mCursor.close();
        return tAllHarberLineUpTrain;
    }

//*********************CONVERT TO JSON*******************

//public void convertToJson()
//{
//
//
////wruptimetable
//String searchQuery = "SELECT  * FROM wruptimetable";
//Cursor cursor = mDb.rawQuery(searchQuery, null );
//
//JSONArray resultSet 	= new JSONArray();
//JSONObject returnObj 	= new JSONObject();
//
//cursor.moveToFirst();
//int count=cursor.getCount();
//while (cursor.isAfterLast() == false) {
//
//     	    int totalColumn = cursor.getColumnCount();
//     	    JSONObject rowObject = new JSONObject();
//
//     	    for( int i=0 ;  i< totalColumn ; i++ )
//     	    {
//     	    	if( cursor.getColumnName(i) != null )
//     	    	{
//
//     	    		try
//     	    		{
//
//	       	    		if( cursor.getString(i) != null )
//	           	    	{
////	           	    		Log.d("TAG_NAME", cursor.getString(i) );
//	           	    		rowObject.put(cursor.getColumnName(i) ,  cursor.getString(i) );
//	           	    	}
//	           	    	else
//	           	    	{
//	           	    		rowObject.put( cursor.getColumnName(i) ,  "" );
//	           	    	}
//     	    		}
//     	    		catch( Exception e )
//     	    		{
//     	    			Log.d("TAG_NAME", e.getMessage()  );
//     	    		}
//     	    	}
//
//     	    }
//
//     	    resultSet.put(rowObject);
//     	    cursor.moveToNext();
//      }
//
//		cursor.close();
////		Log.d("TAG_NAME", resultSet.toString() );
//		writeStringAsFile(convertJsonToString(resultSet),"wruptimetable");
////		return resultSet;
//
//}
//
//public String convertJsonToString(JSONArray argJSONObject){
//	Gson gson =new Gson();
//	String tempTest=gson.toJson(argJSONObject);
//	return tempTest;
//}
//
//public  void writeStringAsFile(String fileContents, String fileName) {
//  try {
//      FileWriter out = new FileWriter(new File("/storage/emulated/0/", fileName+".txt"));
//      out.write(fileContents);
//      out.close();
//  } catch (IOException e) {
////      Logger.logError(TAG, e);
//  }
//}

//public List<Train> retriveSingleTrainFromWesternUP(String trainKey) {
//List<Train> tAllHarberLineUpTrain=new ArrayList<Train>();
//Cursor mCursor = mDb.query("hruptimetable", new String[] {},"trainkey='"+ trainKey+"'" , null, null, null, null);
//int count=mCursor.getCount();
//mCursor.moveToFirst();
//		  for(int i=0;i<mCursor.getCount();i++){
//	  Train tTrain = new Train();
//	  tTrain.id=mCursor.getString(0);
//	  tTrain.trainKey=mCursor.getString(1);
//	  tTrain.stationKey=mCursor.getString(2);
//	  tTrain.time=mCursor.getString(3);
//	  tAllHarberLineUpTrain.add(tTrain);
//	  mCursor.moveToNext();
//  }
//  mCursor.close();
//
//return tAllHarberLineUpTrain;
//}
//public List<Train> retriveSingleTrainFromWesternDown(String trainKey) {
//List<Train> tAllHarberLineUpTrain=new ArrayList<Train>();
//Cursor mCursor = mDb.query("hruptimetable", new String[] {},"trainkey='"+ trainKey+"'" , null, null, null, null);
//int count=mCursor.getCount();
//mCursor.moveToFirst();
//		  for(int i=0;i<mCursor.getCount();i++){
//	  Train tTrain = new Train();
//	  tTrain.id=mCursor.getString(0);
//	  tTrain.trainKey=mCursor.getString(1);
//	  tTrain.stationKey=mCursor.getString(2);
//	  tTrain.time=mCursor.getString(3);
//	  tAllHarberLineUpTrain.add(tTrain);
//	  mCursor.moveToNext();
//  }
//  mCursor.close();
//
//return tAllHarberLineUpTrain;
//}


}