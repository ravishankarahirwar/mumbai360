package mumbai.d360.dataprovider.mono;

import java.util.ArrayList;
import java.util.List;

import mumbai.d360.model.Station;
import mumbai.d360.utils.LineIndicator;

public class MonoStationDataProvider {

    public static List<Station> sMonoStationList;



	 public static List<Station> getMonoStation(){
         sMonoStationList = new ArrayList<>();
         sMonoStationList.add(new Station("1", MonoStationName.CHEMBUR, MonoStationLocation.CHEMBUR, LineIndicator.MONO));
          sMonoStationList.add(new Station("2", MonoStationName.VPN_MARG_JUNCTION, MonoStationLocation.VNP_MARG, LineIndicator.MONO));
          sMonoStationList.add(new Station("3", MonoStationName.FERTILISER_TOWNSHIP, MonoStationLocation.FERTILISER_TOWNSHIP, LineIndicator.MONO));
          sMonoStationList.add(new Station("4", MonoStationName.BHARAT_PERTROLEUM, MonoStationLocation.BHARAT_PETROLEUM, LineIndicator.MONO));
          sMonoStationList.add(new Station("5", MonoStationName.MYSORE_COLONY, MonoStationLocation.MYSORE_COLONY, LineIndicator.MONO));
          sMonoStationList.add(new Station("6", MonoStationName.BHAKTI_PARK, MonoStationLocation.BHAKTI_PARK, LineIndicator.MONO));
          sMonoStationList.add(new Station("7", MonoStationName.WADALA, MonoStationLocation.WADALA, LineIndicator.MONO));
		return sMonoStationList;
	 }
}
