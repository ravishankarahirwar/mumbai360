package mumbai.d360.data;



import java.util.ArrayList;
import java.util.List;

import mumbai.d360.dataprovider.local.LocalStationsName;
import mumbai.d360.dataprovider.metro.MetroStationLocation;
import mumbai.d360.dataprovider.metro.MetroStationNames;
import mumbai.d360.dataprovider.mono.MonoStationLocation;
import mumbai.d360.dataprovider.mono.MonoStationName;
import mumbai.d360.model.Station;
import mumbai.d360.utils.LineIndicator;

public class StationCollection {
public List<Station> mHarberStationsLocationList;
public List<Station> mMetroStationsLocationList;
public List<Station> mMonoStationsLocationList;

//	public List<MapData> getAllHarberStationLocationList(){
//	mHarberStationsLocationList=new ArrayList<MapData>();
//	mHarberStationsLocationList.add(new MapData(StationLocation.MUMBAI_CST,);
//	mHarberStationsLocationList.add(StationLocation.MASJID_BUNDER);
//	mHarberStationsLocationList.add(StationLocation.SANDHURST_ROAD);
//	mHarberStationsLocationList.add(StationLocation.DOCKYARD_ROAD);
//	mHarberStationsLocationList.add(StationLocation.REAY_ROAD);
//	mHarberStationsLocationList.add(StationLocation.COTTON_GREEN);
//	mHarberStationsLocationList.add(StationLocation.SEWRI);
//	mHarberStationsLocationList.add(StationLocation.WADALA_ROAD);
//	mHarberStationsLocationList.add(StationLocation.GURU_TEGH_BAHADUR_NAGAR);
//	mHarberStationsLocationList.add(StationLocation.CHUNABHATTI);
//	mHarberStationsLocationList.add(StationLocation.KURLA);
//	mHarberStationsLocationList.add(StationLocation.TILAK_NAGAR);
//	mHarberStationsLocationList.add(StationLocation.CHEMBUR);
//	mHarberStationsLocationList.add(StationLocation.GOVANDI);
//	mHarberStationsLocationList.add(StationLocation.MANKHURD);
//	mHarberStationsLocationList.add(StationLocation.VASHI);
//	mHarberStationsLocationList.add(StationLocation.SANPADA);
//	mHarberStationsLocationList.add(StationLocation.JUINAGAR);
//	mHarberStationsLocationList.add(StationLocation.NERUL);
//	mHarberStationsLocationList.add(StationLocation.SEAWOODS_DARAVE);
//	mHarberStationsLocationList.add(StationLocation.CBD_BELAPUR);
//	mHarberStationsLocationList.add(StationLocation.KHARGHAR);
//	mHarberStationsLocationList.add(StationLocation.MANSAROVAR);
//	mHarberStationsLocationList.add(StationLocation.KHANDESHWAR);
//	mHarberStationsLocationList.add(StationLocation.PANVEL);
//	mHarberStationsLocationList.add(StationLocation.KINGS_CIRCLE);
//	mHarberStationsLocationList.add(StationLocation.MAHIM);
//	mHarberStationsLocationList.add(StationLocation.BANDRA);
//	mHarberStationsLocationList.add(StationLocation.KHAR_ROAD);
//	mHarberStationsLocationList.add(StationLocation.SANTACRUZ);
//	mHarberStationsLocationList.add(StationLocation.VILE_PARLE);
//	mHarberStationsLocationList.add(StationLocation.ANDHERI);
//	mHarberStationsLocationList.add(StationLocation.AIROLI);
//	mHarberStationsLocationList.add(StationLocation.RABALE);
//	mHarberStationsLocationList.add(StationLocation.GHANSOLI);
//	mHarberStationsLocationList.add(StationLocation.KOPAR_KHAIRANE);
//	mHarberStationsLocationList.add(StationLocation.TURBHE);
//	return mHarberStationsLocationList;
//	}

