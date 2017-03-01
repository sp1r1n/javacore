package com.sp1r1n.app.homework.lesson4;

import com.sp1r1n.app.classwork.lesson4.CircleSquare;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.reflect.Array;

import static org.junit.Assert.*;

/**
 * Created by Denis on 27.01.2017.
 */
public class CircleSquareTest {
    CircleSquare circleSquare;

    @Before
    public void init(){
        circleSquare = new CircleSquare();
    }

    @Test
    public void calculateCheckArea1() throws Exception {
        assertTrue("Test1 failed\n", circleSquare.calculateCheck(5.0, 4.0)[0]);
    }

    @Test
    public void calculateCheckArea2() throws Exception {
        assertTrue("Test2 failed\n", circleSquare.calculateCheck(4.0, 5.0)[1]);
    }

    @Test
    public void calculateCheckEquals() throws Exception {
        assertTrue("Test3 failed\n", circleSquare.calculateCheck(5.0, 5.0)[2]);
    }

    @Test
    public void calculateCheckEqualsFalse() throws Exception {
        boolean[] expRes = {false, false, true};
        Assert.assertArrayEquals(circleSquare.calculateCheck(5.0, 5.0), expRes);
    }





}