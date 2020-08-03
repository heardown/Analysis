package com.sayweee.track.platform.af;

import com.appsflyer.AFInAppEventType;
import com.sayweee.track.platform.BaseEventIml;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    2020/7/20.
 * Desc:
 */
public class AppsFlyerEvent extends BaseEventIml {

    public AppsFlyerEvent() {
        super();
    }

    @Override
    public void buildMappingEvent() {
        super.buildMappingEvent();
        addMappingEvent(LEVEL_ACHIEVED, AFInAppEventType.LEVEL_ACHIEVED);
        addMappingEvent(ADD_PAYMENT_INFO, AFInAppEventType.ADD_PAYMENT_INFO);
        addMappingEvent(ADD_TO_CART, AFInAppEventType.ADD_TO_CART);
        addMappingEvent(ADD_TO_WISH_LIST, AFInAppEventType.ADD_TO_WISH_LIST);
        addMappingEvent(COMPLETE_REGISTRATION, AFInAppEventType.COMPLETE_REGISTRATION);
        addMappingEvent(TUTORIAL_COMPLETION, AFInAppEventType.TUTORIAL_COMPLETION);
        addMappingEvent(INITIATED_CHECKOUT, AFInAppEventType.INITIATED_CHECKOUT);
        addMappingEvent(PURCHASE, AFInAppEventType.PURCHASE);
        addMappingEvent(RATE, AFInAppEventType.RATE);
        addMappingEvent(SEARCH, AFInAppEventType.SEARCH);
        addMappingEvent(SPENT_CREDIT, AFInAppEventType.SPENT_CREDIT);
        addMappingEvent(ACHIEVEMENT_UNLOCKED, AFInAppEventType.ACHIEVEMENT_UNLOCKED);
        addMappingEvent(CONTENT_VIEW, AFInAppEventType.CONTENT_VIEW);
        addMappingEvent(TRAVEL_BOOKING, AFInAppEventType.TRAVEL_BOOKING);
        addMappingEvent(SHARE, AFInAppEventType.SHARE);
        addMappingEvent(INVITE, AFInAppEventType.INVITE);
        addMappingEvent(LOGIN, AFInAppEventType.LOGIN);
        addMappingEvent(RE_ENGAGE, AFInAppEventType.RE_ENGAGE);
        addMappingEvent(UPDATE, AFInAppEventType.UPDATE);
        addMappingEvent(OPENED_FROM_PUSH_NOTIFICATION, AFInAppEventType.OPENED_FROM_PUSH_NOTIFICATION);
        addMappingEvent(LOCATION_CHANGED, AFInAppEventType.LOCATION_CHANGED);
        addMappingEvent(LOCATION_COORDINATES, AFInAppEventType.LOCATION_COORDINATES);
        addMappingEvent(ORDER_ID, AFInAppEventType.ORDER_ID);
        addMappingEvent(CUSTOMER_SEGMENT, AFInAppEventType.CUSTOMER_SEGMENT);
        addMappingEvent(LIST_VIEW, AFInAppEventType.LIST_VIEW);
        addMappingEvent(SUBSCRIBE, AFInAppEventType.SUBSCRIBE);
        addMappingEvent(START_TRIAL, AFInAppEventType.START_TRIAL);
        addMappingEvent(AD_CLICK, AFInAppEventType.AD_CLICK);
        addMappingEvent(AD_VIEW, AFInAppEventType.AD_VIEW);
    }

}
