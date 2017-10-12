package mumbai.d360.data;



import java.util.ArrayList;
import java.util.List;

import mumbai.d360.dataprovider.local.LocalStationsName;
import mumbai.d360.dataprovider.metro.MetroStationLocation;
import mumbai.d360.dataprovider.metro.MetroStationNames;
import mumbai.d360.dataprovider.mono.MonoStationLocation;
import mumbai.d360.dataprovider.mono.MonoStationName;

public class StationCollection {
public List<Bootstrap> mHarberStationsLocationList;
public List<Bootstrap> mMetroStationsLocationList;
public List<Bootstrap> mMonoStationsLocationList;

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

	public List<Bootstrap> getAllStationLocationList(){
		mHarberStationsLocationList=new ArrayList<Bootstrap>();






		mHarberStationsLocationList.add(new Bootstrap(StationLocation.MUMBAI_CST,LocalStationsName.MUMBAI_CST,StationCodes.MUMBAI_CST ,"harbour"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation.MASJID_BUNDER,LocalStationsName.MASJID_BUNDER,StationCodes.MASJID_BUNDER ,"harbour"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation.SANDHURST_ROAD,LocalStationsName.SANDHURST_ROAD,StationCodes.SANDHURST_ROAD ,"harbour"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation.DOCKYARD_ROAD,LocalStationsName.DOCKYARD_ROAD ,StationCodes.DOCKYARD_ROAD ,"harbour"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation.REAY_ROAD,LocalStationsName.REAY_ROAD,StationCodes.REAY_ROAD ,"harbour"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation.COTTON_GREEN,LocalStationsName.COTTON_GREEN ,StationCodes.COTTON_GREEN ,"harbour"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation.SEWRI,LocalStationsName.SEWRI ,StationCodes.SEWRI ,"harbour"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation.WADALA_ROAD,LocalStationsName.WADALA_ROAD ,StationCodes.WADALA_ROAD ,"harbour"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation.GURU_TEGH_BAHADUR_NAGAR,LocalStationsName.GTB_NAGAR, StationCodes.GURU_TEGH_BAHADUR_NAGAR ,"harbour"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation.CHUNABHATTI, LocalStationsName.CHUNABHATTI, StationCodes.CHUNABHATTI ,"harbour"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation.KURLA,LocalStationsName.KURLA,StationCodes.KURLA ,"harbour"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation.TILAK_NAGAR,LocalStationsName.TILAK_NAGAR, StationCodes.TILAK_NAGAR ,"harbour"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation.CHEMBUR,LocalStationsName.CHEMBUR ,StationCodes.CHEMBUR ,"harbour"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation.GOVANDI,LocalStationsName.GOVANDI ,StationCodes.GOVANDI ,"harbour"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation.MANKHURD,LocalStationsName.MANKHURD, StationCodes.MANKHURD ,"harbour"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation.VASHI,LocalStationsName.VASHI, StationCodes.VASHI ,"harbour"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation.SANPADA,LocalStationsName.SANPADA, StationCodes.SANPADA ,"harbour"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation.JUINAGAR ,LocalStationsName.JUINAGAR, StationCodes.JUINAGAR ,"harbour"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation.NERUL,LocalStationsName.NERUL, StationCodes.NERUL ,"harbour"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation.SEAWOODS_DARAVE,LocalStationsName.SEAWOODS_DARAVE, StationCodes.SEAWOODS_DARAVE ,"harbour"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation.CBD_BELAPUR,LocalStationsName.CBD_BELAPUR ,StationCodes.CBD_BELAPUR ,"harbour"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation.KHARGHAR,LocalStationsName.KHARGHAR ,StationCodes.KHARGHAR ,"harbour"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation.MANSAROVAR,LocalStationsName.MANSAROVAR, StationCodes.MANSAROVAR ,"harbour"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation.KHANDESHWAR,LocalStationsName.KHANDESHWAR ,StationCodes.KHANDESHWAR ,"harbour"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation.PANVEL,LocalStationsName.PANVEL ,StationCodes.PANVEL ,"harbour"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. KINGS_CIRCLE,LocalStationsName.KINGS_CIRCLE, StationCodes.KINGS_CIRCLE ,"harbour"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. MAHIM,LocalStationsName.MAHIM, StationCodes.MAHIM ,"harbour"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. BANDRA,LocalStationsName.BANDRA ,StationCodes.BANDRA ,"harbour"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. KHAR_ROAD,LocalStationsName.KHAR_ROAD,StationCodes.KHAR_ROAD ,"harbour"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. SANTACRUZ,LocalStationsName.SANTACRUZ ,StationCodes.VILE_PARLE ,"harbour"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. VILE_PARLE,LocalStationsName.VILE_PARLE, StationCodes.VILE_PARLE ,"harbour"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. ANDHERI,LocalStationsName.ANDHERI, StationCodes.ANDHERI ,"harbour"));
		mHarberStationsLocationList.add(new Bootstrap(StationLocation.AIROLI,LocalStationsName.AIROLI ,StationCodes. AIROLI,"harbour"));
		mHarberStationsLocationList.add(new Bootstrap(StationLocation.RABALE,LocalStationsName.RABALE ,StationCodes.RABALE ,"harbour"));
		mHarberStationsLocationList.add(new Bootstrap(StationLocation.GHANSOLI,LocalStationsName.GHANSOLI ,StationCodes.GHANSOLI ,"harbour"));
		mHarberStationsLocationList.add(new Bootstrap(StationLocation.KOPAR_KHAIRANE,LocalStationsName.KOPAR_KHAIRANE, StationCodes.KOPAR_KHAIRANE ,"harbour"));
		mHarberStationsLocationList.add(new Bootstrap(StationLocation.TURBHE,LocalStationsName.TURBHE, StationCodes.TURBHE ,"harbour"));

		// **************HARBER LINE STATION END******************

		// **************WESTERN LINE STATION START

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. CHURCHGATE,LocalStationsName. CHURCHGATE,"western"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. MARINE_LINES,LocalStationsName.MARINE_LINES ,"western"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. CHARNI_ROAD ,LocalStationsName. CHARNI_ROAD,"western"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. GRANT_ROAD,LocalStationsName.GRANT_ROAD ,"western"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. MUMBAI_CENTRAL ,LocalStationsName. MUMBAI_CENTRAL,"western"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. MAHALAKSHMI ,LocalStationsName.MAHALAKSHMI ,"western"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. LOWER_PAREL ,LocalStationsName.LOWER_PAREL ,"western"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. ELPHINSTONE_ROAD,LocalStationsName. ELPHINSTONE_ROAD,"western"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. DADAR,LocalStationsName.DADAR ,"western"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. MATUNGA_ROAD,LocalStationsName.MATUNGA_ROAD ,"western"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. JOGESHWARI,LocalStationsName.JOGESHWARI ,"western"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. GOREGAON,LocalStationsName.GOREGAON ,"western"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. MALAD,LocalStationsName.MALAD ,"western"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. KANDIVALI,LocalStationsName.KANDIVALI ,"western"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. BORIVALI,LocalStationsName.BORIVALI ,"western"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. DAHISAR,LocalStationsName.DAHISAR ,"western"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. MIRA_ROAD,LocalStationsName.MIRA_ROAD ,"western"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. BHAYANDAR,LocalStationsName.BHAYANDAR ,"western"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. NAIGAON,LocalStationsName.NAIGAON ,"western"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. Nalla_Sopara,LocalStationsName.NALLA_SOPARA ,"western"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. VIRAR ,LocalStationsName. VIRAR,"western"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. VAITARNA ,LocalStationsName.VAITARNA ,"western"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. SAPHALE,LocalStationsName. SAPHALE,"western"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. KELVA_ROAD,LocalStationsName.KELVA_ROAD ,"western"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. PALGHAR,LocalStationsName.PALGHAR ,"western"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. UMROLI,LocalStationsName.UMROLI ,"western"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. BOISAR ,LocalStationsName.BOISAR ,"western"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. VANGAON ,LocalStationsName.VANGAON ,"western"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. DAHANU_ROAD ,LocalStationsName.DAHANU_ROAD ,"western"));

		// **************WESTERN LINE STATION END

		// **************CENTRAL LINE STATION START

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. BYCULLA,LocalStationsName.BYCULLA ,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. CHINCHPOKLI,LocalStationsName.CHINCHPOKLI ,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. CURREY_ROAD ,LocalStationsName.CURREY_ROAD ,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. PAREL,LocalStationsName.PAREL ,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. MATUNGA,LocalStationsName.MATUNGA ,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. SION,LocalStationsName. SION,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. VIDYAVIHAR,LocalStationsName. VIDYAVIHAR,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. GHATKOPAR,LocalStationsName. GHATKOPAR,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. VIKHROLI,LocalStationsName. VIKHROLI,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. KANJURMARG ,LocalStationsName.KANJURMARG ,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. BHANDUP,LocalStationsName. BHANDUP,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. NAHUR,LocalStationsName.NAHUR ,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. MULUND ,LocalStationsName. MULUND,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. THANE,LocalStationsName.THANE ,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. KALWA,LocalStationsName.KALWA ,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. MUMBRA,LocalStationsName.MUMBRA ,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. DIVA,LocalStationsName.DIVA ,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. KOPAR,LocalStationsName. KOPAR,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. DOMBIVLI,LocalStationsName.DOMBIVLI ,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. THAKURLI ,LocalStationsName.THAKURLI ,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. KALYAN,LocalStationsName.KALYAN ,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. VITTHALWADI,LocalStationsName. VITTHALWADI,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. ULHASNAGAR,LocalStationsName.ULHASNAGAR ,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. AMBARNATH,LocalStationsName. AMBARNATH,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. BADLAPUR,LocalStationsName.BADLAPUR ,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. VANGANI,LocalStationsName. VANGANI,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. SHELU,LocalStationsName.SHELU,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. NERAL,LocalStationsName.NERAL ,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. BHIVPURI_ROAD,LocalStationsName. BHIVPURI_ROAD,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. KARJAT,LocalStationsName.KARJAT ,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. PALASDARI ,LocalStationsName.PALASDARI ,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. KELAVLI ,LocalStationsName.KELAVLI ,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. DOLAVLI ,LocalStationsName. DOLAVLI,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. LOWJEE  ,LocalStationsName.LOWJEE ,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. KHOPOLI,LocalStationsName.KHOPOLI ,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. SHAHAD ,LocalStationsName.SHAHAD ,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. AMBIVLI ,LocalStationsName.AMBIVLI ,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. TITVALA ,LocalStationsName.TITVALA ,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. KHADAVLI  ,LocalStationsName.KHADAVLI ,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. Vasind  ,LocalStationsName.VASIND ,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation.ASANGAON  ,LocalStationsName.ASANGAON ,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. ATGAON  ,LocalStationsName. ATGAON,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. KHARDI,LocalStationsName.KHARDI ,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. UMBERALI,LocalStationsName.UMBERALI ,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. KASARA ,LocalStationsName. KASARA,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. VASAI_ROAD ,LocalStationsName.VASAI_ROAD ,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. JUCHANDRA ,LocalStationsName. JUCHANDRA,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. KAMAN_ROAD ,LocalStationsName. KAMAN_ROAD,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. KHARBAO ,LocalStationsName.KHARBAO ,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. BHIWANDI ,LocalStationsName.BHIWANDI ,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. DATIVALI,LocalStationsName. DATIVALI,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. NILAJE ,LocalStationsName.NILAJE ,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. TALOJA,LocalStationsName.TALOJA ,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. NAVADE_ROAD ,LocalStationsName.NAVADE_ROAD ,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. KALAMBOLI,LocalStationsName.KALAMBOLI ,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. JUMMAPATTI,LocalStationsName.JUMMAPATTI ,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. WATER_PIPE ,LocalStationsName. WATER_PIPE,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation. AMAN_LODGE ,LocalStationsName.AMAN_LODGE ,"central"));

		mHarberStationsLocationList.add(new Bootstrap(StationLocation.MATHERAN,LocalStationsName.MATHERAN ,"central"));

		return mHarberStationsLocationList;
	}

	public List<Bootstrap> getAllMetroStationLocationList(){
		mMetroStationsLocationList=new ArrayList<Bootstrap>();
		mMetroStationsLocationList.add(new Bootstrap(MetroStationLocation.GHATKOPAR, MetroStationNames.GHATKOPAR,"metro"));
		mMetroStationsLocationList.add(new Bootstrap(MetroStationLocation.JAGRUTI_NAGAR,MetroStationNames.JAGRUTI_NAGAR,"metro"));
		mMetroStationsLocationList.add(new Bootstrap(MetroStationLocation.ASALPA,MetroStationNames.ASALPA,"metro"));
		mMetroStationsLocationList.add(new Bootstrap(MetroStationLocation.SAKI_NAKA,MetroStationNames.SAKI_NAKA,"metro"));
		mMetroStationsLocationList.add(new Bootstrap(MetroStationLocation.MAROL_NAKA,MetroStationNames.MAROL_NAKA,"metro"));
		mMetroStationsLocationList.add(new Bootstrap(MetroStationLocation.AIRPORT_ROAD,MetroStationNames.AIRPORT_ROAD,"metro"));
		mMetroStationsLocationList.add(new Bootstrap(MetroStationLocation.CHAKALA,MetroStationNames.CHAKALA,"metro"));
		mMetroStationsLocationList.add(new Bootstrap(MetroStationLocation.WESTERN_EXP_HIGHWAY,MetroStationNames.WESTERN_EXP_HIGHWAY,"metro"));
		mMetroStationsLocationList.add(new Bootstrap(MetroStationLocation.ANDHERI,MetroStationNames.ANDHERI,"metro"));
		mMetroStationsLocationList.add(new Bootstrap(MetroStationLocation.AZAD_NAGAR,MetroStationNames.AZAD_NAGAR,"metro"));
		mMetroStationsLocationList.add(new Bootstrap(MetroStationLocation.D_N_NAGAR,MetroStationNames.D_N_NAGAR,"metro"));
		mMetroStationsLocationList.add(new Bootstrap(MetroStationLocation.VERSOVA,MetroStationNames.VERSOVA,"metro"));
		return mMetroStationsLocationList;

	}

	public List<Bootstrap> getAllMonoStationLocationList(){
		mMonoStationsLocationList=new ArrayList<Bootstrap>();
		mMonoStationsLocationList.add(new Bootstrap(MonoStationLocation.CHEMBUR, MonoStationName.CHEMBUR,"mono"));
		mMonoStationsLocationList.add(new Bootstrap(MonoStationLocation.VNP_MARG,MonoStationName.VPN_MARG_JUNCTION,"mono"));
		mMonoStationsLocationList.add(new Bootstrap(MonoStationLocation.FERTILISER_TOWNSHIP,MonoStationName.FERTILISER_TOWNSHIP,"mono"));
		mMonoStationsLocationList.add(new Bootstrap(MonoStationLocation.BHARAT_PETROLEUM,MonoStationName.BHARAT_PERTROLEUM,"mono"));
		mMonoStationsLocationList.add(new Bootstrap(MonoStationLocation.MYSORE_COLONY,MonoStationName.MYSORE_COLONY,"mono"));
		mMonoStationsLocationList.add(new Bootstrap(MonoStationLocation.BHAKTI_PARK,MonoStationName.BHAKTI_PARK,"mono"));
		mMonoStationsLocationList.add(new Bootstrap(MonoStationLocation.WADALA,MonoStationName.WADALA,"mono"));
		return mMonoStationsLocationList;

	}

}
