package mumbai.d360.dataprovider.metro;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;

import mumbai.d360.database.contentvalue.TrainInfo;
import mumbai.d360.utils.Time;
import mumbai.d360.utils.TrainType;


public class Php {
	private List<TrainInfo> metroDownTrainInfoList=null;
	ContentValues values;
	TrainInfo mTrainInfo;
	
	public static final String[] METRO_DOWN_TRAIN_ROUTE=new String[]{
			
			MetroStationNames.VERSOVA,
			MetroStationNames.D_N_NAGAR,
			MetroStationNames.AZAD_NAGAR,
			MetroStationNames.ANDHERI,
			MetroStationNames.WESTERN_EXP_HIGHWAY,
			MetroStationNames.CHAKALA,
			MetroStationNames.AIRPORT_ROAD,
			MetroStationNames.MAROL_NAKA,
			MetroStationNames.SAKI_NAKA,
			MetroStationNames.ASALPA,
			MetroStationNames.JAGRUTI_NAGAR,
			MetroStationNames.GHATKOPAR,
	};
	
	public Php() {
		metroDownTrainInfoList=new ArrayList<TrainInfo>();
		 metroUpTrainInfoCreater();
	}
	public List<TrainInfo> getMetroDownTrainInfo() {
		return metroDownTrainInfoList;
	}

	private void metroUpTrainInfoCreater() {
		
		
//		mTrainInfo=new TrainInfo("VE06GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
//		mTrainInfo.time=new String[]{Time.T06,Time.T06,Time.T06,Time.T06,Time.T06,Time.T06,
//				Time.T06,Time.T06,Time.T06,Time.T06,Time.T06,Time.T06};
//		metroDownTrainInfoList.add(mTrainInfo);
//		mTrainInfo=new TrainInfo("VE06GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
//		mTrainInfo.time=new String[]{Time.T06,Time.T06,Time.T06,Time.T06,Time.T06,Time.T06,
//				Time.T06,Time.T06,Time.T06,Time.T06,Time.T06,Time.T06};
//		metroDownTrainInfoList.add(mTrainInfo);
//		
//		mTrainInfo=new TrainInfo("VE06GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
//		mTrainInfo.time=new String[]{Time.T06,Time.T06,Time.T06,Time.T06,Time.T06,Time.T06,
//				Time.T06,Time.T06,Time.T06,Time.T06,Time.T06,Time.T06};
//		metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE0535GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0535,Time.T0536,Time.T0538,Time.T0540,Time.T0542,Time.T0544,
			Time.T0546,Time.T0548,Time.T0549,Time.T0551,Time.T0553,Time.T0556};
	metroDownTrainInfoList.add(mTrainInfo);
	
	
	mTrainInfo=new TrainInfo("VE0537GH", TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0537, Time.T0538,Time.T0540,Time.T0542,Time.T0544,Time.T0546,
			Time.T0548,Time.T0550,Time.T0551,Time.T0553,Time.T0555,Time.T0558};
	metroDownTrainInfoList.add(mTrainInfo);
	
	
	mTrainInfo=new TrainInfo("VE0544GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0544,Time.T0545,Time.T0547,Time.T0549,Time.T0551,Time.T0553,
			Time.T0555,Time.T0557,Time.T0558,Time.T0600,Time.T0602,Time.T0605};
	metroDownTrainInfoList.add(mTrainInfo);
	
	
	mTrainInfo=new TrainInfo("VE0551GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0551,Time.T0552,Time.T0554,Time.T0556,Time.T0558,Time.T0600,Time.T0602,
			Time.T0604,Time.T0605,Time.T0607,Time.T0609,Time.T0612};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE0558GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0558,Time.T0559,Time.T0601,Time.T0603,Time.T0605,Time.T0607,
			Time.T0609,Time.T0611,Time.T0612,Time.T0614,Time.T0616,Time.T0619};
	metroDownTrainInfoList.add(mTrainInfo);
	
	
	mTrainInfo=new TrainInfo("VE0601GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0601,Time.T0603,Time.T0604,Time.T0607,Time.T0609,Time.T0611,
			Time.T0613,Time.T0614,Time.T0616,Time.T0618,Time.T0620,Time.T0622};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE0606GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0606,Time.T0608,Time.T0610,Time.T0613,Time.T0615,Time.T0617,
			Time.T0618,Time.T0620,Time.T0622,Time.T0624,Time.T0626,Time.T0628};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE0612GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0612,Time.T0613,Time.T0615,Time.T0618,Time.T0620,Time.T0622,
			Time.T0623,Time.T0625,Time.T0627,Time.T0629,Time.T0631,Time.T0633};
	metroDownTrainInfoList.add(mTrainInfo);

	
	mTrainInfo=new TrainInfo("VE0616GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0616,Time.T0617,Time.T0619,Time.T0622,Time.T0624,Time.T0626,
			Time.T0627,Time.T0629,Time.T0631,Time.T0633,Time.T0635,Time.T0637};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE0622GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0622,Time.T0623,Time.T0625,Time.T0628,Time.T0630,Time.T0632,
			Time.T0633,Time.T0635,Time.T0637,Time.T0639,Time.T0641,Time.T0643};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE0627GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0627,Time.T0629,Time.T0630,Time.T0633,Time.T0635,Time.T0637,
			Time.T0638,Time.T0640,Time.T0642,Time.T0644,Time.T0646,Time.T0648};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE0633GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0633,Time.T0635,Time.T0636,Time.T0639,Time.T0641,Time.T0643,
			Time.T0644,Time.T0646,Time.T0648,Time.T0650,Time.T0652,Time.T0654};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE0638GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0638,Time.T0639,Time.T0641,Time.T0643,Time.T0646,Time.T0648,
			Time.T0649,Time.T0651,Time.T0653,Time.T0654,Time.T0656,Time.T0659};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE0642GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0642,Time.T0643,Time.T0645,Time.T0648,Time.T0650,Time.T0652,
			Time.T0653,Time.T0655,Time.T0657,Time.T0659,Time.T0701,Time.T0703};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE0646GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0646,Time.T0647,Time.T0649,Time.T0651,Time.T0653,Time.T0655,
			Time.T0657,Time.T0659,Time.T0700,Time.T0702,Time.T0704,Time.T0707};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE0652GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0652,Time.T0653,Time.T0655,Time.T0657,Time.T0659,Time.T0701,
			Time.T0703,Time.T0705,Time.T0706,Time.T0708,Time.T0710,Time.T0713};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE0658GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0658,Time.T0659,Time.T0701,Time.T0703,Time.T0705,Time.T0707,
			Time.T0709,Time.T0711,Time.T0712,Time.T0714,Time.T0716,Time.T0719};
	metroDownTrainInfoList.add(mTrainInfo);
	

	
	mTrainInfo=new TrainInfo("VE0703GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0703,Time.T0704,Time.T0706,Time.T0708,Time.T0710,Time.T0712,
			Time.T0714,Time.T0716,Time.T0717,Time.T0719,Time.T0721,Time.T0724};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE0706GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0706,Time.T0707,Time.T0709,Time.T0711,Time.T0714,Time.T0716,
			Time.T0717,Time.T0719,Time.T0721,Time.T0723,Time.T0724,Time.T0727};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE0709GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0709,Time.T0711,Time.T0712,Time.T0715,Time.T0717,Time.T0719,
			Time.T0720,Time.T0722,Time.T0724,Time.T0726,Time.T0728,Time.T0730};
	metroDownTrainInfoList.add(mTrainInfo);


	mTrainInfo=new TrainInfo("VE0713GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0713,Time.T0714,Time.T0716,Time.T0718,Time.T0720,Time.T0722,
			Time.T0724,Time.T0726,Time.T0727,Time.T0729,Time.T0731,Time.T0734};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE0716GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0716,Time.T0717,Time.T0719,Time.T0721,Time.T0724,Time.T0726,
			Time.T0727,Time.T0729,Time.T0731,Time.T0733,Time.T0734,Time.T0737};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE0719GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0719,Time.T0721,Time.T0722,Time.T0725,Time.T0727,Time.T0729,
			Time.T0730,Time.T0732,Time.T0734,Time.T0736,Time.T0738,Time.T0740};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE0723GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0723,Time.T0724,Time.T0726,Time.T0728,Time.T0730,Time.T0732,
			Time.T0734,Time.T0736,Time.T0737,Time.T0739,Time.T0741,Time.T0744};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE0726GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0726,Time.T0727,Time.T0729,Time.T0731,Time.T0734,Time.T0736,
			Time.T0737,Time.T0739,Time.T0741,Time.T0743,Time.T0744,Time.T0747};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE0729GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0729,Time.T0731,Time.T0732,Time.T0735,Time.T0737,Time.T0739,
			Time.T0740,Time.T0742,Time.T0744,Time.T0746,Time.T0748,Time.T0750};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE0733GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0733,Time.T0734,Time.T0736,Time.T0738,Time.T0740,Time.T0742,
			Time.T0744,Time.T0746,Time.T0747,Time.T0749,Time.T0751,Time.T0754};
	metroDownTrainInfoList.add(mTrainInfo);
	

