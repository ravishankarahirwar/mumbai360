package mumbai.d360.database.offlinedb;

import android.provider.BaseColumns;

/**
 * Created by ravi on 16-2-28.
 */
public class Favourite {
    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    public Favourite() {}

    /* Inner class that defines the table contents */
    public static abstract class FavouriteEntry implements BaseColumns {
        public static final String TABLE_NAME = "favourite";
        public static final String COLUMN_NAME_MESSAGE_ID = "message_id";
        public static final String COLUMN_NAME_CATEGORY_ID = "category_id";
        public static final String COLUMN_NAME_MESSAGE = "message";
    }
}
