package com.sp1r1n.app.homework.lesson14;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Denis on 3/3/2017.
 */
public class BicycleWithRingTest {
    @Test
    public void ring() throws Exception {
        CustomBicycle customBicycle = new BicycleWithRing();
        customBicycle.ride();
    }

}