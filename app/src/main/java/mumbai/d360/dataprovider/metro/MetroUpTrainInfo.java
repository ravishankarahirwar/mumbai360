package mumbai.d360.dataprovider.metro;

import android.content.ContentValues;


import java.util.ArrayList;
import java.util.List;

import mumbai.d360.database.contentvalue.TrainInfo;
import mumbai.d360.utils.Time;
import mumbai.d360.utils.TrainType;

/**Metro UP train means Ghatkoper to Vessova*/
public class MetroUpTrainInfo {
	private List<TrainInfo> metroUpTrainInfoList=null;
	ContentValues values;
	TrainInfo mTrainInfo;

	public static final String[] METRO_UP_TRAIN_ROUTE=new String[]{
			MetroStationNames.GHATKOPAR,
			MetroStationNames.JAGRUTI_NAGAR,
			MetroStationNames.ASALPA,
			MetroStationNames.SAKI_NAKA,
			MetroStationNames.MAROL_NAKA,
			MetroStationNames.AIRPORT_ROAD,
			MetroStationNames.CHAKALA,
			MetroStationNames.WESTERN_EXP_HIGHWAY,
			MetroStationNames.ANDHERI,
			MetroStationNames.AZAD_NAGAR,
			MetroStationNames.D_N_NAGAR,
			MetroStationNames.VERSOVA,
	};

	public MetroUpTrainInfo() {
		metroUpTrainInfoList=new ArrayList<TrainInfo>();
		 metroUpTrainInfoCreater();
	}
	public List<TrainInfo> getMetroUpTrainInfo() {
		return metroUpTrainInfoList;
	}

