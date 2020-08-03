package com.sayweee.track.model;

import com.sayweee.track.convert.IConvert;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    20120/7/16.
 * Desc:    标准事件
 */
public interface IEvent extends IConvert {

    String VIEW = "pv";
    //af标准事件
    String LEVEL_ACHIEVED = "af_level_achieved";
    String ADD_PAYMENT_INFO = "af_add_payment_info";
    String ADD_TO_CART = "af_add_to_cart";
    String ADD_TO_WISH_LIST = "af_add_to_wishlist";
    String COMPLETE_REGISTRATION = "af_complete_registration";
    String TUTORIAL_COMPLETION = "af_tutorial_completion";
    String INITIATED_CHECKOUT = "af_initiated_checkout";
    String PURCHASE = "af_purchase";
    String RATE = "af_rate";
    String SEARCH = "af_search";
    String SPENT_CREDIT = "af_spent_credits";
    String ACHIEVEMENT_UNLOCKED = "af_achievement_unlocked";
    String CONTENT_VIEW = "af_content_view";
    String TRAVEL_BOOKING = "af_travel_booking";
    String SHARE = "af_share";
    String INVITE = "af_invite";
    String LOGIN = "af_login";
    String RE_ENGAGE = "af_re_engage";
    String UPDATE = "af_update";
    String OPENED_FROM_PUSH_NOTIFICATION = "af_opened_from_push_notification";
    String LOCATION_CHANGED = "af_location_changed";
    String LOCATION_COORDINATES = "af_location_coordinates";
    String ORDER_ID = "af_order_id";
    String CUSTOMER_SEGMENT = "af_customer_segment";
    String LIST_VIEW = "af_list_view";
    String SUBSCRIBE = "af_subscribe";
    String START_TRIAL = "af_start_trial";
    String AD_CLICK = "af_ad_click";
    String AD_VIEW = "af_ad_view";

    /**
     * 构建映射事件
     */
    void buildMappingEvent();

    void addMappingEvent(String key, String value);

    void replaceMappingEvent(String key, String value);

    void removeMappingEvent(String key);
}
