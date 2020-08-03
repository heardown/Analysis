package com.sayweee.track.platform.fb;

import com.facebook.appevents.AppEventsConstants;
import com.sayweee.track.platform.BaseEventIml;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    2020/7/20.
 * Desc:
 */
public class FBEvent extends BaseEventIml {

    public FBEvent() {
        super();
    }

    @Override
    public void buildMappingEvent() {
        super.buildMappingEvent();
        addMappingEvent(LEVEL_ACHIEVED, AppEventsConstants.EVENT_NAME_ACHIEVED_LEVEL);
        addMappingEvent(ADD_PAYMENT_INFO, AppEventsConstants.EVENT_NAME_ADDED_PAYMENT_INFO);
        addMappingEvent(ADD_TO_CART, AppEventsConstants.EVENT_NAME_ADDED_TO_CART);
        addMappingEvent(ADD_TO_WISH_LIST, AppEventsConstants.EVENT_NAME_ADDED_TO_WISHLIST);
        addMappingEvent(COMPLETE_REGISTRATION, AppEventsConstants.EVENT_NAME_COMPLETED_REGISTRATION);
        addMappingEvent(TUTORIAL_COMPLETION, AppEventsConstants.EVENT_NAME_COMPLETED_TUTORIAL);
        addMappingEvent(INITIATED_CHECKOUT, AppEventsConstants.EVENT_NAME_INITIATED_CHECKOUT);
        addMappingEvent(PURCHASE, AppEventsConstants.EVENT_NAME_PURCHASED);
        addMappingEvent(RATE, AppEventsConstants.EVENT_NAME_RATED);
        addMappingEvent(SEARCH, AppEventsConstants.EVENT_NAME_SEARCHED);
        addMappingEvent(SPENT_CREDIT, AppEventsConstants.EVENT_NAME_SPENT_CREDITS);
        addMappingEvent(ACHIEVEMENT_UNLOCKED, AppEventsConstants.EVENT_NAME_UNLOCKED_ACHIEVEMENT);
        addMappingEvent(CONTENT_VIEW, AppEventsConstants.EVENT_NAME_VIEWED_CONTENT);
        addMappingEvent(TRAVEL_BOOKING, AppEventsConstants.EVENT_NAME_PURCHASED);
//        addMappingEvent(SHARE, AppEventsConstants.SHARE);
//        addMappingEvent(INVITE, AppEventsConstants.INVITE);
//        addMappingEvent(LOGIN, AppEventsConstants.LOGIN);
//        addMappingEvent(RE_ENGAGE, AppEventsConstants.RE_ENGAGE);
//        addMappingEvent(UPDATE, AppEventsConstants.UPDATE);
//        addMappingEvent(OPENED_FROM_PUSH_NOTIFICATION, AppEventsConstants.OPENED_FROM_PUSH_NOTIFICATION);
//        addMappingEvent(LOCATION_CHANGED, AppEventsConstants.LOCATION_CHANGED);
//        addMappingEvent(LOCATION_COORDINATES, AppEventsConstants.LOCATION_COORDINATES);
//        addMappingEvent(ORDER_ID, AppEventsConstants.ORDER_ID);
//        addMappingEvent(CUSTOMER_SEGMENT, AppEventsConstants.CUSTOMER_SEGMENT);
//        addMappingEvent(LIST_VIEW, AppEventsConstants.LIST_VIEW);
        addMappingEvent(SUBSCRIBE, AppEventsConstants.EVENT_NAME_SUBSCRIBE);
        addMappingEvent(START_TRIAL, AppEventsConstants.EVENT_NAME_START_TRIAL);
        addMappingEvent(AD_CLICK, AppEventsConstants.EVENT_NAME_AD_CLICK);
        addMappingEvent(AD_VIEW, AppEventsConstants.EVENT_NAME_AD_IMPRESSION);
    }

}
