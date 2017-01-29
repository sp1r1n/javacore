package com.sp1r1n.app.homework.lesson4;

import com.sp1r1n.app.classwork.lesson4.CircleSquare;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Denis on 27.01.2017.
 */
public class CircleSquareTest {
    //CircleSquare circleSquare;

    @Test
    public void calculateCheckArea1() throws Exception {
        assertTrue("Test1: Area2 is bigger\n", CircleSquare.calculateCheck(5.0, 4.0)[0]);
    }

    @Test
    public void calculateCheckArea2() throws Exception {
        assertTrue("Test2: Area2 is bigger\n", CircleSquare.calculateCheck(4.0, 5.0)[1]);
    }

    @Test
    public void calculateCheckEquals() throws Exception {
        assertTrue("Test3: Area1 equals Area2\n", CircleSquare.calculateCheck(5.0, 5.0)[2]);
    }

}