package com.sayweee.track.platform.ga;

import com.appsflyer.AFInAppEventType;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sayweee.track.platform.BaseEventIml;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    2020/7/20.
 * Desc:
 */
public class GAEvent extends BaseEventIml {

    public GAEvent() {
        super();
    }

    @Override
    public void buildMappingEvent() {
        super.buildMappingEvent();
        addMappingEvent(LEVEL_ACHIEVED, FirebaseAnalytics.Event.LEVEL_UP);
        addMappingEvent(ADD_PAYMENT_INFO, FirebaseAnalytics.Event.ADD_PAYMENT_INFO);
        addMappingEvent(ADD_TO_CART, FirebaseAnalytics.Event.ADD_TO_CART);
        addMappingEvent(ADD_TO_WISH_LIST, FirebaseAnalytics.Event.ADD_TO_WISHLIST);
        addMappingEvent(COMPLETE_REGISTRATION, FirebaseAnalytics.Event.SIGN_UP);
        addMappingEvent(TUTORIAL_COMPLETION, FirebaseAnalytics.Event.TUTORIAL_COMPLETE);
        addMappingEvent(INITIATED_CHECKOUT, FirebaseAnalytics.Event.BEGIN_CHECKOUT);
        addMappingEvent(PURCHASE, FirebaseAnalytics.Event.PURCHASE);
//        addMappingEvent(RATE, FirebaseAnalytics.Event.RATE);
        addMappingEvent(SEARCH, FirebaseAnalytics.Event.SEARCH);
        addMappingEvent(SPENT_CREDIT, FirebaseAnalytics.Event.SPEND_VIRTUAL_CURRENCY);
        addMappingEvent(ACHIEVEMENT_UNLOCKED, FirebaseAnalytics.Event.UNLOCK_ACHIEVEMENT);
        addMappingEvent(CONTENT_VIEW, FirebaseAnalytics.Event.VIEW_ITEM);
        addMappingEvent(TRAVEL_BOOKING, FirebaseAnalytics.Event.ECOMMERCE_PURCHASE);
        addMappingEvent(SHARE, FirebaseAnalytics.Event.SHARE);
//        addMappingEvent(INVITE, FirebaseAnalytics.Event.INVITE);
        addMappingEvent(LOGIN, FirebaseAnalytics.Event.LOGIN);
//        addMappingEvent(RE_ENGAGE, FirebaseAnalytics.Event.RE_ENGAGE);
//        addMappingEvent(UPDATE, FirebaseAnalytics.Event.UPDATE);
//        addMappingEvent(OPENED_FROM_PUSH_NOTIFICATION, FirebaseAnalytics.Event.OPENED_FROM_PUSH_NOTIFICATION);
//        addMappingEvent(LOCATION_CHANGED, FirebaseAnalytics.Event.LOCATION_CHANGED);
//        addMappingEvent(LOCATION_COORDINATES, FirebaseAnalytics.Event.LOCATION_COORDINATES);
//        addMappingEvent(ORDER_ID, FirebaseAnalytics.Event.ORDER_ID);
//        addMappingEvent(CUSTOMER_SEGMENT, FirebaseAnalytics.Event.CUSTOMER_SEGMENT);
        addMappingEvent(LIST_VIEW, FirebaseAnalytics.Event.VIEW_ITEM_LIST);
//        addMappingEvent(SUBSCRIBE, FirebaseAnalytics.Event.SUBSCRIBE);
//        addMappingEvent(START_TRIAL, FirebaseAnalytics.Event.START_TRIAL);
//        addMappingEvent(AD_CLICK, FirebaseAnalytics.Event.AD_CLICK);
//        addMappingEvent(AD_VIEW, FirebaseAnalytics.Event.AD_VIEW);
    }

}
