package com.sp1r1n.app.classwork.lesson4;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Denis on 27.01.2017.
 */
public class EvenOddTest {
    @Test
    public void isEvenTrue() throws Exception {
        assertTrue("Test 1 is failed\n", EvenOdd.isEven(4));
    }

    @Test
    public void isEvenFalse() throws Exception {
        assertFalse("Test 2 is failed\n", EvenOdd.isEven(3));
    }

}