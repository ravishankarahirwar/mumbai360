package mumbai.d360.database;

public interface SQLQuery {

	String CREATE_TABLE_WESTERN_LINE_STATIONS="create table "
			+Asm.WESTERN_LINE_STATIONS  + "(" + ColumnsName.STATIONS._ID + " integer primary key autoincrement, " +
			ColumnsName.STATIONS.NAME+", "+ColumnsName.STATIONS.CODE+", "+ColumnsName.STATIONS.INDICATOR+", "+
			ColumnsName.STATIONS.R1+", "+ColumnsName.STATIONS.R2+", "+ColumnsName.STATIONS.R3+", "+
			ColumnsName.STATIONS.R4+", "+ColumnsName.STATIONS.R5+", "+ColumnsName.STATIONS.LATITUDE+", "+
			ColumnsName.STATIONS.LONGITUDE+", "+ColumnsName.STATIONS.FEATURE+")";

	String CREATE_TABLE_CENTRAL_LINE_STATIONS="create table "
			+Asm.CENTRAL_LINE_STATIONS  + "(" + ColumnsName.STATIONS._ID + " integer primary key autoincrement, " +
			ColumnsName.STATIONS.NAME+", "+ColumnsName.STATIONS.CODE+", "+ColumnsName.STATIONS.INDICATOR+", "+
			ColumnsName.STATIONS.R1+", "+ColumnsName.STATIONS.R2+", "+ColumnsName.STATIONS.R3+", "+
			ColumnsName.STATIONS.R4+", "+ColumnsName.STATIONS.R5+", "+ColumnsName.STATIONS.LATITUDE+", "+
			ColumnsName.STATIONS.LONGITUDE+", "+ColumnsName.STATIONS.FEATURE+")";

	String CREATE_TABLE_HARBER_LINE_STATIONS="create table "
			+Asm.HARBER_LINE_STATIONS  + "(" + ColumnsName.STATIONS._ID + " integer primary key autoincrement, " +
			ColumnsName.STATIONS.NAME+", "+ColumnsName.STATIONS.CODE+", "+ColumnsName.STATIONS.INDICATOR+", "+
			ColumnsName.STATIONS.R1+", "+ColumnsName.STATIONS.R2+", "+ColumnsName.STATIONS.R3+", "+
			ColumnsName.STATIONS.R4+", "+ColumnsName.STATIONS.R5+", "+ColumnsName.STATIONS.LATITUDE+", "+
			ColumnsName.STATIONS.LONGITUDE+", "+ColumnsName.STATIONS.FEATURE+")";



	String CREATE_TABLE_WESTERN_UP_TRAIN_TIMETABLE="create table "
			+Asm.WESTERN_UP_TRAIN_TIMETABLE  + "(" + ColumnsName.TIMETABLE._ID + " integer primary key autoincrement, " +
			ColumnsName.TIMETABLE.TRAINKEY+", "+ColumnsName.TIMETABLE.STKEY+", "+ColumnsName.TIMETABLE.TIME+", "+
			ColumnsName.TIMETABLE.TIMEMIN+")";

	String CREATE_TABLE_CENTRAL_UP_TRAIN_TIMETABLE="create table "
			+Asm.CENTRAL_UP_TRAIN_TIMETABLE  + "(" + ColumnsName.TIMETABLE._ID + " integer primary key autoincrement, " +
			ColumnsName.TIMETABLE.TRAINKEY+", "+ColumnsName.TIMETABLE.STKEY+", "+ColumnsName.TIMETABLE.TIME+", "+
			ColumnsName.TIMETABLE.TIMEMIN+")";

	String CREATE_TABLE_HARBER_UP_TRAIN_TIMETABLE="create table "
			+Asm.HARBER_UP_TRAIN_TIMETABLE  + "(" + ColumnsName.TIMETABLE._ID + " integer primary key autoincrement, " +
			ColumnsName.TIMETABLE.TRAINKEY+", "+ColumnsName.TIMETABLE.STKEY+", "+ColumnsName.TIMETABLE.TIME+", "+
			ColumnsName.TIMETABLE.TIMEMIN+")";

	String CREATE_TABLE_WESTERN_DOWN_TRAIN_TIMETABLE="create table "
			+Asm.WESTERN_DOWN_TRAIN_TIMETABLE  + "(" + ColumnsName.TIMETABLE._ID + " integer primary key autoincrement, " +
			ColumnsName.TIMETABLE.TRAINKEY+", "+ColumnsName.TIMETABLE.STKEY+", "+ColumnsName.TIMETABLE.TIME+", "+
			ColumnsName.TIMETABLE.TIMEMIN+")";

	String CREATE_TABLE_CENTRAL_DOWN_TRAIN_TIMETABLE="create table "
			+Asm.CENTRAL_DOWN_TRAIN_TIMETABLE  + "(" + ColumnsName.TIMETABLE._ID + " integer primary key autoincrement, " +
			ColumnsName.TIMETABLE.TRAINKEY+", "+ColumnsName.TIMETABLE.STKEY+", "+ColumnsName.TIMETABLE.TIME+", "+
			ColumnsName.TIMETABLE.TIMEMIN+")";

	String CREATE_TABLE_HARBER_DOWN_TRAIN_TIMETABLE="create table "
			+Asm.HARBER_DOWN_TRAIN_TIMETABLE  + "(" + ColumnsName.TIMETABLE._ID + " integer primary key autoincrement, " +
			ColumnsName.TIMETABLE.TRAINKEY+", "+ColumnsName.TIMETABLE.STKEY+", "+ColumnsName.TIMETABLE.TIME+", "+
			ColumnsName.TIMETABLE.TIMEMIN+")";



