package mumbai.d360.database.contentvalue;

import android.content.ContentValues;

import java.util.ArrayList;
import java.util.List;

import mumbai.d360.database.MySQLiteHelper;
import mumbai.d360.utils.Time;
import mumbai.d360.utils.TrainType;

public class HarberLineUpTrain {
	String[] panvel2CSTTrainRout=new String[]{HarberLineStation.PANVEL,HarberLineStation.KHANDESHWAR,
			HarberLineStation.MANASAROVAR,HarberLineStation.KHARGHAR,HarberLineStation.BELAPUR,HarberLineStation.SEAWOOD_DARAVE,
			HarberLineStation.NERUL,HarberLineStation.JUI_NAGAR,HarberLineStation.SANPADA,HarberLineStation.VASHI,
			HarberLineStation.MANKHURD,HarberLineStation.GOVANDI,HarberLineStation.CHEMBUR,HarberLineStation.TILAK_NAGAR,
			HarberLineStation.KURLA,HarberLineStation.CHUNABHATTI,HarberLineStation.GTB_NAGAR,HarberLineStation.VADALA_ROAD,
			HarberLineStation.SEWRI,HarberLineStation.COTTON_GREEN,HarberLineStation.REAY_RD,HarberLineStation.DOCKYARD_RD,
			HarberLineStation.SANDHURST_RD,HarberLineStation.MASJID_BUNDER,HarberLineStation.MUMBAI_CST
	};

	private List<TrainInfo> harberLineAllTrainList=null;
	private List<ContentValues> harberLineAllTrainListForDB=null;
	ContentValues values;
	TrainInfo mTrainInfo;

	public HarberLineUpTrain() {
		 harberLineAllTrainList=new ArrayList<TrainInfo>();
		 harberLineAllTrainListForDB=new ArrayList<ContentValues>();
		 harberLineTrainCreater();
	}

	public void harberLineTrainCreater(){
		mTrainInfo=new TrainInfo("PL1ST", TrainType.SLOW,panvel2CSTTrainRout);
		mTrainInfo.time=new String[]{Time.T0400,Time.T0404,Time.T0407,Time.T0410,Time.T0414,Time.T0418,
				Time.T0421,Time.T0424,Time.T0427,Time.T0429,Time.T0437,Time.T0440,Time.T0442,Time.T0445,
				Time.T0448,Time.T0451,Time.T0454,Time.T0459,Time.T0502,Time.T0505,Time.T0507,Time.T0510,
				Time.T0512,Time.T0514,Time.T0517};
		harberLineAllTrainList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("PL2ST",TrainType.SLOW,panvel2CSTTrainRout);
		mTrainInfo.time=new String[]{Time.T0426,Time.T0430,Time.T0433,Time.T0436,Time.T0440,
				Time.T0444,Time.T0447,Time.T0450,Time.T0453,Time.T0455,
				Time.T0503,Time.T0506,Time.T0508,Time.T0511,Time.T0514,
				Time.T0517,Time.T0520,Time.T0525,Time.T0528,Time.T0531,
				Time.T0533,Time.T0536,Time.T0538,Time.T0540,Time.T0543};
		harberLineAllTrainList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("PL3ST",TrainType.SLOW,panvel2CSTTrainRout);
		mTrainInfo.time=new String[]{Time.T0459,Time.T0503,Time.T0506,Time.T0509,Time.T0513,
				Time.T0517,Time.T0520,Time.T0523,Time.T0526,Time.T0528,
				Time.T0536,Time.T0539,Time.T0541,Time.T0544,Time.T0547,
				Time.T0550,Time.T0553,Time.T0558,Time.T0601,Time.T0604,
				Time.T0606,Time.T0609,Time.T0611,Time.T0613,Time.T0616};
		harberLineAllTrainList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("PL4ST",TrainType.SLOW,panvel2CSTTrainRout);
		mTrainInfo.time=new String[]{Time.T0523,Time.T0527,Time.T0530,Time.T0533,Time.T0537,
				Time.T0541,Time.T0544,Time.T0547,Time.T0550,Time.T0552,
				Time.T0600,Time.T0603,Time.T0605,Time.T0608,Time.T0611,
				Time.T0614,Time.T0617,Time.T0622,Time.T0625,Time.T0628,
				Time.T0630,Time.T0633,Time.T0635,Time.T0637,Time.T0640};
		harberLineAllTrainList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("PL5ST",TrainType.SLOW,panvel2CSTTrainRout);
		mTrainInfo.time=new String[]{Time.T0539,Time.T0543,Time.T0546,Time.T0549,Time.T0553,
				Time.T0557,Time.T0600,Time.T0603,Time.T0606,Time.T0608,
				Time.T0616,Time.T0619,Time.T0621,Time.T0624,Time.T0627,
				Time.T0630,Time.T0633,Time.T0638,Time.T0641,Time.T0644,
				Time.T0646,Time.T0649,Time.T0651,Time.T0653,Time.T0656};
		harberLineAllTrainList.add(mTrainInfo);

//		mTrainInfo=new TrainInfo("PL5ST",TrainType.SLOW,panvel2CSTTrainRout);
//		mTrainInfo.time=new String[]{Time.T0,Time.T0,Time.T0,Time.T0,Time.T0,
//				Time.T0,Time.T0,Time.T0,Time.T0,Time.T0,
//				Time.T0,Time.T0,Time.T0,Time.T0,Time.T0,
//				Time.T0,Time.T0,Time.T0,Time.T0,Time.T0,
//				Time.T0,Time.T0,Time.T0,Time.T0,Time.T0};
//		harberLineAllTrainList.add(mTrainInfo);


		prepareAllTrainForDB();
	}

	public void prepareAllTrainForDB(){
		for (int i = 0; i < harberLineAllTrainList.size(); i++) {
			TrainInfo tTrainInfo= harberLineAllTrainList.get(i);
			for (int j = 0; j <tTrainInfo.stationName.length; j++) {
				values= new ContentValues();
			    values.put(MySQLiteHelper.COLUMN_TRAIN_ID, tTrainInfo.trainId);
			    values.put(MySQLiteHelper.COLUMN_TRAIN_TYPE, tTrainInfo.type);
			    values.put(MySQLiteHelper.COLUMN_STATION, harberLineAllTrainList.get(i).stationName[j]);
			    values.put(MySQLiteHelper.COLUMN_TIME,harberLineAllTrainList.get(i).time[j]);
			    harberLineAllTrainListForDB.add(values)	;
			}

		}
	}

	public List<ContentValues> getAllUpTrains(){
		return harberLineAllTrainListForDB;
	}
}
