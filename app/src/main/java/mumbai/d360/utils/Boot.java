package mumbai.d360.utils;


import mumbai.d360.dataprovider.metro.MetroStationNames;

public class Boot {

    public static String getHarberStationNameByCode(String code) {
        String stationName = "Source";

        switch (code) {
            case "CSTM":
                stationName = "Mumbai CST";
                break;
            case "MSD":
                stationName = "Masjid Bunder";
                break;
            case "SNRD":
                stationName = "Sandhurst Road";
                break;
            case "DKRD":
                stationName = "Dockyard Road";
                break;
            case "RRD":
                stationName = "Reay Road";
                break;
            case "CTGN":
                stationName = "Cotton Green";
                break;
            case "SVE":
                stationName = "Sewri";
                break;
            case "VDLR":
                stationName = "Wadala Road";
                break;
            case "GTBN":
                stationName = "Guru Tegh Bahadur Nagar";
                break;
            case "CHF":
                stationName = "Chunabhatti";
                break;
            case "CLA":
                stationName = "Kurla";
                break;
            case "TKNG":
                stationName = "Tilak Nagar";
                break;
            case "CMBR":
                stationName = "Chembur";
                break;
            case "GV":
                stationName = "Govandi";
                break;
            case "MNKD":
                stationName = "Mankhurd";
                break;
            case "VSH":
                stationName = "Vashi";
                break;
            case "SNCR":
                stationName = "Sanpada";
                break;
            case "JNJ":
                stationName = "Juinagar";
                break;
            case "NEU":
                stationName = "Nerul";
                break;
            case "SWDV":
                stationName = "Seawoods-Darave";
                break;
            case "BEPR":
                stationName = "CBD Belapur";
                break;
            case "KHAG":
                stationName = "Kharghar";
                break;
            case "MANR":
                stationName = "Mansarovar";
                break;
            case "KNDS":
                stationName = "Khandeshwar";
                break;
            case "PNVL":
                stationName = "Panvel";
                break;
            case "KCE":
                stationName = "Kings Circle";
                break;
            case "MM":
                stationName = "Mahim";
                break;
            case "BA":
                stationName = "Bandra";
                break;
            case "KHR":
                stationName = "Khar Road";
                break;
            case "STC":
                stationName = "Santacruz";
                break;
            case "VLP":
                stationName = "Vile Parle";
                break;
            case "ADH":
                stationName = "Andheri";
                break;

            case "AIRL":
                stationName = "Airoli";
                break;
            case "RABE":
                stationName = "Rabale";
                break;
            case "GNSL":
                stationName = "Ghansoli";
                break;
            case "KPHN":
                stationName = "Kopar Khairane";
                break;
            case "TAPG":
                stationName = "Turbhe";
                break;
//		case "":
//			stationName="";
//			break;
//		
            //**************WESTERN LINE STATION START

            case "CCG":
                stationName = "Churchgate";
                break;
            case "MEL":
                stationName = "Marine Lines";
                break;
            case "CYR":
                stationName = "Charni Road";
                break;
            case "GTR":
                stationName = "Grant Road";
                break;
            case "MCT":
                stationName = "Mumbai Central";
                break;
            case "MX":
                stationName = "Mahalakshmi";
                break;
            case "PL":
                stationName = "Lower Parel";
                break;
            case "EPR":
                stationName = "Elphinstone Road";
                break;
            case "DDR":
                stationName = "Dadar";
                break;
            case "MRU":
                stationName = "Matunga Road";
                break;
            case "JOS":
                stationName = "Jogeshwari";
                break;
            case "GM":
                stationName = "Goregaon";
                break;
            case "MDD":
                stationName = "Malad";
                break;
            case "KILE":
                stationName = "Kandivali";
                break;
            case "BVI":
                stationName = "Borivali";
                break;
            case "DIC":
                stationName = "Dahisar";
                break;
            case "MIRA":
                stationName = "Mira Road";
                break;
            case "BYR":
                stationName = "Bhayandar";
                break;
            case "NIG":
                stationName = "Naigaon";
                break;

            case "NSP":
                stationName = "Nalla Sopara";
                break;
            case "VR":
                stationName = "Virar";
                break;
            case "VTN":
                stationName = "Vaitarna";
                break;
            case "SAH":
                stationName = "Saphale";
                break;
            case "KLV":
                stationName = "Kelva Road";
                break;
            case "PLG":
                stationName = "Palghar";
                break;
            case "UOI":
                stationName = "Umroli";
                break;
            case "BOR":
                stationName = "Boisar";
                break;
            case "VGN":
                stationName = "Vangaon";
                break;
            case "DRD":
                stationName = "Dahanu Road";
                break;

            //**************WESTERN LINE STATION END

            //**************CENTRAL LINE STATION START


            case "BY":
                stationName = "Byculla";
                break;
            case "CHG":
                stationName = "Chinchpokli";
                break;
            case "CRD":
                stationName = "Currey Road";
                break;
            case "PR":
                stationName = "Parel";
                break;

            case "MTN":
                stationName = "Matunga";
                break;
            case "SIN":
                stationName = "Sion";
                break;

            case "VVH":
                stationName = "Vidyavihar";
                break;
            case "GC":
                stationName = "Ghatkopar";
                break;
            case "VK":
                stationName = "Vikhroli";
                break;
            case "KJMG":
                stationName = "Kanjurmarg";
                break;
            case "BND":
                stationName = "Bhandup";
                break;
            case "NHU":
                stationName = "Nahur";
                break;
            case "MLND":
                stationName = "Mulund";
                break;
            case "TNA":
                stationName = "Thane";
                break;
            case "KLVA":
                stationName = "Kalwa";
                break;
            case "MBQ":
                stationName = "Mumbra";
                break;
            case "DIVA":
                stationName = "Diva";
                break;
            case "KOPR":
                stationName = "Kopar";
                break;
            case "DI":
                stationName = "Dombivli";
                break;
            case "THK":
                stationName = "Thakurli";
                break;
            case "KYN":
                stationName = "Kalyan";
                break;
            case "VLDI":
                stationName = "Vitthalwadi";
                break;
            case "ULNR":
                stationName = "Ulhasnagar";
                break;
            case "ABH":
                stationName = "Ambarnath";
                break;
            case "BUD":
                stationName = "Badlapur";
                break;
            case "VGI":
                stationName = "Vangani";
                break;
            case "SHLU":
                stationName = "Shelu";
                break;
            case "NRL":
                stationName = "Neral";
                break;
            case "BVS":
                stationName = "Bhivpuri Road";
                break;
            case "KJT":
                stationName = "Karjat";
                break;
            case "PDI":
                stationName = "Palasdari";
                break;
            case "KLY":
                stationName = "Kelavli";
                break;
            case "DLV":
                stationName = "Dolavli";
                break;
            case "LWJ":
                stationName = "Lowjee";
                break;
            case "KHPI":
                stationName = "Khopoli";
                break;
            case "SHAD":
                stationName = "Shahad";
                break;
            case "ABY":
                stationName = "Ambivli";
                break;
            case "TLA":
                stationName = "Titvala";
                break;
            case "KDV":
                stationName = "Khadavli";
                break;
            case "VSD":
                stationName = "Vasind";
                break;
            case "ASO":
                stationName = "Asangaon";
                break;
            case "ATG":
                stationName = "Atgaon";
                break;
            case "KE":
                stationName = "Khardi";
                break;
            case "UMB":
                stationName = "Umberali";
                break;
            case "KSRA":
                stationName = "Kasara";
                break;
            case "BSR":
                stationName = "Vasai Road";
                break;
            case "JCNR":
                stationName = "Juchandra";
                break;
            case "KARD":
                stationName = "Kaman Road";
                break;
            case "KHBV":
                stationName = "Kharbao";
                break;
            case "BIRD":
                stationName = "Bhiwandi";
                break;
            case "DTVL":
                stationName = "Dativali";
                break;
            case "NIIJ":
                stationName = "Nilaje";
                break;
            case "TPND":
                stationName = "Taloja";
                break;
            case "NVRD":
                stationName = "Navade Road";
                break;
            case "KLMC":
                stationName = "Kalamboli";
                break;
            case "JTT":
                stationName = "Jummapatti";
                break;
            case "WTP":
                stationName = "Water pipe";
                break;
            case "AMNA":
                stationName = "Aman Lodge";
                break;
            case "MAE":
                stationName = "Matheran";
                break;
            //**************CENTRAL LINE STATION END

            case MetroStationNames.GHATKOPAR:
                stationName = MetroStationNames.GHATKOPAR;
                break;
            case MetroStationNames.JAGRUTI_NAGAR:
                stationName = MetroStationNames.JAGRUTI_NAGAR;
                break;
            case MetroStationNames.ASALPA:
                stationName = MetroStationNames.ASALPA;
                break;
            case MetroStationNames.SAKI_NAKA:
                stationName = MetroStationNames.SAKI_NAKA;
                break;
            case MetroStationNames.MAROL_NAKA:
                stationName = MetroStationNames.MAROL_NAKA;
                break;
            case MetroStationNames.AIRPORT_ROAD:
                stationName = MetroStationNames.AIRPORT_ROAD;
                break;
            case MetroStationNames.CHAKALA:
                stationName = MetroStationNames.CHAKALA;
                break;
            case MetroStationNames.WESTERN_EXP_HIGHWAY:
                stationName = MetroStationNames.WESTERN_EXP_HIGHWAY;
                break;
            case MetroStationNames.ANDHERI:
                stationName = MetroStationNames.ANDHERI;
                break;
            case MetroStationNames.AZAD_NAGAR:
                stationName = MetroStationNames.AZAD_NAGAR;
                break;
            case MetroStationNames.D_N_NAGAR:
                stationName = MetroStationNames.D_N_NAGAR;
                break;
            case MetroStationNames.VERSOVA:
                stationName = MetroStationNames.VERSOVA;
                break;


        }
        return stationName;


    }
}
