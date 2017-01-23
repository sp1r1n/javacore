package com.sp1r1n.app.classwork.lesson3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by DELL on 1/23/2017.
 */
public class MathFuncTest {
    @Test
    public void multiply() throws Exception {
        int a = 1, b = 2, expRes = 2;
        MathFunc mathFunc = new MathFunc();
        Assert.assertEquals(expRes, mathFunc.multiply(a, b));
    }
}