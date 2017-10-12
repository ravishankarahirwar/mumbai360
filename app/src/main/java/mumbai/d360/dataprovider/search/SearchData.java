package mumbai.d360.dataprovider.search;

import android.content.Context;
import android.widget.Filter;

import com.quinny898.library.persistentsearch.SearchResult;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import mumbai.d360.R;
import mumbai.d360.dataprovider.metro.MetroStationNames;
import mumbai.d360.dataprovider.mono.MonoStationName;
import mumbai.d360.model.Station;
import mumbai.d360.searchdata.ColorSuggestion;
import mumbai.d360.searchdata.DataHelper;
import mumbai.d360.utils.LineIndicator;

public class SearchData {

    public ArrayList<SearchResult> getSearchResult(Context context) {
        ArrayList<SearchResult> searchResults = new ArrayList<>();
        List<Station> searchableData = getSearchableData();
        for (Station station : searchableData) {
            SearchResult option = new SearchResult(station.getName(),
                    context.getResources().getDrawable(R.drawable.ic_history));
            searchResults.add(option);
        }
        return searchResults;
    }

    private List<Station> getSearchableData() {
        List<Station> searchableData = new ArrayList<>();
        searchableData.add(new Station("1", "Mumbai CST", "CSTM", LineIndicator.HARBOUR));
        searchableData.add(new Station("1", "Mumbai CST", "CSTM", LineIndicator.HARBOUR));
        searchableData.add(new Station("2", "Masjid Bunder", "MSD", LineIndicator.HARBOUR));
        searchableData.add(new Station("3", "Sandhurst Road", "SNRD", LineIndicator.HARBOUR));
        searchableData.add(new Station("4", "Dockyard Road", "DKRD", LineIndicator.HARBOUR));
        searchableData.add(new Station("5", "Reay Road", "RRD", LineIndicator.HARBOUR));
        searchableData.add(new Station("6", "Cotton Green", "CTGN", LineIndicator.HARBOUR));
        searchableData.add(new Station("7", "Sewri", "SVE", LineIndicator.HARBOUR));
        searchableData.add(new Station("8", "Wadala Road", "VDLR", LineIndicator.HARBOUR));
        searchableData.add(new Station("9", "Guru Tegh Bahadur Nagar", "GTBN", LineIndicator.HARBOUR));
        searchableData.add(new Station("10", "Chunabhatti", "CHF", LineIndicator.HARBOUR));
        searchableData.add(new Station("11", "Kurla", "CLA", LineIndicator.HARBOUR));
        searchableData.add(new Station("12", "Tilak Nagar", "TKNG", LineIndicator.HARBOUR));
        searchableData.add(new Station("13", "Chembur", "CMBR", LineIndicator.HARBOUR));
        searchableData.add(new Station("14", "Govandi", "GV", LineIndicator.HARBOUR));
        searchableData.add(new Station("15", "Mankhurd", "MNKD", LineIndicator.HARBOUR));
        searchableData.add(new Station("16", "Vashi", "VSH", LineIndicator.HARBOUR));
        searchableData.add(new Station("17", "Sanpada", "SNCR", LineIndicator.HARBOUR));
        searchableData.add(new Station("18", "Juinagar", "JNJ", LineIndicator.HARBOUR));
        searchableData.add(new Station("19", "Nerul", "NEU", LineIndicator.HARBOUR));
        searchableData.add(new Station("20", "Seawoods-Darave", "SWDV", LineIndicator.HARBOUR));
        searchableData.add(new Station("21", "CBD Belapur", "BEPR", LineIndicator.HARBOUR));
        searchableData.add(new Station("22", "Kharghar", "KHAG", LineIndicator.HARBOUR));
        searchableData.add(new Station("23", "Mansarovar", "MANR", LineIndicator.HARBOUR));
        searchableData.add(new Station("24", "Khandeshwar", "KNDS", LineIndicator.HARBOUR));
        searchableData.add(new Station("25", "Panvel", "PNVL", LineIndicator.HARBOUR));
        searchableData.add(new Station("26", "Kings Circle", "KCE", LineIndicator.HARBOUR));
        searchableData.add(new Station("27", "Mahim", "MM", LineIndicator.HARBOUR));
        searchableData.add(new Station("28", "Bandra", "BA", LineIndicator.HARBOUR));
        searchableData.add(new Station("29", "Khar Road", "KHR", LineIndicator.HARBOUR));
        searchableData.add(new Station("30", "Santacruz", "STC", LineIndicator.HARBOUR));
        searchableData.add(new Station("31", "Vile Parle", "VLP", LineIndicator.HARBOUR));
        searchableData.add(new Station("32", "Andheri", "ADH", LineIndicator.HARBOUR));
        searchableData.add(new Station("33", "Airoli", "AIRL", LineIndicator.HARBOUR));
        searchableData.add(new Station("34", "Rabale", "Rabale", LineIndicator.HARBOUR));
        searchableData.add(new Station("35", "Ghansoli", "GNSL", LineIndicator.HARBOUR));
        searchableData.add(new Station("36", "Kopar Khairane", "KPHN", LineIndicator.HARBOUR));
        searchableData.add(new Station("37", "Turbhe", "TAPG", LineIndicator.HARBOUR));
        searchableData.add(new Station("38", "Thane", "TNA", LineIndicator.HARBOUR));
        //Harber Line Name End Here and Central Line Name Start

        searchableData.add(new Station("39", "Mumbai CST", "CSTM", LineIndicator.CENTER));
        searchableData.add(new Station("40", "Masjid Bunder", "MSD", LineIndicator.CENTER));
        searchableData.add(new Station("41", "Sandhurst Road", "SNRD", LineIndicator.CENTER));
        searchableData.add(new Station("42", "Byculla", "BY", LineIndicator.CENTER));
        searchableData.add(new Station("43", "Chinchpokli", "CHG", LineIndicator.CENTER));
        searchableData.add(new Station("44", "Currey Road", "CRD", LineIndicator.CENTER));
        searchableData.add(new Station("45", "Parel", "PR", LineIndicator.CENTER));
        searchableData.add(new Station("46", "Dadar", "DDR", LineIndicator.CENTER));
        searchableData.add(new Station("47", "Matunga", "MTN", LineIndicator.CENTER));
        searchableData.add(new Station("48", "Sion", "SIN", LineIndicator.CENTER));
        searchableData.add(new Station("49", "Kurla", "CLA", LineIndicator.CENTER));
        searchableData.add(new Station("50", "Vidyavihar", "VVH", LineIndicator.CENTER));
        searchableData.add(new Station("51", "Ghatkopar", "GC", LineIndicator.CENTER));
        searchableData.add(new Station("52", "Vikhroli", "VK", LineIndicator.CENTER));
        searchableData.add(new Station("53", "Kanjurmarg", "KJMG", LineIndicator.CENTER));
        searchableData.add(new Station("54", "Bhandup", "BND", LineIndicator.CENTER));
        searchableData.add(new Station("55", "Nahur", "NHU", LineIndicator.CENTER));
        searchableData.add(new Station("56", "Mulund", "MLND", LineIndicator.CENTER));
        searchableData.add(new Station("57", "Thane", "TNA", LineIndicator.CENTER));
        searchableData.add(new Station("58", "Kalwa", "KLVA", LineIndicator.CENTER));
        searchableData.add(new Station("59", "Mumbra", "MBQ", LineIndicator.CENTER));
        searchableData.add(new Station("60", "Diva", "DIVA", LineIndicator.CENTER));
        searchableData.add(new Station("61", "Kopar", "KOPR", LineIndicator.CENTER));
        searchableData.add(new Station("62", "Dombivli", "DI", LineIndicator.CENTER));
        searchableData.add(new Station("63", "Thakurli", "THK", LineIndicator.CENTER));
        searchableData.add(new Station("64", "Kalyan", "KYN", LineIndicator.CENTER));
        searchableData.add(new Station("65", "Vitthalwadi", "VLDI", LineIndicator.CENTER));
        searchableData.add(new Station("66", "Ulhasnagar", "ULNR", LineIndicator.CENTER));
        searchableData.add(new Station("67", "Ambarnath", "ABH", LineIndicator.CENTER));
        searchableData.add(new Station("68", "Badlapur", "BUD", LineIndicator.CENTER));
        searchableData.add(new Station("69", "Vangani", "VGI", LineIndicator.CENTER));
        searchableData.add(new Station("70", "Shelu", "SHLU", LineIndicator.CENTER));
        searchableData.add(new Station("71", "Neral", "NRL", LineIndicator.CENTER));
        searchableData.add(new Station("72", "Bhivpuri Road", "BVS", LineIndicator.CENTER));
        searchableData.add(new Station("73", "Karjat", "KJT", LineIndicator.CENTER));
        searchableData.add(new Station("74", "Palasdari", "PDI", LineIndicator.CENTER));
        searchableData.add(new Station("75", "Kelavli", "KLY", LineIndicator.CENTER));
        searchableData.add(new Station("76", "Dolavli", "DLV", LineIndicator.CENTER));
        searchableData.add(new Station("77", "Lowjee", "LWJ", LineIndicator.CENTER));
        searchableData.add(new Station("78", "Khopoli", "KHPI", LineIndicator.CENTER));
        searchableData.add(new Station("79", "Shahad", "SHAD", LineIndicator.CENTER));
        searchableData.add(new Station("80", "Ambivli", "ABY", LineIndicator.CENTER));
        searchableData.add(new Station("81", "Titvala", "TLA", LineIndicator.CENTER));
        searchableData.add(new Station("82", "Khadavli", "KDV", LineIndicator.CENTER));
        searchableData.add(new Station("83", "Vasind", "VSD", LineIndicator.CENTER));
        searchableData.add(new Station("84", "Asangaon", "ASO", LineIndicator.CENTER));
        searchableData.add(new Station("85", "Atgaon", "ATG", LineIndicator.CENTER));
        searchableData.add(new Station("86", "Khardi", "KE", LineIndicator.CENTER));
        searchableData.add(new Station("87", "Umberali", "UMB", LineIndicator.CENTER));
        searchableData.add(new Station("88", "Kasara", "KSRA", LineIndicator.CENTER));
        searchableData.add(new Station("89", "Vasai Road", "BSR", LineIndicator.CENTER));
        searchableData.add(new Station("90", "Juchandra", "JCNR", LineIndicator.CENTER));
        searchableData.add(new Station("91", "Kaman Road", "KARD", LineIndicator.CENTER));
        searchableData.add(new Station("92", "Kharbao", "KHBV", LineIndicator.CENTER));
        searchableData.add(new Station("93", "Bhiwandi", "BIRD", LineIndicator.CENTER));
        searchableData.add(new Station("94", "Dativali", "DTVL", LineIndicator.CENTER));
        searchableData.add(new Station("95", "Nilaje", "NIIJ", LineIndicator.CENTER));
        searchableData.add(new Station("96", "Taloja", "TPND", LineIndicator.CENTER));
        searchableData.add(new Station("97", "Navade Road", "NVRD", LineIndicator.CENTER));
        searchableData.add(new Station("98", "Kalamboli", "KLMC", LineIndicator.CENTER));
        searchableData.add(new Station("99", "Jummapatti", "JTT", LineIndicator.CENTER));
        searchableData.add(new Station("100", "Water pipe", "WTP", LineIndicator.CENTER));
        searchableData.add(new Station("101", "Aman Lodge", "AMNA", LineIndicator.CENTER));
        searchableData.add(new Station("102", "Matheran", "MAE", LineIndicator.CENTER));

        //**************CENTRAL LINE STATION END

        //**************WESTERN LINE STATION START

        searchableData.add(new Station("103", "Churchgate", "CCG", LineIndicator.WESTERN));
        searchableData.add(new Station("104", "Marine Lines", "MEL", LineIndicator.WESTERN));
        searchableData.add(new Station("105", "Charni Road", "CYR", LineIndicator.WESTERN));
        searchableData.add(new Station("106", "Grant Road", "GTR", LineIndicator.WESTERN));
        searchableData.add(new Station("107", "Mumbai Central", "MCT", LineIndicator.WESTERN));
        searchableData.add(new Station("108", "Mahalakshmi", "MX", LineIndicator.WESTERN));
        searchableData.add(new Station("109", "Lower Parel", "PL", LineIndicator.WESTERN));
        searchableData.add(new Station("110", "Elphinstone Road", "EPR", LineIndicator.WESTERN));
        searchableData.add(new Station("111", "Dadar", "DDR", LineIndicator.WESTERN));
        searchableData.add(new Station("112", "Matunga Road", "MRU", LineIndicator.WESTERN));
        searchableData.add(new Station("113", "Mahim", "MM", LineIndicator.WESTERN));
        searchableData.add(new Station("114", "Bandra", "BA", LineIndicator.WESTERN));
        searchableData.add(new Station("115", "Khar Road", "KHR", LineIndicator.WESTERN));
        searchableData.add(new Station("116", "Santacruz", "STC", LineIndicator.WESTERN));
        searchableData.add(new Station("117", "Vile Parle", "VLP", LineIndicator.WESTERN));
        searchableData.add(new Station("118", "Andheri", "ADH", LineIndicator.WESTERN));
        searchableData.add(new Station("119", "Airoli", "AIRL", LineIndicator.WESTERN));
        searchableData.add(new Station("120", "Jogeshwari", "JOS", LineIndicator.WESTERN));
        searchableData.add(new Station("121", "Goregaon", "GM", LineIndicator.WESTERN));
        searchableData.add(new Station("122", "Malad", "MDD", LineIndicator.WESTERN));
        searchableData.add(new Station("123", "Kandivali", "KILE", LineIndicator.WESTERN));
        searchableData.add(new Station("124", "Borivali", "BVI", LineIndicator.WESTERN));
        searchableData.add(new Station("125", "Dahisar", "DIC", LineIndicator.WESTERN));
        searchableData.add(new Station("126", "Mira Road", "MIRA", LineIndicator.WESTERN));
        searchableData.add(new Station("127", "Bhayandar", "BYR", LineIndicator.WESTERN));
        searchableData.add(new Station("128", "Naigaon", "NIG", LineIndicator.WESTERN));
        searchableData.add(new Station("129", "Nalla Sopara", "NSP", LineIndicator.WESTERN));
        searchableData.add(new Station("130", "Virar", "VR", LineIndicator.WESTERN));
        searchableData.add(new Station("131", "Vaitarna", "VTN", LineIndicator.WESTERN));
        searchableData.add(new Station("132", "Saphale", "SAH", LineIndicator.WESTERN));
        searchableData.add(new Station("133", "Kelva Road", "KLV", LineIndicator.WESTERN));
        searchableData.add(new Station("134", "Palghar", "PLG", LineIndicator.WESTERN));
        searchableData.add(new Station("135", "Umroli", "UOI", LineIndicator.WESTERN));
        searchableData.add(new Station("136", "Boisar", "BOR", LineIndicator.WESTERN));
        searchableData.add(new Station("137", "Vangaon", "VGN", LineIndicator.WESTERN));
        searchableData.add(new Station("138", "Dahanu Road", "DRD", LineIndicator.WESTERN));


        //**************WESTERN LINE STATION END

        //**************METRO LINE STATION START

        searchableData.add(new Station("139", MetroStationNames.GHATKOPAR, MetroStationNames.GHATKOPAR, LineIndicator.METRO));
        searchableData.add(new Station("140", MetroStationNames.JAGRUTI_NAGAR, MetroStationNames.JAGRUTI_NAGAR, LineIndicator.METRO));
        searchableData.add(new Station("141", MetroStationNames.ASALPA, MetroStationNames.ASALPA, LineIndicator.METRO));
        searchableData.add(new Station("142", MetroStationNames.SAKI_NAKA, MetroStationNames.SAKI_NAKA, LineIndicator.METRO));
        searchableData.add(new Station("143", MetroStationNames.MAROL_NAKA, MetroStationNames.MAROL_NAKA, LineIndicator.METRO));
        searchableData.add(new Station("144", MetroStationNames.AIRPORT_ROAD, MetroStationNames.AIRPORT_ROAD, LineIndicator.METRO));
        searchableData.add(new Station("145", MetroStationNames.CHAKALA, MetroStationNames.CHAKALA, LineIndicator.METRO));
        searchableData.add(new Station("146", MetroStationNames.WESTERN_EXP_HIGHWAY, MetroStationNames.WESTERN_EXP_HIGHWAY, LineIndicator.METRO));
        searchableData.add(new Station("147", MetroStationNames.ANDHERI, MetroStationNames.ANDHERI, LineIndicator.METRO));
        searchableData.add(new Station("148", MetroStationNames.AZAD_NAGAR, MetroStationNames.AZAD_NAGAR, LineIndicator.METRO));
        searchableData.add(new Station("149", MetroStationNames.D_N_NAGAR, MetroStationNames.D_N_NAGAR, LineIndicator.METRO));
        searchableData.add(new Station("150", MetroStationNames.VERSOVA, MetroStationNames.VERSOVA, LineIndicator.METRO));

        //**************METRO LINE STATION END


        //**************MONO LINE STATION START

        searchableData.add(new Station("151", MonoStationName.CHEMBUR, MonoStationName.CHEMBUR, LineIndicator.MONO));
        searchableData.add(new Station("152", MonoStationName.VPN_MARG_JUNCTION, MonoStationName.VPN_MARG_JUNCTION, LineIndicator.MONO));
        searchableData.add(new Station("153", MonoStationName.FERTILISER_TOWNSHIP, MonoStationName.FERTILISER_TOWNSHIP, LineIndicator.MONO));
        searchableData.add(new Station("154", MonoStationName.BHARAT_PERTROLEUM, MonoStationName.BHARAT_PERTROLEUM, LineIndicator.MONO));
        searchableData.add(new Station("155", MonoStationName.MYSORE_COLONY, MonoStationName.MYSORE_COLONY, LineIndicator.MONO));
        searchableData.add(new Station("156", MonoStationName.BHAKTI_PARK, MonoStationName.BHAKTI_PARK, LineIndicator.MONO));
        searchableData.add(new Station("157", MonoStationName.WADALA, MonoStationName.WADALA, LineIndicator.MONO));

        //**************MONO LINE STATION END
        return searchableData;
    }

