package com.sp1r1n.app.classwork.lesson2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by DELL on 2/9/2017.
 */
public class WideningCastingTest {

    public static final double DELTA = 1e-15;

    @Test
    public void wideningTest() throws Exception {
        WideningCasting wideningCasting = new WideningCasting();
        double expRes = 127.0;
        assertEquals(expRes, wideningCasting.widening(), DELTA);
    }

}