	private void metroUpTrainInfoCreater() {
		mTrainInfo=new TrainInfo("GH0531VE", TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0531,Time.T0533,Time.T0535,Time.T0536,Time.T0538,Time.T0540,
				Time.T0541,Time.T0543,Time.T0546,Time.T0548,Time.T0550,Time.T0551};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0537VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0537,Time.T0539,Time.T0541,Time.T0542,Time.T0544,Time.T0546,
				Time.T0547,Time.T0549,Time.T0552,Time.T0554,Time.T0556,Time.T0557};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0544VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0544, Time.T0546,Time.T0548,Time.T0549,Time.T0551,Time.T0553,
				Time.T0554,Time.T0556,Time.T0559,Time.T0601,Time.T0603,Time.T0604};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0549VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0549,Time.T0551,Time.T0553,Time.T0554,Time.T0556,Time.T0558,
				Time.T0559,Time.T0601,Time.T0604,Time.T0606,Time.T0608,Time.T0609};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0555VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0555,Time.T0557,Time.T0559,Time.T0601,Time.T0602,Time.T0604,
				Time.T0606,Time.T0608,Time.T0609,Time.T0612,Time.T0614,Time.T0616};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0602VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0602,Time.T0604,Time.T0605,Time.T0607,Time.T0609,Time.T0610,
				Time.T0612,Time.T0614,Time.T0616,Time.T0619,Time.T0620,Time.T0622};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0609VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0609,Time.T0611,Time.T0612,Time.T0614,Time.T0616,Time.T0617,
				Time.T0619,Time.T0621,Time.T0623,Time.T0626,Time.T0627,Time.T0629};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0616VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0616,Time.T0618,Time.T0619,Time.T0621,Time.T0623,Time.T0624,
				Time.T0626,Time.T0628,Time.T0630,Time.T0633,Time.T0634,Time.T0636};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0623VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0623,Time.T0625,Time.T0626,Time.T0628,Time.T0630,Time.T0631,
				Time.T0633,Time.T0635,Time.T0637,Time.T0640,Time.T0641,Time.T0643};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0630VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0630,Time.T0632,Time.T0633,Time.T0635,Time.T0637,Time.T0638,
				Time.T0640,Time.T0642,Time.T0644,Time.T0647,Time.T0648,Time.T0650};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0635VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0635,Time.T0637,Time.T0638,Time.T0640,Time.T0642,Time.T0643,
				Time.T0645,Time.T0647,Time.T0649,Time.T0652,Time.T0653,Time.T0655};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0642VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0642,Time.T0644,Time.T0645,Time.T0647,Time.T0649,Time.T0650,
				Time.T0652,Time.T0654,Time.T0656,Time.T0659,Time.T0700,Time.T0702};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0646VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0646,Time.T0648,Time.T0649,Time.T0651,Time.T0653,Time.T0654,
				Time.T0656,Time.T0658,Time.T0700,Time.T0703,Time.T0704,Time.T0706};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0652VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0652,Time.T0654,Time.T0655,Time.T0657,Time.T0659,Time.T0700,Time.T0702,
				Time.T0704,Time.T0706,Time.T0709,Time.T0710,Time.T0712};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0656VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0656,Time.T0658,Time.T0659,Time.T0701,Time.T0703,Time.T0704,
				Time.T0706,Time.T0708,Time.T0710,Time.T0713,Time.T0714,Time.T0716};
		metroUpTrainInfoList.add(mTrainInfo);



		//***************************************

		mTrainInfo=new TrainInfo("GH0700VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0700,Time.T0702,Time.T0703,Time.T0705,Time.T0707,Time.T0708,
				Time.T0710,Time.T0712,Time.T0714,Time.T0717,Time.T0718,Time.T0720};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0704VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0704,Time.T0706,Time.T0707,Time.T0709,Time.T0711,Time.T0712,
				Time.T0714,Time.T0716,Time.T0718,Time.T0721,Time.T0722,Time.T0724};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0708VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0708,Time.T0710,Time.T0712,Time.T0714,Time.T0715,Time.T0717,
				Time.T0719,Time.T0721,Time.T0722,Time.T0725,Time.T0727,Time.T0729};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0712VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0712,Time.T0714,Time.T0715,Time.T0717,Time.T0719,Time.T0720,
				Time.T0722,Time.T0724,Time.T0726,Time.T0729,Time.T0730,Time.T0732};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0717VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0717,Time.T0719,Time.T0720,Time.T0722,Time.T0724,Time.T0725,
				Time.T0727,Time.T0729,Time.T0731,Time.T0734,Time.T0736,Time.T0737};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0721VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0721,Time.T0723,Time.T0725,Time.T0727,Time.T0728,Time.T0730,
				Time.T0732,Time.T0734,Time.T0735,Time.T0738,Time.T0740,Time.T0742};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0725VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0725,Time.T0727,Time.T0729,Time.T0731,Time.T0732,Time.T0734,
				Time.T0736,Time.T0738,Time.T0739,Time.T0742,Time.T0744,Time.T0746};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0728VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0728,Time.T0730,Time.T0732,Time.T0734,Time.T0736,Time.T0737,
				Time.T0739,Time.T0741,Time.T0743,Time.T0746,Time.T0747,Time.T0749};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0732VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0732,Time.T0734,Time.T0735,Time.T0737,Time.T0739,Time.T0740,
				Time.T0742,Time.T0744,Time.T0746,Time.T0749,Time.T0751,Time.T0752};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0735VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0735,Time.T0737,Time.T0739,Time.T0741,Time.T0742,Time.T0744,
				Time.T0746,Time.T0748,Time.T0749,Time.T0752,Time.T0754,Time.T0756};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0738VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0738,Time.T0740,Time.T0742,Time.T0744,Time.T0746,Time.T0747,
				Time.T0749,Time.T0751,Time.T0753,Time.T0756,Time.T0757,Time.T0759};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0742VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0742,Time.T0744,Time.T0746,Time.T0747,Time.T0749,Time.T0751,
				Time.T0752,Time.T0754,Time.T0756,Time.T0759,Time.T0801,Time.T0803};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0745VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0745,Time.T0747,Time.T0749,Time.T0751,Time.T0753,Time.T0754,
				Time.T0756,Time.T0758,Time.T0800,Time.T0803,Time.T0804,Time.T0806};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0749VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0749,Time.T0751,Time.T0752,Time.T0754,Time.T0756,Time.T0757,
				Time.T0759,Time.T0801,Time.T0803,Time.T0806,Time.T0807,Time.T0809};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0752VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0752,Time.T0754,Time.T0756,Time.T0757,Time.T0759,Time.T0801,
				Time.T0802,Time.T0804,Time.T0806,Time.T0809,Time.T0811,Time.T0813};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0755VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0755,Time.T0757,Time.T0759,Time.T0801,Time.T0803,Time.T0804,Time.T0806,
				Time.T0808,Time.T0810,Time.T0813,Time.T0814,Time.T0816};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0759VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0759,Time.T0801,Time.T0802,Time.T0804,Time.T0806,Time.T0807,
				Time.T0809,Time.T0811,Time.T0813,Time.T0816,Time.T0817,Time.T0819};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0802VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0802,Time.T0804,Time.T0806,Time.T0807,Time.T0809,Time.T0811,
				Time.T0812,Time.T0814,Time.T0816,Time.T0819,Time.T0821,Time.T0823};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0805VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0805,Time.T0807,Time.T0809,Time.T0811,Time.T0813,Time.T0814,
				Time.T0816,Time.T0818,Time.T0820,Time.T0823,Time.T0824,Time.T0826};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0809VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0809,Time.T0811,Time.T0812,Time.T0814,Time.T0816,Time.T0817,
				Time.T0819,Time.T0821,Time.T0823,Time.T0826,Time.T0827,Time.T0829};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0812VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0812,Time.T0814,Time.T0816,Time.T0817,Time.T0819,Time.T0821,
				Time.T0822,Time.T0824,Time.T0826,Time.T0829,Time.T0831,Time.T0833};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0815VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0815,Time.T0817,Time.T0819,Time.T0821,Time.T0823,Time.T0824,
				Time.T0826,Time.T0828,Time.T0830,Time.T0833,Time.T0834,Time.T0836};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0819VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0819,Time.T0821,Time.T0822,Time.T0824,Time.T0826,Time.T0827,
				Time.T0829,Time.T0831,Time.T0833,Time.T0836,Time.T0837,Time.T0839};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0822VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0822,Time.T0824,Time.T0826,Time.T0827,Time.T0829,Time.T0831,
				Time.T0832,Time.T0834,Time.T0836,Time.T0839,Time.T0841,Time.T0843};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0825VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0825,Time.T0827,Time.T0829,Time.T0831,Time.T0833,Time.T0834,
				Time.T0836,Time.T0838,Time.T0840,Time.T0843,Time.T0844,Time.T0846};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0829VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0829,Time.T0831,Time.T0832,Time.T0834,Time.T0836,Time.T0837,
				Time.T0839,Time.T0841,Time.T0843,Time.T0846,Time.T0847,Time.T0849};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0832VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0832,Time.T0834,Time.T0836,Time.T0837,Time.T0839,Time.T0841,
				Time.T0842,Time.T0844,Time.T0846,Time.T0849,Time.T0851,Time.T0853};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0835VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0835,Time.T0837,Time.T0839,Time.T0841,Time.T0843,Time.T0844,
				Time.T0846,Time.T0848,Time.T0850,Time.T0853,Time.T0854,Time.T0856};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0839VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0839,Time.T0841,Time.T0842,Time.T0844,Time.T0846,Time.T0847,
				Time.T0849,Time.T0851,Time.T0853,Time.T0856,Time.T0857,Time.T0859};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0842VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0842,Time.T0844,Time.T0846,Time.T0847,Time.T0849,Time.T0851,
				Time.T0852,Time.T0854,Time.T0856,Time.T0859,Time.T0901,Time.T0903};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0845VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0845,Time.T0847,Time.T0849,Time.T0851,Time.T0853,Time.T0854,
				Time.T0856,Time.T0858,Time.T0900,Time.T0903,Time.T0904,Time.T0906};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0849VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0849,Time.T0851,Time.T0852,Time.T0854,Time.T0856,Time.T0857,
				Time.T0859,Time.T0901,Time.T0903,Time.T0906,Time.T0907,Time.T0909};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0852VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0852,Time.T0854,Time.T0856,Time.T0857,Time.T0859,Time.T0901,
				Time.T0902,Time.T0904,Time.T0906,Time.T0909,Time.T0911,Time.T0913};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0855VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0855,Time.T0857,Time.T0859,Time.T0901,Time.T0903,Time.T0904,
				Time.T0906,Time.T0908,Time.T0910,Time.T0913,Time.T0914,Time.T0916};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0859VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0859,Time.T0901,Time.T0902,Time.T0904,Time.T0906,Time.T0907,
				Time.T0909,Time.T0911,Time.T0913,Time.T0916,Time.T0917,Time.T0919};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0902VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0902,Time.T0904,Time.T0906,Time.T0907,Time.T0909,Time.T0911,
				Time.T0912,Time.T0914,Time.T0916,Time.T0919,Time.T0921,Time.T0923};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0905VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0905,Time.T0907,Time.T0909,Time.T0911,Time.T0913,Time.T0914,
				Time.T0916,Time.T0918,Time.T0920,Time.T0923,Time.T0924,Time.T0926};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0909VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0909,Time.T0911,Time.T0912,Time.T0914,Time.T0916,Time.T0917,
				Time.T0919,Time.T0921,Time.T0923,Time.T0926,Time.T0927,Time.T0929};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0912VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0912,Time.T0914,Time.T0916,Time.T0917,Time.T0919,Time.T0921,
				Time.T0922,Time.T0924,Time.T0926,Time.T0929,Time.T0931,Time.T0933};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0915VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0915,Time.T0917,Time.T0919,Time.T0921,Time.T0923,Time.T0924,
				Time.T0926,Time.T0928,Time.T0930,Time.T0933,Time.T0934,Time.T0936};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0919VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0919,Time.T0921,Time.T0922,Time.T0924,Time.T0926,Time.T0927,
				Time.T0929,Time.T0931,Time.T0933,Time.T0936,Time.T0937,Time.T0939};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0922VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0922,Time.T0924,Time.T0926,Time.T0927,Time.T0929,Time.T0931,
				Time.T0932,Time.T0934,Time.T0936,Time.T0939,Time.T0941,Time.T0943};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0925VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0925,Time.T0927,Time.T0929,Time.T0931,Time.T0933,Time.T0934,
				Time.T0936,Time.T0938,Time.T0940,Time.T0943,Time.T0944,Time.T0946};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0929VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0929,Time.T0931,Time.T0932,Time.T0934,Time.T0936,Time.T0937,
				Time.T0939,Time.T0941,Time.T0943,Time.T0946,Time.T0947,Time.T0949};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0932VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0932,Time.T0934,Time.T0936,Time.T0937,Time.T0939,Time.T0941,
				Time.T0942,Time.T0944,Time.T0946,Time.T0949,Time.T0951,Time.T0953};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0935VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0935,Time.T0937,Time.T0939,Time.T0941,Time.T0943,Time.T0944,
				Time.T0946,Time.T0948,Time.T0950,Time.T0953,Time.T0954,Time.T0956};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0939VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0939,Time.T0941,Time.T0942,Time.T0944,Time.T0946,Time.T0947,
				Time.T0949,Time.T0951,Time.T0953,Time.T0956,Time.T0957,Time.T0959};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0942VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0942,Time.T0944,Time.T0946,Time.T0947,Time.T0949,Time.T0951,
				Time.T0952,Time.T0954,Time.T0956,Time.T0959,Time.T1001,Time.T1003};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0945VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0945,Time.T0947,Time.T0949,Time.T0951,Time.T0953,Time.T0954,
				Time.T0956,Time.T0958,Time.T1000,Time.T1003,Time.T1004,Time.T1006};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0949VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0949,Time.T0951,Time.T0952,Time.T0954,Time.T0956,Time.T0957,
				Time.T0959,Time.T1001,Time.T1003,Time.T1006,Time.T1007,Time.T1009};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0952VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0952,Time.T0954,Time.T0956,Time.T0957,Time.T0959,Time.T1001,
				Time.T1002,Time.T1004,Time.T1006,Time.T1009,Time.T1011,Time.T1013};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0955VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0955,Time.T0957,Time.T0959,Time.T1001,Time.T1003,Time.T1004,
				Time.T1006,Time.T1008,Time.T1010,Time.T1013,Time.T1014,Time.T1016};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH0959VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T0959,Time.T1001,Time.T1002,Time.T1004,Time.T1006,Time.T1007,
				Time.T1009,Time.T1011,Time.T1013,Time.T1016,Time.T1017,Time.T1019};
		metroUpTrainInfoList.add(mTrainInfo);


		mTrainInfo=new TrainInfo("GH1002VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1002,Time.T1004,Time.T1006,Time.T1007,Time.T1009,Time.T1011,
				Time.T1012,Time.T1014,Time.T1016,Time.T1019,Time.T1021,Time.T1023};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1005VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1005,Time.T1007,Time.T1009,Time.T1011,Time.T1013,Time.T1014,
				Time.T1016,Time.T1018,Time.T1020,Time.T1023,Time.T1024,Time.T1026};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1009VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1009,Time.T1011,Time.T1012,Time.T1014,Time.T1016,Time.T1017,
				Time.T1019,Time.T1021,Time.T1023,Time.T1026,Time.T1027,Time.T1029};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1012VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1012,Time.T1014,Time.T1016,Time.T1017,Time.T1019,Time.T1021,
				Time.T1022,Time.T1024,Time.T1026,Time.T1029,Time.T1031,Time.T1033};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1015VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1015,Time.T1017,Time.T1019,Time.T1021,Time.T1023,Time.T1024,
				Time.T1026,Time.T1028,Time.T1030,Time.T1033,Time.T1034,Time.T1036};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1019VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1019,Time.T1021,Time.T1022,Time.T1024,Time.T1026,Time.T1027,
				Time.T1029,Time.T1031,Time.T1033,Time.T1036,Time.T1037,Time.T1039};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1022VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1022,Time.T1024,Time.T1026,Time.T1027,Time.T1029,Time.T1031,
				Time.T1032,Time.T1034,Time.T1036,Time.T1039,Time.T1041,Time.T1043};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1025VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1025,Time.T1027,Time.T1029,Time.T1031,Time.T1033,Time.T1034,
				Time.T1036,Time.T1038,Time.T1040,Time.T1043,Time.T1044,Time.T1046};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1029VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1029,Time.T1031,Time.T1032,Time.T1034,Time.T1036,Time.T1037,
				Time.T1039,Time.T1041,Time.T1043,Time.T1046,Time.T1047,Time.T1049};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1032VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1032,Time.T1034,Time.T1036,Time.T1037,Time.T1039,Time.T1041,
				Time.T1042,Time.T1044,Time.T1046,Time.T1049,Time.T1051,Time.T1053};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1035VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1035,Time.T1037,Time.T1039,Time.T1041,Time.T1043,Time.T1044,
				Time.T1046,Time.T1048,Time.T1050,Time.T1053,Time.T1054,Time.T1056};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1039VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1039,Time.T1041,Time.T1042,Time.T1044,Time.T1046,Time.T1047,
				Time.T1049,Time.T1051,Time.T1053,Time.T1056,Time.T1057,Time.T1059};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1042VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1042,Time.T1044,Time.T1046,Time.T1047,Time.T1049,Time.T1051,
				Time.T1052,Time.T1054,Time.T1056,Time.T1059,Time.T1101,Time.T1103};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1045VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1045,Time.T1047,Time.T1049,Time.T1051,Time.T1053,Time.T1054,
				Time.T1056,Time.T1058,Time.T1100,Time.T1103,Time.T1104,Time.T1106};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1049VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1049,Time.T1051,Time.T1052,Time.T1054,Time.T1056,Time.T1057,
				Time.T1059,Time.T1101,Time.T1103,Time.T1106,Time.T1107,Time.T1109};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1052VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1052,Time.T1054,Time.T1056,Time.T1057,Time.T1059,Time.T1101,
				Time.T1102,Time.T1104,Time.T1106,Time.T1109,Time.T1111,Time.T1113};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1055VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1055,Time.T1057,Time.T1059,Time.T1101,Time.T1103,Time.T1104,
				Time.T1106,Time.T1108,Time.T1110,Time.T1113,Time.T1114,Time.T1116};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1059VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1059,Time.T1101,Time.T1102,Time.T1104,Time.T1106,Time.T1107,
				Time.T1109,Time.T1111,Time.T1113,Time.T1116,Time.T1117,Time.T1119};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1102VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1102,Time.T1104,Time.T1106,Time.T1107,Time.T1109,Time.T1111,
				Time.T1112,Time.T1114,Time.T1116,Time.T1119,Time.T1121,Time.T1123};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1105VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1105,Time.T1107,Time.T1109,Time.T1111,Time.T1113,Time.T1114,
				Time.T1116,Time.T1118,Time.T1120,Time.T1123,Time.T1124,Time.T1126};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1109VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1109,Time.T1111,Time.T1112,Time.T1114,Time.T1116,Time.T1117,
				Time.T1119,Time.T1121,Time.T1123,Time.T1126,Time.T1127,Time.T1129};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1112VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1112,Time.T1114,Time.T1116,Time.T1117,Time.T1119,Time.T1121,
				Time.T1122,Time.T1124,Time.T1126,Time.T1129,Time.T1131,Time.T1133};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1115VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1115,Time.T1117,Time.T1119,Time.T1121,Time.T1123,Time.T1124,
				Time.T1126,Time.T1128,Time.T1130,Time.T1133,Time.T1134,Time.T1136};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1119VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1119,Time.T1121,Time.T1122,Time.T1124,Time.T1126,Time.T1127,
				Time.T1129,Time.T1131,Time.T1133,Time.T1136,Time.T1137,Time.T1139};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1122VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1122,Time.T1124,Time.T1126,Time.T1127,Time.T1129,Time.T1131,
				Time.T1132,Time.T1134,Time.T1136,Time.T1139,Time.T1141,Time.T1143};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1125VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1125,Time.T1127,Time.T1129,Time.T1131,Time.T1133,Time.T1134,
				Time.T1136,Time.T1138,Time.T1140,Time.T1143,Time.T1144,Time.T1146};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1129VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1129,Time.T1131,Time.T1132,Time.T1134,Time.T1136,Time.T1137,
				Time.T1139,Time.T1141,Time.T1143,Time.T1146,Time.T1147,Time.T1149};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1132VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1132,Time.T1134,Time.T1136,Time.T1137,Time.T1139,Time.T1141,
				Time.T1142,Time.T1144,Time.T1146,Time.T1149,Time.T1151,Time.T1153};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1135VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1135,Time.T1137,Time.T1139,Time.T1141,Time.T1143,Time.T1144,
				Time.T1146,Time.T1148,Time.T1150,Time.T1153,Time.T1154,Time.T1156};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1139VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1139,Time.T1141,Time.T1142,Time.T1144,Time.T1146,Time.T1147,
				Time.T1149,Time.T1151,Time.T1153,Time.T1156,Time.T1157,Time.T1159};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1142VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1142,Time.T1144,Time.T1146,Time.T1147,Time.T1149,Time.T1151,
				Time.T1152,Time.T1154,Time.T1156,Time.T1159,Time.T1201,Time.T1203};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1145VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1145,Time.T1147,Time.T1149,Time.T1151,Time.T1153,Time.T1154,
				Time.T1156,Time.T1158,Time.T1200,Time.T1203,Time.T1204,Time.T1206};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1149VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1149,Time.T1151,Time.T1152,Time.T1154,Time.T1156,Time.T1157,
				Time.T1159,Time.T1201,Time.T1203,Time.T1206,Time.T1207,Time.T1209};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1152VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1152,Time.T1154,Time.T1156,Time.T1157,Time.T1159,Time.T1201,
				Time.T1203,Time.T1204,Time.T1206,Time.T1209,Time.T1211,Time.T1213};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1155VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1155,Time.T1157,Time.T1159,Time.T1201,Time.T1203,Time.T1204,
				Time.T1206,Time.T1208,Time.T1210,Time.T1213,Time.T1214,Time.T1216};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1159VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1159,Time.T1201,Time.T1202,Time.T1204,Time.T1206,Time.T1207,
				Time.T1209,Time.T1211,Time.T1213,Time.T1216,Time.T1217,Time.T1219};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1202VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1202,Time.T1204,Time.T1206,Time.T1207,Time.T1209,Time.T1211,
				Time.T1212,Time.T1214,Time.T1216,Time.T1219,Time.T1221,Time.T1223};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1205VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1205,Time.T1207,Time.T1209,Time.T1211,Time.T1213,Time.T1214,
				Time.T1216,Time.T1218,Time.T1220,Time.T1223,Time.T1224,Time.T1226};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1209VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1209,Time.T1211,Time.T1212,Time.T1214,Time.T1216,Time.T1217,
				Time.T1219,Time.T1221,Time.T1223,Time.T1226,Time.T1227,Time.T1229};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1212VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1212,Time.T1214,Time.T1216,Time.T1217,Time.T1219,Time.T1221,
				Time.T1222,Time.T1224,Time.T1226,Time.T1229,Time.T1231,Time.T1233};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1215VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1215,Time.T1217,Time.T1219,Time.T1221,Time.T1223,Time.T1224,
				Time.T1226,Time.T1228,Time.T1230,Time.T1233,Time.T1234,Time.T1236};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1219VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1219,Time.T1221,Time.T1222,Time.T1224,Time.T1226,Time.T1227,
				Time.T1229,Time.T1231,Time.T1233,Time.T1236,Time.T1237,Time.T1239};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1222VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1222,Time.T1224,Time.T1226,Time.T1227,Time.T1229,Time.T1231,
				Time.T1232,Time.T1234,Time.T1236,Time.T1239,Time.T1241,Time.T1243};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1225VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1225,Time.T1227,Time.T1229,Time.T1231,Time.T1233,Time.T1234,
				Time.T1236,Time.T1238,Time.T1240,Time.T1243,Time.T1244,Time.T1246};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1229VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1229,Time.T1231,Time.T1232,Time.T1234,Time.T1236,Time.T1237,
				Time.T1239,Time.T1241,Time.T1243,Time.T1246,Time.T1247,Time.T1249};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1232VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1232,Time.T1234,Time.T1236,Time.T1237,Time.T1239,Time.T1241,
				Time.T1242,	Time.T1244,Time.T1246,Time.T1249,Time.T1251,Time.T1253};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1235VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1235,Time.T1237,Time.T1239,Time.T1241,Time.T1243,Time.T1244,
				Time.T1246,Time.T1248,Time.T1250,Time.T1253,Time.T1254,Time.T1256};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1239VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1239,Time.T1241,Time.T1242,Time.T1244,Time.T1246,Time.T1247,
				Time.T1249,Time.T1251,Time.T1253,Time.T1256,Time.T1257,Time.T1259};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1242VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1242,Time.T1244,Time.T1246,Time.T1247,Time.T1249,Time.T1251,
				Time.T1252,Time.T1254,Time.T1256,Time.T1259,Time.T1301,Time.T1303};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1245VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1245,Time.T1247,Time.T1249,Time.T1251,Time.T1253,Time.T1254,
				Time.T1256,Time.T1258,Time.T1300,Time.T1303,Time.T1304,Time.T1306};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1249VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1249,Time.T1251,Time.T1252,Time.T1254,Time.T1256,Time.T1257,
				Time.T1259,Time.T1301,Time.T1303,Time.T1306,Time.T1307,Time.T1309};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1252VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1252,Time.T1254,Time.T1256,Time.T1257,Time.T1259,Time.T1301,
				Time.T1302,Time.T1304,Time.T1306,Time.T1309,Time.T1311,Time.T1313};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1255VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1255,Time.T1257,Time.T1259,Time.T1301,Time.T1302,Time.T1304,
				Time.T1306,Time.T1308,Time.T1310,Time.T1313,Time.T1314,Time.T1316};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1259VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1259,Time.T1301,Time.T1302,Time.T1304,Time.T1306,Time.T1307,
				Time.T1309,Time.T1311,Time.T1313,Time.T1316,Time.T1317,Time.T1319};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1302VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1302,Time.T1304,Time.T1306,Time.T1307,Time.T1309,Time.T1311,
				Time.T1312,Time.T1314,Time.T1316,Time.T1319,Time.T1321,Time.T1323};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1305VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1305,Time.T1307,Time.T1309,Time.T1311,Time.T1313,Time.T1314,
				Time.T1316,Time.T1318,Time.T1320,Time.T1323,Time.T1324,Time.T1326};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1309VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1309,Time.T1311,Time.T1312,Time.T1314,Time.T1316,Time.T1317,
				Time.T1319,Time.T1321,Time.T1323,Time.T1326,Time.T1327,Time.T1329};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1312VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1312,Time.T1314,Time.T1316,Time.T1317,Time.T1319,Time.T1321,
				Time.T1322,Time.T1324,Time.T1326,Time.T1329,Time.T1331,Time.T1333};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1315VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1315,Time.T1317,Time.T1319,Time.T1321,Time.T1323,Time.T1324,
				Time.T1326,Time.T1328,Time.T1330,Time.T1333,Time.T1334,Time.T1336};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1320VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1320,Time.T1322,Time.T1323,Time.T1325,Time.T1327,Time.T1328,
				Time.T1330,Time.T1332,Time.T1334,Time.T1337,Time.T1338,Time.T1340};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1327VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1327,Time.T1329,Time.T1330,Time.T1332,Time.T1334,Time.T1335,
				Time.T1337,Time.T1339,Time.T1341,Time.T1344,Time.T1345,Time.T1347};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1334VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1334,Time.T1336,Time.T1337,Time.T1339,Time.T1341,Time.T1342,
				Time.T1344,Time.T1346,Time.T1348,Time.T1351,Time.T1352,Time.T1354};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1341VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1341,Time.T1343,Time.T1344,Time.T1346,Time.T1348,Time.T1349,
				Time.T1351,Time.T1353,Time.T1355,Time.T1358,Time.T1359,Time.T1401};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1348VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1348,Time.T1350,Time.T1351,Time.T1353,Time.T1355,Time.T1356,
				Time.T1358,Time.T1400,Time.T1402,Time.T1405,Time.T1406,Time.T1408};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1355VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1355,Time.T1357,Time.T1358,Time.T1400,Time.T1402,Time.T1403,
				Time.T1405,Time.T1407,Time.T1409,Time.T1412,Time.T1413,Time.T1415};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1402VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1402,Time.T1404,Time.T1405,Time.T1407,Time.T1409,Time.T1410,
				Time.T1412,Time.T1414,Time.T1416,Time.T1419,Time.T1420,Time.T1422};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1409VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1409,Time.T1411,Time.T1412,Time.T1414,Time.T1416,Time.T1417,
				Time.T1419,Time.T1421,Time.T1423,Time.T1426,Time.T1427,Time.T1429};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1416VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1416,Time.T1418,Time.T1419,Time.T1421,Time.T1423,Time.T1424,
				Time.T1426,Time.T1428,Time.T1430,Time.T1433,Time.T1434,Time.T1436};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1423VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1423,Time.T1425,Time.T1426,Time.T1428,Time.T1430,Time.T1431,
				Time.T1433,Time.T1435,Time.T1437,Time.T1440,Time.T1441,Time.T1443};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1430VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1430,Time.T1432,Time.T1433,Time.T1435,Time.T1437,Time.T1438,
				Time.T1440,Time.T1442,Time.T1444,Time.T1447,Time.T1448,Time.T1450};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1437VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1437,Time.T1439,Time.T1440,Time.T1442,Time.T1444,Time.T1445,
				Time.T1447,Time.T1449,Time.T1451,Time.T1454,Time.T1455,Time.T1457};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1444VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1444,Time.T1446,Time.T1447,Time.T1449,Time.T1451,Time.T1452,
				Time.T1454,Time.T1456,Time.T1458,Time.T1501,Time.T1502,Time.T1504};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1451VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1451,Time.T1453,Time.T1454,Time.T1456,Time.T1458,Time.T1459,
				Time.T1501,Time.T1503,Time.T1505,Time.T1508,Time.T1509,Time.T1511};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1458VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1458,Time.T1500,Time.T1501,Time.T1503,Time.T1505,Time.T1506,
				Time.T1508,Time.T1510,Time.T1512,Time.T1515,Time.T1516,Time.T1518};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1505VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1505,Time.T1507,Time.T1508,Time.T1510,Time.T1510,Time.T1513,
				Time.T1515,Time.T1517,Time.T1519,Time.T1522,Time.T1523,Time.T1525};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1512VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1512,Time.T1514,Time.T1515,Time.T1517,Time.T1519,Time.T1520,
				Time.T1522,Time.T1524,Time.T1526,Time.T1529,Time.T1530,Time.T1532};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1519VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1519,Time.T1521,Time.T1522,Time.T1524,Time.T1526,Time.T1527,
				Time.T1529,Time.T1531,Time.T1533,Time.T1536,Time.T1537,Time.T1539};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1526VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1526,Time.T1528,Time.T1529,Time.T1531,Time.T1533,Time.T1534,
				Time.T1536,Time.T1538,Time.T1540,Time.T1543,Time.T1544,Time.T1546};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1533VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1533,Time.T1535,Time.T1536,Time.T1538,Time.T1540,Time.T1541,
				Time.T1543,Time.T1545,Time.T1547,Time.T1550,Time.T1551,Time.T1553};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1540VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1540,Time.T1542,Time.T1543,Time.T1545,Time.T1547,Time.T1548,
				Time.T1550,Time.T1552,Time.T1554,Time.T1557,Time.T1558,Time.T1600};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1547VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1547,Time.T1549,Time.T1550,Time.T1552,Time.T1554,Time.T1555,
				Time.T1557,Time.T1559,Time.T1601,Time.T1604,Time.T1605,Time.T1607};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1554VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1554,Time.T1556,Time.T1557,Time.T1559,Time.T1601,Time.T1602,
				Time.T1604,Time.T1606,Time.T1608,Time.T1611,Time.T1612,Time.T1614};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1601VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1601,Time.T1603,Time.T1604,Time.T1606,Time.T1608,Time.T1609,
				Time.T1611,Time.T1613,Time.T1615,Time.T1618,Time.T1619,Time.T1621};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1608VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1608,Time.T1610,Time.T1611,Time.T1613,Time.T1615,Time.T1616,
				Time.T1618,Time.T1620,Time.T1622,Time.T1625,Time.T1626,Time.T1628};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1615VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1615,Time.T1617,Time.T1618,Time.T1620,Time.T1622,Time.T1623,
				Time.T1625,Time.T1627,Time.T1629,Time.T1632,Time.T1633,Time.T1635};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1622VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1622,Time.T1624,Time.T1625,Time.T1627,Time.T1629,Time.T1630,
				Time.T1632,Time.T1634,Time.T1636,Time.T1639,Time.T1640,Time.T1642};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1629VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1629,Time.T1631,Time.T1632,Time.T1634,Time.T1636,Time.T1637,
				Time.T1639,Time.T1641,Time.T1643,Time.T1646,Time.T1647,Time.T1649};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1636VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1636,Time.T1638,Time.T1639,Time.T1641,Time.T1641,Time.T1643,
				Time.T1646,Time.T1648,Time.T1650,Time.T1653,Time.T1654,Time.T1656};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1643VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1643,Time.T1645,Time.T1646,Time.T1648,Time.T1650,Time.T1651,
				Time.T1653,Time.T1655,Time.T1657,Time.T1700,Time.T1701,Time.T1703};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1650VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1650,Time.T1652,Time.T1653,Time.T1655,Time.T1657,Time.T1658,
				Time.T1700,Time.T1702,Time.T1704,Time.T1707,Time.T1708,Time.T1710};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1656VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1656,Time.T1658,Time.T1700,Time.T1702,Time.T1704,Time.T1705,
				Time.T1707,Time.T1709,Time.T1711,Time.T1714,Time.T1715,Time.T1717};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1700VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1700,Time.T1702,Time.T1703,Time.T1705,Time.T1707,Time.T1709,
				Time.T1710,Time.T1712,Time.T1714,Time.T1717,Time.T1719,Time.T1720};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1703VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1703,Time.T1705,Time.T1707,Time.T1709,Time.T1710,Time.T1712,
				Time.T1714,Time.T1716,Time.T1717,Time.T1720,Time.T1722,Time.T1724};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1706VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1716,Time.T1708,Time.T1710,Time.T1712,Time.T1714,Time.T1715,
				Time.T1719,Time.T1720,Time.T1721,Time.T1724,Time.T1725,Time.T1727};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1710VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1710,Time.T1712,Time.T1713,Time.T1715,Time.T1717,Time.T1719,
				Time.T1720,Time.T1722,Time.T1724,Time.T1727,Time.T1729,Time.T1730};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1713VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1713,Time.T1715,Time.T1717,Time.T1719,Time.T1720,
				Time.T1722,Time.T1724,Time.T1726,Time.T1727,Time.T1730,Time.T1732,Time.T1734};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1716VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1713,Time.T1715,Time.T1717,Time.T1719,Time.T1720,Time.T1722,
				Time.T1724,Time.T1726,Time.T1727,Time.T1730,Time.T1732,Time.T1734};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1720VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1720,Time.T1722,Time.T1723,Time.T1725,Time.T1727,Time.T1729,
				Time.T1730,Time.T1732,Time.T1734,Time.T1737,Time.T1739,Time.T1740};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1723VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1723,Time.T1725,Time.T1727,Time.T1729,Time.T1730,Time.T1732,
				Time.T1734,Time.T1736,Time.T1737,Time.T1740,Time.T1742,Time.T1744};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1726VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1726,Time.T1728,Time.T1730,Time.T1732,Time.T1734,Time.T1735,
				Time.T1737,Time.T1739,Time.T1741,Time.T1744,Time.T1745,Time.T1747};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1730VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1730,Time.T1732,Time.T1733,Time.T1735,Time.T1737,Time.T1739,
				Time.T1740,Time.T1742,Time.T1744,Time.T1747,Time.T1749,Time.T1750};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1733VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1733,Time.T1735,Time.T1737,Time.T1739,Time.T1740,Time.T1742,
				Time.T1744,Time.T1746,Time.T1747,Time.T1750,Time.T1752,Time.T1754};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1736VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1736,Time.T1738,Time.T1740,Time.T1742,Time.T1744,Time.T1745,
				Time.T1747,Time.T1749,Time.T1751,Time.T1754,Time.T1755,Time.T1757};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1740VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1740,Time.T1742,Time.T1743,Time.T1745,Time.T1747,Time.T1749,
				Time.T1750,Time.T1752,Time.T1754,Time.T1757,Time.T1759,Time.T1800};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1743VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1743,Time.T1745,Time.T1747,Time.T1749,Time.T1750,Time.T1752,
				Time.T1754,Time.T1756,Time.T1757,Time.T1800,Time.T1802,Time.T1804};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1746VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1746,Time.T1748,Time.T1750,Time.T1752,Time.T1754,Time.T1755,
				Time.T1757,Time.T1759,Time.T1801,Time.T1804,Time.T1805,Time.T1807};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1750VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1750,Time.T1752,Time.T1753,Time.T1755,Time.T1757,Time.T1759,
				Time.T1800,Time.T1802,Time.T1804,Time.T1807,Time.T1809,Time.T1810};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1753VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1753,Time.T1755,Time.T1757,Time.T1759,Time.T1800,Time.T1802,
				Time.T1804,Time.T1806,Time.T1807,Time.T1810,Time.T1812,Time.T1814};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1756VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1756,Time.T1758,Time.T1800,Time.T1802,Time.T1804,Time.T1805,
				Time.T1807,Time.T1809,Time.T1811,Time.T1814,Time.T1815,Time.T1817};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1800VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1800,Time.T1802,Time.T1803,Time.T1805,Time.T1807,Time.T1809,
				Time.T1810,Time.T1812,Time.T1814,Time.T1817,Time.T1819,Time.T1820};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1803VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1803,Time.T1805,Time.T1807,Time.T1809,Time.T1810,Time.T1812,
				Time.T1814,Time.T1816,Time.T1817,Time.T1820,Time.T1822,Time.T1824};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1806VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1806,Time.T1808,Time.T1810,Time.T1812,Time.T1814,Time.T1815,
				Time.T1817,Time.T1819,Time.T1821,Time.T1824,Time.T1825,Time.T1827};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1810VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1810,Time.T1812,Time.T1813,Time.T1815,Time.T1817,Time.T1819,
				Time.T1820,Time.T1822,Time.T1824,Time.T1827,Time.T1829,Time.T1830};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1813VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1813,Time.T1815,Time.T1817,Time.T1819,Time.T1820,Time.T1822,
				Time.T1824,Time.T1826,Time.T1827,Time.T1830,Time.T1832,Time.T1834};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1816VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1816,Time.T1818,Time.T1820,Time.T1822,Time.T1824,Time.T1825,
				Time.T1827,Time.T1829,Time.T1831,Time.T1834,Time.T1835,Time.T1837};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1820VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1820,Time.T1822,Time.T1824,Time.T1825,Time.T1827,Time.T1829,
				Time.T1830,Time.T1832,Time.T1834,Time.T1837,Time.T1839,Time.T1840};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1823VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1823,Time.T1825,Time.T1827,Time.T1829,Time.T1830,Time.T1832,
				Time.T1834,Time.T1836,Time.T1837,Time.T1840,Time.T1842,Time.T1844};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1826VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1826,Time.T1828,Time.T1830,Time.T1832,Time.T1834,Time.T1835,
				Time.T1837,Time.T1839,Time.T1841,Time.T1844,Time.T1845,Time.T1847};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1830VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1830,Time.T1832,Time.T1833,Time.T1835,Time.T1837,Time.T1839,
				Time.T1840,Time.T1842,Time.T1844,Time.T1847,Time.T1849,Time.T1850};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1833VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1833,Time.T1835,Time.T1837,Time.T1839,Time.T1840,Time.T1842,
				Time.T1844,Time.T1846,Time.T1847,Time.T1850,Time.T1852,Time.T1854};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1836VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1836,Time.T1838,Time.T1840,Time.T1842,Time.T1844,Time.T1846,
				Time.T1847,Time.T1849,Time.T1851,Time.T1854,Time.T1855,Time.T1857};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1840VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1840,Time.T1842,Time.T1843,Time.T1845,Time.T1847,Time.T1849,
				Time.T1850,Time.T1852,Time.T1854,Time.T1857,Time.T1859,Time.T1900};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1843VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1843,Time.T1845,Time.T1847,Time.T1849,Time.T1850,Time.T1852,
				Time.T1854,Time.T1856,Time.T1857,Time.T1900,Time.T1902,Time.T1904};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1846VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1846,Time.T1848,Time.T1850,Time.T1852,Time.T1854,Time.T1855,
				Time.T1857,Time.T1859,Time.T1901,Time.T1904,Time.T1905,Time.T1907};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1850VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1850,Time.T1852,Time.T1853,Time.T1855,Time.T1857,Time.T1859,
				Time.T1900,Time.T1902,Time.T1904,Time.T1907,Time.T1909,Time.T1910};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1853VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1853,Time.T1855,Time.T1857,Time.T1859,Time.T1900,Time.T1902,
				Time.T1904,Time.T1906,Time.T1907,Time.T1910,Time.T1912,Time.T1914};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1856VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1856,Time.T1858,Time.T1900,Time.T1902,Time.T1904,Time.T1905,
				Time.T1907,Time.T1909,Time.T1911,Time.T1914,Time.T1915,Time.T1917};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1900VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1900,Time.T1902,Time.T1903,Time.T1905,Time.T1907,Time.T1909,
				Time.T1910,Time.T1912,Time.T1914,Time.T1917,Time.T1919,Time.T1920};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1903VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1903,Time.T1905,Time.T1907,Time.T1909,Time.T1910,Time.T1912,
				Time.T1914,Time.T1916,Time.T1917,Time.T1920,Time.T1922,Time.T1924};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH01906VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1906,Time.T1908,Time.T1910,Time.T1912,Time.T1914,Time.T1915,
				Time.T1917,Time.T1919,Time.T1921,Time.T1924,Time.T1925,Time.T1927};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1910VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1910,Time.T1912,Time.T1913,Time.T1915,Time.T1917,Time.T1919,
				Time.T1920,Time.T1922,Time.T1924,Time.T1927,Time.T1929,Time.T1930};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1913VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1913,Time.T1915,Time.T1917,Time.T1919,Time.T1920,Time.T1922,
				Time.T1924,Time.T1926,Time.T1927,Time.T1930,Time.T1932,Time.T1934};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1916VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1916,Time.T1918,Time.T1920,Time.T1922,Time.T1924,Time.T1925,
				Time.T1927,Time.T1929,Time.T1931,Time.T1934,Time.T1935,Time.T1937};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1920VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1920,Time.T1922,Time.T1923,Time.T1925,Time.T1927,Time.T1929,
				Time.T1930,Time.T1932,Time.T1934,Time.T1937,Time.T1939,Time.T1940};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1923VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1923,Time.T1925,Time.T1927,Time.T1929,Time.T1930,Time.T1932,
				Time.T1934,Time.T1936,Time.T1937,Time.T1940,Time.T1942,Time.T1944};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1926VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1926,Time.T1928,Time.T1930,Time.T1932,Time.T1934,Time.T1935,
				Time.T1937,Time.T1939,Time.T1941,Time.T1944,Time.T1945,Time.T1947};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1930VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1930,Time.T1932,Time.T1933,Time.T1935,Time.T1937,Time.T1939,
				Time.T1940,Time.T1942,Time.T1944,Time.T1947,Time.T1949,Time.T1950};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1933VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1933,Time.T1935,Time.T1937,Time.T1939,Time.T1940,Time.T1942,
				Time.T1944,Time.T1946,Time.T1947,Time.T1950,Time.T1952,Time.T1954};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1936VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1936,Time.T1938,Time.T1940,Time.T1942,Time.T1944,Time.T1945,
				Time.T1947,Time.T1949,Time.T1951,Time.T1954,Time.T1955,Time.T1957};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1940VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1940,Time.T1942,Time.T1943,Time.T1945,Time.T1947,Time.T1949,
				Time.T1950,Time.T1952,Time.T1954,Time.T1957,Time.T1959,Time.T2000};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1943VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1943,Time.T1945,Time.T1947,Time.T1949,Time.T1950,Time.T1952,
				Time.T1954,Time.T1956,Time.T1957,Time.T2000,Time.T2002,Time.T2004};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1946VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1946,Time.T1948,Time.T1950,Time.T1952,Time.T1954,Time.T1955,
				Time.T1957,Time.T1959,Time.T2001,Time.T2004,Time.T2005,Time.T2007};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1950VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1950,Time.T1952,Time.T1953,Time.T1955,Time.T1957,Time.T1959,
				Time.T2000,Time.T2002,Time.T2004,Time.T2007,Time.T2009,Time.T2010};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1953VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1953,Time.T1955,Time.T1957,Time.T1959,Time.T2000,Time.T2002,
				Time.T2004,Time.T2006,Time.T2007,Time.T2010,Time.T2012,Time.T2014};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH1956VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T1956,Time.T1958,Time.T2000,Time.T2002,Time.T2004,Time.T2005,
				Time.T2007,Time.T2009,Time.T2011,Time.T2014,Time.T2015,Time.T2017};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2000VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2000,Time.T2002,Time.T2003,Time.T2005,Time.T2007,Time.T2009,
				Time.T2010,Time.T2012,Time.T2014,Time.T2017,Time.T2019,Time.T2020};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2003VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2003,Time.T2005,Time.T2007,Time.T2009,Time.T2010,Time.T2012,
				Time.T2014,Time.T2016,Time.T2017,Time.T2020,Time.T2022,Time.T2024};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2006VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2006,Time.T2008,Time.T2010,Time.T2012,Time.T2014,Time.T2015,
				Time.T2017,Time.T2019,Time.T2021,Time.T2024,Time.T2025,Time.T2027};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2010VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2010,Time.T2012,Time.T2013,Time.T2015,Time.T2017,Time.T2019,
				Time.T2020,Time.T2022,Time.T2024,Time.T2027,Time.T2029,Time.T2030};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2013VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2013,Time.T2015,Time.T2017,Time.T2019,Time.T2020,Time.T2022,
				Time.T2024,Time.T2026,Time.T2027,Time.T2030,Time.T2032,Time.T2034};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2016VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2016,Time.T2018,Time.T2020,Time.T2022,Time.T2024,Time.T2025,
				Time.T2027,Time.T2029,Time.T2031,Time.T2034,Time.T2035,Time.T2037};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2020VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2020,Time.T2022,Time.T2023,Time.T2025,Time.T2027,Time.T2029,
				Time.T2030,Time.T2032,Time.T2034,Time.T2037,Time.T2039,Time.T2040};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2023VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2023,Time.T2025,Time.T2027,Time.T2029,Time.T2030,Time.T2032,
				Time.T2034,Time.T2036,Time.T2037,Time.T2040,Time.T2042,Time.T2044};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2026VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2026,Time.T2028,Time.T2030,Time.T2032,Time.T2034,Time.T2035,
				Time.T2037,Time.T2039,Time.T2041,Time.T2044,Time.T2045,Time.T2047};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2030VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2030,Time.T2032,Time.T2033,Time.T2035,Time.T2037,Time.T2039,
				Time.T2040,Time.T2042,Time.T2044,Time.T2047,Time.T2049,Time.T2050};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2033VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2033,Time.T2035,Time.T2037,Time.T2039,Time.T2040,Time.T2042,
				Time.T2044,Time.T2046,Time.T2047,Time.T2050,Time.T2052,Time.T2054};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2036VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2036,Time.T2038,Time.T2040,Time.T2042,Time.T2044,Time.T2045,
				Time.T2047,Time.T2049,Time.T2051,Time.T2054,Time.T2055,Time.T2057};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2040VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2040,Time.T2042,Time.T2044,Time.T2045,Time.T2047,Time.T2049,
				Time.T2050,Time.T2052,Time.T2054,Time.T2057,Time.T2059,Time.T2100};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2043VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2043,Time.T2045,Time.T2047,Time.T2049,Time.T2050,Time.T2052,
				Time.T2054,Time.T2056,Time.T2057,Time.T2100,Time.T2102,Time.T2104};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2046VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2046,Time.T2048,Time.T2050,Time.T2052,Time.T2054,Time.T2055,
				Time.T2057,Time.T2059,Time.T2101,Time.T2104,Time.T2105,Time.T2107};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2050VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2050,Time.T2052,Time.T2053,Time.T2055,Time.T2057,Time.T2059,
				Time.T2100,Time.T2102,Time.T2104,Time.T2107,Time.T2109,Time.T2110};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2053VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2053,Time.T2055,Time.T2057,Time.T2059,Time.T2100,Time.T2102,
				Time.T2104,Time.T2106,Time.T2107,Time.T2110,Time.T2112,Time.T2114};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2056VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2056,Time.T2058,Time.T2100,Time.T2102,Time.T2104,Time.T2105,
				Time.T2107,Time.T2109,Time.T2111,Time.T2114,Time.T2115,Time.T2117};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2100VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2100,Time.T2102,Time.T2103,Time.T2105,Time.T2107,Time.T2109,
				Time.T2110,Time.T2112,Time.T2114,Time.T2117,Time.T2119,Time.T2120};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2103VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2103,Time.T2105,Time.T2107,Time.T2109,Time.T2110,Time.T2112,
				Time.T2114,Time.T2116,Time.T2117,Time.T2120,Time.T2122,Time.T2124};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2106VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2106,Time.T2108,Time.T2110,Time.T2112,Time.T2114,Time.T2115,
				Time.T2117,Time.T2119,Time.T2121,Time.T2124,Time.T2125,Time.T2127};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2110VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2110,Time.T2112,Time.T2113,Time.T2115,Time.T2117,Time.T2119,
				Time.T2120,Time.T2122,Time.T2124,Time.T2127,Time.T2129,Time.T2130};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2113VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2113,Time.T2115,Time.T2117,Time.T2119,Time.T2120,Time.T2122,
				Time.T2124,Time.T2126,Time.T2127,Time.T2130,Time.T2132,Time.T2134};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2116VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2116,Time.T2118,Time.T2120,Time.T2122,Time.T2124,Time.T2125,
				Time.T2127,Time.T2129,Time.T2131,Time.T2134,Time.T2135,Time.T2137};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2120VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2120,Time.T2122,Time.T2123,Time.T2125,Time.T2127,Time.T2129,
				Time.T2130,Time.T2132,Time.T2134,Time.T2137,Time.T2139,Time.T2140};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2123VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2123,Time.T2125,Time.T2127,Time.T2129,Time.T2130,Time.T2132,
				Time.T2134,Time.T2136,Time.T2137,Time.T2140,Time.T2142,Time.T2144};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GHVE2126",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2126,Time.T2128,Time.T2130,Time.T2132,Time.T2134,Time.T2135,
				Time.T2137,Time.T2139,Time.T2141,Time.T2144,Time.T2145,Time.T2147};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2130VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2130,Time.T2132,Time.T2133,Time.T2135,Time.T2137,Time.T2139,
				Time.T2140,Time.T2142,Time.T2144,Time.T2147,Time.T2149,Time.T2150};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2133VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2133,Time.T2135,Time.T2137,Time.T2139,Time.T2140,Time.T2142,
				Time.T2144,Time.T2146,Time.T2147,Time.T2150,Time.T2152,Time.T2154};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2136VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2136,Time.T2138,Time.T2140,Time.T2142,Time.T2144,Time.T2145,Time.T2147,
				Time.T2149,Time.T2151,Time.T2154,Time.T2155,Time.T2157};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2140VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2140,Time.T2142,Time.T2143,Time.T2145,Time.T2147,Time.T2149,
				Time.T2150,Time.T2152,Time.T2154,Time.T2157,Time.T2159,Time.T2200};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2143VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2143,Time.T2145,Time.T2147,Time.T2149,Time.T2150,Time.T2152,
				Time.T2154,Time.T2156,Time.T2157,Time.T2200,Time.T2202,Time.T2204};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2146VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2146,Time.T2148,Time.T2150,Time.T2152,Time.T2154,Time.T2155,
				Time.T2157,Time.T2159,Time.T2201,Time.T2204,Time.T2205,Time.T2207};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2150VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2150,Time.T2152,Time.T2153,Time.T2155,Time.T2157,Time.T2159,
				Time.T2200,Time.T2202,Time.T2204,Time.T2207,Time.T2209,Time.T2210};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2153VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2153,Time.T2155,Time.T2157,Time.T2159,Time.T2200,Time.T2202,
				Time.T2204,Time.T2206,Time.T2207,Time.T2210,Time.T2212,Time.T2214};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2156VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2156,Time.T2158,Time.T2200,Time.T2202,Time.T2204,Time.T2205,
				Time.T2207,Time.T2209,Time.T2211,Time.T2214,Time.T2215,Time.T2217};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2200VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2200,Time.T2202,Time.T2203,Time.T2205,Time.T2207,Time.T2209,
				Time.T2210,Time.T2212,Time.T2214,Time.T2217,Time.T2219,Time.T2220};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2203VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2203,Time.T2205,Time.T2207,Time.T2209,Time.T2210,Time.T2212,
				Time.T2214,Time.T2216,Time.T2217,Time.T2220,Time.T2222,Time.T2224};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2206VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2206,Time.T2208,Time.T2210,Time.T2212,Time.T2214,Time.T2215,
				Time.T2217,Time.T2219,Time.T2221,Time.T2224,Time.T2225,Time.T2227};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2210VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2210,Time.T2212,Time.T2213,Time.T2215,Time.T2217,Time.T2219,
				Time.T2220,Time.T2222,Time.T2224,Time.T2227,Time.T2229,Time.T2230};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2213VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2213,Time.T2215,Time.T2217,Time.T2219,Time.T2220,Time.T2222,
				Time.T2224,Time.T2226,Time.T2227,Time.T2230,Time.T2232,Time.T2234};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2216VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2216,Time.T2218,Time.T2220,Time.T2222,Time.T2224,Time.T2225,
				Time.T2227,Time.T2229,Time.T2231,Time.T2234,Time.T2235,Time.T2237};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2220VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2220,Time.T2222,Time.T2223,Time.T2225,Time.T2227,Time.T2229,
				Time.T2230,Time.T2232,Time.T2234,Time.T2237,Time.T2239,Time.T2240};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2223VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2223,Time.T2225,Time.T2227,Time.T2229,Time.T2230,Time.T2232,
				Time.T2234,Time.T2236,Time.T2237,Time.T2240,Time.T2242,Time.T2244};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2229VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2229,Time.T2231,Time.T2232,Time.T2234,Time.T2236,Time.T2237,Time.T2239,
				Time.T2241,Time.T2243,Time.T2246,Time.T2247,Time.T2249};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2236VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2236,Time.T2238,Time.T2239,Time.T2241,Time.T2243,Time.T2244,
				Time.T2246,Time.T2248,Time.T2250,Time.T2253,Time.T2254,Time.T2256};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2243VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2243,Time.T2245,Time.T2246,Time.T2248,Time.T2250,Time.T2251,
				Time.T2253,Time.T2255,Time.T2257,Time.T2300,Time.T2301,Time.T2303};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2250VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2250,Time.T2252,Time.T2253,Time.T2255,Time.T2257,Time.T2258,
				Time.T2300,Time.T2302,Time.T2304,Time.T2307,Time.T2308,Time.T2310};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2257VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2257,Time.T2259,Time.T2300,Time.T2302,Time.T2304,Time.T2305,
				Time.T2307,Time.T2309,Time.T2311,Time.T2314,Time.T2315,Time.T2317};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2304VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2304,Time.T2306,Time.T2307,Time.T2309,Time.T2311,Time.T2312,
				Time.T2314,Time.T2316,Time.T2318,Time.T2321,Time.T2322,Time.T2324};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2311VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2311,Time.T2313,Time.T2314,Time.T2316,Time.T2318,Time.T2319,
				Time.T2321,Time.T2323,Time.T2325,Time.T2328,Time.T2329,Time.T2331};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2318VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2318,Time.T2320,Time.T2321,Time.T2323,Time.T2325,Time.T2326,
				Time.T2328,Time.T2330,Time.T2332,Time.T2335,Time.T2336,Time.T2338};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2325VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2325,Time.T2327,Time.T2328,Time.T2330,Time.T2332,Time.T2333,
				Time.T2335,Time.T2337,Time.T2339,Time.T2342,Time.T2343,Time.T2345};
		metroUpTrainInfoList.add(mTrainInfo);

		mTrainInfo=new TrainInfo("GH2339VE",TrainType.METRO_TRAIN,METRO_UP_TRAIN_ROUTE);
		mTrainInfo.time=new String[]{Time.T2339,Time.T2341,Time.T2342,Time.T2344,Time.T2346,Time.T2347,
				Time.T2349,Time.T2351,Time.T2353,Time.T2356,Time.T2357,Time.T2359};
		metroUpTrainInfoList.add(mTrainInfo);
	}




}
