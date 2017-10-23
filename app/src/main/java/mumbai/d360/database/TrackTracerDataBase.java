package mumbai.d360.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import mumbai.d360.data.TrackTracerDataManager;
import mumbai.d360.database.contentvalue.TrainInfo;
import mumbai.d360.dataprovider.metro.MetroUpTrainInfo;
import mumbai.d360.dataprovider.metro.Php;
import mumbai.d360.dataprovider.mono.MonoStationName;

public class TrackTracerDataBase extends SQLiteOpenHelper {

	private static final String DATABASE_NAME = "conversionProfile_PiP.db";
	private static final int DATABASE_VERSION = 11;
	TrackTracerDataManager mTrackTracerDataManager;
//	StringToJson mStringToJson;
//	AssetsFileProvider mAssetsFileProvider;
//	String	mParsableString;
	MetroUpTrainInfo mMetroUpTrainInfo;

	Php mMetroDownTrainInfo;
	private SimpleDateFormat simpleDateFormat;
	public TrackTracerDataBase(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		this.mTrackTracerDataManager=new TrackTracerDataManager();
		mMetroUpTrainInfo=new MetroUpTrainInfo();
		mMetroDownTrainInfo=new Php();
//		mStringToJson=new StringToJson();
//		mAssetsFileProvider=new AssetsFileProvider(context);
		simpleDateFormat = new SimpleDateFormat("HH:mm");
	}