	public List<Station> getAllStationLocationList(){
		mHarberStationsLocationList=new ArrayList<Station>();






		mHarberStationsLocationList.add(new Station(StationLocation.MUMBAI_CST,LocalStationsName.MUMBAI_CST,StationCodes.MUMBAI_CST ,LineIndicator.HARBOUR));

		mHarberStationsLocationList.add(new Station(StationLocation.MASJID_BUNDER,LocalStationsName.MASJID_BUNDER,StationCodes.MASJID_BUNDER , LineIndicator.HARBOUR));

		mHarberStationsLocationList.add(new Station(StationLocation.SANDHURST_ROAD,LocalStationsName.SANDHURST_ROAD,StationCodes.SANDHURST_ROAD ,LineIndicator.HARBOUR));

		mHarberStationsLocationList.add(new Station(StationLocation.DOCKYARD_ROAD,LocalStationsName.DOCKYARD_ROAD ,StationCodes.DOCKYARD_ROAD ,LineIndicator.HARBOUR));

		mHarberStationsLocationList.add(new Station(StationLocation.REAY_ROAD,LocalStationsName.REAY_ROAD,StationCodes.REAY_ROAD ,LineIndicator.HARBOUR));

		mHarberStationsLocationList.add(new Station(StationLocation.COTTON_GREEN,LocalStationsName.COTTON_GREEN ,StationCodes.COTTON_GREEN ,LineIndicator.HARBOUR));

		mHarberStationsLocationList.add(new Station(StationLocation.SEWRI,LocalStationsName.SEWRI ,StationCodes.SEWRI ,LineIndicator.HARBOUR));

		mHarberStationsLocationList.add(new Station(StationLocation.WADALA_ROAD,LocalStationsName.WADALA_ROAD ,StationCodes.WADALA_ROAD ,LineIndicator.HARBOUR));

		mHarberStationsLocationList.add(new Station(StationLocation.GURU_TEGH_BAHADUR_NAGAR,LocalStationsName.GTB_NAGAR, StationCodes.GURU_TEGH_BAHADUR_NAGAR ,LineIndicator.HARBOUR));

		mHarberStationsLocationList.add(new Station(StationLocation.CHUNABHATTI, LocalStationsName.CHUNABHATTI, StationCodes.CHUNABHATTI ,LineIndicator.HARBOUR));

		mHarberStationsLocationList.add(new Station(StationLocation.KURLA,LocalStationsName.KURLA,StationCodes.KURLA ,LineIndicator.HARBOUR));

		mHarberStationsLocationList.add(new Station(StationLocation.TILAK_NAGAR,LocalStationsName.TILAK_NAGAR, StationCodes.TILAK_NAGAR ,LineIndicator.HARBOUR));

		mHarberStationsLocationList.add(new Station(StationLocation.CHEMBUR,LocalStationsName.CHEMBUR ,StationCodes.CHEMBUR ,LineIndicator.HARBOUR));

		mHarberStationsLocationList.add(new Station(StationLocation.GOVANDI,LocalStationsName.GOVANDI ,StationCodes.GOVANDI ,LineIndicator.HARBOUR));

		mHarberStationsLocationList.add(new Station(StationLocation.MANKHURD,LocalStationsName.MANKHURD, StationCodes.MANKHURD ,LineIndicator.HARBOUR));

		mHarberStationsLocationList.add(new Station(StationLocation.VASHI,LocalStationsName.VASHI, StationCodes.VASHI ,LineIndicator.HARBOUR));

		mHarberStationsLocationList.add(new Station(StationLocation.SANPADA,LocalStationsName.SANPADA, StationCodes.SANPADA ,LineIndicator.HARBOUR));

		mHarberStationsLocationList.add(new Station(StationLocation.JUINAGAR ,LocalStationsName.JUINAGAR, StationCodes.JUINAGAR ,LineIndicator.HARBOUR));

		mHarberStationsLocationList.add(new Station(StationLocation.NERUL,LocalStationsName.NERUL, StationCodes.NERUL ,LineIndicator.HARBOUR));

		mHarberStationsLocationList.add(new Station(StationLocation.SEAWOODS_DARAVE,LocalStationsName.SEAWOODS_DARAVE, StationCodes.SEAWOODS_DARAVE ,LineIndicator.HARBOUR));

		mHarberStationsLocationList.add(new Station(StationLocation.CBD_BELAPUR,LocalStationsName.CBD_BELAPUR ,StationCodes.CBD_BELAPUR ,LineIndicator.HARBOUR));

		mHarberStationsLocationList.add(new Station(StationLocation.KHARGHAR,LocalStationsName.KHARGHAR ,StationCodes.KHARGHAR ,LineIndicator.HARBOUR));

		mHarberStationsLocationList.add(new Station(StationLocation.MANSAROVAR,LocalStationsName.MANSAROVAR, StationCodes.MANSAROVAR ,LineIndicator.HARBOUR));

		mHarberStationsLocationList.add(new Station(StationLocation.KHANDESHWAR,LocalStationsName.KHANDESHWAR ,StationCodes.KHANDESHWAR ,LineIndicator.HARBOUR));

		mHarberStationsLocationList.add(new Station(StationLocation.PANVEL,LocalStationsName.PANVEL ,StationCodes.PANVEL ,LineIndicator.HARBOUR));

		mHarberStationsLocationList.add(new Station(StationLocation. KINGS_CIRCLE,LocalStationsName.KINGS_CIRCLE, StationCodes.KINGS_CIRCLE ,LineIndicator.HARBOUR));

		mHarberStationsLocationList.add(new Station(StationLocation. MAHIM,LocalStationsName.MAHIM, StationCodes.MAHIM ,LineIndicator.HARBOUR));

		mHarberStationsLocationList.add(new Station(StationLocation. BANDRA,LocalStationsName.BANDRA ,StationCodes.BANDRA ,LineIndicator.HARBOUR));

		mHarberStationsLocationList.add(new Station(StationLocation. KHAR_ROAD,LocalStationsName.KHAR_ROAD,StationCodes.KHAR_ROAD ,LineIndicator.HARBOUR));

		mHarberStationsLocationList.add(new Station(StationLocation. SANTACRUZ,LocalStationsName.SANTACRUZ ,StationCodes.VILE_PARLE ,LineIndicator.HARBOUR));

		mHarberStationsLocationList.add(new Station(StationLocation. VILE_PARLE,LocalStationsName.VILE_PARLE, StationCodes.VILE_PARLE ,LineIndicator.HARBOUR));

		mHarberStationsLocationList.add(new Station(StationLocation. ANDHERI,LocalStationsName.ANDHERI, StationCodes.ANDHERI ,LineIndicator.HARBOUR));
		mHarberStationsLocationList.add(new Station(StationLocation.AIROLI,LocalStationsName.AIROLI ,StationCodes. AIROLI,LineIndicator.HARBOUR));
		mHarberStationsLocationList.add(new Station(StationLocation.RABALE,LocalStationsName.RABALE ,StationCodes.RABALE ,LineIndicator.HARBOUR));
		mHarberStationsLocationList.add(new Station(StationLocation.GHANSOLI,LocalStationsName.GHANSOLI ,StationCodes.GHANSOLI ,LineIndicator.HARBOUR));
		mHarberStationsLocationList.add(new Station(StationLocation.KOPAR_KHAIRANE,LocalStationsName.KOPAR_KHAIRANE, StationCodes.KOPAR_KHAIRANE ,LineIndicator.HARBOUR));
		mHarberStationsLocationList.add(new Station(StationLocation.TURBHE,LocalStationsName.TURBHE, StationCodes.TURBHE ,LineIndicator.HARBOUR));

		// **************HARBER LINE STATION END******************

		// **************WESTERN LINE STATION START

		mHarberStationsLocationList.add(new Station(StationLocation. CHURCHGATE,LocalStationsName. CHURCHGATE,LineIndicator.WESTERN));

		mHarberStationsLocationList.add(new Station(StationLocation. MARINE_LINES,LocalStationsName.MARINE_LINES ,LineIndicator.WESTERN));

		mHarberStationsLocationList.add(new Station(StationLocation. CHARNI_ROAD ,LocalStationsName. CHARNI_ROAD,LineIndicator.WESTERN));

		mHarberStationsLocationList.add(new Station(StationLocation. GRANT_ROAD,LocalStationsName.GRANT_ROAD ,LineIndicator.WESTERN));

		mHarberStationsLocationList.add(new Station(StationLocation. MUMBAI_CENTRAL ,LocalStationsName. MUMBAI_CENTRAL,LineIndicator.WESTERN));

		mHarberStationsLocationList.add(new Station(StationLocation. MAHALAKSHMI ,LocalStationsName.MAHALAKSHMI ,LineIndicator.WESTERN));

		mHarberStationsLocationList.add(new Station(StationLocation. LOWER_PAREL ,LocalStationsName.LOWER_PAREL ,LineIndicator.WESTERN));

		mHarberStationsLocationList.add(new Station(StationLocation. ELPHINSTONE_ROAD,LocalStationsName. ELPHINSTONE_ROAD,LineIndicator.WESTERN));

		mHarberStationsLocationList.add(new Station(StationLocation. DADAR,LocalStationsName.DADAR ,LineIndicator.WESTERN));

		mHarberStationsLocationList.add(new Station(StationLocation. MATUNGA_ROAD,LocalStationsName.MATUNGA_ROAD ,LineIndicator.WESTERN));

		mHarberStationsLocationList.add(new Station(StationLocation. JOGESHWARI,LocalStationsName.JOGESHWARI ,LineIndicator.WESTERN));

		mHarberStationsLocationList.add(new Station(StationLocation. GOREGAON,LocalStationsName.GOREGAON ,LineIndicator.WESTERN));

		mHarberStationsLocationList.add(new Station(StationLocation. MALAD,LocalStationsName.MALAD ,LineIndicator.WESTERN));

		mHarberStationsLocationList.add(new Station(StationLocation. KANDIVALI,LocalStationsName.KANDIVALI ,LineIndicator.WESTERN));

		mHarberStationsLocationList.add(new Station(StationLocation. BORIVALI,LocalStationsName.BORIVALI ,LineIndicator.WESTERN));

		mHarberStationsLocationList.add(new Station(StationLocation. DAHISAR,LocalStationsName.DAHISAR ,LineIndicator.WESTERN));

		mHarberStationsLocationList.add(new Station(StationLocation. MIRA_ROAD,LocalStationsName.MIRA_ROAD ,LineIndicator.WESTERN));

		mHarberStationsLocationList.add(new Station(StationLocation. BHAYANDAR,LocalStationsName.BHAYANDAR ,LineIndicator.WESTERN));

		mHarberStationsLocationList.add(new Station(StationLocation. NAIGAON,LocalStationsName.NAIGAON ,LineIndicator.WESTERN));

		mHarberStationsLocationList.add(new Station(StationLocation. Nalla_Sopara,LocalStationsName.NALLA_SOPARA ,LineIndicator.WESTERN));

		mHarberStationsLocationList.add(new Station(StationLocation. VIRAR ,LocalStationsName. VIRAR,LineIndicator.WESTERN));

		mHarberStationsLocationList.add(new Station(StationLocation. VAITARNA ,LocalStationsName.VAITARNA ,LineIndicator.WESTERN));

		mHarberStationsLocationList.add(new Station(StationLocation. SAPHALE,LocalStationsName. SAPHALE,LineIndicator.WESTERN));

		mHarberStationsLocationList.add(new Station(StationLocation. KELVA_ROAD,LocalStationsName.KELVA_ROAD ,LineIndicator.WESTERN));

		mHarberStationsLocationList.add(new Station(StationLocation. PALGHAR,LocalStationsName.PALGHAR ,LineIndicator.WESTERN));

		mHarberStationsLocationList.add(new Station(StationLocation. UMROLI,LocalStationsName.UMROLI ,LineIndicator.WESTERN));

		mHarberStationsLocationList.add(new Station(StationLocation. BOISAR ,LocalStationsName.BOISAR ,LineIndicator.WESTERN));

		mHarberStationsLocationList.add(new Station(StationLocation. VANGAON ,LocalStationsName.VANGAON ,LineIndicator.WESTERN));

		mHarberStationsLocationList.add(new Station(StationLocation. DAHANU_ROAD ,LocalStationsName.DAHANU_ROAD ,LineIndicator.WESTERN));

		// **************WESTERN LINE STATION END

		// **************CENTRAL LINE STATION START

		mHarberStationsLocationList.add(new Station(StationLocation. BYCULLA,LocalStationsName.BYCULLA ,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. CHINCHPOKLI,LocalStationsName.CHINCHPOKLI ,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. CURREY_ROAD ,LocalStationsName.CURREY_ROAD ,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. PAREL,LocalStationsName.PAREL ,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. MATUNGA,LocalStationsName.MATUNGA ,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. SION,LocalStationsName. SION,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. VIDYAVIHAR,LocalStationsName. VIDYAVIHAR,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. GHATKOPAR,LocalStationsName. GHATKOPAR,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. VIKHROLI,LocalStationsName. VIKHROLI,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. KANJURMARG ,LocalStationsName.KANJURMARG ,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. BHANDUP,LocalStationsName. BHANDUP,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. NAHUR,LocalStationsName.NAHUR ,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. MULUND ,LocalStationsName. MULUND,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. THANE,LocalStationsName.THANE ,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. KALWA,LocalStationsName.KALWA ,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. MUMBRA,LocalStationsName.MUMBRA ,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. DIVA,LocalStationsName.DIVA ,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. KOPAR,LocalStationsName. KOPAR,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. DOMBIVLI,LocalStationsName.DOMBIVLI ,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. THAKURLI ,LocalStationsName.THAKURLI ,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. KALYAN,LocalStationsName.KALYAN ,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. VITTHALWADI,LocalStationsName. VITTHALWADI,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. ULHASNAGAR,LocalStationsName.ULHASNAGAR ,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. AMBARNATH,LocalStationsName. AMBARNATH,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. BADLAPUR,LocalStationsName.BADLAPUR ,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. VANGANI,LocalStationsName. VANGANI,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. SHELU,LocalStationsName.SHELU,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. NERAL,LocalStationsName.NERAL ,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. BHIVPURI_ROAD,LocalStationsName. BHIVPURI_ROAD,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. KARJAT,LocalStationsName.KARJAT ,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. PALASDARI ,LocalStationsName.PALASDARI ,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. KELAVLI ,LocalStationsName.KELAVLI ,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. DOLAVLI ,LocalStationsName. DOLAVLI,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. LOWJEE  ,LocalStationsName.LOWJEE ,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. KHOPOLI,LocalStationsName.KHOPOLI ,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. SHAHAD ,LocalStationsName.SHAHAD ,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. AMBIVLI ,LocalStationsName.AMBIVLI ,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. TITVALA ,LocalStationsName.TITVALA ,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. KHADAVLI  ,LocalStationsName.KHADAVLI ,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. Vasind  ,LocalStationsName.VASIND ,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation.ASANGAON  ,LocalStationsName.ASANGAON ,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. ATGAON  ,LocalStationsName. ATGAON,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. KHARDI,LocalStationsName.KHARDI ,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. UMBERALI,LocalStationsName.UMBERALI ,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. KASARA ,LocalStationsName. KASARA,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. VASAI_ROAD ,LocalStationsName.VASAI_ROAD ,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. JUCHANDRA ,LocalStationsName. JUCHANDRA,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. KAMAN_ROAD ,LocalStationsName. KAMAN_ROAD,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. KHARBAO ,LocalStationsName.KHARBAO ,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. BHIWANDI ,LocalStationsName.BHIWANDI ,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. DATIVALI,LocalStationsName. DATIVALI,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. NILAJE ,LocalStationsName.NILAJE ,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. TALOJA,LocalStationsName.TALOJA ,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. NAVADE_ROAD ,LocalStationsName.NAVADE_ROAD ,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. KALAMBOLI,LocalStationsName.KALAMBOLI ,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. JUMMAPATTI,LocalStationsName.JUMMAPATTI ,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. WATER_PIPE ,LocalStationsName. WATER_PIPE,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation. AMAN_LODGE ,LocalStationsName.AMAN_LODGE ,LineIndicator.CENTER));

		mHarberStationsLocationList.add(new Station(StationLocation.MATHERAN,LocalStationsName.MATHERAN ,LineIndicator.CENTER));

		return mHarberStationsLocationList;
	}

//	public List<Station> getAllMetroStationLocationList(){
//		mMetroStationsLocationList=new ArrayList<Station>();
//		mMetroStationsLocationList.add(new Station(MetroStationLocation.GHATKOPAR, MetroStationNames.GHATKOPAR,"metro"));
//		mMetroStationsLocationList.add(new Station(MetroStationLocation.JAGRUTI_NAGAR,MetroStationNames.JAGRUTI_NAGAR,"metro"));
//		mMetroStationsLocationList.add(new Station(MetroStationLocation.ASALPA,MetroStationNames.ASALPA,"metro"));
//		mMetroStationsLocationList.add(new Station(MetroStationLocation.SAKI_NAKA,MetroStationNames.SAKI_NAKA,"metro"));
//		mMetroStationsLocationList.add(new Station(MetroStationLocation.MAROL_NAKA,MetroStationNames.MAROL_NAKA,"metro"));
//		mMetroStationsLocationList.add(new Station(MetroStationLocation.AIRPORT_ROAD,MetroStationNames.AIRPORT_ROAD,"metro"));
//		mMetroStationsLocationList.add(new Station(MetroStationLocation.CHAKALA,MetroStationNames.CHAKALA,"metro"));
//		mMetroStationsLocationList.add(new Station(MetroStationLocation.WESTERN_EXP_HIGHWAY,MetroStationNames.WESTERN_EXP_HIGHWAY,"metro"));
//		mMetroStationsLocationList.add(new Station(MetroStationLocation.ANDHERI,MetroStationNames.ANDHERI,"metro"));
//		mMetroStationsLocationList.add(new Station(MetroStationLocation.AZAD_NAGAR,MetroStationNames.AZAD_NAGAR,"metro"));
//		mMetroStationsLocationList.add(new Station(MetroStationLocation.D_N_NAGAR,MetroStationNames.D_N_NAGAR,"metro"));
//		mMetroStationsLocationList.add(new Station(MetroStationLocation.VERSOVA,MetroStationNames.VERSOVA,"metro"));
//		return mMetroStationsLocationList;
//
//	}
//
//	public List<Station> getAllMonoStationLocationList(){
//		mMonoStationsLocationList=new ArrayList<Station>();
//		mMonoStationsLocationList.add(new Station(MonoStationLocation.CHEMBUR, MonoStationName.CHEMBUR,"mono"));
//		mMonoStationsLocationList.add(new Station(MonoStationLocation.VNP_MARG,MonoStationName.VPN_MARG_JUNCTION,"mono"));
//		mMonoStationsLocationList.add(new Station(MonoStationLocation.FERTILISER_TOWNSHIP,MonoStationName.FERTILISER_TOWNSHIP,"mono"));
//		mMonoStationsLocationList.add(new Station(MonoStationLocation.BHARAT_PETROLEUM,MonoStationName.BHARAT_PERTROLEUM,"mono"));
//		mMonoStationsLocationList.add(new Station(MonoStationLocation.MYSORE_COLONY,MonoStationName.MYSORE_COLONY,"mono"));
//		mMonoStationsLocationList.add(new Station(MonoStationLocation.BHAKTI_PARK,MonoStationName.BHAKTI_PARK,"mono"));
//		mMonoStationsLocationList.add(new Station(MonoStationLocation.WADALA,MonoStationName.WADALA,"mono"));
//		return mMonoStationsLocationList;
//
//	}

}
