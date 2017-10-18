package mumbai.d360.database.offlinedb;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.google.android.gms.maps.model.LatLng;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import mumbai.d360.database.Asm;
import mumbai.d360.database.ColumnsName;
import mumbai.d360.model.SourceDestination;
import mumbai.d360.model.Station;
import mumbai.d360.model.Train;
import mumbai.d360.utils.Boot;
import mumbai.d360.utils.Direction;
import mumbai.d360.utils.LineIndicator;
import mumbai.d360.utils.TrainConstants;


public class MessageDBAdapter {
    protected static final String TAG = "MessageDBAdapter";
    private static final String MESSAGE_TABLE = "messages";
    private static final String CATEGORY_TABLE = "categories";
    private static final String MAIN_CATEGORY_TABLE = "maincategories";
    private static final String LANGUAGE_TABLE = "language";
    private static final String MASTER_MESSAGE_TABLE = "message_master";
    private static final String MASTER_CATEGORY_TABLE = "caterory_master";
    private static final String CATEGORY_ID = "categoryId";
    private static final String CATEGORY_NAME = "categoryName";
    private static final String MAIN_CATEGORY_ID = "maincategory_id";
    private static final String MAIN_CATEGORY_NAME = "maincategory_name";
    private static final String MESSAGE_ID = "messageId";
    private static final String MESSAGE = "message";
    private static final String MESSAGE_MASTER_ID = "mess_mas_id";
    private static final String CATEGORY_MASTER_NAME = "cat_mas_name";
    private static MessageDBAdapter instance = null;
    private Context mContext;
    private SQLiteDatabase mDb;
    private DataBaseHelper mDbHelper;
    private FaverioteDBHelper mFaverioteDBHelper;
    private Cursor mCoursor;
    private SharedPreferences sharedPrefs;

    private SimpleDateFormat simpleDateFormat;

    public MessageDBAdapter(Context context) {
        this.mContext = context;
        mDbHelper = new DataBaseHelper(mContext);
        mFaverioteDBHelper = new FaverioteDBHelper(mContext);
        simpleDateFormat = new SimpleDateFormat("HH:mm");
        createDatabase();
    }

    public static MessageDBAdapter getInstance(Context context) {
        if (instance == null) {
            instance = new MessageDBAdapter(context);
        }
        return instance;
    }

    public MessageDBAdapter createDatabase() throws SQLException {
        try {
            mDbHelper.createDataBase();
        } catch (IOException mIOException) {
            Log.e(TAG, mIOException.toString() + "  UnableToCreateDatabase");
            throw new Error("UnableToCreateDatabase");
        }
        return this;
    }

    public MessageDBAdapter open() throws SQLException {
        try {
            mDbHelper.openDataBase();
//            mDbHelper.close();
            mDb = mDbHelper.getReadableDatabase();
            //mDbHelper.close();
        } catch (SQLException mSQLException) {
            Log.e(TAG, mSQLException.toString());
            throw mSQLException;
        }
        return this;
    }

    public void close() {
        mDbHelper.close();
    }

//*****************WESTERN LINE OPERATION START************************

    public List<Station> retriveAllWesternLineStation() {
        List<Station> tAllHarberLineStation = new ArrayList<Station>();
        Cursor mCursor = mDb.query(Asm.WESTERN_LINE_STATIONS, new String[]{ColumnsName.STATIONS.NAME, ColumnsName.STATIONS.CODE,ColumnsName.STATIONS.LATITUDE, ColumnsName.STATIONS.LONGITUDE}, null, null, null, null, null);
        mCursor.moveToFirst();
        int count = mCursor.getCount();
        for (int i = 0; i < mCursor.getCount(); i++) {
            Station tStation = new Station();
            tStation.setName(mCursor.getString(0));
            tStation.setStationCode(mCursor.getString(1));
            if(mCursor.getString(2) != null && mCursor.getString(3) != null) {
                LatLng stationLocation = new LatLng(Double.parseDouble(mCursor.getString(2)), Double.parseDouble(mCursor.getString(3)));
                tStation.setLocation(stationLocation);
            }
            tStation.setLineIndicator(LineIndicator.WESTERN);
            tAllHarberLineStation.add(tStation);
            mCursor.moveToNext();
        }
        mCursor.close();

        return tAllHarberLineStation;
    }


