package com.sp1r1n.app.classwork.lesson12;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Denis on 3/1/2017.
 */
public class BicycleTest {
    @Test
    public void ride() throws Exception {
        Bicycle bicycle = new Bicycle();
        Bicycle bicycle1 = new Bicycle(1);
        Bicycle bicycle2 = new Bicycle(2, "red");
        Bicycle bicycle3 = new Bicycle(3, "blue", 4.0d);
        Bicycle bicycle4 = new Bicycle(4, "black", 6.0d, true);
        Assert.assertEquals("\nWroom!", bicycle.ride());
    }
}