	@Override
	public void onCreate(SQLiteDatabase trackTrackDataBase) {

		//****************************STRING TO JSON CONVERSION***********************

//		mTrackTracerDataManager.westernlinestations=mStringToJson.stringToStation(TrainConstants.WESTERN_LINE_STATIONS_DATA);
//	   	mTrackTracerDataManager.centrallinestations=mStringToJson.stringToStation(TrainConstants.CENTRAL_LINE_STATIONS_DATA);
//	   	mTrackTracerDataManager.harberlinestations=mStringToJson.stringToStation(TrainConstants.HARBER_LINE_STATIONS_DATA);
//
//	  	mTrackTracerDataManager.westernuptrains=mStringToJson.stringToTrain(TrainConstants.WESTERN_UP_TRAINS);
//		mTrackTracerDataManager.centraluptrains=mStringToJson.stringToTrain(TrainConstants.CENTRAL_UP_TRAINS);
//		mTrackTracerDataManager.harberuptrains=mStringToJson.stringToTrain(TrainConstants.HARBER_UP_TRAINS);
//
//		mTrackTracerDataManager.westerndowntrains=mStringToJson.stringToTrain(TrainConstants.WESTERN_DOWN_TRAINS);
//		mTrackTracerDataManager.centraldowntrains=mStringToJson.stringToTrain(TrainConstants.CENTRAL_DOWN_TRAINS);
//		mTrackTracerDataManager.harberdowntrains=mStringToJson.stringToTrain(TrainConstants.HARBER_DOWN_TRAINS);
//
//		//wruptimetable.txt
//		mParsableString=mAssetsFileProvider.loadJSONFromAsset("a1.dll");
//		mTrackTracerDataManager.westernuptimetable=mStringToJson.stringToTimeTable(mParsableString);
//		mParsableString=mAssetsFileProvider.loadJSONFromAsset("chupa.m");
//		mTrackTracerDataManager.centraluptimetable=mStringToJson.stringToTimeTable(mParsableString);
//		mParsableString=mAssetsFileProvider.loadJSONFromAsset("jsdbgui.tmp");
//		mTrackTracerDataManager.harberuptimetable=mStringToJson.stringToTimeTable(mParsableString);
//
//		mParsableString=mAssetsFileProvider.loadJSONFromAsset("VISSHE.DLL");
//		mTrackTracerDataManager.westerndowntimetable=mStringToJson.stringToTimeTable(mParsableString);
//		mParsableString=mAssetsFileProvider.loadJSONFromAsset("stdole.dll");
//		mTrackTracerDataManager.centraldowntimetable=mStringToJson.stringToTimeTable(mParsableString);
//		mParsableString=mAssetsFileProvider.loadJSONFromAsset("BAM.dll");
//		mTrackTracerDataManager.harberdowntimetable=mStringToJson.stringToTimeTable(mParsableString);
//
//
		mTrackTracerDataManager.metrouptimetable = mMetroUpTrainInfo.getMetroUpTrainInfo();
		mTrackTracerDataManager.metrodowntimetable = mMetroDownTrainInfo.getMetroDownTrainInfo();
//
//		//*************************ALL TABLE CREATION *******************************
//
//		trackTrackDataBase.execSQL(SQLQuery.CREATE_TABLE_WESTERN_LINE_STATIONS);
//		trackTrackDataBase.execSQL( SQLQuery. CREATE_TABLE_CENTRAL_LINE_STATIONS);
//		trackTrackDataBase.execSQL( SQLQuery. CREATE_TABLE_HARBER_LINE_STATIONS);
//
//		trackTrackDataBase.execSQL( SQLQuery.CREATE_TABLE_WESTERN_UP_TRAIN_TIMETABLE);
//		trackTrackDataBase.execSQL( SQLQuery.CREATE_TABLE_CENTRAL_UP_TRAIN_TIMETABLE);
//		trackTrackDataBase.execSQL( SQLQuery.CREATE_TABLE_HARBER_UP_TRAIN_TIMETABLE);
//
//		trackTrackDataBase.execSQL(SQLQuery.  CREATE_TABLE_WESTERN_DOWN_TRAIN_TIMETABLE);
//		trackTrackDataBase.execSQL( SQLQuery.CREATE_TABLE_CENTRAL_DOWN_TRAIN_TIMETABLE);
//		trackTrackDataBase.execSQL( SQLQuery.CREATE_TABLE_HARBER_DOWN_TRAIN_TIMETABLE);
//
//		trackTrackDataBase.execSQL(SQLQuery.CREATE_TABLE_WESTERN_UP_TRAINS);
//		trackTrackDataBase.execSQL(SQLQuery.CREATE_TABLE_CENTRAL_UP_TRAINS);
//		trackTrackDataBase.execSQL(SQLQuery.CREATE_TABLE_HARBER_UP_TRAINS);
//
//		trackTrackDataBase.execSQL( SQLQuery. CREATE_TABLE_WESTERN_DOWN_TRAINS);
//		trackTrackDataBase.execSQL( SQLQuery. CREATE_TABLE_CENTRAL_DOWN_TRAINS);
//		trackTrackDataBase.execSQL( SQLQuery. CREATE_TABLE_HARBER_DOWN_TRAINS);

		trackTrackDataBase.execSQL(SQLQuery.CREATE_TABLE_METRO_UP_TRAIN_TIMETABLE);
		trackTrackDataBase.execSQL(SQLQuery.  CREATE_TABLE_METRO_DOWN_TRAIN_TIMETABLE);

		trackTrackDataBase.execSQL( SQLQuery.CREATE_TABLE_MONO_UP_TRAIN_TIMETABLE);
		trackTrackDataBase.execSQL(SQLQuery.  CREATE_TABLE_MONO_DOWN_TRAIN_TIMETABLE);


		//*************************** STATION INSERTION*********************************************
//
//		for(int i=0;i<this.mTrackTracerDataManager.westernlinestations.values.size();i++){
//			StationDataList.StationData tStationDataListStationData=this.mTrackTracerDataManager.westernlinestations.values.get(i).nameValuePairs;
//			ContentValues values = new ContentValues();
//
//			values.put(ColumnsName.STATIONS.NAME,tStationDataListStationData.name );
//			values.put(ColumnsName.STATIONS.CODE, tStationDataListStationData.code);
//			values.put(ColumnsName.STATIONS.INDICATOR, tStationDataListStationData.indicator);
//			values.put(ColumnsName.STATIONS.R1,tStationDataListStationData.r1 );
//			values.put(ColumnsName.STATIONS.R2, tStationDataListStationData.r2);
//			values.put(ColumnsName.STATIONS.R3, tStationDataListStationData.r3);
//			values.put(ColumnsName.STATIONS.R4, tStationDataListStationData.r4);
//			values.put(ColumnsName.STATIONS.R5, tStationDataListStationData.r5);
////			values.put(ColumnsName.STATIONS.LATITUDE,tStationDataListStationData.latitude );
////			values.put(ColumnsName.STATIONS.LONGITUDE, tStationDataListStationData.longitude);
//			values.put(ColumnsName.STATIONS.FEATURE, tStationDataListStationData.feature);
//
//			long id = trackTrackDataBase.insert(Asm.WESTERN_LINE_STATIONS, null, values);
//		}
//
//		for(int i=0;i<this.mTrackTracerDataManager.centrallinestations.values.size();i++){
//			StationDataList.StationData tStationDataListStationData=this.mTrackTracerDataManager.centrallinestations.values.get(i).nameValuePairs;
//			ContentValues values = new ContentValues();
//
//			values.put(ColumnsName.STATIONS.NAME,tStationDataListStationData.name );
//			values.put(ColumnsName.STATIONS.CODE, tStationDataListStationData.code);
//			values.put(ColumnsName.STATIONS.INDICATOR, tStationDataListStationData.indicator);
//			values.put(ColumnsName.STATIONS.R1,tStationDataListStationData.r1 );
//			values.put(ColumnsName.STATIONS.R2, tStationDataListStationData.r2);
//			values.put(ColumnsName.STATIONS.R3, tStationDataListStationData.r3);
//			values.put(ColumnsName.STATIONS.R4, tStationDataListStationData.r4);
//			values.put(ColumnsName.STATIONS.R5, tStationDataListStationData.r5);
////			values.put(ColumnsName.STATIONS.LATITUDE,tStationDataListStationData.latitude );
////			values.put(ColumnsName.STATIONS.LONGITUDE, tStationDataListStationData.longitude);
//			values.put(ColumnsName.STATIONS.FEATURE, tStationDataListStationData.feature);
//
//			long id = trackTrackDataBase.insert(Asm.CENTRAL_LINE_STATIONS, null, values);
//		}
//
//		for(int i=0;i<this.mTrackTracerDataManager.harberlinestations.values.size();i++){
//			StationDataList.StationData tStationDataListStationData=this.mTrackTracerDataManager.harberlinestations.values.get(i).nameValuePairs;
//			ContentValues values = new ContentValues();
//
//			values.put(ColumnsName.STATIONS.NAME,tStationDataListStationData.name );
//			values.put(ColumnsName.STATIONS.CODE, tStationDataListStationData.code);
//			values.put(ColumnsName.STATIONS.INDICATOR, tStationDataListStationData.indicator);
//			values.put(ColumnsName.STATIONS.R1,tStationDataListStationData.r1 );
//			values.put(ColumnsName.STATIONS.R2, tStationDataListStationData.r2);
//			values.put(ColumnsName.STATIONS.R3, tStationDataListStationData.r3);
//			values.put(ColumnsName.STATIONS.R4, tStationDataListStationData.r4);
//			values.put(ColumnsName.STATIONS.R5, tStationDataListStationData.r5);
////			values.put(ColumnsName.STATIONS.LATITUDE,tStationDataListStationData.latitude );
////			values.put(ColumnsName.STATIONS.LONGITUDE, tStationDataListStationData.longitude);
//			values.put(ColumnsName.STATIONS.FEATURE, tStationDataListStationData.feature);
//
//			long id = trackTrackDataBase.insert(Asm.HARBER_LINE_STATIONS, null, values);
//		}
//
//		//*****************************UP TRINA INSERTION*********************************
//
//		for(int i=0;i<this.mTrackTracerDataManager.westernuptrains.values.size();i++){
//			TrainData.Train tTrainDataTrain=this.mTrackTracerDataManager.westernuptrains.values.get(i).nameValuePairs;
//			ContentValues values = new ContentValues();
//
//			values.put(ColumnsName.TRAINS.TRAINKEY,tTrainDataTrain.trainkey );
//			values.put(ColumnsName.TRAINS.STARTST,tTrainDataTrain.startst );
//			values.put(ColumnsName.TRAINS.DESTST,tTrainDataTrain.destst );
//			values.put(ColumnsName.TRAINS.CARS,tTrainDataTrain.cars );
//			values.put(ColumnsName.TRAINS.FEATURE,tTrainDataTrain.feature );
//			values.put(ColumnsName.TRAINS.SPEED,tTrainDataTrain.speed );
//
//			long id = trackTrackDataBase.insert(Asm.WESTERN_UP_TRAINS, null, values);
//		}
//
//		for(int i=0;i<this.mTrackTracerDataManager.centraluptrains.values.size();i++){
//			TrainData.Train tTrainDataTrain=this.mTrackTracerDataManager.centraluptrains.values.get(i).nameValuePairs;
//			ContentValues values = new ContentValues();
//
//			values.put(ColumnsName.TRAINS.TRAINKEY,tTrainDataTrain.trainkey );
//			values.put(ColumnsName.TRAINS.STARTST,tTrainDataTrain.startst );
//			values.put(ColumnsName.TRAINS.DESTST,tTrainDataTrain.destst );
//			values.put(ColumnsName.TRAINS.CARS,tTrainDataTrain.cars );
//			values.put(ColumnsName.TRAINS.FEATURE,tTrainDataTrain.feature );
//			values.put(ColumnsName.TRAINS.SPEED,tTrainDataTrain.speed );
//
//			long id = trackTrackDataBase.insert(Asm.CENTRAL_UP_TRAINS, null, values);
//		}
//		for(int i=0;i<this.mTrackTracerDataManager.harberuptrains.values.size();i++){
//			TrainData.Train tTrainDataTrain=this.mTrackTracerDataManager.harberuptrains.values.get(i).nameValuePairs;
//			ContentValues values = new ContentValues();
//
//			values.put(ColumnsName.TRAINS.TRAINKEY,tTrainDataTrain.trainkey );
//			values.put(ColumnsName.TRAINS.STARTST,tTrainDataTrain.startst );
//			values.put(ColumnsName.TRAINS.DESTST,tTrainDataTrain.destst );
//			values.put(ColumnsName.TRAINS.CARS,tTrainDataTrain.cars );
//			values.put(ColumnsName.TRAINS.FEATURE,tTrainDataTrain.feature );
//			values.put(ColumnsName.TRAINS.SPEED,tTrainDataTrain.speed );
//
//			long id = trackTrackDataBase.insert(Asm.HARBER_UP_TRAINS, null, values);
//		}
//
//		//*********************DOWN TRAIN INSERTION**************************
//
//
//		for(int i=0;i<this.mTrackTracerDataManager.westerndowntrains.values.size();i++){
//			TrainData.Train tTrainDataTrain=this.mTrackTracerDataManager.westerndowntrains.values.get(i).nameValuePairs;
//			ContentValues values = new ContentValues();
//
//			values.put(ColumnsName.TRAINS.TRAINKEY,tTrainDataTrain.trainkey );
//			values.put(ColumnsName.TRAINS.STARTST,tTrainDataTrain.startst );
//			values.put(ColumnsName.TRAINS.DESTST,tTrainDataTrain.destst );
//			values.put(ColumnsName.TRAINS.CARS,tTrainDataTrain.cars );
//			values.put(ColumnsName.TRAINS.FEATURE,tTrainDataTrain.feature );
//			values.put(ColumnsName.TRAINS.SPEED,tTrainDataTrain.speed );
//
//			long id = trackTrackDataBase.insert(Asm.WESTERN_DOWN_TRAINS, null, values);
//		}
//
//		for(int i=0;i<this.mTrackTracerDataManager.centraldowntrains.values.size();i++){
//			TrainData.Train tTrainDataTrain=this.mTrackTracerDataManager.centraldowntrains.values.get(i).nameValuePairs;
//			ContentValues values = new ContentValues();
//
//			values.put(ColumnsName.TRAINS.TRAINKEY,tTrainDataTrain.trainkey );
//			values.put(ColumnsName.TRAINS.STARTST,tTrainDataTrain.startst );
//			values.put(ColumnsName.TRAINS.DESTST,tTrainDataTrain.destst );
//			values.put(ColumnsName.TRAINS.CARS,tTrainDataTrain.cars );
//			values.put(ColumnsName.TRAINS.FEATURE,tTrainDataTrain.feature );
//			values.put(ColumnsName.TRAINS.SPEED,tTrainDataTrain.speed );
//
//			long id = trackTrackDataBase.insert(Asm.CENTRAL_DOWN_TRAINS, null, values);
//		}
//		for(int i=0;i<this.mTrackTracerDataManager.harberdowntrains.values.size();i++){
//			TrainData.Train tTrainDataTrain=this.mTrackTracerDataManager.harberdowntrains.values.get(i).nameValuePairs;
//			ContentValues values = new ContentValues();
//
//			values.put(ColumnsName.TRAINS.TRAINKEY,tTrainDataTrain.trainkey );
//			values.put(ColumnsName.TRAINS.STARTST,tTrainDataTrain.startst );
//			values.put(ColumnsName.TRAINS.DESTST,tTrainDataTrain.destst );
//			values.put(ColumnsName.TRAINS.CARS,tTrainDataTrain.cars );
//			values.put(ColumnsName.TRAINS.FEATURE,tTrainDataTrain.feature );
//			values.put(ColumnsName.TRAINS.SPEED,tTrainDataTrain.speed );
//
//			long id = trackTrackDataBase.insert(Asm.HARBER_DOWN_TRAINS, null, values);
//		}
//
//		//*****************TIME TABLE INSERTION***********************************
//
//		for(int i=0;i<mTrackTracerDataManager.westernuptimetable.values.size();i++){
//			TimeTableData.TimeTable tTimeTableDataTimeTable=this.mTrackTracerDataManager.westernuptimetable.values.get(i).nameValuePairs;
//			ContentValues values = new ContentValues();
//
//			values.put(ColumnsName.TIMETABLE.TRAINKEY,tTimeTableDataTimeTable.trainkey );
//			values.put(ColumnsName.TIMETABLE.STKEY,tTimeTableDataTimeTable.stkey );
//			values.put(ColumnsName.TIMETABLE.TIME,tTimeTableDataTimeTable.time );
//			values.put(ColumnsName.TIMETABLE.TIMEMIN,tTimeTableDataTimeTable.timemin );
//
//			long id = trackTrackDataBase.insert(Asm.WESTERN_UP_TRAIN_TIMETABLE, null, values);
//		}
//
//		for(int i=0;i<mTrackTracerDataManager.centraluptimetable.values.size();i++){
//			TimeTableData.TimeTable tTimeTableDataTimeTable=this.mTrackTracerDataManager.centraluptimetable.values.get(i).nameValuePairs;
//			ContentValues values = new ContentValues();
//
//			values.put(ColumnsName.TIMETABLE.TRAINKEY,tTimeTableDataTimeTable.trainkey );
//			values.put(ColumnsName.TIMETABLE.STKEY,tTimeTableDataTimeTable.stkey );
//			values.put(ColumnsName.TIMETABLE.TIME,tTimeTableDataTimeTable.time );
//			values.put(ColumnsName.TIMETABLE.TIMEMIN,tTimeTableDataTimeTable.timemin );
//
//			long id = trackTrackDataBase.insert(Asm.CENTRAL_UP_TRAIN_TIMETABLE, null, values);
//		}
//
//		for(int i=0;i<mTrackTracerDataManager.harberuptimetable.values.size();i++){
//			TimeTableData.TimeTable tTimeTableDataTimeTable=this.mTrackTracerDataManager.harberuptimetable.values.get(i).nameValuePairs;
//			ContentValues values = new ContentValues();
//
//			values.put(ColumnsName.TIMETABLE.TRAINKEY,tTimeTableDataTimeTable.trainkey );
//			values.put(ColumnsName.TIMETABLE.STKEY,tTimeTableDataTimeTable.stkey );
//			values.put(ColumnsName.TIMETABLE.TIME,tTimeTableDataTimeTable.time );
//			values.put(ColumnsName.TIMETABLE.TIMEMIN,tTimeTableDataTimeTable.timemin );
//
//			long id = trackTrackDataBase.insert(Asm.HARBER_UP_TRAIN_TIMETABLE, null, values);
//		}
//
//		for(int i=0;i<mTrackTracerDataManager.westerndowntimetable.values.size();i++){
//			TimeTableData.TimeTable tTimeTableDataTimeTable=this.mTrackTracerDataManager.westerndowntimetable.values.get(i).nameValuePairs;
//			ContentValues values = new ContentValues();
//
//			values.put(ColumnsName.TIMETABLE.TRAINKEY,tTimeTableDataTimeTable.trainkey );
//			values.put(ColumnsName.TIMETABLE.STKEY,tTimeTableDataTimeTable.stkey );
//			values.put(ColumnsName.TIMETABLE.TIME,tTimeTableDataTimeTable.time );
//			values.put(ColumnsName.TIMETABLE.TIMEMIN,tTimeTableDataTimeTable.timemin );
//
//			long id = trackTrackDataBase.insert(Asm.WESTERN_DOWN_TRAIN_TIMETABLE, null, values);
//		}
//
//		for(int i=0;i<mTrackTracerDataManager.centraldowntimetable.values.size();i++){
//			TimeTableData.TimeTable tTimeTableDataTimeTable=this.mTrackTracerDataManager.centraldowntimetable.values.get(i).nameValuePairs;
//			ContentValues values = new ContentValues();
//
//			values.put(ColumnsName.TIMETABLE.TRAINKEY,tTimeTableDataTimeTable.trainkey );
//			values.put(ColumnsName.TIMETABLE.STKEY,tTimeTableDataTimeTable.stkey );
//			values.put(ColumnsName.TIMETABLE.TIME,tTimeTableDataTimeTable.time );
//			values.put(ColumnsName.TIMETABLE.TIMEMIN,tTimeTableDataTimeTable.timemin );
//
//			long id = trackTrackDataBase.insert(Asm.CENTRAL_DOWN_TRAIN_TIMETABLE, null, values);
//		}
//
//		for(int i=0;i<mTrackTracerDataManager.harberdowntimetable.values.size();i++){
//			TimeTableData.TimeTable tTimeTableDataTimeTable=this.mTrackTracerDataManager.harberdowntimetable.values.get(i).nameValuePairs;
//			ContentValues values = new ContentValues();
//
//			values.put(ColumnsName.TIMETABLE.TRAINKEY,tTimeTableDataTimeTable.trainkey );
//			values.put(ColumnsName.TIMETABLE.STKEY,tTimeTableDataTimeTable.stkey );
//			values.put(ColumnsName.TIMETABLE.TIME,tTimeTableDataTimeTable.time );
//			values.put(ColumnsName.TIMETABLE.TIMEMIN,tTimeTableDataTimeTable.timemin );
//
//			long id = trackTrackDataBase.insert(Asm.HARBER_DOWN_TRAIN_TIMETABLE, null, values);
//		}
//
//		//*****************METRO TIME TABLE INSERTION***********************************

		for(int i=0;i<mTrackTracerDataManager.metrouptimetable.size();i++){
			TrainInfo tTimeTableDataTimeTable = mTrackTracerDataManager.metrouptimetable.get(i);

			for(int j=0;j<tTimeTableDataTimeTable.stationName.length;j++){
				ContentValues values = new ContentValues();
				values.put(ColumnsName.TIMETABLE.TRAINKEY,tTimeTableDataTimeTable.trainId );
				values.put(ColumnsName.TIMETABLE.STKEY,tTimeTableDataTimeTable.stationName[j] );
				values.put(ColumnsName.TIMETABLE.TIME,tTimeTableDataTimeTable.time[j]);
				long id = trackTrackDataBase.insert(Asm.METRO_UP_TRAIN_TIMETABLE, null, values);
				Log.v("MetroInsertId", ":" + id);
			}

		}

		for(int i=0;i<mTrackTracerDataManager.metrodowntimetable.size();i++){
			TrainInfo tTimeTableDataTimeTable=mTrackTracerDataManager.metrodowntimetable.get(i);

			for(int j=0;j<tTimeTableDataTimeTable.stationName.length;j++){
				ContentValues values = new ContentValues();
				values.put(ColumnsName.TIMETABLE.TRAINKEY,tTimeTableDataTimeTable.trainId );
				values.put(ColumnsName.TIMETABLE.STKEY,tTimeTableDataTimeTable.stationName[j] );
				values.put(ColumnsName.TIMETABLE.TIME,tTimeTableDataTimeTable.time[j]);
				long id = trackTrackDataBase.insert(Asm.METRO_DOWN_TRAIN_TIMETABLE, null, values);
				Log.v("MetroInsertId", ":" + id);
			}

		}
		//*****************MONO TIME TABLE INSERTION***********************************

		String time="";
		int difference[] =new int[]{0,2,5,7,11,15,20};

		  final String[] MONO_UP_TRAIN_ROUTE=new String[]{
			MonoStationName.CHEMBUR,
			 MonoStationName.VPN_MARG_JUNCTION,
			 MonoStationName.FERTILISER_TOWNSHIP,
			 MonoStationName.BHARAT_PERTROLEUM,
			 MonoStationName.MYSORE_COLONY,
			 MonoStationName.BHAKTI_PARK,
			 MonoStationName.WADALA

	};

		  String trainKey = null;
		for(int i=6;i<=21;i++){
			for(int j=0;j<59;j+=15){
				for(int k=0;k<7;k++){
					String stationTime = null,temp;
					if(j+difference[k]>60){
						temp=(i+1)+":"+((j+difference[k])%60)+"\n";
					}else{
						if((j+difference[k])==60)
							temp=(i+1)+":"+00+"\n";
						else
							temp=i+":"+(j+difference[k])+"\n";
					}
					if(k==0){
						stationTime=trainKey=temp;
					time+=("Key : "+temp);
					}
					else{
						stationTime=temp;
					}

					ContentValues values = new ContentValues();
					values.put(ColumnsName.TIMETABLE.TRAINKEY,"CH"+trainKey+"WA" );
					values.put(ColumnsName.TIMETABLE.STKEY,MONO_UP_TRAIN_ROUTE[k] );

					Date stringToDate = null;
					try {
						stringToDate =simpleDateFormat.parse(stationTime);
						stationTime=simpleDateFormat.format(stringToDate);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}


					values.put(ColumnsName.TIMETABLE.TIME,simpleDateFormat.format(stringToDate));
					long id = trackTrackDataBase.insert(Asm.MONO_UP_TRAIN_TIMETABLE, null, values);

				}
			}
		}
		String differenceString[] =new String[]{"07","09","12","14","18","22","27"};
		for(int l=0;l<MONO_UP_TRAIN_ROUTE.length;l++){
		ContentValues values = new ContentValues();
		values.put(ColumnsName.TIMETABLE.TRAINKEY,"WA2207CH" );
		values.put(ColumnsName.TIMETABLE.STKEY,MONO_UP_TRAIN_ROUTE[l] );
		values.put(ColumnsName.TIMETABLE.TIME,"22:"+differenceString[l]);
		long id = trackTrackDataBase.insert(Asm.MONO_UP_TRAIN_TIMETABLE, null, values);
		}



		//****************Mono Wadala to Chambur timing insertation
		String timeDown="";
		int differenceDown[] =new int[]{0,4,8,11,14,16,18};

		  final String[] MONO_DOWN_TRAIN_ROUTE=new String[]{

			 MonoStationName.WADALA,
			 MonoStationName.BHAKTI_PARK,
			 MonoStationName.MYSORE_COLONY,
			 MonoStationName.BHARAT_PERTROLEUM,
			 MonoStationName.FERTILISER_TOWNSHIP,
			 MonoStationName.VPN_MARG_JUNCTION,
			 MonoStationName.CHEMBUR

	};

		  String differenceStringMonoDownFirst[] =new String[]{"00","04","08","11","14","16","18"};
			for(int l=0;l<MONO_DOWN_TRAIN_ROUTE.length;l++){
			ContentValues values = new ContentValues();
			values.put(ColumnsName.TIMETABLE.TRAINKEY,"WA0600CH" );
			values.put(ColumnsName.TIMETABLE.STKEY,MONO_DOWN_TRAIN_ROUTE[l] );
			values.put(ColumnsName.TIMETABLE.TIME,"06:"+differenceStringMonoDownFirst[l]);
			long id = trackTrackDataBase.insert(Asm.MONO_DOWN_TRAIN_TIMETABLE, null, values);
			}

		  String trainKeyDown = null;
		for(int i=6;i<=21;i++){
			for(int j=7;j<59;j+=15){
				for(int k=0;k<7;k++){
					String stationTime = null,temp;
					if(j+difference[k]>60){
						temp=(i+1)+":"+((j+differenceDown[k])%60)+"\n";
					}else{
						if((j+difference[k])==60)
							temp=(i+1)+":"+00+"\n";
						else
							temp=i+":"+(j+difference[k])+"\n";
					}
					if(k==0){
						stationTime=trainKey=temp;
					time+=("Key : "+temp);
					}
					else{
						stationTime=temp;
					}

					ContentValues values = new ContentValues();
					values.put(ColumnsName.TIMETABLE.TRAINKEY,"WA"+trainKey+"CH" );
					values.put(ColumnsName.TIMETABLE.STKEY,MONO_DOWN_TRAIN_ROUTE[k] );

					Date stringToDate = null;
					try {
						stringToDate =simpleDateFormat.parse(stationTime);
						stationTime=simpleDateFormat.format(stringToDate);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}


					values.put(ColumnsName.TIMETABLE.TIME,simpleDateFormat.format(stringToDate));
					long id = trackTrackDataBase.insert(Asm.MONO_DOWN_TRAIN_TIMETABLE, null, values);

				}
			}
		}
		 String differenceStringMonoDownLast[] =new String[]{"07","12","16","19","21","24","26"};
			for(int l=0;l<MONO_DOWN_TRAIN_ROUTE.length;l++){
			ContentValues values = new ContentValues();
			values.put(ColumnsName.TIMETABLE.TRAINKEY,"WA2207CH" );
			values.put(ColumnsName.TIMETABLE.STKEY,MONO_DOWN_TRAIN_ROUTE[l] );
			values.put(ColumnsName.TIMETABLE.TIME,"22:"+differenceStringMonoDownLast[l]);
			long id = trackTrackDataBase.insert(Asm.MONO_DOWN_TRAIN_TIMETABLE, null, values);
			}

	}