    public void resetSuggestionsHistory() {
        for (Station station : getSearchableData()) {
            station.setmIsHistory(false);
        }
    }

    public void findSuggestions(Context context, String query, final int limit, final long simulatedDelay,
                                       final DataHelper.OnFindSuggestionsListener listener) {
        new Filter() {

            @Override
            protected FilterResults performFiltering(CharSequence constraint) {

                try {
                    Thread.sleep(simulatedDelay);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                DataHelper.resetSuggestionsHistory();
                List<Station> suggestionList = new ArrayList<>();
                if (!(constraint == null || constraint.length() == 0)) {

                    for (Station station : getSearchableData()) {
                        if (station.getBody().toUpperCase()
                                .startsWith(constraint.toString().toUpperCase())) {

                            suggestionList.add(station);
                            if (limit != -1 && suggestionList.size() == limit) {
                                break;
                            }
                        }
                    }
                }

                FilterResults results = new FilterResults();
//                Collections.sort(suggestionList, new Comparator<ColorSuggestion>() {
//                    @Override
//                    public int compare(ColorSuggestion lhs, ColorSuggestion rhs) {
//                        return lhs.getIsHistory() ? -1 : 0;
//                    }
//                });
                results.values = suggestionList;
                results.count = suggestionList.size();

                return results;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {

                if (listener != null) {
                    listener.onResults((List<ColorSuggestion>) results.values);
                }
            }
        }.filter(query);

    }


}