    public List<Train> retriveAllWesternUPTrainByStation(String stationKey) {

        List<String> trainsTime = new ArrayList<String>();
        List<String> allWesternUPTrainTimeShortedList = new ArrayList<String>();

        boolean tempFindListSelection=true;
        String currentDateandTime = simpleDateFormat.format(new Date());
        Date currentTime = null;
        try {
            currentTime = simpleDateFormat.parse(currentDateandTime);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }

        List<Train> tAllHarberLineUpTrain=new ArrayList<Train>();
        Cursor mCursor = mDb.query(Asm.WESTERN_UP_TRAIN_TIMETABLE, new String[] {"trainkey","time"},"stkey='"+ stationKey+"'" , null, null, null, "time");
        while (mCursor.moveToNext()){
            Train tTrain = new Train();

            tTrain.setTrainKey(mCursor.getString(0));

            tTrain.setTime(mCursor.getString(1));
            trainsTime.add(tTrain.getTime());
            allWesternUPTrainTimeShortedList.add(tTrain.getTime());

            SourceDestination tSourceDestination = getSourceDestinationByTrainNo(mCursor.getString(0));;
            tTrain.setSource(tSourceDestination.source);
            tTrain.setDestination(tSourceDestination.destination);
            tTrain.setCars(tSourceDestination.cars);
            tTrain.setFeature(tSourceDestination.feature);
            tTrain.setSpeed(tSourceDestination.speed);

            tTrain.setLineIndicator(LineIndicator.WESTERN);
            tTrain.setDirection(Direction.UP);

            tAllHarberLineUpTrain.add(tTrain);

        }
        /**
         * Findind first train accordint to current time
         * */
        Collections.sort(allWesternUPTrainTimeShortedList);
        try {
            for(int i=0;i<allWesternUPTrainTimeShortedList.size();i++){
                Date  trainTime   =  simpleDateFormat.parse(allWesternUPTrainTimeShortedList.get(i).toString());
                if(tempFindListSelection && ( (trainTime.compareTo(currentTime) > 0)||(trainTime.compareTo(currentTime) == 0))){
                    TrainConstants.UP_SELECTED_TRAIN_POSITION=trainsTime.indexOf(allWesternUPTrainTimeShortedList.get(i).toString());
                    tempFindListSelection=false;
                    break;
                }

            } }catch (ParseException e) {
            TrainConstants.UP_SELECTED_TRAIN_POSITION=0;
            e.printStackTrace();
        }
        mCursor.close();
        return tAllHarberLineUpTrain;
    }
    public List<Train> retriveAllWesternDownTrainByStation(String stationKey) {
        List<String> trainsTime = new ArrayList<String>();
        List<Train> tAllWesternLineUpTrain=new ArrayList<Train>();
        List<String> allWesternDownTrainTimeShortedList = new ArrayList<String>();

        boolean tempFindListSelection=true;
        String currentDateandTime = simpleDateFormat.format(new Date());
        Date currentTime = null;
        try {
            currentTime = simpleDateFormat.parse(currentDateandTime);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }


        Cursor mCursor = mDb.query(Asm.WESTERN_DOWN_TRAIN_TIMETABLE, new String[] {ColumnsName.TIMETABLE.TRAINKEY,ColumnsName.TIMETABLE.TIME},ColumnsName.TIMETABLE.STKEY+"='"+ stationKey+"'" , null, null, null, "time");
        while (mCursor.moveToNext()){
            Train tTrain = new Train();

            tTrain.setTrainKey(mCursor.getString(0));
            tTrain.setTime(mCursor.getString(1));

            trainsTime.add(tTrain.getTime());
            allWesternDownTrainTimeShortedList.add(tTrain.getTime());

            final Cursor srecCursor = mDb.query(Asm.WESTERN_DOWN_TRAINS, new String[] {ColumnsName.TRAINS.STARTST,ColumnsName.TRAINS.DESTST,ColumnsName.TRAINS.CARS,ColumnsName.TRAINS.FEATURE,ColumnsName.TRAINS.SPEED},ColumnsName.TRAINS.TRAINKEY+"='"+ mCursor.getString(0)+"'" , null, null, null, null);

            try {
                if (srecCursor.moveToFirst()) {

                    tTrain.setSource(Boot.getHarberStationNameByCode(srecCursor.getString(0)));
                    tTrain.setDestination(Boot.getHarberStationNameByCode(srecCursor.getString(1)));
                    tTrain.setCars(srecCursor.getString(2));
                    tTrain.setFeature(srecCursor.getString(3));
                    tTrain.setSpeed(srecCursor.getString(4));
                    tTrain.setLineIndicator(LineIndicator.WESTERN);
                    tTrain.setDirection(Direction.DOWN);

                    tAllWesternLineUpTrain.add(tTrain);
                }
            } finally {
                srecCursor.close();
            }

        }

        /**
         * Findind first train accordint to current time
         * */
        Collections.sort(allWesternDownTrainTimeShortedList);
        try {
            for(int i=0;i<allWesternDownTrainTimeShortedList.size();i++){
                Date  trainTime   =  simpleDateFormat.parse(allWesternDownTrainTimeShortedList.get(i).toString());
                if(tempFindListSelection && ((trainTime.compareTo(currentTime) > 0)||(trainTime.compareTo(currentTime) == 0))){
                    TrainConstants.DOWN_SELECTED_TRAIN_POSITION=trainsTime.indexOf(allWesternDownTrainTimeShortedList.get(i).toString());
                    tempFindListSelection=false;
                    break;
                }

            } }catch (ParseException e) {
            TrainConstants.UP_SELECTED_TRAIN_POSITION=0;
            e.printStackTrace();
        }

        mCursor.close();

        return tAllWesternLineUpTrain;
    }

