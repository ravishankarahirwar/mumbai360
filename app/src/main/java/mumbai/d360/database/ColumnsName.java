package mumbai.d360.database;

public class ColumnsName {

	public interface STATIONS {
		String _ID="_id";
		String INDICATOR="indicator";
		String NAME="name";
		String FEATURE="feature";
		String LONGITUDE="longitude";
		String LATITUDE="latitude";
		String CODE="code";
		String R1="r1";
		String R2="r2";
		String R3="r3";
		String R4="r4";
		String R5="r5";
	}

	public interface TIMETABLE {
		String _ID="_id";
		String TRAINKEY="trainkey";
		String TIME="time";
		String STKEY="stkey";
		String TIMEMIN="timemin";

	}

	public interface TRAINS {
		String _ID="_id";
		String DESTST="destst";
		String STARTST="startst";
		String FEATURE="feature";
		String TRAINKEY="trainkey";
		String SPEED="speed";
		String CARS="cars";

	}




}