//	mTrainInfo=new TrainInfo("VE0736GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
//	mTrainInfo.time=new String[]{Time.T07,Time.T07,Time.T07,Time.T07,Time.T07,Time.T07,
//			Time.T07,Time.T07,Time.T07,Time.T07,Time.T07,Time.T07};
//	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE0739GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0739,Time.T0741,Time.T0742,Time.T0745,Time.T0747,Time.T0749,
			Time.T0750,Time.T0752,Time.T0754,Time.T0756,Time.T0758,Time.T0800};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE0743GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0743,Time.T0744,Time.T0746,Time.T0748,Time.T0750,Time.T0752,
			Time.T0754,Time.T0756,Time.T0757,Time.T0759,Time.T0801,Time.T0804};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE0746GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0746,Time.T0747,Time.T0749,Time.T0751,Time.T0754,Time.T0756,
			Time.T0757,Time.T0759,Time.T0801,Time.T0803,Time.T0804,Time.T0807};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE0749GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0749,Time.T0751,Time.T0752,Time.T0755,Time.T0757,Time.T0759,
			Time.T0800,Time.T0802,Time.T0804,Time.T0806,Time.T0808,Time.T0810};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE0753GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0753,Time.T0754,Time.T0756,Time.T0758,Time.T0800,Time.T0802,
			Time.T0804,Time.T0806,Time.T0807,Time.T0809,Time.T0811,Time.T0814};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE0756GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0756,Time.T0757,Time.T0759,Time.T0801,Time.T0804,Time.T0806,
			Time.T0807,Time.T0809,Time.T0811,Time.T0813,Time.T0814,Time.T0817};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE0759GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0759,Time.T0801,Time.T0802,Time.T0805,Time.T0807,Time.T0809,
			Time.T0810,Time.T0812,Time.T0814,Time.T0816,Time.T0818,Time.T0820};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE0803GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0803,Time.T0804,Time.T0806,Time.T0808,Time.T0810,Time.T0812,
			Time.T0814,Time.T0816,Time.T0817,Time.T0819,Time.T0821,Time.T0824};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE0806GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0806,Time.T0807,Time.T0809,Time.T0811,Time.T0814,Time.T0816,
			Time.T0817,Time.T0819,Time.T0821,Time.T0823,Time.T0824,Time.T0827};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE0809GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0809,Time.T0811,Time.T0812,Time.T0815,Time.T0817,Time.T0819,
			Time.T0820,Time.T0822,Time.T0824,Time.T0826,Time.T0828,Time.T0830};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE0813GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0813,Time.T0814,Time.T0816,Time.T0818,Time.T0820,Time.T0822,
			Time.T0824,Time.T0826,Time.T0827,Time.T0829,Time.T0831,Time.T0834};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE0816GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0816,Time.T0817,Time.T0819,Time.T0821,Time.T0824,Time.T0826,
			Time.T0827,Time.T0829,Time.T0831,Time.T0833,Time.T0834,Time.T0837};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE0819GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0819,Time.T0821,Time.T0822,Time.T0825,Time.T0827,Time.T0829,
			Time.T0830,Time.T0832,Time.T0834,Time.T0836,Time.T0838,Time.T0840};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE0823GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0823,Time.T0824,Time.T0826,Time.T0828,Time.T0830,Time.T0832,
			Time.T0834,Time.T0836,Time.T0837,Time.T0839,Time.T0841,Time.T0844};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE0826GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0826,Time.T0827,Time.T0829,Time.T0831,Time.T0834,Time.T0836,
			Time.T0837,Time.T0839,Time.T0841,Time.T0843,Time.T0844,Time.T0847};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE0829GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0829,Time.T0831,Time.T0832,Time.T0835,Time.T0837,Time.T0839,
			Time.T0840,Time.T0842,Time.T0844,Time.T0846,Time.T0848,Time.T0850};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE0833GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0833,Time.T0834,Time.T0836,Time.T0838,Time.T0840,Time.T0842,
			Time.T0844,Time.T0846,Time.T0847,Time.T0849,Time.T0851,Time.T0854};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE0836GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0836,Time.T0837,Time.T0839,Time.T0841,Time.T0844,Time.T0846,
			Time.T0847,Time.T0849,Time.T0851,Time.T0853,Time.T0854,Time.T0857};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE0839GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0839,Time.T0841,Time.T0842,Time.T0845,Time.T0847,Time.T0849,
			Time.T0850,Time.T0852,Time.T0854,Time.T0856,Time.T0858,Time.T0900};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE0843GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0843,Time.T0844,Time.T0846,Time.T0848,Time.T0850,Time.T0852,
			Time.T0854,Time.T0856,Time.T0857,Time.T0859,Time.T0901,Time.T0904};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE0846GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0846,Time.T0847,Time.T0849,Time.T0851,Time.T0854,Time.T0856,
			Time.T0857,Time.T0859,Time.T0901,Time.T0903,Time.T0904,Time.T0907};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE0849GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0849,Time.T0851,Time.T0852,Time.T0855,Time.T0857,Time.T0859,
			Time.T0900,Time.T0902,Time.T0904,Time.T0906,Time.T0908,Time.T0910};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE0853GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0853,Time.T0854,Time.T0856,Time.T0858,Time.T0900,Time.T0902,
			Time.T0904,Time.T0906,Time.T0907,Time.T0909,Time.T0911,Time.T0914};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE0856GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0856,Time.T0857,Time.T0859,Time.T0901,Time.T0904,Time.T0906,
			Time.T0907,Time.T0909,Time.T0911,Time.T0913,Time.T0914,Time.T0917};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE0859GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0859,Time.T0901,Time.T0902,Time.T0905,Time.T0907,Time.T0909,
			Time.T0910,Time.T0912,Time.T0914,Time.T0914,Time.T0918,Time.T0920};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE0903GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0903,Time.T0904,Time.T0906,Time.T0908,Time.T0910,Time.T0912,
			Time.T0914,Time.T0916,Time.T0917,Time.T0919,Time.T0921,Time.T0924};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE0906GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0906,Time.T0907,Time.T0909,Time.T0911,Time.T0914,Time.T0916,
			Time.T0917,Time.T0919,Time.T0921,Time.T0923,Time.T0924,Time.T0927};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE0909GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0909,Time.T0911,Time.T0912,Time.T0915,Time.T0917,Time.T0919,
			Time.T0920,Time.T0922,Time.T0924,Time.T0926,Time.T0928,Time.T0930};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE0913GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0913,Time.T0914,Time.T0916,Time.T0918,Time.T0920,Time.T0922,
			Time.T0924,Time.T0926,Time.T0927,Time.T0929,Time.T0931,Time.T0934};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE0916GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0916,Time.T0917,Time.T0919,Time.T0921,Time.T0924,Time.T0926,
			Time.T0927,Time.T0929,Time.T0931,Time.T0933,Time.T0934,Time.T0937};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE0919GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0919,Time.T0921,Time.T0922,Time.T0925,Time.T0927,Time.T0929,
			Time.T0930,Time.T0932,Time.T0934,Time.T0936,Time.T0938,Time.T0940};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE0923GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0923,Time.T0924,Time.T0926,Time.T0928,Time.T0930,Time.T0932,
			Time.T0934,Time.T0936,Time.T0937,Time.T0939,Time.T0941,Time.T0944};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE0926GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0926,Time.T0927,Time.T0929,Time.T0931,Time.T0934,Time.T0936,
			Time.T0937,Time.T0939,Time.T0941,Time.T0943,Time.T0944,Time.T0947};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE0929GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0929,Time.T0931,Time.T0932,Time.T0935,Time.T0937,Time.T0939,
			Time.T0941,Time.T0942,Time.T0944,Time.T0946,Time.T0948,Time.T0950};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE0933GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0933,Time.T0934,Time.T0936,Time.T0938,Time.T0940,Time.T0942,
			Time.T0944,Time.T0946,Time.T0947,Time.T0949,Time.T0951,Time.T0954};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE0936GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0936,Time.T0937,Time.T0939,Time.T0941,Time.T0944,Time.T0946,
			Time.T0947,Time.T0949,Time.T0951,Time.T0953,Time.T0954,Time.T0957};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE0939GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0939,Time.T0941,Time.T0942,Time.T0945,Time.T0947,Time.T0949,
			Time.T0950,Time.T0952,Time.T0954,Time.T0956,Time.T0958,Time.T1000};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE0943GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0943,Time.T0944,Time.T0946,Time.T0948,Time.T0950,Time.T0952,
			Time.T0954,Time.T0956,Time.T0957,Time.T0959,Time.T1001,Time.T1004};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE0946GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0946,Time.T0947,Time.T0949,Time.T0951,Time.T0954,Time.T0956,
			Time.T0957,Time.T0959,Time.T1001,Time.T1003,Time.T1004,Time.T1007};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE0949GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0949,Time.T0951,Time.T0952,Time.T0955,Time.T0957,Time.T0959,
			Time.T1000,Time.T1002,Time.T1004,Time.T1006,Time.T1008,Time.T1010};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE0953GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0953,Time.T0954,Time.T0956,Time.T0958,Time.T1000,Time.T1002,
			Time.T1004,Time.T1006,Time.T1007,Time.T1009,Time.T1011,Time.T1014};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE0956GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0956,Time.T0957,Time.T0959,Time.T1001,Time.T1004,Time.T1006,
			Time.T1007,Time.T1009,Time.T1011,Time.T1013,Time.T1014,Time.T1017};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE0959GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T0959,Time.T1001,Time.T1002,Time.T1005,Time.T1007,Time.T1009,
			Time.T1010,Time.T1012,Time.T1014,Time.T1016,Time.T1018,Time.T1020};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1003GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1003,Time.T1004,Time.T1006,Time.T1008,Time.T1010,Time.T1012,
			Time.T1014,Time.T1016,Time.T1017,Time.T1019,Time.T1021,Time.T1024};
	metroDownTrainInfoList.add(mTrainInfo);
	
	

	mTrainInfo=new TrainInfo("VE1006GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1006,Time.T1007,Time.T1009,Time.T1011,Time.T1014,Time.T1016,
			Time.T1017,Time.T1019,Time.T1021,Time.T1023,Time.T1024,Time.T1027};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1009GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1009,Time.T1011,Time.T1012,Time.T1015,Time.T1017,Time.T1019,
			Time.T1020,Time.T1022,Time.T1024,Time.T1026,Time.T1028,Time.T1030};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1013GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1013,Time.T1014,Time.T1016,Time.T1018,Time.T1020,Time.T1022,
			Time.T1024,Time.T1026,Time.T1027,Time.T1029,Time.T1031,Time.T1034};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1016GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1016,Time.T1017,Time.T1019,Time.T1021,Time.T1024,Time.T1026,
			Time.T1027,Time.T1029,Time.T1031,Time.T1033,Time.T1034,Time.T1037};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1019GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1019,Time.T1021,Time.T1022,Time.T1025,Time.T1027,Time.T1029,
			Time.T1030,Time.T1032,Time.T1034,Time.T1036,Time.T1038,Time.T1040};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1023GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1023,Time.T1024,Time.T1026,Time.T1028,Time.T1030,Time.T1032,
			Time.T1034,Time.T1036,Time.T1037,Time.T1039,Time.T1041,Time.T1044};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1026GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1026,Time.T1027,Time.T1029,Time.T1031,Time.T1034,Time.T1036,
			Time.T1037,Time.T1039,Time.T1041,Time.T1043,Time.T1044,Time.T1047};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1029GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1029,Time.T1031,Time.T1032,Time.T1035,Time.T1037,Time.T1039,
			Time.T1040,Time.T1042,Time.T1044,Time.T1046,Time.T1048,Time.T1050};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1033GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1033,Time.T1034,Time.T1036,Time.T1038,Time.T1040,Time.T1042,Time.T1044,
			Time.T1046,Time.T1047,Time.T1049,Time.T1051,Time.T1051};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1036GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1036,Time.T1037,Time.T1039,Time.T1041,Time.T1044,Time.T1046,
			Time.T1047,Time.T1049,Time.T1051,Time.T1053,Time.T1054,Time.T1057};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1039GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1039,Time.T1041,Time.T1042,Time.T1045,Time.T1047,Time.T1049,
			Time.T1050,Time.T1052,Time.T1054,Time.T1056,Time.T1058,Time.T1100};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1043GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1043,Time.T1044,Time.T1046,Time.T1048,Time.T1050,Time.T1052,
			Time.T1054,Time.T1056,Time.T1057,Time.T1059,Time.T1101,Time.T1104};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1046GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1046,Time.T1047,Time.T1049,Time.T1051,Time.T1054,Time.T1056,Time.T1057,
			Time.T1059,Time.T1101,Time.T1103,Time.T1104,Time.T1107};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1049GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1049,Time.T1051,Time.T1052,Time.T1055,Time.T1057,Time.T1059,
			Time.T1100,Time.T1102,Time.T1104,Time.T1106,Time.T1108,Time.T1110};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE1053GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1053,Time.T1054,Time.T1056,Time.T1058,Time.T1100,Time.T1102,
			Time.T1104,Time.T1106,Time.T1107,Time.T1109,Time.T1111,Time.T1114};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE1056GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1056,Time.T1057,Time.T1059,Time.T1101,Time.T1104,Time.T1106,
			Time.T1107,Time.T1109,Time.T1111,Time.T1113,Time.T1114,Time.T1117};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE1059GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1059,Time.T1101,Time.T1102,Time.T1105,Time.T1107,Time.T1109,
			Time.T1110,Time.T1112,Time.T1114,Time.T1116,Time.T1118,Time.T1120};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE1103GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1103,Time.T1104,Time.T1106,Time.T1108,Time.T1110,Time.T1112,
			Time.T1114,Time.T1116,Time.T1117,Time.T1119,Time.T1121,Time.T1124};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE1106GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1106,Time.T1107,Time.T1109,Time.T1111,Time.T1114,Time.T1116,
			Time.T1117,Time.T1119,Time.T1121,Time.T1123,Time.T1124,Time.T1127};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE1109GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1109,Time.T1111,Time.T1112,Time.T1115,Time.T1117,Time.T1119,
			Time.T1120,Time.T1122,Time.T1124,Time.T1126,Time.T1128,Time.T1130};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1113GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1113,Time.T1114,Time.T1116,Time.T1118,Time.T1120,Time.T1221,
			Time.T1124,Time.T1126,Time.T1127,Time.T1129,Time.T1131,Time.T1134};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1116GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1116,Time.T1117,Time.T1119,Time.T1121,Time.T1124,Time.T1126,
			Time.T1127,Time.T1129,Time.T1131,Time.T1133,Time.T1134,Time.T1137};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1119GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1119,Time.T1121,Time.T1122,Time.T1125,Time.T1127,Time.T1129,
			Time.T1131,Time.T1132,Time.T1134,Time.T1136,Time.T1138,Time.T1140};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1123GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1123,Time.T1124,Time.T1126,Time.T1128,Time.T1130,Time.T1132,
			Time.T1134,Time.T1136,Time.T1137,Time.T1139,Time.T1141,Time.T1144};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1126GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1126,Time.T1127,Time.T1129,Time.T1131,Time.T1134,Time.T1136,
			Time.T1137,Time.T1139,Time.T1141,Time.T1143,Time.T1144,Time.T1147};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1129GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1129,Time.T1131,Time.T1132,Time.T1135,Time.T1137,Time.T1139,
			Time.T1140,Time.T1142,Time.T1144,Time.T1146,Time.T1148,Time.T1150};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1133GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1132,Time.T1134,Time.T1136,Time.T1138,Time.T1140,Time.T1142,
			Time.T1144,Time.T1146,Time.T1147,Time.T1149,Time.T1151,Time.T1154};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1136GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1136,Time.T1137,Time.T1139,Time.T1141,Time.T1144,Time.T1146,
			Time.T1147,Time.T1149,Time.T1151,Time.T1153,Time.T1154,Time.T1157};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1139GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1139,Time.T1141,Time.T1142,Time.T1145,Time.T1147,Time.T1149,
			Time.T1150,Time.T1152,Time.T1154,Time.T1156,Time.T1158,Time.T1200};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1143GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1143,Time.T1144,Time.T1146,Time.T1148,Time.T1150,Time.T1152,
			Time.T1154,Time.T1156,Time.T1157,Time.T1159,Time.T1201,Time.T1204};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1146GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1146,Time.T1147,Time.T1149,Time.T1151,Time.T1154,Time.T1156,
			Time.T1157,Time.T1159,Time.T1201,Time.T1203,Time.T1204,Time.T1207};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1149GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1149,Time.T1151,Time.T1152,Time.T1155,Time.T1157,Time.T1159,Time.T1200,
			Time.T1202,Time.T1204,Time.T1206,Time.T1208,Time.T1210};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1153GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1153,Time.T1154,Time.T1156,Time.T1158,Time.T1200,Time.T1202,
			Time.T1204,Time.T1206,Time.T1207,Time.T1209,Time.T1211,Time.T1214};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1156GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1156,Time.T1157,Time.T1159,Time.T1201,Time.T1204,Time.T1206,
			Time.T1207,Time.T1209,Time.T1211,Time.T1213,Time.T1214,Time.T1217};
	metroDownTrainInfoList.add(mTrainInfo);
	
	
	mTrainInfo=new TrainInfo("VE1159GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1159,Time.T1201,Time.T1202,Time.T1205,Time.T1207,Time.T1209,
			Time.T1210,Time.T1212,Time.T1214,Time.T1216,Time.T1218,Time.T1220};
	metroDownTrainInfoList.add(mTrainInfo);
		
	mTrainInfo=new TrainInfo("VE1203GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1203,Time.T1204,Time.T1206,Time.T1208,Time.T1210,Time.T1212,
			Time.T1214,Time.T1216,Time.T1217,Time.T1219,Time.T1221,Time.T1224};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE1206GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1206,Time.T1207,Time.T1209,Time.T1211,Time.T1214,Time.T1216,
			Time.T1217,Time.T1219,Time.T1221,Time.T1223,Time.T1224,Time.T1227};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE1209GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1209,Time.T1211,Time.T1212,Time.T1215,Time.T1217,Time.T1219,
			Time.T1220,Time.T1222,Time.T1224,Time.T1226,Time.T1228,Time.T1230};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE1213GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1213,Time.T1214,Time.T1216,Time.T1218,Time.T1220,Time.T1222,
			Time.T1224,Time.T1226,Time.T1227,Time.T1229,Time.T1231,Time.T1234};
	metroDownTrainInfoList.add(mTrainInfo);

	

	mTrainInfo=new TrainInfo("VE1216GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1216,Time.T1217,Time.T1219,Time.T1221,Time.T1224,Time.T1226,
			Time.T1227,Time.T1229,Time.T1231,Time.T1233,Time.T1234,Time.T1237};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE1219GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1219,Time.T1221,Time.T1222,Time.T1225,Time.T1227,Time.T1229,
			Time.T1230,Time.T1232,Time.T1234,Time.T1236,Time.T1238,Time.T1240};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE1223GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1223,Time.T1224,Time.T1226,Time.T1228,Time.T1230,Time.T1232,
			Time.T1234,Time.T1236,Time.T1237,Time.T1239,Time.T1241,Time.T1244};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE1226GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1226,Time.T1227,Time.T1229,Time.T1231,Time.T1234,Time.T1236,
			Time.T1237,Time.T1239,Time.T1241,Time.T1243,Time.T1244,Time.T1247};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE1229GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1229,Time.T1231,Time.T1232,Time.T1235,Time.T1237,Time.T1239,
			Time.T1240,Time.T1242,Time.T1244,Time.T1246,Time.T1248,Time.T1250};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE1233GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1233,Time.T1234,Time.T1236,Time.T1238,Time.T1240,Time.T1242,
			Time.T1244,Time.T1246,Time.T1247,Time.T1249,Time.T1251,Time.T1254};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE1236GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1236,Time.T1237,Time.T1239,Time.T1241,Time.T1244,Time.T1246,
			Time.T1247,Time.T1249,Time.T1251,Time.T1253,Time.T1254,Time.T1257};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE1239GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1239,Time.T1241,Time.T1242,Time.T1245,Time.T1247,Time.T1249,
			Time.T1250,Time.T1252,Time.T1254,Time.T1256,Time.T1258,Time.T1300};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE1243GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1243,Time.T1244,Time.T1246,Time.T1248,Time.T1250,Time.T1252,
			Time.T1254,Time.T1256,Time.T1257,Time.T1259,Time.T1301,Time.T1304};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE1246GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1246,Time.T1247,Time.T1249,Time.T1251,Time.T1254,Time.T1256,
			Time.T1257,Time.T1259,Time.T1301,Time.T1303,Time.T1304,Time.T1307};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE1249GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1249,Time.T1251,Time.T1252,Time.T1255,Time.T1257,Time.T1259,
			Time.T1300,Time.T1302,Time.T1304,Time.T1306,Time.T1308,Time.T1310};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE1253GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1253,Time.T1254,Time.T1256,Time.T1258,Time.T1300,Time.T1302,
			Time.T1304,Time.T1306,Time.T1307,Time.T1309,Time.T1311,Time.T1314};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE1256GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1256,Time.T1257,Time.T1259,Time.T1301,Time.T1304,Time.T1306,
			Time.T1307,Time.T1309,Time.T1311,Time.T1313,Time.T1314,Time.T1317};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE1304GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1304,Time.T1305,Time.T1307,Time.T1309,Time.T1312,Time.T1314,
			Time.T1315,Time.T1317,Time.T1319,Time.T1320,Time.T1322,Time.T1325};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE1311GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1311,Time.T1312,Time.T1314,Time.T1316,Time.T1319,Time.T1321,
			Time.T1322,Time.T1324,Time.T1326,Time.T1327,Time.T1329,Time.T1332};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1318GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1318,Time.T1319,Time.T1321,Time.T1323,Time.T1326,Time.T1328,
			Time.T1329,Time.T1331,Time.T1333,Time.T1334,Time.T1336,Time.T1339};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1325GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1325,Time.T1326,Time.T1328,Time.T1330,Time.T1333,Time.T1335,
			Time.T1336,Time.T1338,Time.T1340,Time.T1341,Time.T1343,Time.T1346};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1332GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1332,Time.T1333,Time.T1335,Time.T1337,Time.T1340,Time.T1342,
			Time.T1343,Time.T1345,Time.T1347,Time.T1348,Time.T1350,Time.T1353};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1339GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1339,Time.T1340,Time.T1342,Time.T1344,Time.T1347,Time.T1349,
			Time.T1350,Time.T1352,Time.T1354,Time.T1355,Time.T1357,Time.T1400};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1346GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1346,Time.T1347,Time.T1349,Time.T1351,Time.T1354,Time.T1356,
			Time.T1357,Time.T1359,Time.T1401,Time.T1402,Time.T1404,Time.T1407};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1353GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1353,Time.T1354,Time.T1356,Time.T1358,Time.T1401,Time.T1403,
			Time.T1404,Time.T1406,Time.T1408,Time.T1409,Time.T1411,Time.T1414};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1400GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1400,Time.T1401,Time.T1403,Time.T1405,Time.T1408,Time.T1410,
			Time.T1411,Time.T1413,Time.T1415,Time.T1416,Time.T1418,Time.T1421};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1407GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1407,Time.T1408,Time.T1410,Time.T1412,Time.T1415,Time.T1417,
			Time.T1418,Time.T1420,Time.T1422,Time.T1423,Time.T1425,Time.T1428};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1414GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1414,Time.T1415,Time.T1417,Time.T1419,Time.T1422,Time.T1424,
			Time.T1425,Time.T1427,Time.T1429,Time.T1430,Time.T1432,Time.T1435};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1421GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1421,Time.T1422,Time.T1424,Time.T1426,Time.T1429,Time.T1431,
			Time.T1432,Time.T1434,Time.T1436,Time.T1437,Time.T1439,Time.T1442};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1428GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1428,Time.T1429,Time.T1431,Time.T1433,Time.T1436,Time.T1438,
			Time.T1439,Time.T1441,Time.T1443,Time.T1444,Time.T1446,Time.T1449};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1435GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1435,Time.T1436,Time.T1438,Time.T1440,Time.T1443,Time.T1445,
			Time.T1446,Time.T1448,Time.T1450,Time.T1451,Time.T1453,Time.T1456};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1442GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1442,Time.T1443,Time.T1445,Time.T1447,Time.T1450,Time.T1452,
			Time.T1453,Time.T1455,Time.T1457,Time.T1458,Time.T1500,Time.T1503};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1449GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1449,Time.T1450,Time.T1452,Time.T1454,Time.T1457,Time.T1459,
			Time.T1500,Time.T1502,Time.T1504,Time.T1505,Time.T1507,Time.T1510};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1456GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1456,Time.T1457,Time.T1459,Time.T1501,Time.T1504,Time.T1506,
			Time.T1507,Time.T1509,Time.T1511,Time.T1513,Time.T1514,Time.T1517};
	metroDownTrainInfoList.add(mTrainInfo);
	


	mTrainInfo=new TrainInfo("VE1503GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1503,Time.T1504,Time.T1506,Time.T1508,Time.T1511,Time.T1513,
			Time.T1514,Time.T1516,Time.T1518,Time.T1519,Time.T1521,Time.T1524};
	metroDownTrainInfoList.add(mTrainInfo);
	


	mTrainInfo=new TrainInfo("VE1510GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1510,Time.T1511,Time.T1513,Time.T1515,Time.T1518,Time.T1520,
			Time.T1521,Time.T1523,Time.T1525,Time.T1526,Time.T1528,Time.T1531};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1517GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1517,Time.T1518,Time.T1520,Time.T1522,Time.T1525,Time.T1527,
			Time.T1528,Time.T1530,Time.T1532,Time.T1533,Time.T1535,Time.T1538};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1524GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1524,Time.T1525,Time.T1527,Time.T1529,Time.T1532,Time.T1534,
			Time.T1535,Time.T1537,Time.T1539,Time.T1540,Time.T1542,Time.T1545};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1531GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1531,Time.T1532,Time.T1534,Time.T1536,Time.T1539,Time.T1541,
			Time.T1542,Time.T1544,Time.T1546,Time.T1547,Time.T1549,Time.T1552};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1538GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1538,Time.T1539,Time.T1541,Time.T1543,Time.T1546,Time.T1548,
			Time.T1549,Time.T1551,Time.T1553,Time.T1554,Time.T1556,Time.T1559};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1545GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1545,Time.T1546,Time.T1548,Time.T1550,Time.T1553,Time.T1555,
			Time.T1556,Time.T1558,Time.T1600,Time.T1601,Time.T1603,Time.T1606};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1552GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1552,Time.T1553,Time.T1555,Time.T1557,Time.T1600,Time.T1602,
			Time.T1603,Time.T1605,Time.T1607,Time.T1608,Time.T1610,Time.T1613};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1559GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1559,Time.T1600,Time.T1602,Time.T1604,Time.T1607,Time.T1609,
			Time.T1610,Time.T1612,Time.T1614,Time.T1615,Time.T1617,Time.T1620};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1606GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1606,Time.T1607,Time.T1609,Time.T1611,Time.T1614,Time.T1616,
			Time.T1617,Time.T1619,Time.T1621,Time.T1622,Time.T1624,Time.T1627};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1613GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1613,Time.T1614,Time.T1616,Time.T1618,Time.T1621,Time.T1623,
			Time.T1624,Time.T1626,Time.T1628,Time.T1629,Time.T1631,Time.T1634};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE1620GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1620,Time.T1621,Time.T1623,Time.T1625,Time.T1628,Time.T1630,
			Time.T1631,Time.T1633,Time.T1635,Time.T1636,Time.T1638,Time.T1641};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE1627GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1627,Time.T1628,Time.T1630,Time.T1632,Time.T1635,Time.T1637,
			Time.T1638,Time.T1640,Time.T1642,Time.T1643,Time.T1645,Time.T1648};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE1634GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1634,Time.T1635,Time.T1637,Time.T1639,Time.T1642,Time.T1644,
			Time.T1645,Time.T1647,Time.T1649,Time.T1650,Time.T1652,Time.T1655};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE1637GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1637,Time.T1638,Time.T1640,Time.T1643,Time.T1645,Time.T1647,
			Time.T1648,Time.T1650,Time.T1652,Time.T1654,Time.T1656,Time.T1658};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE1640GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1640,Time.T1642,Time.T1643,Time.T1646,Time.T1648,Time.T1650,
			Time.T1652,Time.T1653,Time.T1655,Time.T1657,Time.T1659,Time.T1701};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE1644GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1644,Time.T1645,Time.T1647,Time.T1649,Time.T1652,Time.T1654,
			Time.T1655,Time.T1657,Time.T1659,Time.T1700,Time.T1702,Time.T1705};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE1647GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1647,Time.T1648,Time.T1650,Time.T1653,Time.T1655,Time.T1657,
			Time.T1658,Time.T1700,Time.T1702,Time.T1704,Time.T1706,Time.T1708};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE1650GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1650,Time.T1652,Time.T1653,Time.T1656,Time.T1658,Time.T1700,
			Time.T1702,Time.T1703,Time.T1705,Time.T1707,Time.T1709,Time.T1711};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1654GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1654,Time.T1655,Time.T1657,Time.T1659,Time.T1702,Time.T1704,
			Time.T1705,Time.T1707,Time.T1709,Time.T1710,Time.T1712,Time.T1715};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE1657GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1657,Time.T1658,Time.T1700,Time.T1703,Time.T1705,Time.T1707,
			Time.T1708,Time.T1710,Time.T1712,Time.T1714,Time.T1716,Time.T1718};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE1700GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1700,Time.T1702,Time.T1703,Time.T1706,Time.T1708,Time.T1710,
			Time.T1712,Time.T1713,Time.T1715,Time.T1717,Time.T1719,Time.T1721};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1704GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1704,Time.T1705,Time.T1707,Time.T1709,Time.T1712,Time.T1714,
			Time.T1715,Time.T1717,Time.T1719,Time.T1720,Time.T1722,Time.T1725};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1707GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1707,Time.T1708,Time.T1710,Time.T1713,Time.T1715,Time.T1717,
			Time.T1718,Time.T1720,Time.T1722,Time.T1724,Time.T1726,Time.T1728};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1710GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1710,Time.T1712,Time.T1713,Time.T1716,Time.T1718,Time.T1720,
			Time.T1722,Time.T1723,Time.T1725,Time.T1727,Time.T1729,Time.T1731};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1714GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1714,Time.T1715,Time.T1717,Time.T1719,Time.T1722,Time.T1724,
			Time.T1725,Time.T1727,Time.T1729,Time.T1730,Time.T1732,Time.T1735};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1717GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1717,Time.T1718,Time.T1720,Time.T1723,Time.T1725,Time.T1727,
			Time.T1728,Time.T1730,Time.T1732,Time.T1734,Time.T1736,Time.T1738};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1720GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1720,Time.T1722,Time.T1724,Time.T1726,Time.T1728,Time.T1730,
			Time.T1732,Time.T1733,Time.T1735,Time.T1737,Time.T1739,Time.T1741};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1724GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1724,Time.T1725,Time.T1727,Time.T1729,Time.T1732,Time.T1734,
			Time.T1735,Time.T1737,Time.T1739,Time.T1740,Time.T1742,Time.T1745};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1727GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1727,Time.T1728,Time.T1730,Time.T1733,Time.T1735,Time.T1737,
			Time.T1738,Time.T1740,Time.T1742,Time.T1744,Time.T1746,Time.T1748};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1730GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1730,Time.T1732,Time.T1733,Time.T1736,Time.T1738,Time.T1740,
			Time.T1742,Time.T1743,Time.T1745,Time.T1747,Time.T1749,Time.T1751};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1734GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1734,Time.T1735,Time.T1737,Time.T1739,Time.T1742,Time.T1744,
			Time.T1745,Time.T1747,Time.T1749,Time.T1750,Time.T1752,Time.T1755};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1737GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1737,Time.T1738,Time.T1740,Time.T1743,Time.T1745,Time.T1747,
			Time.T1748,Time.T1750,Time.T1752,Time.T1754,Time.T1756,Time.T1758};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1740GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1740,Time.T1742,Time.T1743,Time.T1746,Time.T1748,Time.T1750,
			Time.T1752,Time.T1753,Time.T1755,Time.T1757,Time.T1759,Time.T1801};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1744GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1744,Time.T1745,Time.T1747,Time.T1749,Time.T1752,Time.T1754,
			Time.T1755,Time.T1757,Time.T1759,Time.T1800,Time.T1802,Time.T1805};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1747GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1747,Time.T1748,Time.T1750,Time.T1753,Time.T1755,Time.T1757,
			Time.T1758,Time.T1800,Time.T1802,Time.T1804,Time.T1806,Time.T1808};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1750GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1750,Time.T1752,Time.T1753,Time.T1756,Time.T1758,Time.T1800,
			Time.T1802,Time.T1803,Time.T1805,Time.T1807,Time.T1809,Time.T1811};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1754GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1754,Time.T1755,Time.T1757,Time.T1759,Time.T1802,Time.T1804,
			Time.T1805,Time.T1807,Time.T1809,Time.T1810,Time.T1812,Time.T1815};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1757GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1757,Time.T1758,Time.T1800,Time.T1803,Time.T1805,Time.T1807,
			Time.T1808,Time.T1810,Time.T1812,Time.T1814,Time.T1816,Time.T1818};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1800GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1800,Time.T1802,Time.T1803,Time.T1806,Time.T1808,Time.T1810,
			Time.T1812,Time.T1813,Time.T1815,Time.T1817,Time.T1819,Time.T1821};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1804GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1804,Time.T1805,Time.T1807,Time.T1809,Time.T1812,Time.T1814,
			Time.T1815,Time.T1817,Time.T1819,Time.T1820,Time.T1822,Time.T1825};
	metroDownTrainInfoList.add(mTrainInfo);
	