    public SourceDestination getSourceDestinationByTrainNo(String TrainNo){
        SourceDestination tSourceDestination = null;
        final Cursor srecCursor = mDb.query(Asm.WESTERN_UP_TRAINS, new String[] {ColumnsName.TRAINS.STARTST,ColumnsName.TRAINS.DESTST,ColumnsName.TRAINS.CARS,ColumnsName.TRAINS.FEATURE,ColumnsName.TRAINS.SPEED},ColumnsName.TRAINS.TRAINKEY+"='"+ TrainNo+"'" , null, null, null, null);


        if (srecCursor != null) {
            try {
                if (srecCursor.moveToFirst()) {
                    tSourceDestination=new SourceDestination();

                    tSourceDestination.source=Boot.getHarberStationNameByCode(srecCursor.getString(0));
                    tSourceDestination.destination=Boot.getHarberStationNameByCode(srecCursor.getString(1));

                    tSourceDestination.cars=srecCursor.getString(2);
                    tSourceDestination.feature=srecCursor.getString(3);
                    tSourceDestination.speed=srecCursor.getString(4);
                }
            } finally {
                srecCursor.close();
            }
        }



        return tSourceDestination;
    }
    ////*****************WESTERN LINE OPERATION END************************

    //*****************CENTRAL LINE OPERATION START************************
    public List<Station> retriveAllCentralLineStation() {
        List<Station> tAllHarberLineStation = new ArrayList<Station>();
        Cursor mCursor = mDb.query(Asm.CENTRAL_LINE_STATIONS, new String[]{ColumnsName.STATIONS.NAME, ColumnsName.STATIONS.CODE, ColumnsName.STATIONS.LATITUDE, ColumnsName.STATIONS.LONGITUDE}, null, null, null, null, null);

        while (mCursor.moveToNext()) {
            Station tStation = new Station();
            tStation.setName(mCursor.getString(0));
            tStation.setStationCode(mCursor.getString(1));

            if(mCursor.getString(2) != null && mCursor.getString(3) != null) {
                LatLng stationLocation = new LatLng(Double.parseDouble(mCursor.getString(2)), Double.parseDouble(mCursor.getString(3)));
                tStation.setLocation(stationLocation);
            }

            tStation.setLineIndicator(LineIndicator.CENTER);
            tAllHarberLineStation.add(tStation);

        }
        mCursor.close();

        return tAllHarberLineStation;
    }