	@Override
	public void onUpgrade(SQLiteDatabase trackTrackDataBase, int oldVersion, int newVersion) {
		Log.w("DB UPdate",
		        "Upgrading database from version " + oldVersion + " to "
		            + newVersion + ", which will destroy all old data");

		trackTrackDataBase.execSQL("DROP TABLE IF EXISTS " + Asm. WESTERN_LINE_STATIONS);
		trackTrackDataBase.execSQL("DROP TABLE IF EXISTS " + Asm. CENTRAL_LINE_STATIONS);
		trackTrackDataBase.execSQL("DROP TABLE IF EXISTS " + Asm. HARBER_LINE_STATIONS);

		trackTrackDataBase.execSQL("DROP TABLE IF EXISTS " + Asm. WESTERN_UP_TRAIN_TIMETABLE);
		trackTrackDataBase.execSQL("DROP TABLE IF EXISTS " + Asm. CENTRAL_UP_TRAIN_TIMETABLE);
		trackTrackDataBase.execSQL("DROP TABLE IF EXISTS " + Asm. HARBER_UP_TRAIN_TIMETABLE);

		trackTrackDataBase.execSQL("DROP TABLE IF EXISTS " + Asm. WESTERN_DOWN_TRAIN_TIMETABLE);
		trackTrackDataBase.execSQL("DROP TABLE IF EXISTS " + Asm. CENTRAL_DOWN_TRAIN_TIMETABLE);
		trackTrackDataBase.execSQL("DROP TABLE IF EXISTS " + Asm. HARBER_DOWN_TRAIN_TIMETABLE);

		trackTrackDataBase.execSQL("DROP TABLE IF EXISTS " + Asm. WESTERN_UP_TRAINS);
		trackTrackDataBase.execSQL("DROP TABLE IF EXISTS " + Asm. CENTRAL_UP_TRAINS);
		trackTrackDataBase.execSQL("DROP TABLE IF EXISTS " + Asm. HARBER_UP_TRAINS);

		trackTrackDataBase.execSQL("DROP TABLE IF EXISTS " + Asm. WESTERN_DOWN_TRAINS);
		trackTrackDataBase.execSQL("DROP TABLE IF EXISTS " + Asm. CENTRAL_DOWN_TRAINS);
		trackTrackDataBase.execSQL("DROP TABLE IF EXISTS " + Asm. HARBER_DOWN_TRAINS);

		trackTrackDataBase.execSQL("DROP TABLE IF EXISTS " + Asm. METRO_UP_TRAIN_TIMETABLE);
		trackTrackDataBase.execSQL("DROP TABLE IF EXISTS " + Asm. METRO_DOWN_TRAIN_TIMETABLE);

		trackTrackDataBase.execSQL("DROP TABLE IF EXISTS " + Asm. MONO_UP_TRAIN_TIMETABLE);
		trackTrackDataBase.execSQL("DROP TABLE IF EXISTS " + Asm. MONO_DOWN_TRAIN_TIMETABLE);

		    onCreate(trackTrackDataBase);
	}
}
