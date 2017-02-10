package com.sp1r1n.app.classwork.lesson2;

import org.junit.Test;

import javax.print.attribute.standard.MediaSize;

import static org.junit.Assert.*;

/**
 * Created by DELL on 2/9/2017.
 */
public class NarrowingCastingTest {
    @Test
    public void narrowingTest() throws Exception {
        NarrowingCasting narrowingCasting = new NarrowingCasting();
        int expRes = 127;
        assertEquals(expRes, narrowingCasting.narrowing(127.0f));
    }

}