    public List<Train> retriveAllCentralUPTrainByStation(String stationKey) {

        List<String> trainsTime = new ArrayList<String>();
        List<String> allCentralDownTrainTimeShortedList = new ArrayList<String>();

        boolean tempFindListSelection=true;
        String currentDateandTime = simpleDateFormat.format(new Date());
        Date currentTime = null;
        try {
            currentTime = simpleDateFormat.parse(currentDateandTime);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }

        List<Train> tAllCentralLineUpTrain=new ArrayList<Train>();
        Cursor mCursor = mDb.query(Asm.CENTRAL_UP_TRAIN_TIMETABLE, new String[] {ColumnsName.TIMETABLE.TRAINKEY,ColumnsName.TIMETABLE.TIME},ColumnsName.TIMETABLE.STKEY+"='"+ stationKey+"'" , null, null, null, "time");
        while (mCursor.moveToNext()){
            Train tTrain = new Train();
            tTrain.setTrainKey(mCursor.getString(0));
            tTrain.setTime(mCursor.getString(1));

            trainsTime.add(tTrain.getTime());
            allCentralDownTrainTimeShortedList.add(tTrain.getTime());


            SourceDestination tSourceDestination =getCentralUPTrainSourceDestinationByTrainNo(mCursor.getString(0));
            tTrain.setSource(tSourceDestination.source);
            tTrain.setDestination(tSourceDestination.destination);
            tTrain.setCars(tSourceDestination.cars);
            tTrain.setFeature(tSourceDestination.feature);
            tTrain.setSpeed(tSourceDestination.speed);
            tTrain.setLineIndicator(LineIndicator.CENTER);
            tTrain.setDirection(Direction.UP);

            tAllCentralLineUpTrain.add(tTrain);

        }

        /**
         * Finding first train according to current time
         * */
        Collections.sort(allCentralDownTrainTimeShortedList);
        try {
            for(int i=0;i<allCentralDownTrainTimeShortedList.size();i++){
                Date  trainTime   =  simpleDateFormat.parse(allCentralDownTrainTimeShortedList.get(i).toString());
                if(tempFindListSelection && ((trainTime.compareTo(currentTime) > 0)||(trainTime.compareTo(currentTime) == 0))){
                    TrainConstants.UP_SELECTED_TRAIN_POSITION=trainsTime.indexOf(allCentralDownTrainTimeShortedList.get(i).toString());
                    tempFindListSelection=false;
                    break;
                }

            } }catch (ParseException e) {
            TrainConstants.UP_SELECTED_TRAIN_POSITION=0;
            e.printStackTrace();
        }

        mCursor.close();

        mCursor.close();
        return tAllCentralLineUpTrain;
    }
    public List<Train> retriveAllCentralDownTrainByStation(String stationKey) {
        List<String> trainsTime = new ArrayList<String>();
        List<String> allCentralDownTrainTimeShortedList = new ArrayList<String>();

        boolean tempFindListSelection=true;
        String currentDateandTime = simpleDateFormat.format(new Date());
        Date currentTime = null;
        try {
            currentTime = simpleDateFormat.parse(currentDateandTime);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }

        List<Train> tAllHarberLineUpTrain=new ArrayList<Train>();
        Cursor mCursor = mDb.query(Asm.CENTRAL_DOWN_TRAIN_TIMETABLE, new String[] {ColumnsName.TIMETABLE.TRAINKEY,ColumnsName.TIMETABLE.TIME},ColumnsName.TIMETABLE.STKEY+"='"+ stationKey+"'" , null, null, null, "time");
        while (mCursor.moveToNext()){
            Train tTrain = new Train();
            tTrain.setTrainKey(mCursor.getString(0));
            tTrain.setTime(mCursor.getString(1));

            trainsTime.add(tTrain.getTime());
            allCentralDownTrainTimeShortedList.add(tTrain.getTime());

            SourceDestination tSourceDestination =getCentralDownTrainSourceDestinationByTrainNo(mCursor.getString(0));
            tTrain.setSource(tSourceDestination.source);
            tTrain.setDestination(tSourceDestination.destination);
            tTrain.setCars(tSourceDestination.cars);
            tTrain.setFeature(tSourceDestination.feature);
            tTrain.setSpeed(tSourceDestination.speed);
            tTrain.setLineIndicator(LineIndicator.CENTER);
            tTrain.setDirection(Direction.DOWN);
            tAllHarberLineUpTrain.add(tTrain);
        }

        /**
         * Findind first train accordint to current time
         * */
        Collections.sort(allCentralDownTrainTimeShortedList);
        try {
            for(int i=0;i<allCentralDownTrainTimeShortedList.size();i++){
                Date  trainTime   =  simpleDateFormat.parse(allCentralDownTrainTimeShortedList.get(i).toString());
                if(tempFindListSelection && ((trainTime.compareTo(currentTime) > 0)||(trainTime.compareTo(currentTime) == 0))){
                    TrainConstants.DOWN_SELECTED_TRAIN_POSITION=trainsTime.indexOf(allCentralDownTrainTimeShortedList.get(i).toString());
                    tempFindListSelection=false;
                    break;
                }

            } }catch (ParseException e) {
            TrainConstants.UP_SELECTED_TRAIN_POSITION=0;
            e.printStackTrace();
        }


        mCursor.close();

        return tAllHarberLineUpTrain;
    }
    public SourceDestination getCentralDownTrainSourceDestinationByTrainNo(String TrainNo){
        SourceDestination tSourceDestination = null;

        final Cursor srecCursor = mDb.query(Asm.CENTRAL_DOWN_TRAINS, new String[] {ColumnsName.TRAINS.STARTST,ColumnsName.TRAINS.DESTST,ColumnsName.TRAINS.CARS,ColumnsName.TRAINS.FEATURE,ColumnsName.TRAINS.SPEED},ColumnsName.TRAINS.TRAINKEY+"='"+ TrainNo+"'" , null, null, null, null);


        if (srecCursor != null) {
            try {
                if (srecCursor.moveToFirst()) {
                    tSourceDestination=new SourceDestination();

                    tSourceDestination.source=Boot.getHarberStationNameByCode(srecCursor.getString(0));
                    tSourceDestination.destination=Boot.getHarberStationNameByCode(srecCursor.getString(1));

                    tSourceDestination.cars=srecCursor.getString(2);
                    tSourceDestination.feature=srecCursor.getString(3);
                    tSourceDestination.speed=srecCursor.getString(4);


                }
            } finally {
                srecCursor.close();
            }
        }



        return tSourceDestination;
    }
    public SourceDestination getCentralUPTrainSourceDestinationByTrainNo(String TrainNo){
        SourceDestination tSourceDestination = null;
        final Cursor srecCursor = mDb.query(Asm.CENTRAL_UP_TRAINS, new String[] {ColumnsName.TRAINS.STARTST,ColumnsName.TRAINS.DESTST,ColumnsName.TRAINS.CARS,ColumnsName.TRAINS.FEATURE,ColumnsName.TRAINS.SPEED},ColumnsName.TRAINS.TRAINKEY+"='"+ TrainNo+"'" , null, null, null, null);


        if (srecCursor != null) {
            try {
                if (srecCursor.moveToFirst()) {
                    tSourceDestination=new SourceDestination();

                    tSourceDestination.source=Boot.getHarberStationNameByCode(srecCursor.getString(0));
                    tSourceDestination.destination=Boot.getHarberStationNameByCode(srecCursor.getString(1));

                    tSourceDestination.cars=srecCursor.getString(2);
                    tSourceDestination.feature=srecCursor.getString(3);
                    tSourceDestination.speed=srecCursor.getString(4);
                }
            } finally {
                srecCursor.close();
            }
        }



        return tSourceDestination;
    }
    //*****************CENTRAL LINE OPERATION END************************

//*****************HARBOUR LINE OPERATION START************************

