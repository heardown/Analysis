package com.sayweee.track.platform.af;

import com.appsflyer.AFInAppEventParameterName;
import com.sayweee.track.platform.BaseParameterIml;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    2020/8/3.
 * Desc:
 */
public class AppsFlyerParameter extends BaseParameterIml {

    public AppsFlyerParameter(){
        super();
    }

    @Override
    public void buildMappingParameter() {
        super.buildMappingParameter();
        addMappingParameter(LEVEL, AFInAppEventParameterName.LEVEL);
        addMappingParameter(SCORE, AFInAppEventParameterName.SCORE);
        addMappingParameter(SUCCESS, AFInAppEventParameterName.SUCCESS);
        addMappingParameter(PRICE, AFInAppEventParameterName.PRICE);
        addMappingParameter(CONTENT_TYPE, AFInAppEventParameterName.CONTENT_TYPE);
        addMappingParameter(CONTENT_ID, AFInAppEventParameterName.CONTENT_ID);
        addMappingParameter(CONTENT_LIST, AFInAppEventParameterName.CONTENT_LIST);
        addMappingParameter(CURRENCY, AFInAppEventParameterName.CURRENCY);
        addMappingParameter(QUANTITY, AFInAppEventParameterName.QUANTITY);
        addMappingParameter(REGISTRATION_METHOD, AFInAppEventParameterName.REGSITRATION_METHOD);
        addMappingParameter(PAYMENT_INFO_AVAILABLE, AFInAppEventParameterName.PAYMENT_INFO_AVAILIBLE);
        addMappingParameter(MAX_RATING_VALUE, AFInAppEventParameterName.MAX_RATING_VALUE);
        addMappingParameter(RATING_VALUE, AFInAppEventParameterName.RATING_VALUE);
        addMappingParameter(SEARCH_STRING, AFInAppEventParameterName.SEARCH_STRING);
        addMappingParameter(DATE_A, AFInAppEventParameterName.DATE_A);
        addMappingParameter(DATE_B, AFInAppEventParameterName.DATE_B);
        addMappingParameter(DESTINATION_A, AFInAppEventParameterName.DESTINATION_A);
        addMappingParameter(DESTINATION_B, AFInAppEventParameterName.DESTINATION_B);
        addMappingParameter(DESCRIPTION, AFInAppEventParameterName.DESCRIPTION);
        addMappingParameter(CLASS, AFInAppEventParameterName.CLASS);
        addMappingParameter(EVENT_START, AFInAppEventParameterName.EVENT_START);
        addMappingParameter(EVENT_END, AFInAppEventParameterName.EVENT_END);
        addMappingParameter(LATITUDE, AFInAppEventParameterName.LATITUDE);
        addMappingParameter(LONGTITUDE, AFInAppEventParameterName.LONGTITUDE);
        addMappingParameter(CUSTOMER_USER_ID, AFInAppEventParameterName.CUSTOMER_USER_ID);
        addMappingParameter(VALIDATED, AFInAppEventParameterName.VALIDATED);
        addMappingParameter(REVENUE, AFInAppEventParameterName.REVENUE);
        addMappingParameter(PROJECTED_REVENUE, AFInAppEventParameterName.PROJECTED_REVENUE);
        addMappingParameter(RECEIPT_ID, AFInAppEventParameterName.RECEIPT_ID);
        addMappingParameter(TUTORIAL_ID, AFInAppEventParameterName.TUTORIAL_ID);
        addMappingParameter(ACHIEVEMENT_ID, AFInAppEventParameterName.ACHIEVEMENT_ID);
        addMappingParameter(VIRTUAL_CURRENCY_NAME, AFInAppEventParameterName.VIRTUAL_CURRENCY_NAME);
        addMappingParameter(DEEP_LINK, AFInAppEventParameterName.DEEP_LINK);
        addMappingParameter(OLD_VERSION, AFInAppEventParameterName.OLD_VERSION);
        addMappingParameter(NEW_VERSION, AFInAppEventParameterName.NEW_VERSION);
        addMappingParameter(REVIEW_TEXT, AFInAppEventParameterName.REVIEW_TEXT);
        addMappingParameter(COUPON_CODE, AFInAppEventParameterName.COUPON_CODE);
        addMappingParameter(PARAM_1, AFInAppEventParameterName.PARAM_1);
        addMappingParameter(PARAM_2, AFInAppEventParameterName.PARAM_2);
        addMappingParameter(PARAM_3, AFInAppEventParameterName.PARAM_3);
        addMappingParameter(PARAM_4, AFInAppEventParameterName.PARAM_4);
        addMappingParameter(PARAM_5, AFInAppEventParameterName.PARAM_5);
        addMappingParameter(PARAM_6, AFInAppEventParameterName.PARAM_6);
        addMappingParameter(PARAM_7, AFInAppEventParameterName.PARAM_7);
        addMappingParameter(PARAM_8, AFInAppEventParameterName.PARAM_8);
        addMappingParameter(PARAM_9, AFInAppEventParameterName.PARAM_9);
        addMappingParameter(PARAM_10, AFInAppEventParameterName.PARAM_10);
        addMappingParameter(ORDER_ID, AFInAppEventParameterName.ORDER_ID);
        addMappingParameter(DEPARTING_DEPARTURE_DATE, AFInAppEventParameterName.DEPARTING_DEPARTURE_DATE);
        addMappingParameter(RETURNING_DEPARTURE_DATE, AFInAppEventParameterName.RETURNING_DEPARTURE_DATE);
        addMappingParameter(DESTINATION_LIST, AFInAppEventParameterName.DESTINATION_LIST);
        addMappingParameter(CITY, AFInAppEventParameterName.CITY);
        addMappingParameter(REGION, AFInAppEventParameterName.REGION);
        addMappingParameter(COUNTRY, AFInAppEventParameterName.COUNTRY);
        addMappingParameter(DEPARTING_ARRIVAL_DATE, AFInAppEventParameterName.DEPARTING_ARRIVAL_DATE);
        addMappingParameter(RETURNING_ARRIVAL_DATE, AFInAppEventParameterName.RETURNING_ARRIVAL_DATE);
        addMappingParameter(SUGGESTED_DESTINATIONS, AFInAppEventParameterName.SUGGESTED_DESTINATIONS);
        addMappingParameter(TRAVEL_START, AFInAppEventParameterName.TRAVEL_START);
        addMappingParameter(TRAVEL_END, AFInAppEventParameterName.TRAVEL_END);
        addMappingParameter(NUM_ADULTS, AFInAppEventParameterName.NUM_ADULTS);
        addMappingParameter(NUM_CHILDREN, AFInAppEventParameterName.NUM_CHILDREN);
        addMappingParameter(NUM_INFANTS, AFInAppEventParameterName.NUM_INFANTS);
        addMappingParameter(SUGGESTED_HOTELS, AFInAppEventParameterName.SUGGESTED_HOTELS);
        addMappingParameter(USER_SCORE, AFInAppEventParameterName.USER_SCORE);
        addMappingParameter(HOTEL_SCORE, AFInAppEventParameterName.HOTEL_SCORE);
        addMappingParameter(PURCHASE_CURRENCY, AFInAppEventParameterName.PURCHASE_CURRENCY);
        addMappingParameter(PREFERRED_STAR_RATINGS, AFInAppEventParameterName.PREFERRED_STAR_RATINGS);
        addMappingParameter(PREFERRED_PRICE_RANGE, AFInAppEventParameterName.PREFERRED_PRICE_RANGE);
        addMappingParameter(PREFERRED_NEIGHBORHOODS, AFInAppEventParameterName.PREFERRED_NEIGHBORHOODS);
        addMappingParameter(PREFERRED_NUM_STOPS, AFInAppEventParameterName.PREFERRED_NUM_STOPS);
        addMappingParameter(AF_CHANNEL, AFInAppEventParameterName.AF_CHANNEL);
        addMappingParameter(CONTENT, AFInAppEventParameterName.CONTENT);
        addMappingParameter(AD_REVENUE_AD_TYPE, AFInAppEventParameterName.AD_REVENUE_AD_TYPE);
        addMappingParameter(AD_REVENUE_NETWORK_NAME, AFInAppEventParameterName.AD_REVENUE_NETWORK_NAME);
        addMappingParameter(AD_REVENUE_PLACEMENT_ID, AFInAppEventParameterName.AD_REVENUE_PLACEMENT_ID);
        addMappingParameter(AD_REVENUE_AD_SIZE, AFInAppEventParameterName.AD_REVENUE_AD_SIZE);
        addMappingParameter(AD_REVENUE_MEDIATED_NETWORK_NAME, AFInAppEventParameterName.AD_REVENUE_MEDIATED_NETWORK_NAME);
    }
}
