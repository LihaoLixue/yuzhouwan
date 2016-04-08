package com.yuzhouwan.common.util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Copyright @ 2015 yuzhouwan.com
 * All right reserved.
 * Function: Ip Util Tester
 *
 * @author Benedict Jin
 * @since 2016/4/7 0030
 */
public class IpUtilsTest {

    @Test
    public void checkValidTest() throws Exception {
        assertEquals(true, IpUtils.checkValid("1.1.1.1"));
        assertEquals(true, IpUtils.checkValid("113.12.83.4"));
        assertEquals(false, IpUtils.checkValid("313.12.83.4"));
    }
}