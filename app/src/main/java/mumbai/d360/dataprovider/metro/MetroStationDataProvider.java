package mumbai.d360.dataprovider.metro;
import mumbai.d360.model.Station;



import java.util.ArrayList;
import java.util.List;


public class MetroStationDataProvider {

	public static List<Station> sMetroStationList;


	 public static List<Station> getMetroStations(){
          sMetroStationList = new ArrayList<>();
          sMetroStationList.add(new Station("1", MetroStationNames.GHATKOPAR, MetroStationLocation.GHATKOPAR));
          sMetroStationList.add(new Station("2", MetroStationNames.JAGRUTI_NAGAR, MetroStationLocation.JAGRUTI_NAGAR));
          sMetroStationList.add(new Station("3", MetroStationNames.ASALPA, MetroStationLocation.ASALPA));
          sMetroStationList.add(new Station("4", MetroStationNames.SAKI_NAKA, MetroStationLocation.SAKI_NAKA));
          sMetroStationList.add(new Station("5", MetroStationNames.MAROL_NAKA, MetroStationLocation.MAROL_NAKA));
          sMetroStationList.add(new Station("6", MetroStationNames.AIRPORT_ROAD, MetroStationLocation.AIRPORT_ROAD));
          sMetroStationList.add(new Station("7", MetroStationNames.CHAKALA, MetroStationLocation.CHAKALA));
          sMetroStationList.add(new Station("8", MetroStationNames.WESTERN_EXP_HIGHWAY, MetroStationLocation.WESTERN_EXP_HIGHWAY));
          sMetroStationList.add(new Station("9", MetroStationNames.ANDHERI, MetroStationLocation.ANDHERI));
          sMetroStationList.add(new Station("10", MetroStationNames.AZAD_NAGAR, MetroStationLocation.AZAD_NAGAR));
          sMetroStationList.add(new Station("11", MetroStationNames.D_N_NAGAR, MetroStationLocation.D_N_NAGAR));
          sMetroStationList.add(new Station("12", MetroStationNames.VERSOVA, MetroStationLocation.VERSOVA));
		return sMetroStationList;
	 }
}
