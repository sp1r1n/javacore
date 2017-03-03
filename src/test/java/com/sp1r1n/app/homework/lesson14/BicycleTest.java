package com.sp1r1n.app.homework.lesson14;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Denis on 3/3/2017.
 */
public class BicycleTest {
    Bicycle bicycle;

    @Before
    public void init(){
        bicycle = new CustomBicycle();
    }
    @Test
    public void ride() throws Exception {
        bicycle.ride();
    }

    @Test
    public void setSpeed() throws Exception {
        bicycle.setSpeed(3);
    }

    @Test
    public void setGear() throws Exception {
        bicycle.setGear("Test");
    }

}