package com.sayweee.track.model;

import com.sayweee.track.convert.IConvert;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    20120/7/16.
 * Desc:    标准事件参数
 */
public interface IEventParameter extends IConvert {

    String LEVEL = "af_level";
    String SCORE = "af_score";
    String SUCCESS = "af_success";
    String PRICE = "af_price";
    String CONTENT_TYPE = "af_content_type";
    String CONTENT_ID = "af_content_id";
    String CONTENT_LIST = "af_content_list";
    String CURRENCY = "af_currency";
    String QUANTITY = "af_quantity";
    String REGISTRATION_METHOD = "af_registration_method";
    String PAYMENT_INFO_AVAILABLE = "af_payment_info_available";
    String MAX_RATING_VALUE = "af_max_rating_value";
    String RATING_VALUE = "af_rating_value";
    String SEARCH_STRING = "af_search_string";
    String DATE_A = "af_date_a";
    String DATE_B = "af_date_b";
    String DESTINATION_A = "af_destination_a";
    String DESTINATION_B = "af_destination_b";
    String DESCRIPTION = "af_description";
    String CLASS = "af_class";
    String EVENT_START = "af_event_start";
    String EVENT_END = "af_event_end";
    String LATITUDE = "af_lat";
    String LONGTITUDE = "af_long";
    String CUSTOMER_USER_ID = "af_customer_user_id";
    String VALIDATED = "af_validated";
    String REVENUE = "af_revenue";
    String PROJECTED_REVENUE = "af_projected_revenue";
    String RECEIPT_ID = "af_receipt_id";
    String TUTORIAL_ID = "af_tutorial_id";
    String ACHIEVEMENT_ID = "af_achievement_id";
    String VIRTUAL_CURRENCY_NAME = "af_virtual_currency_name";
    String DEEP_LINK = "af_deep_link";
    String OLD_VERSION = "af_old_version";
    String NEW_VERSION = "af_new_version";
    String REVIEW_TEXT = "af_review_text";
    String COUPON_CODE = "af_coupon_code";
    String PARAM_1 = "af_param_1";
    String PARAM_2 = "af_param_2";
    String PARAM_3 = "af_param_3";
    String PARAM_4 = "af_param_4";
    String PARAM_5 = "af_param_5";
    String PARAM_6 = "af_param_6";
    String PARAM_7 = "af_param_7";
    String PARAM_8 = "af_param_8";
    String PARAM_9 = "af_param_9";
    String PARAM_10 = "af_param_10";
    String ORDER_ID = "af_order_id";
    String DEPARTING_DEPARTURE_DATE = "af_departing_departure_date";
    String RETURNING_DEPARTURE_DATE = "af_returning_departure_date";
    String DESTINATION_LIST = "af_destination_list";
    String CITY = "af_city";
    String REGION = "af_region";
    String COUNTRY = "af_country";
    String DEPARTING_ARRIVAL_DATE = "af_departing_arrival_date";
    String RETURNING_ARRIVAL_DATE = "af_returning_arrival_date";
    String SUGGESTED_DESTINATIONS = "af_suggested_destinations";
    String TRAVEL_START = "af_travel_start";
    String TRAVEL_END = "af_travel_end";
    String NUM_ADULTS = "af_num_adults";
    String NUM_CHILDREN = "af_num_children";
    String NUM_INFANTS = "af_num_infants";
    String SUGGESTED_HOTELS = "af_suggested_hotels";
    String USER_SCORE = "af_user_score";
    String HOTEL_SCORE = "af_hotel_score";
    String PURCHASE_CURRENCY = "af_purchase_currency";
    String PREFERRED_STAR_RATINGS = "af_preferred_star_ratings";
    String PREFERRED_PRICE_RANGE = "af_preferred_price_range";
    String PREFERRED_NEIGHBORHOODS = "af_preferred_neighborhoods";
    String PREFERRED_NUM_STOPS = "af_preferred_num_stops";
    String AF_CHANNEL = "af_channel";
    String CONTENT = "af_content";
    String AD_REVENUE_AD_TYPE = "af_adrev_ad_type";
    String AD_REVENUE_NETWORK_NAME = "af_adrev_network_name";
    String AD_REVENUE_PLACEMENT_ID = "af_adrev_placement_id";
    String AD_REVENUE_AD_SIZE = "af_adrev_ad_size";
    String AD_REVENUE_MEDIATED_NETWORK_NAME = "af_adrev_mediated_network_name";

    void buildMappingParameter();

    void addMappingParameter(String key, String value);

    void replaceMappingParameter(String key, String value);

    void removeMappingParameter(String key);
}
