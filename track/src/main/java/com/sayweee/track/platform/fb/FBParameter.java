package com.sayweee.track.platform.fb;

import com.facebook.appevents.AppEventsConstants;
import com.sayweee.track.platform.BaseParameterIml;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    2020/8/3.
 * Desc:
 */
public class FBParameter extends BaseParameterIml {

    public FBParameter(){
        super();
    }

    @Override
    public void buildMappingParameter() {
        super.buildMappingParameter();
        addMappingParameter(LEVEL, AppEventsConstants.EVENT_PARAM_LEVEL);
//        addMappingParameter(SCORE, AppEventsConstants.SCORE);
        addMappingParameter(SUCCESS, AppEventsConstants.EVENT_PARAM_SUCCESS);
        addMappingParameter(PRICE, AppEventsConstants.EVENT_PARAM_VALUE_TO_SUM);
        addMappingParameter(CONTENT_TYPE, AppEventsConstants.EVENT_PARAM_CONTENT_TYPE);
        addMappingParameter(CONTENT_ID, AppEventsConstants.EVENT_PARAM_CONTENT_ID);
//        addMappingParameter(CONTENT_LIST, AppEventsConstants.CONTENT_LIST);
        addMappingParameter(CURRENCY, AppEventsConstants.EVENT_PARAM_CURRENCY);
        addMappingParameter(QUANTITY, AppEventsConstants.EVENT_PARAM_NUM_ITEMS);
        addMappingParameter(REGISTRATION_METHOD, AppEventsConstants.EVENT_PARAM_REGISTRATION_METHOD);
        addMappingParameter(PAYMENT_INFO_AVAILABLE, AppEventsConstants.EVENT_PARAM_PAYMENT_INFO_AVAILABLE);
        addMappingParameter(MAX_RATING_VALUE, AppEventsConstants.EVENT_PARAM_MAX_RATING_VALUE);
        addMappingParameter(RATING_VALUE, AppEventsConstants.EVENT_PARAM_VALUE_TO_SUM);
        addMappingParameter(SEARCH_STRING, AppEventsConstants.EVENT_PARAM_SEARCH_STRING);
//        addMappingParameter(DATE_A, AppEventsConstants.DATE_A);
//        addMappingParameter(DATE_B, AppEventsConstants.DATE_B);
//        addMappingParameter(DESTINATION_A, AppEventsConstants.DESTINATION_A);
//        addMappingParameter(DESTINATION_B, AppEventsConstants.DESTINATION_B);
        addMappingParameter(DESCRIPTION, AppEventsConstants.EVENT_PARAM_DESCRIPTION);
//        addMappingParameter(CLASS, AppEventsConstants.CLASS);
//        addMappingParameter(EVENT_START, AppEventsConstants.EVENT_START);
//        addMappingParameter(EVENT_END, AppEventsConstants.EVENT_END);
//        addMappingParameter(LATITUDE, AppEventsConstants.LATITUDE);
//        addMappingParameter(LONGTITUDE, AppEventsConstants.LONGTITUDE);
//        addMappingParameter(CUSTOMER_USER_ID, AppEventsConstants.CUSTOMER_USER_ID);
//        addMappingParameter(VALIDATED, AppEventsConstants.VALIDATED);
//        addMappingParameter(REVENUE, AppEventsConstants.REVENUE);
//        addMappingParameter(PROJECTED_REVENUE, AppEventsConstants.PROJECTED_REVENUE);
//        addMappingParameter(RECEIPT_ID, AppEventsConstants.RECEIPT_ID);
//        addMappingParameter(TUTORIAL_ID, AppEventsConstants.TUTORIAL_ID);
//        addMappingParameter(ACHIEVEMENT_ID, AppEventsConstants.ACHIEVEMENT_ID);
//        addMappingParameter(VIRTUAL_CURRENCY_NAME, AppEventsConstants.VIRTUAL_CURRENCY_NAME);
//        addMappingParameter(DEEP_LINK, AppEventsConstants.DEEP_LINK);
//        addMappingParameter(OLD_VERSION, AppEventsConstants.OLD_VERSION);
//        addMappingParameter(NEW_VERSION, AppEventsConstants.NEW_VERSION);
//        addMappingParameter(REVIEW_TEXT, AppEventsConstants.REVIEW_TEXT);
//        addMappingParameter(COUPON_CODE, AppEventsConstants.COUPON_CODE);
//        addMappingParameter(PARAM_1, AppEventsConstants.PARAM_1);
//        addMappingParameter(PARAM_2, AppEventsConstants.PARAM_2);
//        addMappingParameter(PARAM_3, AppEventsConstants.PARAM_3);
//        addMappingParameter(PARAM_4, AppEventsConstants.PARAM_4);
//        addMappingParameter(PARAM_5, AppEventsConstants.PARAM_5);
//        addMappingParameter(PARAM_6, AppEventsConstants.PARAM_6);
//        addMappingParameter(PARAM_7, AppEventsConstants.PARAM_7);
//        addMappingParameter(PARAM_8, AppEventsConstants.PARAM_8);
//        addMappingParameter(PARAM_9, AppEventsConstants.PARAM_9);
//        addMappingParameter(PARAM_10, AppEventsConstants.PARAM_10);
        addMappingParameter(ORDER_ID, AppEventsConstants.EVENT_PARAM_ORDER_ID);
//        addMappingParameter(DEPARTING_DEPARTURE_DATE, AppEventsConstants.DEPARTING_DEPARTURE_DATE);
//        addMappingParameter(RETURNING_DEPARTURE_DATE, AppEventsConstants.RETURNING_DEPARTURE_DATE);
//        addMappingParameter(DESTINATION_LIST, AppEventsConstants.DESTINATION_LIST);
//        addMappingParameter(CITY, AppEventsConstants.CITY);
//        addMappingParameter(REGION, AppEventsConstants.REGION);
//        addMappingParameter(COUNTRY, AppEventsConstants.COUNTRY);
//        addMappingParameter(DEPARTING_ARRIVAL_DATE, AppEventsConstants.DEPARTING_ARRIVAL_DATE);
//        addMappingParameter(RETURNING_ARRIVAL_DATE, AppEventsConstants.RETURNING_ARRIVAL_DATE);
//        addMappingParameter(SUGGESTED_DESTINATIONS, AppEventsConstants.SUGGESTED_DESTINATIONS);
//        addMappingParameter(TRAVEL_START, AppEventsConstants.TRAVEL_START);
//        addMappingParameter(TRAVEL_END, AppEventsConstants.TRAVEL_END);
//        addMappingParameter(NUM_ADULTS, AppEventsConstants.NUM_ADULTS);
//        addMappingParameter(NUM_CHILDREN, AppEventsConstants.NUM_CHILDREN);
//        addMappingParameter(NUM_INFANTS, AppEventsConstants.NUM_INFANTS);
//        addMappingParameter(SUGGESTED_HOTELS, AppEventsConstants.SUGGESTED_HOTELS);
//        addMappingParameter(USER_SCORE, AppEventsConstants.USER_SCORE);
//        addMappingParameter(HOTEL_SCORE, AppEventsConstants.HOTEL_SCORE);
//        addMappingParameter(PURCHASE_CURRENCY, AppEventsConstants.PURCHASE_CURRENCY);
//        addMappingParameter(PREFERRED_STAR_RATINGS, AppEventsConstants.PREFERRED_STAR_RATINGS);
//        addMappingParameter(PREFERRED_PRICE_RANGE, AppEventsConstants.PREFERRED_PRICE_RANGE);
//        addMappingParameter(PREFERRED_NEIGHBORHOODS, AppEventsConstants.PREFERRED_NEIGHBORHOODS);
//        addMappingParameter(PREFERRED_NUM_STOPS, AppEventsConstants.PREFERRED_NUM_STOPS);
//        addMappingParameter(AF_CHANNEL, AppEventsConstants.AF_CHANNEL);
        addMappingParameter(CONTENT, AppEventsConstants.EVENT_PARAM_CONTENT);
        addMappingParameter(AD_REVENUE_AD_TYPE, AppEventsConstants.EVENT_PARAM_AD_TYPE);
//        addMappingParameter(AD_REVENUE_NETWORK_NAME, AppEventsConstants.AD_REVENUE_NETWORK_NAME);
//        addMappingParameter(AD_REVENUE_PLACEMENT_ID, AppEventsConstants.AD_REVENUE_PLACEMENT_ID);
//        addMappingParameter(AD_REVENUE_AD_SIZE, AppEventsConstants.AD_REVENUE_AD_SIZE);
//        addMappingParameter(AD_REVENUE_MEDIATED_NETWORK_NAME, AppEventsConstants.AD_REVENUE_MEDIATED_NETWORK_NAME);
    }
}
