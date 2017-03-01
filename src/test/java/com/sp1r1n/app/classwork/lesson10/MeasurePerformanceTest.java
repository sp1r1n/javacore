package com.sp1r1n.app.classwork.lesson10;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Denis on 3/1/2017.
 */
public class MeasurePerformanceTest {
    @Test
    public void measurePerf() throws Exception {
        MeasurePerformance measurePerformance = new MeasurePerformance();
        Assert.assertTrue(measurePerformance.MeasurePerf() > 0);
    }

}