	String CREATE_TABLE_WESTERN_UP_TRAINS="create table "
			+Asm.WESTERN_UP_TRAINS  + "(" + ColumnsName.TRAINS._ID + " integer primary key autoincrement, " +
			ColumnsName.TRAINS.TRAINKEY+", "+ColumnsName.TRAINS.STARTST+", "+ColumnsName.TRAINS.DESTST+", "+
			ColumnsName.TRAINS.CARS+", "+ColumnsName.TRAINS.FEATURE+", "+ColumnsName.TRAINS.SPEED+")";

	String CREATE_TABLE_CENTRAL_UP_TRAINS="create table "
			+Asm.CENTRAL_UP_TRAINS  + "(" + ColumnsName.TRAINS._ID + " integer primary key autoincrement, " +
			ColumnsName.TRAINS.TRAINKEY+", "+ColumnsName.TRAINS.STARTST+", "+ColumnsName.TRAINS.DESTST+", "+
			ColumnsName.TRAINS.CARS+", "+ColumnsName.TRAINS.FEATURE+", "+ColumnsName.TRAINS.SPEED+")";

	String CREATE_TABLE_HARBER_UP_TRAINS="create table "
			+Asm.HARBER_UP_TRAINS  + "(" + ColumnsName.TRAINS._ID + " integer primary key autoincrement, " +
			ColumnsName.TRAINS.TRAINKEY+", "+ColumnsName.TRAINS.STARTST+", "+ColumnsName.TRAINS.DESTST+", "+
			ColumnsName.TRAINS.CARS+", "+ColumnsName.TRAINS.FEATURE+", "+ColumnsName.TRAINS.SPEED+")";

	String CREATE_TABLE_WESTERN_DOWN_TRAINS="create table "
			+Asm.WESTERN_DOWN_TRAINS  + "(" + ColumnsName.TRAINS._ID + " integer primary key autoincrement, " +
			ColumnsName.TRAINS.TRAINKEY+", "+ColumnsName.TRAINS.STARTST+", "+ColumnsName.TRAINS.DESTST+", "+
			ColumnsName.TRAINS.CARS+", "+ColumnsName.TRAINS.FEATURE+", "+ColumnsName.TRAINS.SPEED+")";

	String CREATE_TABLE_CENTRAL_DOWN_TRAINS="create table "
			+Asm.CENTRAL_DOWN_TRAINS  + "(" + ColumnsName.TRAINS._ID + " integer primary key autoincrement, " +
			ColumnsName.TRAINS.TRAINKEY+", "+ColumnsName.TRAINS.STARTST+", "+ColumnsName.TRAINS.DESTST+", "+
			ColumnsName.TRAINS.CARS+", "+ColumnsName.TRAINS.FEATURE+", "+ColumnsName.TRAINS.SPEED+")";

	String CREATE_TABLE_HARBER_DOWN_TRAINS="create table "
			+Asm.HARBER_DOWN_TRAINS  + "(" + ColumnsName.TRAINS._ID + " integer primary key autoincrement, " +
			ColumnsName.TRAINS.TRAINKEY+", "+ColumnsName.TRAINS.STARTST+", "+ColumnsName.TRAINS.DESTST+", "+
			ColumnsName.TRAINS.CARS+", "+ColumnsName.TRAINS.FEATURE+", "+ColumnsName.TRAINS.SPEED+")";

/**Metro Train Data Base Creation START*/

	String CREATE_TABLE_METRO_UP_TRAIN_TIMETABLE="create table "
			+Asm.METRO_UP_TRAIN_TIMETABLE  + "(" + ColumnsName.TIMETABLE._ID + " integer primary key autoincrement, " +
			ColumnsName.TIMETABLE.TRAINKEY+", "+ColumnsName.TIMETABLE.STKEY+", "+ColumnsName.TIMETABLE.TIME+", "+
			ColumnsName.TIMETABLE.TIMEMIN+")";

	String CREATE_TABLE_METRO_DOWN_TRAIN_TIMETABLE="create table "
			+Asm.METRO_DOWN_TRAIN_TIMETABLE  + "(" + ColumnsName.TIMETABLE._ID + " integer primary key autoincrement, " +
			ColumnsName.TIMETABLE.TRAINKEY+", "+ColumnsName.TIMETABLE.STKEY+", "+ColumnsName.TIMETABLE.TIME+", "+
			ColumnsName.TIMETABLE.TIMEMIN+")";

	/**MONO Train Data Base Creation START*/

	String CREATE_TABLE_MONO_UP_TRAIN_TIMETABLE="create table "
			+Asm.MONO_UP_TRAIN_TIMETABLE  + "(" + ColumnsName.TIMETABLE._ID + " integer primary key autoincrement, " +
			ColumnsName.TIMETABLE.TRAINKEY+", "+ColumnsName.TIMETABLE.STKEY+", "+ColumnsName.TIMETABLE.TIME+", "+
			ColumnsName.TIMETABLE.TIMEMIN+")";

	String CREATE_TABLE_MONO_DOWN_TRAIN_TIMETABLE="create table "
			+Asm.MONO_DOWN_TRAIN_TIMETABLE  + "(" + ColumnsName.TIMETABLE._ID + " integer primary key autoincrement, " +
			ColumnsName.TIMETABLE.TRAINKEY+", "+ColumnsName.TIMETABLE.STKEY+", "+ColumnsName.TIMETABLE.TIME+", "+
			ColumnsName.TIMETABLE.TIMEMIN+")";
}