    public List<Station> retriveAllHarberLineStation() {
        List<Station> tAllHarberLineStation = new ArrayList<Station>();
        Cursor mCursor = mDb.query(Asm.HARBER_LINE_STATIONS, new String[]{ColumnsName.STATIONS.NAME, ColumnsName.STATIONS.CODE, ColumnsName.STATIONS.LATITUDE, ColumnsName.STATIONS.LONGITUDE}, null, null, null, null, null);
        while (mCursor.moveToNext()) {
            Station tStation = new Station();
            tStation.setName(mCursor.getString(0));
            tStation.setStationCode(mCursor.getString(1));
            tStation.setLineIndicator(LineIndicator.HARBOUR);

            if(mCursor.getString(2) != null && mCursor.getString(3) != null) {
                LatLng stationLocation = new LatLng(Double.parseDouble(mCursor.getString(2)), Double.parseDouble(mCursor.getString(3)));
                tStation.setLocation(stationLocation);
            }

            tAllHarberLineStation.add(tStation);
        }
        mCursor.close();

        return tAllHarberLineStation;
    }

    public List<Train> retriveAllHarberUPTrainByStation(String stationKey) {
        List<String> trainsTime = new ArrayList<String>();
        List<String> allHarberlUPTrainTimeShortedList = new ArrayList<String>();

        boolean tempFindListSelection = true;

        String currentDateandTime = simpleDateFormat.format(new Date());
        Date currentTime = null;
        try {
            currentTime = simpleDateFormat.parse(currentDateandTime);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }


        List<Train> tAllHarberLineUpTrain = new ArrayList<Train>();
        Cursor mCursor = mDb.query(Asm.HARBER_UP_TRAIN_TIMETABLE, new String[]{ColumnsName.TIMETABLE.TRAINKEY, ColumnsName.TIMETABLE.TIME}, ColumnsName.TIMETABLE.STKEY + "='" + stationKey + "'", null, null, null, "time");
        while (mCursor.moveToNext()) {
            Train tTrain = new Train();
            tTrain.setTrainKey(mCursor.getString(0));
            tTrain.setTime(mCursor.getString(1));

            trainsTime.add(tTrain.getTime());
            allHarberlUPTrainTimeShortedList.add(tTrain.getTime());

            SourceDestination tSourceDestination = getHarberUPTrainSourceDestinationByTrainNo(mCursor.getString(0));
            tTrain.setSource(tSourceDestination.source);
            tTrain.setDestination(tSourceDestination.destination);
            tTrain.setCars(tSourceDestination.cars);
            tTrain.setFeature(tSourceDestination.feature);
            tTrain.setSpeed(tSourceDestination.speed);
            tTrain.setLineIndicator(LineIndicator.HARBOUR);
            tTrain.setDirection(Direction.UP);

            tAllHarberLineUpTrain.add(tTrain);

        }

        /**
         * Finding first train according to current time
         * */
        Collections.sort(allHarberlUPTrainTimeShortedList);
        try {
            for (int i = 0; i < allHarberlUPTrainTimeShortedList.size(); i++) {
                Date trainTime = simpleDateFormat.parse(allHarberlUPTrainTimeShortedList.get(i).toString());
                if (tempFindListSelection && ((trainTime.compareTo(currentTime) > 0) || (trainTime.compareTo(currentTime) == 0))) {
                    TrainConstants.UP_SELECTED_TRAIN_POSITION = trainsTime.indexOf(allHarberlUPTrainTimeShortedList.get(i).toString());
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

        public SourceDestination getHarberUPTrainSourceDestinationByTrainNo(String TrainNo) {
        SourceDestination tSourceDestination = null;
        final Cursor srecCursor = mDb.query(Asm.HARBER_UP_TRAINS, new String[]{ColumnsName.TRAINS.STARTST, ColumnsName.TRAINS.DESTST, ColumnsName.TRAINS.CARS, ColumnsName.TRAINS.FEATURE, ColumnsName.TRAINS.SPEED}, ColumnsName.TRAINS.TRAINKEY + "='" + TrainNo + "'", null, null, null, null);


        if (srecCursor != null) {
            try {
                if (srecCursor.moveToFirst()) {
                    tSourceDestination = new SourceDestination();

                    tSourceDestination.source = Boot.getHarberStationNameByCode(srecCursor.getString(0));
                    tSourceDestination.destination = Boot.getHarberStationNameByCode(srecCursor.getString(1));

                    tSourceDestination.cars = srecCursor.getString(2);
                    tSourceDestination.feature = srecCursor.getString(3);
                    tSourceDestination.speed = srecCursor.getString(4);
                }
            } finally {
                srecCursor.close();
            }
        }


        return tSourceDestination;
    }


    /*****************************************/

    public List<Train> retriveAllHarberDownTrainByStation(String stationKey) {
        List<String> trainsTime = new ArrayList<String>();
        List<String> allHarberlDownTrainTimeShortedList = new ArrayList<String>();

        boolean tempFindListSelection=true;
        String currentDateandTime = simpleDateFormat.format(new Date());
        Date currentTime = null;
        try {
            currentTime = simpleDateFormat.parse(currentDateandTime);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }

        List<Train> tAllHarberLineUpTrain=new ArrayList<Train>();
        Cursor mCursor = mDb.query(Asm.HARBER_DOWN_TRAIN_TIMETABLE, new String[] {ColumnsName.TIMETABLE.TRAINKEY,ColumnsName.TIMETABLE.TIME},ColumnsName.TIMETABLE.STKEY+"='"+ stationKey+"'" , null, null, null, ColumnsName.TIMETABLE.TIME);
        while (mCursor.moveToNext()){
            Train tTrain = new Train();
            tTrain.setTrainKey(mCursor.getString(0));
            tTrain.setTime(mCursor.getString(1));

            trainsTime.add(tTrain.getTime());
            allHarberlDownTrainTimeShortedList.add(tTrain.getTime());


            SourceDestination tSourceDestination =getHarberDownTrainSourceDestinationByTrainNo(mCursor.getString(0));
            tTrain.setSource(tSourceDestination.source);
            tTrain.setDestination(tSourceDestination.destination);
            tTrain.setCars(tSourceDestination.cars);
            tTrain.setFeature(tSourceDestination.feature);
            tTrain.setSpeed(tSourceDestination.speed);
            tTrain.setLineIndicator(LineIndicator.HARBOUR);
            tTrain.setDirection(Direction.DOWN);
            tAllHarberLineUpTrain.add(tTrain);
        }


        /**
         * Finding first train according to current time
         * */
        Collections.sort(allHarberlDownTrainTimeShortedList);
        try {
            for(int i=0;i<allHarberlDownTrainTimeShortedList.size();i++){
                Date  trainTime   =  simpleDateFormat.parse(allHarberlDownTrainTimeShortedList.get(i).toString());
                if(tempFindListSelection && ((trainTime.compareTo(currentTime) > 0)||(trainTime.compareTo(currentTime) == 0))){
                    TrainConstants.DOWN_SELECTED_TRAIN_POSITION=trainsTime.indexOf(allHarberlDownTrainTimeShortedList.get(i).toString());
                    tempFindListSelection=false;
                    break;
                }

            } }catch (ParseException e) {
            TrainConstants.UP_SELECTED_TRAIN_POSITION=0;
            e.printStackTrace();
        }

        mCursor.close();

        return tAllHarberLineUpTrain;
    }
    public SourceDestination getHarberDownTrainSourceDestinationByTrainNo(String TrainNo){
        SourceDestination tSourceDestination = null;
        final Cursor srecCursor=mDb.query(Asm.HARBER_DOWN_TRAINS, new String[] {ColumnsName.TRAINS.STARTST,ColumnsName.TRAINS.DESTST,ColumnsName.TRAINS.CARS,ColumnsName.TRAINS.FEATURE,ColumnsName.TRAINS.SPEED},ColumnsName.TRAINS.TRAINKEY+"='"+ TrainNo+"'" , null, null, null, null);

        if (srecCursor != null) {
            try {
                if (srecCursor.moveToFirst()) {
                    tSourceDestination=new SourceDestination();

                    tSourceDestination.source=Boot.getHarberStationNameByCode(srecCursor.getString(0));
                    tSourceDestination.destination=Boot.getHarberStationNameByCode(srecCursor.getString(1));

                    tSourceDestination.cars=srecCursor.getString(2);
                    tSourceDestination.feature=srecCursor.getString(3);
                    tSourceDestination.speed=srecCursor.getString(4);
                }
            } finally {
                srecCursor.close();
            }
        }



        return tSourceDestination;
    }

    public List<Train> retriveSingleTrain(String trainKey,int line,int direction) {
        List<Train> tAllHarberLineUpTrain=new ArrayList<Train>();
        Cursor mCursor = null;
        if(line == LineIndicator.WESTERN && direction == Direction.UP){
            mCursor= mDb.query(Asm.WESTERN_UP_TRAIN_TIMETABLE, new String[] {ColumnsName.TIMETABLE.STKEY,ColumnsName.TIMETABLE.TIME},ColumnsName.TIMETABLE.TRAINKEY+"='"+ trainKey+"'" , null, null, null, null);
        }else if(line == LineIndicator.WESTERN && direction == Direction.DOWN){
            mCursor= mDb.query(Asm.WESTERN_DOWN_TRAIN_TIMETABLE, new String[] {ColumnsName.TIMETABLE.STKEY,ColumnsName.TIMETABLE.TIME},ColumnsName.TIMETABLE.TRAINKEY+"='"+ trainKey+"'" , null, null, null, null);
        }else if(line == LineIndicator.CENTER && direction == Direction.UP){
            mCursor= mDb.query(Asm.CENTRAL_UP_TRAIN_TIMETABLE, new String[] {ColumnsName.TIMETABLE.STKEY,ColumnsName.TIMETABLE.TIME},ColumnsName.TIMETABLE.TRAINKEY+"='"+ trainKey+"'" , null, null, null, null);
        }else if(line == LineIndicator.CENTER && direction == Direction.DOWN){
            mCursor= mDb.query(Asm.CENTRAL_DOWN_TRAIN_TIMETABLE, new String[] {ColumnsName.TIMETABLE.STKEY,ColumnsName.TIMETABLE.TIME},ColumnsName.TIMETABLE.TRAINKEY+"='"+ trainKey+"'" , null, null, null, null);
        }else if(line == LineIndicator.HARBOUR && direction == Direction.UP){
            mCursor= mDb.query(Asm.HARBER_UP_TRAIN_TIMETABLE, new String[] {ColumnsName.TIMETABLE.STKEY,ColumnsName.TIMETABLE.TIME},ColumnsName.TIMETABLE.TRAINKEY+"='"+ trainKey+"'" , null, null, null, null);
        }else if(line == LineIndicator.HARBOUR && direction == Direction.DOWN){
            mCursor= mDb.query(Asm.HARBER_DOWN_TRAIN_TIMETABLE, new String[] {ColumnsName.TIMETABLE.STKEY,ColumnsName.TIMETABLE.TIME},ColumnsName.TIMETABLE.TRAINKEY+"='"+ trainKey+"'" , null, null, null, null);
        }
//        else if(line.equalsIgnoreCase("metro")&&direction.equalsIgnoreCase("up")){
//            mCursor= mDb.query(Asm.METRO_UP_TRAIN_TIMETABLE, new String[] {ColumnsName.TIMETABLE.STKEY,ColumnsName.TIMETABLE.TIME},ColumnsName.TIMETABLE.TRAINKEY+"='"+ trainKey+"'" , null, null, null, null);
//        }else if(line.equalsIgnoreCase("metro")&&direction.equalsIgnoreCase("down")){
//            mCursor= mDb.query(Asm.METRO_DOWN_TRAIN_TIMETABLE, new String[] {ColumnsName.TIMETABLE.STKEY,ColumnsName.TIMETABLE.TIME},ColumnsName.TIMETABLE.TRAINKEY+"='"+ trainKey+"'" , null, null, null, null);
//        }else if(line.equalsIgnoreCase("mono")&&direction.equalsIgnoreCase("up")){
//            mCursor= mDb.query(Asm.MONO_UP_TRAIN_TIMETABLE, new String[] {ColumnsName.TIMETABLE.STKEY,ColumnsName.TIMETABLE.TIME},ColumnsName.TIMETABLE.TRAINKEY+"='"+ trainKey+"'" , null, null, null, null);
//        }else if(line.equalsIgnoreCase("mono")&&direction.equalsIgnoreCase("down")){
//            mCursor= mDb.query(Asm.MONO_DOWN_TRAIN_TIMETABLE, new String[] {ColumnsName.TIMETABLE.STKEY,ColumnsName.TIMETABLE.TIME},ColumnsName.TIMETABLE.TRAINKEY+"='"+ trainKey+"'" , null, null, null, null);
//        }

        while (mCursor.moveToNext()){
            Train tTrain = new Train();
            tTrain.setTrainKey(trainKey);
            tTrain.setStationKey(Boot.getHarberStationNameByCode(mCursor.getString(0)));
            tTrain.setTime(mCursor.getString(1));
            tAllHarberLineUpTrain.add(tTrain);
        }
        mCursor.close();

        return tAllHarberLineUpTrain;
    }

}