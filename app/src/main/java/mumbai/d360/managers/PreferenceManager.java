package mumbai.d360.managers;

import android.content.Context;
import android.content.SharedPreferences;



/**
 * Created by Ravishankar Ahirwar on 12/2/2016.
 */

public class PreferenceManager {


    public static final String PREF_SECOND_HAND = "shipper_is_secound_hand";
    public static final String ADD = "true";
    public static final String REMOVE = "false";


    //Pay within 30 min module related keys
    public static final String START_TIME = "shipper_start_time";
    public static final String IS_30_MIN_MODULE = "shipper_is_30_min";
    public static final String ORDER_NUMBER = "shipper_order_number";
    public static final String TYPE_GOODS_ID = "shipper_type_goods_id";
    public static final String GRAND_TOTAL = "shipper_grand_total";
    public static final String ORDER_DETAILS = "shipper_order_details";
    public static final String USER_BOOKING_DETAIL = "shipper_user_booking_detail";
    public static final String PAYMENT_MODE = "shipper_payment_mode";


    //UUID
    public static final String UUID = "shipper_uuid";

    //related to neft details
    public static final String NEFT_USER_NAME = "shipper_user_name";
    public static final String USER_ACCOUNT_NUMBER = "shipper_user_account_number";
    public static final String COMPANY_NAME = "shipper_company_name";
    public static final String BANK_NAME = "shipper_bank_name";
    public static final String BANK_BRANCH = "shipper_bank_branch";
    public static final String IFSC_CODE = "shipper_ifsc_code";

//    public static final String PAYMENT_DETAILS = "payment_details";
//    public static final String PAY_WITHIN_30_MIN_MODULE_NEEDS_TO_ADD = "pay_within_30_min";

    public static final String SHIPPER_ID = "shipper_shipper_id";
    public static final String[] NEFTRTGSARRAY = new String[]{NEFT_USER_NAME, USER_ACCOUNT_NUMBER, COMPANY_NAME, BANK_NAME, BANK_BRANCH, IFSC_CODE, SHIPPER_ID};
    public static final String PREF_MOBILE_NUMBER = "shipper_mobile_no";
    private static final String PREF_FILE_NAME = "shipper_preference";
    private static final String PREF_ACCESS_TOKEN = "shipper_access_token";
    private static final String PREF_USER_ID = "shipper_user_id";
    private static final String PREF_ORDER_ID = "shipper_order_id";
    private static final String PREF_GOODS_ID = "shipper_goods_id";
    private static final String PREF_GOODS_VALUE = "shipper_value_of_good";
    private static final String PREF_GOODS_NAME = "shipper_goods_name";
    private static SharedPreferences sInstance;
    private static SharedPreferences.Editor editor;
    private static PreferenceManager mSPreferenceManager;

    public static final String PREF_PICKUP_ID = "pickup_id";
    public static final String PREF_DROPOFF_ID = "dropoff_id";
    public static final String PREF_BILLING_ID = "billing_id";
    public static final String PREF_LOAD_CART_RESPONSE = "load_cart_response";
    public static final String PREF_LANGUAGE = "user_language";
    public static final String PREF_IS_NEW_USER = "is_new_user";



    private PreferenceManager() {
    }


    /**
     * @param context
     * @return
     */
    public static synchronized PreferenceManager getInstance(Context context) {
        if (mSPreferenceManager == null) {
            sInstance = context.getSharedPreferences(PREF_FILE_NAME, Context.MODE_PRIVATE);
            editor = sInstance.edit();
            mSPreferenceManager = new PreferenceManager();
        }
        return mSPreferenceManager;
    }

    /**
     * @return
     */
    public String getAccessToken() {
        String accessToken = sInstance.getString(PREF_ACCESS_TOKEN, null);
        return accessToken;
    }

    /**
     * @param accessToken
     */
    public void setAccessToken(String accessToken) {
        editor.putString(PREF_ACCESS_TOKEN, accessToken);
        editor.commit();
    }