//	mTrainInfo=new TrainInfo("VE1806GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
//	mTrainInfo.time=new String[]{Time.T18,Time.T18,Time.T18,Time.T18,Time.T18,Time.T18,
//			Time.T18,Time.T18,Time.T18,Time.T18,Time.T18,Time.T18};
//	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1807GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1807,Time.T1808,Time.T1810,Time.T1813,Time.T1815,Time.T1817,
			Time.T1818,Time.T1820,Time.T1822,Time.T1824,Time.T1826,Time.T1828};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1810GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1810,Time.T1812,Time.T1813,Time.T1816,Time.T1818,Time.T1820,
			Time.T1822,Time.T1823,Time.T1825,Time.T1827,Time.T1829,Time.T1831};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1814GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1814,Time.T1815,Time.T1817,Time.T1819,Time.T1822,Time.T1824,
			Time.T1825,Time.T1827,Time.T1829,Time.T1830,Time.T1832,Time.T1835};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1817GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1817,Time.T1818,Time.T1820,Time.T1823,Time.T1825,Time.T1827,
			Time.T1828,Time.T1830,Time.T1832,Time.T1834,Time.T1836,Time.T1838};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1820GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1820,Time.T1822,Time.T1823,Time.T1826,Time.T1828,Time.T1830,
			Time.T1832,Time.T1833,Time.T1835,Time.T1837,Time.T1839,Time.T1841};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1824GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1824,Time.T1825,Time.T1827,Time.T1829,Time.T1832,Time.T1834,
			Time.T1835,Time.T1837,Time.T1839,Time.T1840,Time.T1842,Time.T1845};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1827GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1827,Time.T1828,Time.T1830,Time.T1833,Time.T1835,Time.T1837,
			Time.T1838,Time.T1840,Time.T1842,Time.T1844,Time.T1846,Time.T1848};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1830GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1830,Time.T1832,Time.T1833,Time.T1836,Time.T1838,Time.T1840,
			Time.T1842,Time.T1843,Time.T1845,Time.T1847,Time.T1849,Time.T1851};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1834GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1834,Time.T1835,Time.T1837,Time.T1839,Time.T1842,Time.T1844,
			Time.T1845,Time.T1847,Time.T1849,Time.T1850,Time.T1852,Time.T1855};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1837GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1837,Time.T1838,Time.T1840,Time.T1843,Time.T1845,Time.T1847,
			Time.T1848,Time.T1850,Time.T1852,Time.T1854,Time.T1856,Time.T1858};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1840GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1840,Time.T1842,Time.T1843,Time.T1846,Time.T1848,Time.T1850,
			Time.T1852,Time.T1853,Time.T1855,Time.T1857,Time.T1859,Time.T1901};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1844GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1844,Time.T1845,Time.T1847,Time.T1849,Time.T1852,Time.T1854,
			Time.T1855,Time.T1857,Time.T1859,Time.T1900,Time.T1902,Time.T1905};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1847GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1847,Time.T1848,Time.T1850,Time.T1853,Time.T1855,Time.T1857,
			Time.T1858,Time.T1900,Time.T1902,Time.T1904,Time.T1906,Time.T1908};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1850GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1850,Time.T1852,Time.T1853,Time.T1856,Time.T1858,Time.T1900,
			Time.T1902,Time.T1903,Time.T1905,Time.T1907,Time.T1909,Time.T1911};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE1854GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1854,Time.T1855,Time.T1857,Time.T1859,Time.T1902,Time.T1904,
			Time.T1905,Time.T1907,Time.T1909,Time.T1910,Time.T1912,Time.T1915};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE1857GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1857,Time.T1858,Time.T1900,Time.T1903,Time.T1905,Time.T1907,
			Time.T1908,Time.T1910,Time.T1912,Time.T1914,Time.T1916,Time.T1918};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE1900GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1900,Time.T1902,Time.T1903,Time.T1906,Time.T1908,Time.T1910,
			Time.T1912,Time.T1913,Time.T1915,Time.T1917,Time.T1919,Time.T1921};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE1904GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1904,Time.T1905,Time.T1907,Time.T1909,Time.T1912,Time.T1914,
			Time.T1915,Time.T1917,Time.T1919,Time.T1920,Time.T1922,Time.T1925};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE1907GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1907,Time.T1908,Time.T1910,Time.T1913,Time.T1915,Time.T1917,
			Time.T1918,Time.T1920,Time.T1922,Time.T1924,Time.T1926,Time.T1928};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE1910GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1910,Time.T1912,Time.T1913,Time.T1916,Time.T1918,Time.T1920,
			Time.T1922,Time.T1923,Time.T1925,Time.T1927,Time.T1929,Time.T1931};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE1914GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1914,Time.T1915,Time.T1917,Time.T1919,Time.T1922,Time.T1924,
			Time.T1925,Time.T1927,Time.T1929,Time.T1930,Time.T1932,Time.T1935};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE1917GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1917,Time.T1918,Time.T1920,Time.T1923,Time.T1925,Time.T1927,
			Time.T1928,Time.T1930,Time.T1932,Time.T1934,Time.T1936,Time.T1938};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE1920GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1920,Time.T1922,Time.T1923,Time.T1926,Time.T1928,Time.T1930,
			Time.T1932,Time.T1933,Time.T1935,Time.T1937,Time.T1939,Time.T1941};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE1924GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1924,Time.T1925,Time.T1927,Time.T1929,Time.T1932,Time.T1934,
			Time.T1935,Time.T1937,Time.T1939,Time.T1940,Time.T1942,Time.T1945};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE1927GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1927,Time.T1928,Time.T1930,Time.T1933,Time.T1935,Time.T1937,
			Time.T1938,Time.T1940,Time.T1942,Time.T1944,Time.T1946,Time.T1948};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE1930GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1930,Time.T1932,Time.T1933,Time.T1936,Time.T1938,Time.T1940,
			Time.T1942,Time.T1943,Time.T1945,Time.T1947,Time.T1949,Time.T1951};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE1934GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1934,Time.T1935,Time.T1937,Time.T1939,Time.T1942,Time.T1944,
			Time.T1945,Time.T1947,Time.T1949,Time.T1950,Time.T1952,Time.T1955};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE1937GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1937,Time.T1938,Time.T1940,Time.T1943,Time.T1945,Time.T1947,
			Time.T1948,Time.T1950,Time.T1952,Time.T1954,Time.T1956,Time.T1958};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE1940GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1940,Time.T1942,Time.T1943,Time.T1946,Time.T1948,Time.T1950,
			Time.T1952,Time.T1953,Time.T1955,Time.T1957,Time.T1959,Time.T2001};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE1944GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1944,Time.T1945,Time.T1947,Time.T1949,Time.T1952,Time.T1954,
			Time.T1955,Time.T1957,Time.T1959,Time.T2000,Time.T2002,Time.T2005};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE1947GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1947,Time.T1948,Time.T1950,Time.T1953,Time.T1955,Time.T1957,
			Time.T1958,Time.T2000,Time.T2002,Time.T2004,Time.T2006,Time.T2008};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE1950GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1950,Time.T1952,Time.T1953,Time.T1956,Time.T1958,Time.T2000,
			Time.T2002,Time.T2003,Time.T2005,Time.T2007,Time.T2009,Time.T2011};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE1954GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1954,Time.T1955,Time.T1957,Time.T1959,Time.T2002,Time.T2004,
			Time.T2005,Time.T2007,Time.T2009,Time.T2010,Time.T2012,Time.T2015};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE1957GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T1957,Time.T1958,Time.T2000,Time.T2003,Time.T2005,Time.T2007,
			Time.T2008,Time.T2010,Time.T2012,Time.T2014,Time.T2016,Time.T2018};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE2000GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2000,Time.T2002,Time.T2003,Time.T2006,Time.T2008,Time.T2010,
			Time.T2012,Time.T2013,Time.T2015,Time.T2017,Time.T2019,Time.T2021};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE2004GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2004,Time.T2005,Time.T2007,Time.T2009,Time.T2012,Time.T2014,
			Time.T2015,Time.T2017,Time.T2019,Time.T2020,Time.T2022,Time.T2025};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE2007GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2007,Time.T2008,Time.T2010,Time.T2013,Time.T2015,Time.T2017,
			Time.T2018,Time.T2020,Time.T2022,Time.T2024,Time.T2026,Time.T2028};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE2010GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2010,Time.T2012,Time.T2013,Time.T2016,Time.T2018,Time.T2020,
			Time.T2022,Time.T2023,Time.T2025,Time.T2027,Time.T2029,Time.T2031};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE2014GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2014,Time.T2015,Time.T2017,Time.T2019,Time.T2022,Time.T2024,
			Time.T2025,Time.T2027,Time.T2029,Time.T2030,Time.T2032,Time.T2035};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE2017GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2017,Time.T2018,Time.T2020,Time.T2023,Time.T2025,Time.T2027,
			Time.T2028,Time.T2030,Time.T2032,Time.T2034,Time.T2036,Time.T2038};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE2020GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2020,Time.T2022,Time.T2023,Time.T2026,Time.T2028,Time.T2030,
			Time.T2032,Time.T2033,Time.T2035,Time.T2037,Time.T2039,Time.T2041};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE2024GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2024,Time.T2025,Time.T2027,Time.T2029,Time.T2032,Time.T2034,
			Time.T2035,Time.T2037,Time.T2039,Time.T2040,Time.T2042,Time.T2045};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE2027GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2027,Time.T2028,Time.T2030,Time.T2033,Time.T2035,Time.T2037,
			Time.T2038,Time.T2040,Time.T2042,Time.T2044,Time.T2046,Time.T2048};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE2030GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2030,Time.T2032,Time.T2033,Time.T2036,Time.T2038,Time.T2040,
			Time.T2042,Time.T2043,Time.T2045,Time.T2047,Time.T2049,Time.T2051};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE2034GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2034,Time.T2035,Time.T2037,Time.T2039,Time.T2042,Time.T2044,
			Time.T2045,Time.T2047,Time.T2049,Time.T2050,Time.T2052,Time.T2055};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE2037GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2037,Time.T2038,Time.T2040,Time.T2043,Time.T2045,Time.T2047,
			Time.T2048,Time.T2050,Time.T2052,Time.T2054,Time.T2056,Time.T2058};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE2040GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2040,Time.T2042,Time.T2043,Time.T2046,Time.T2048,Time.T2050,
			Time.T2052,Time.T2053,Time.T2055,Time.T2057,Time.T2059,Time.T2101};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE2044GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2044,Time.T2045,Time.T2047,Time.T2049,Time.T2052,Time.T2054,
			Time.T2055,Time.T2057,Time.T2059,Time.T2100,Time.T2102,Time.T2105};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE2047GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2047,Time.T2048,Time.T2050,Time.T2053,Time.T2055,Time.T2057,
			Time.T2058,Time.T2100,Time.T2102,Time.T2104,Time.T2106,Time.T2108};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE2050GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2050,Time.T2052,Time.T2053,Time.T2056,Time.T2058,Time.T2100,
			Time.T2102,Time.T2103,Time.T2105,Time.T2107,Time.T2109,Time.T2111};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE2054GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2054,Time.T2055,Time.T2057,Time.T2059,Time.T2102,Time.T2104,
			Time.T2105,Time.T2107,Time.T2109,Time.T2110,Time.T2112,Time.T2115};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE2057GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2057,Time.T2058,Time.T2100,Time.T2102,Time.T2105,Time.T2107,
			Time.T2108,Time.T2110,Time.T2112,Time.T2114,Time.T2116,Time.T2118};
	metroDownTrainInfoList.add(mTrainInfo);
	
	mTrainInfo=new TrainInfo("VE2100GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2100,Time.T2102,Time.T2103,Time.T2106,Time.T2108,Time.T2110,
			Time.T2112,Time.T2113,Time.T2115,Time.T2117,Time.T2119,Time.T2121};
	metroDownTrainInfoList.add(mTrainInfo);
	

	mTrainInfo=new TrainInfo("VE2104GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2104,Time.T2105,Time.T2107,Time.T2109,Time.T2112,Time.T2114,
			Time.T2115,Time.T2117,Time.T2119,Time.T2120,Time.T2122,Time.T2125};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE2107GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2107,Time.T2108,Time.T2110,Time.T2113,Time.T2115,Time.T2117,
			Time.T2118,Time.T2120,Time.T2122,Time.T2124,Time.T2126,Time.T2128};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE2110GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2110,Time.T2112,Time.T2113,Time.T2116,Time.T2118,Time.T2120,
			Time.T2122,Time.T2123,Time.T2125,Time.T2127,Time.T2129,Time.T2131};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE2114GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2114,Time.T2115,Time.T2117,Time.T2119,Time.T2122,Time.T2124,
			Time.T2125,Time.T2127,Time.T2129,Time.T2130,Time.T2132,Time.T2135};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE2117GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2117,Time.T2118,Time.T2120,Time.T2123,Time.T2125,Time.T2127,
			Time.T2128,Time.T2130,Time.T2132,Time.T2134,Time.T2136,Time.T2138};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE2120GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2120,Time.T2122,Time.T2123,Time.T2116,Time.T2118,Time.T2130,
			Time.T2132,Time.T2133,Time.T2135,Time.T2137,Time.T2139,Time.T2141};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE2124GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2124,Time.T2125,Time.T2127,Time.T2129,Time.T2132,Time.T2134,
			Time.T2135,Time.T2137,Time.T2139,Time.T2140,Time.T2142,Time.T2145};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE2127GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2127,Time.T2128,Time.T2130,Time.T2133,Time.T2135,Time.T2137,
			Time.T2138,Time.T2140,Time.T2142,Time.T2144,Time.T2146,Time.T2148};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE2130GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2130,Time.T2132,Time.T2133,Time.T2136,Time.T2138,Time.T2140,
			Time.T2142,Time.T2143,Time.T2145,Time.T2147,Time.T2149,Time.T2151};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE2134GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2134,Time.T2135,Time.T2137,Time.T2139,Time.T2142,Time.T2144,
			Time.T2145,Time.T2147,Time.T2149,Time.T2150,Time.T2152,Time.T2155};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE2137GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2137,Time.T2138,Time.T2140,Time.T2143,Time.T2145,Time.T2147,
			Time.T2148,Time.T2150,Time.T2152,Time.T2154,Time.T2156,Time.T2158};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE2140GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2140,Time.T2142,Time.T2143,Time.T2146,Time.T2148,Time.T2150,
			Time.T2152,Time.T2153,Time.T2155,Time.T2157,Time.T2159,Time.T2201};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE2144GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2144,Time.T2145,Time.T2147,Time.T2149,Time.T2153,Time.T2154,
			Time.T2155,Time.T2157,Time.T2159,Time.T2200,Time.T2202,Time.T2205};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE2147GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2147,Time.T2148,Time.T2150,Time.T2153,Time.T2155,Time.T2157,
			Time.T2158,Time.T2200,Time.T2202,Time.T2204,Time.T2206,Time.T2208};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE2150GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2150,Time.T2152,Time.T2153,Time.T2156,Time.T2158,Time.T2200,
			Time.T2202,Time.T2203,Time.T2205,Time.T2207,Time.T2209,Time.T2211};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE2154GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2154,Time.T2155,Time.T2157,Time.T2159,Time.T2202,Time.T2204,
			Time.T2205,Time.T2207,Time.T2209,Time.T2210,Time.T2212,Time.T2215};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE2157GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2157,Time.T2158,Time.T2200,Time.T2203,Time.T2205,Time.T2207,
			Time.T2208,Time.T2210,Time.T2212,Time.T2214,Time.T2216,Time.T2218};
	metroDownTrainInfoList.add(mTrainInfo);

	mTrainInfo=new TrainInfo("VE2200GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2200,Time.T2202,Time.T2203,Time.T2206,Time.T2208,Time.T2210,
			Time.T2212,Time.T2213,Time.T2215,Time.T2217,Time.T2219,Time.T2221};
	metroDownTrainInfoList.add(mTrainInfo);


	mTrainInfo=new TrainInfo("VE2206GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2206,Time.T2207,Time.T2209,Time.T2211,Time.T2214,Time.T2216,
			Time.T2217,Time.T2219,Time.T2221,Time.T2222,Time.T2224,Time.T2227};
	metroDownTrainInfoList.add(mTrainInfo);


	mTrainInfo=new TrainInfo("VE2213GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2213,Time.T2214,Time.T2216,Time.T2218,Time.T2221,Time.T2223,
			Time.T2224,Time.T2226,Time.T2228,Time.T2229,Time.T2223,Time.T2234};
	metroDownTrainInfoList.add(mTrainInfo);


	mTrainInfo=new TrainInfo("VE2220GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2220,Time.T2221,Time.T2223,Time.T2225,Time.T2228,Time.T2230,
			Time.T2231,Time.T2233,Time.T2235,Time.T2236,Time.T2238,Time.T2241};
	metroDownTrainInfoList.add(mTrainInfo);


	mTrainInfo=new TrainInfo("VE2227GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2227,Time.T2228,Time.T2230,Time.T2232,Time.T2235,Time.T2237,
			Time.T2238,Time.T2240,Time.T2242,Time.T2243,Time.T2245,Time.T2248};
	metroDownTrainInfoList.add(mTrainInfo);


	mTrainInfo=new TrainInfo("VE2234GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2234,Time.T2235,Time.T2237,Time.T2239,Time.T2242,Time.T2244,
			Time.T2245,Time.T2247,Time.T2249,Time.T2250,Time.T2252,Time.T2255};
	metroDownTrainInfoList.add(mTrainInfo);


	mTrainInfo=new TrainInfo("VE2241GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2241,Time.T2242,Time.T2244,Time.T2246,Time.T2249,Time.T2251,
			Time.T2252,Time.T2254,Time.T2256,Time.T2257,Time.T2259,Time.T2302};
	metroDownTrainInfoList.add(mTrainInfo);


	mTrainInfo=new TrainInfo("VE2247GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2247,Time.T2248,Time.T2250,Time.T2252,Time.T2255,Time.T2257,
			Time.T2258,Time.T2300,Time.T2302,Time.T2303,Time.T2305,Time.T2308};
	metroDownTrainInfoList.add(mTrainInfo);


	mTrainInfo=new TrainInfo("VE2254GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2254,Time.T2255,Time.T2257,Time.T2259,Time.T2302,Time.T2304,
			Time.T2305,Time.T2307,Time.T2309,Time.T2310,Time.T2312,Time.T2315};
	metroDownTrainInfoList.add(mTrainInfo);


	mTrainInfo=new TrainInfo("VE2301GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2301,Time.T2302,Time.T2304,Time.T2306,Time.T2309,Time.T2311,
			Time.T2312,Time.T2314,Time.T2316,Time.T2317,Time.T2319,Time.T2322};
	metroDownTrainInfoList.add(mTrainInfo);


	mTrainInfo=new TrainInfo("VE2308GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2308,Time.T2309,Time.T2311,Time.T2313,Time.T2316,Time.T2318,
			Time.T2319,Time.T2321,Time.T2323,Time.T2324,Time.T2326,Time.T2329};
	metroDownTrainInfoList.add(mTrainInfo);


	mTrainInfo=new TrainInfo("VE2312GH",TrainType.METRO_TRAIN,METRO_DOWN_TRAIN_ROUTE);
	mTrainInfo.time=new String[]{Time.T2312,Time.T2313,Time.T2315,Time.T2317,Time.T2320,Time.T2322,
			Time.T2323,Time.T2325,Time.T2327,Time.T2328,Time.T2330,Time.T2333};
	metroDownTrainInfoList.add(mTrainInfo);


}
	
	
	
	
	
	
	
	
}
