package com.sayweee.track.model;

import com.appsflyer.AFInAppEventType;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    2020/7/20.
 * Desc:
 */
public class AppsFlyerEvent implements IEvent {

    @Override
    public String mapping(String event) {
        if (event != null) {
            switch (event) {
                case EVENT_LEVEL_ACHIEVED:
                    return AFInAppEventType.LEVEL_ACHIEVED;
                case EVENT_ADD_PAYMENT_INFO:
                    return AFInAppEventType.ADD_PAYMENT_INFO;
                case EVENT_ADD_TO_CART:
                    return AFInAppEventType.ADD_TO_CART;
                case EVENT_ADD_TO_WISH_LIST:
                    return AFInAppEventType.ADD_TO_WISH_LIST;
                case EVENT_COMPLETE_REGISTRATION:
                    return AFInAppEventType.COMPLETE_REGISTRATION;
                case EVENT_TUTORIAL_COMPLETION:
                    return AFInAppEventType.TUTORIAL_COMPLETION;
                case EVENT_INITIATED_CHECKOUT:
                    return AFInAppEventType.INITIATED_CHECKOUT;
                case EVENT_PURCHASE:
                    return AFInAppEventType.PURCHASE;
                case EVENT_RATE:
                    return AFInAppEventType.RATE;
                case EVENT_SEARCH:
                    return AFInAppEventType.SEARCH;
                case EVENT_SPENT_CREDIT:
                    return AFInAppEventType.SPENT_CREDIT;
                case EVENT_ACHIEVEMENT_UNLOCKED:
                    return AFInAppEventType.ACHIEVEMENT_UNLOCKED;
                case EVENT_CONTENT_VIEW:
                    return AFInAppEventType.CONTENT_VIEW;
                case EVENT_TRAVEL_BOOKING:
                    return AFInAppEventType.TRAVEL_BOOKING;
                case EVENT_SHARE:
                    return AFInAppEventType.SHARE;
                case EVENT_INVITE:
                    return AFInAppEventType.INVITE;
                case EVENT_LOGIN:
                    return AFInAppEventType.LOGIN;
                case EVENT_RE_ENGAGE:
                    return AFInAppEventType.RE_ENGAGE;
                case EVENT_UPDATE:
                    return AFInAppEventType.UPDATE;
                case EVENT_OPENED_FROM_PUSH_NOTIFICATION:
                    return AFInAppEventType.OPENED_FROM_PUSH_NOTIFICATION;
                case EVENT_LOCATION_CHANGED:
                    return AFInAppEventType.LOCATION_CHANGED;
                case EVENT_LOCATION_COORDINATES:
                    return AFInAppEventType.LOCATION_COORDINATES;
                case EVENT_ORDER_ID:
                    return AFInAppEventType.ORDER_ID;
                case EVENT_CUSTOMER_SEGMENT:
                    return AFInAppEventType.CUSTOMER_SEGMENT;
                case EVENT_LIST_VIEW:
                    return AFInAppEventType.LIST_VIEW;
                case EVENT_SUBSCRIBE:
                    return AFInAppEventType.SUBSCRIBE;
                case EVENT_START_TRIAL:
                    return AFInAppEventType.START_TRIAL;
                case EVENT_AD_CLICK:
                    return AFInAppEventType.AD_CLICK;
                case EVENT_AD_VIEW:
                    return AFInAppEventType.AD_VIEW;
                default:
                    return event;
            }
        }
        return null;
    }
}