    /**
     * @return
     */
    public String getUserId() {
        String userId = sInstance.getString(PREF_USER_ID, null);
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(String userId) {
        editor.putString(PREF_USER_ID, userId);
        editor.commit();
    }


    /**
     * @return
     */
    public String getOrderId() {
        String orderId = sInstance.getString(PREF_ORDER_ID, null);
        return orderId;
    }

    /**
     * @param orderId
     */
    public void setOrderId(String orderId) {
        editor.putString(PREF_ORDER_ID, orderId);
        editor.commit();
    }

    /**
     * @return
     */
    public String getGoodsId() {
        String goodsId = sInstance.getString(PREF_GOODS_ID, null);
        return goodsId;
    }

    /**
     * @param goodsId
     */

    public void setGoodsId(String goodsId) {
        editor.putString(PREF_GOODS_ID, goodsId);
        editor.commit();
    }

    /**
     * @return
     */
    public String getSecondHand() {
        String secondHand = sInstance.getString(PREF_SECOND_HAND, "1");//by default second hand goods not selected.
        return secondHand;
    }

    public void setSecondHand(String isSecondHand) {
        editor.putString(PREF_SECOND_HAND, isSecondHand);
        editor.commit();
    }

    public String getGoodsValue() {
        String goodsValue = sInstance.getString(PREF_GOODS_VALUE, null);
        return goodsValue;
    }

    public void setGoodsValue(String goodsValue) {
        editor.putString(PREF_GOODS_VALUE, goodsValue);
        editor.commit();
    }

    public void setGoodsName(String goodsName) {
        editor.putString(PREF_GOODS_NAME, goodsName);
        editor.commit();
    }

    public String getGoodsName(){
        String goodsName = sInstance.getString(PREF_GOODS_NAME, null);
        return goodsName;
    }
    public String getValueFromSharedPreference(String key, String value) {
        String retrivedValue = sInstance.getString(key, value);
        return retrivedValue;
    }

    public String getValueFromSharedPreference(String key) {
        return getValueFromSharedPreference(key, "");
    }

    public void setValueToSharedPreference(String key, String value) {
        editor.putString(key, value);
        editor.commit();
    }

    public void clearAllDataFromSharedPrefernces() {
        editor.clear();
        editor.commit();
    }

    public String getPickupAddressId() {
        String pickupAddressId = sInstance.getString(PREF_PICKUP_ID, null);
        return pickupAddressId;
    }

    /**
     * @param pickUpAddressId
     */
    public void setPickUpAddressId(String pickUpAddressId) {
        editor.putString(PREF_PICKUP_ID, pickUpAddressId);
        editor.commit();
    }

    public String getDropOffAddressId() {
        String dropOffAddressId = sInstance.getString(PREF_DROPOFF_ID, null);
        return dropOffAddressId;
    }

    /**
     * @param dropOffAddressId
     */
    public void setDropOffAddressId(String dropOffAddressId) {
        editor.putString(PREF_DROPOFF_ID, dropOffAddressId);
        editor.commit();
    }


    public String getBillingAddressId() {
        String dropOffAddressId = sInstance.getString(PREF_BILLING_ID, null);
        return dropOffAddressId;
    }

    /**
     * @param dropOffAddressId
     */
    public void setBillingAddressId(String dropOffAddressId) {
        editor.putString(PREF_BILLING_ID, dropOffAddressId);
        editor.commit();
    }

    public String getLoadCartResponse() {
        String loadCartResponse = sInstance.getString(PREF_LOAD_CART_RESPONSE, null);
        return loadCartResponse;
    }

    /**
     * @param loadCartResponse
     */
    public void setLoadCartResponse(String loadCartResponse) {
        editor.putString(PREF_LOAD_CART_RESPONSE, loadCartResponse);
        editor.commit();
    }

    /**
     * @return
     */
    public String getOrderNumber() {
        String orderNumber = sInstance.getString(ORDER_NUMBER, null);
        return orderNumber;
    }

    /**
     * @param orderNumber
     */
    public void setOrderNumber(String orderNumber) {
        editor.putString(ORDER_NUMBER, orderNumber);
        editor.commit();
    }

    public String getUuid() {
        String uuid = sInstance.getString(UUID, null);
        return uuid;
    }

    /**
     * @param uuid the unique id of the device
     */
    public void setUuid(String uuid) {
        editor.putString(UUID, uuid);
        editor.commit();
    }
    /**
     * @param userBookingDetail
     */
    public void setUserBookingDetail(String userBookingDetail) {
        editor.putString(USER_BOOKING_DETAIL, userBookingDetail);
        editor.commit();
    }

    public String getUserBookingDetail() {
        String userBookingDetail = sInstance.getString(USER_BOOKING_DETAIL, null);
        return userBookingDetail;
    }

    /**
     * @param paymentMode
     */
    public void setPaymentMode(String paymentMode) {
        editor.putString(PAYMENT_MODE, paymentMode);
        editor.commit();
    }

    public String getPaymentMode() {
        String paymentMode = sInstance.getString(PAYMENT_MODE, null);
        return paymentMode;
    }

    /**
     * @param languageId
     */
    public void setLanguage(int languageId) {
        editor.putInt(PREF_LANGUAGE, languageId);
        editor.commit();
    }

    public int getLanguage() {
        int languageId = sInstance.getInt(PREF_LANGUAGE, -1);
        return languageId;
    }


    public boolean isNewUser() {
        boolean newUser = sInstance.getBoolean(PREF_IS_NEW_USER, true);
        return newUser;
    }

    public void setNewUser(boolean isNewUser) {
        editor.putBoolean(PREF_IS_NEW_USER, isNewUser);
        editor.commit();
    }


}
