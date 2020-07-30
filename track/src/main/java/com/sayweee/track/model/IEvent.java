package com.sayweee.track.model;

import com.sayweee.track.convert.IConvert;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    20120/7/16.
 * Desc:    标准事件
 * 主页
 * category页面 (shopping_list/category)
 * 合集页 (shopping_list/collect)
 * 特色专区页（新品尝鲜，本月爆款，特价专区，有机甄选，平价菜场）
 * 猜你喜欢页 , 曾经购买页（如果还有的话）
 * 邀请好友页
 * 组合包页
 * 晒单页
 * 购物车页
 * 产品详情页
 * 订单确认页
 * 订单完成页
 * 登陆注册页
 * 注册成功event （login/sign up successfully)
 * 会员页面
 * Me页面
 */
public interface IEvent extends IConvert {

    String EVENT_VIEW = "pv";
    //af标准事件
    String EVENT_LEVEL_ACHIEVED = "af_level_achieved";
    String EVENT_ADD_PAYMENT_INFO = "af_add_payment_info";
    String EVENT_ADD_TO_CART = "af_add_to_cart";
    String EVENT_ADD_TO_WISH_LIST = "af_add_to_wishlist";
    String EVENT_COMPLETE_REGISTRATION = "af_complete_registration";
    String EVENT_TUTORIAL_COMPLETION = "af_tutorial_completion";
    String EVENT_INITIATED_CHECKOUT = "af_initiated_checkout";
    String EVENT_PURCHASE = "af_purchase";
    String EVENT_RATE = "af_rate";
    String EVENT_SEARCH = "af_search";
    String EVENT_SPENT_CREDIT = "af_spent_credits";
    String EVENT_ACHIEVEMENT_UNLOCKED = "af_achievement_unlocked";
    String EVENT_CONTENT_VIEW = "af_content_view";
    String EVENT_TRAVEL_BOOKING = "af_travel_booking";
    String EVENT_SHARE = "af_share";
    String EVENT_INVITE = "af_invite";
    String EVENT_LOGIN = "af_login";
    String EVENT_RE_ENGAGE = "af_re_engage";
    String EVENT_UPDATE = "af_update";
    String EVENT_OPENED_FROM_PUSH_NOTIFICATION = "af_opened_from_push_notification";
    String EVENT_LOCATION_CHANGED = "af_location_changed";
    String EVENT_LOCATION_COORDINATES = "af_location_coordinates";
    String EVENT_ORDER_ID = "af_order_id";
    String EVENT_CUSTOMER_SEGMENT = "af_customer_segment";
    String EVENT_LIST_VIEW = "af_list_view";
    String EVENT_SUBSCRIBE = "af_subscribe";
    String EVENT_START_TRIAL = "af_start_trial";
    String EVENT_AD_CLICK = "af_ad_click";
    String EVENT_AD_VIEW = "af_ad_view";

}
