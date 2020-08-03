package com.sayweee.track.platform.ga;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.sayweee.track.platform.BaseParameterIml;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    2020/8/3.
 * Desc:
 */
public class GAParameter extends BaseParameterIml {

    public GAParameter(){
        super();
    }

    @Override
    public void buildMappingParameter() {
        super.buildMappingParameter();
        addMappingParameter(LEVEL, FirebaseAnalytics.Param.LEVEL);
        addMappingParameter(SCORE, FirebaseAnalytics.Param.SCORE);
        addMappingParameter(SUCCESS, FirebaseAnalytics.Param.SUCCESS);
        addMappingParameter(PRICE, FirebaseAnalytics.Param.PRICE);
        addMappingParameter(CONTENT_TYPE, FirebaseAnalytics.Param.ITEM_CATEGORY);
        addMappingParameter(CONTENT_ID, FirebaseAnalytics.Param.ITEM_ID);
        addMappingParameter(CONTENT_LIST, FirebaseAnalytics.Param.ITEMS);
        addMappingParameter(CURRENCY, FirebaseAnalytics.Param.CURRENCY);
        addMappingParameter(QUANTITY, FirebaseAnalytics.Param.QUANTITY);
        addMappingParameter(REGISTRATION_METHOD, FirebaseAnalytics.Param.SIGN_UP_METHOD);
//        addMappingParameter(PAYMENT_INFO_AVAILIBLE, FirebaseAnalytics.Param.PAYMENT_INFO_AVAILIBLE);
//        addMappingParameter(MAX_RATING_VALUE, FirebaseAnalytics.Param.MAX_RATING_VALUE);
//        addMappingParameter(RATING_VALUE, FirebaseAnalytics.Param.RATING_VALUE);
        addMappingParameter(SEARCH_STRING, FirebaseAnalytics.Param.SEARCH_TERM);
        addMappingParameter(DATE_A, FirebaseAnalytics.Param.START_DATE);
        addMappingParameter(DATE_B, FirebaseAnalytics.Param.END_DATE);
        addMappingParameter(DESTINATION_A, FirebaseAnalytics.Param.ORIGIN);
        addMappingParameter(DESTINATION_B, FirebaseAnalytics.Param.DESTINATION);
//        addMappingParameter(DESCRIPTION, FirebaseAnalytics.Param.DESCRIPTION);
        addMappingParameter(CLASS, FirebaseAnalytics.Param.TRAVEL_CLASS);
//        addMappingParameter(EVENT_START, FirebaseAnalytics.Param.EVENT_START);
//        addMappingParameter(EVENT_END, FirebaseAnalytics.Param.EVENT_END);
//        addMappingParameter(LATITUDE, FirebaseAnalytics.Param.LATITUDE);
//        addMappingParameter(LONGTITUDE, FirebaseAnalytics.Param.LONGTITUDE);
//        addMappingParameter(CUSTOMER_USER_ID, FirebaseAnalytics.Param.CUSTOMER_USER_ID);
//        addMappingParameter(VALIDATED, FirebaseAnalytics.Param.VALIDATED);
        addMappingParameter(REVENUE, FirebaseAnalytics.Param.VALUE);
//        addMappingParameter(PROJECTED_REVENUE, FirebaseAnalytics.Param.PROJECTED_REVENUE);
        addMappingParameter(RECEIPT_ID, FirebaseAnalytics.Param.TRANSACTION_ID);
//        addMappingParameter(TUTORIAL_ID, FirebaseAnalytics.Param.TUTORIAL_ID);
        addMappingParameter(ACHIEVEMENT_ID, FirebaseAnalytics.Param.ACHIEVEMENT_ID);
        addMappingParameter(VIRTUAL_CURRENCY_NAME, FirebaseAnalytics.Param.VIRTUAL_CURRENCY_NAME);
//        addMappingParameter(DEEP_LINK, FirebaseAnalytics.Param.DEEP_LINK);
//        addMappingParameter(OLD_VERSION, FirebaseAnalytics.Param.OLD_VERSION);
//        addMappingParameter(NEW_VERSION, FirebaseAnalytics.Param.NEW_VERSION);
//        addMappingParameter(REVIEW_TEXT, FirebaseAnalytics.Param.REVIEW_TEXT);
        addMappingParameter(COUPON_CODE, FirebaseAnalytics.Param.COUPON);
//        addMappingParameter(PARAM_1, FirebaseAnalytics.Param.PARAM_1);
//        addMappingParameter(PARAM_2, FirebaseAnalytics.Param.PARAM_2);
//        addMappingParameter(PARAM_3, FirebaseAnalytics.Param.PARAM_3);
//        addMappingParameter(PARAM_4, FirebaseAnalytics.Param.PARAM_4);
//        addMappingParameter(PARAM_5, FirebaseAnalytics.Param.PARAM_5);
//        addMappingParameter(PARAM_6, FirebaseAnalytics.Param.PARAM_6);
//        addMappingParameter(PARAM_7, FirebaseAnalytics.Param.PARAM_7);
//        addMappingParameter(PARAM_8, FirebaseAnalytics.Param.PARAM_8);
//        addMappingParameter(PARAM_9, FirebaseAnalytics.Param.PARAM_9);
//        addMappingParameter(PARAM_10, FirebaseAnalytics.Param.PARAM_10);
//        addMappingParameter(ORDER_ID, FirebaseAnalytics.Param.ORDER_ID);
//        addMappingParameter(DEPARTING_DEPARTURE_DATE, FirebaseAnalytics.Param.DEPARTING_DEPARTURE_DATE);
//        addMappingParameter(RETURNING_DEPARTURE_DATE, FirebaseAnalytics.Param.RETURNING_DEPARTURE_DATE);
//        addMappingParameter(DESTINATION_LIST, FirebaseAnalytics.Param.DESTINATION_LIST);
//        addMappingParameter(CITY, FirebaseAnalytics.Param.CITY);
//        addMappingParameter(REGION, FirebaseAnalytics.Param.REGION);
//        addMappingParameter(COUNTRY, FirebaseAnalytics.Param.COUNTRY);
//        addMappingParameter(DEPARTING_ARRIVAL_DATE, FirebaseAnalytics.Param.DEPARTING_ARRIVAL_DATE);
//        addMappingParameter(RETURNING_ARRIVAL_DATE, FirebaseAnalytics.Param.RETURNING_ARRIVAL_DATE);
//        addMappingParameter(SUGGESTED_DESTINATIONS, FirebaseAnalytics.Param.SUGGESTED_DESTINATIONS);
//        addMappingParameter(TRAVEL_START, FirebaseAnalytics.Param.TRAVEL_START);
//        addMappingParameter(TRAVEL_END, FirebaseAnalytics.Param.TRAVEL_END);
//        addMappingParameter(NUM_ADULTS, FirebaseAnalytics.Param.NUM_ADULTS);
//        addMappingParameter(NUM_CHILDREN, FirebaseAnalytics.Param.NUM_CHILDREN);
//        addMappingParameter(NUM_INFANTS, FirebaseAnalytics.Param.NUM_INFANTS);
//        addMappingParameter(SUGGESTED_HOTELS, FirebaseAnalytics.Param.SUGGESTED_HOTELS);
//        addMappingParameter(USER_SCORE, FirebaseAnalytics.Param.USER_SCORE);
//        addMappingParameter(HOTEL_SCORE, FirebaseAnalytics.Param.HOTEL_SCORE);
        addMappingParameter(PURCHASE_CURRENCY, FirebaseAnalytics.Param.CURRENCY);
//        addMappingParameter(PREFERRED_STAR_RATINGS, FirebaseAnalytics.Param.PREFERRED_STAR_RATINGS);
//        addMappingParameter(PREFERRED_PRICE_RANGE, FirebaseAnalytics.Param.PREFERRED_PRICE_RANGE);
//        addMappingParameter(PREFERRED_NEIGHBORHOODS, FirebaseAnalytics.Param.PREFERRED_NEIGHBORHOODS);
//        addMappingParameter(PREFERRED_NUM_STOPS, FirebaseAnalytics.Param.PREFERRED_NUM_STOPS);
//        addMappingParameter(AF_CHANNEL, FirebaseAnalytics.Param.AF_CHANNEL);
        addMappingParameter(CONTENT, FirebaseAnalytics.Param.CONTENT);
//        addMappingParameter(AD_REVENUE_AD_TYPE, FirebaseAnalytics.Param.AD_REVENUE_AD_TYPE);
//        addMappingParameter(AD_REVENUE_NETWORK_NAME, FirebaseAnalytics.Param.AD_REVENUE_NETWORK_NAME);
//        addMappingParameter(AD_REVENUE_PLACEMENT_ID, FirebaseAnalytics.Param.AD_REVENUE_PLACEMENT_ID);
//        addMappingParameter(AD_REVENUE_AD_SIZE, FirebaseAnalytics.Param.AD_REVENUE_AD_SIZE);
//        addMappingParameter(AD_REVENUE_MEDIATED_NETWORK_NAME, FirebaseAnalytics.Param.AD_REVENUE_MEDIATED_NETWORK_NAME);
    }
}
