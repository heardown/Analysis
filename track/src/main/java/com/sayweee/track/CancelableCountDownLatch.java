package com.sayweee.track;

import java.util.concurrent.CountDownLatch;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    20120/7/16.
 * Desc:
 */
public class CancelableCountDownLatch extends CountDownLatch {

    public CancelableCountDownLatch(int count) {
        super(count);
    }

    public void cancel() {
        while (getCount() > 0) {
            countDown();
        }
    }
}