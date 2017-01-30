package com.sp1r1n.app.homework.lesson4;

import com.sp1r1n.app.classwork.lesson4.EvenOdd;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Denis on 30.01.2017.
 */
public class EvenOddTest {


    @Before
    public void init() {
        EvenOdd evenOdd = new EvenOdd();
    }

    @Test
    public void isEvenTrue() throws Exception {
        Assert.assertTrue("Test 1 is failed", EvenOdd.isEven(4));
    }

    @Test
    public void isEvenFalse() throws Exception {
        Assert.assertFalse("Test 2 is failed", EvenOdd.isEven(3));
    }
}