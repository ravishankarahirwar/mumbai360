package mumbai.d360.dataprovider.mono;

import android.database.MatrixCursor;

import java.util.ArrayList;
import java.util.List;

import mumbai.d360.model.Station;
import mumbai.d360.utils.LineIndicator;

public class MonoStationDataProvider {

    public static List<Station> sMetroStationList;



	 public static List<Station> getMonoStation(){
         sMetroStationList = new ArrayList<>();
         sMetroStationList.add(new Station("1", MonoStationName.CHEMBUR, MonoStationLocation.CHEMBUR, LineIndicator.METRO));
          sMetroStationList.add(new Station("2", MonoStationName.VPN_MARG_JUNCTION,MonoStationLocation.VNP_MARG, LineIndicator.METRO));
          sMetroStationList.add(new Station("3", MonoStationName.FERTILISER_TOWNSHIP,MonoStationLocation.FERTILISER_TOWNSHIP, LineIndicator.METRO));
          sMetroStationList.add(new Station("4", MonoStationName.BHARAT_PERTROLEUM,MonoStationLocation.BHARAT_PETROLEUM, LineIndicator.METRO));
          sMetroStationList.add(new Station("5", MonoStationName.MYSORE_COLONY,MonoStationLocation.MYSORE_COLONY, LineIndicator.METRO));
          sMetroStationList.add(new Station("6", MonoStationName.BHAKTI_PARK,MonoStationLocation.BHAKTI_PARK, LineIndicator.METRO));
          sMetroStationList.add(new Station("7", MonoStationName.WADALA,MonoStationLocation.WADALA, LineIndicator.METRO));
		return sMetroStationList;
	 }
}
