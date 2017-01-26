package com.sp1r1n.app.homework.lesson3;

import com.sp1r1n.app.classwork.lesson3.MathFunc;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by DELL on 1/23/2017.
 */
public class MathFuncTest {
    int a = 1, b = 2;
    float n = 0.5f, m = 2.0f;
    double x = 9.0, y = 2.0;
    public static final double DELTA = 1e-15;

    @Test
    public void multiply() throws Exception {
        int expRes = 2;
        MathFunc mathFunc = new MathFunc();
        Assert.assertEquals(expRes, mathFunc.multiply(a, b));
    }

    @Test
    public void diff() throws Exception {
        int expRes = -1;
        MathFunc mathFunc = new MathFunc();
        Assert.assertEquals(expRes, mathFunc.diff(a, b));
    }

    @Test
    public void sum() throws Exception {
        int expRes = 3;
        MathFunc mathFunc = new MathFunc();
        Assert.assertEquals(expRes, mathFunc.sum(a, b));
    }

    @Test
    public void div() throws Exception {
        int expRes = 2;
        MathFunc mathFunc = new MathFunc();
        Assert.assertEquals(expRes, mathFunc.div(a, b));
    }

    @Test
    public void sqrt() throws Exception {
        double expRes = 3.0;
        MathFunc mathFunc = new MathFunc();
        Assert.assertEquals(expRes, mathFunc.sqrt(x), DELTA);
    }

    @Test
    public void pow() throws Exception {
        float expRes = 25.0f;
        MathFunc mathFunc = new MathFunc();
        Assert.assertEquals(expRes, mathFunc.percentage(n, m), DELTA);
    }

    @Test
    public void percentage() throws Exception {
        float expRes = 81.0f;
        MathFunc mathFunc = new MathFunc();
        Assert.assertEquals(expRes, mathFunc.pow(x, y), DELTA);
    }

    @Test
    public void increment() throws Exception {
        int expRes = 2;
        MathFunc mathFunc = new MathFunc();
        Assert.assertEquals(expRes, mathFunc.increment(a));
    }

    @Test
    public void decrement() throws Exception {
        int expRes = 0;
        MathFunc mathFunc = new MathFunc();
        Assert.assertEquals(expRes, mathFunc.decrement(a));
    }

    @Test
    public void sin() throws Exception {
        double expRes = 1.0;
        MathFunc mathFunc = new MathFunc();
        Assert.assertEquals(expRes, mathFunc.sin(Math.PI/b), DELTA);
    }

    @Test
    public void acos() throws Exception {
        double expRes = Math.PI;
        MathFunc mathFunc = new MathFunc();
        Assert.assertEquals(expRes, mathFunc.acos(mathFunc.changeSign(a)), DELTA);
    }

    @Test
    public void round() throws Exception {
        int expRes = 4;
        MathFunc mathFunc = new MathFunc();
        Assert.assertEquals(expRes, mathFunc.round(3.5f), DELTA);
    }

    @Test
    public void abs() throws Exception {
        double expRes = 1.0;
        MathFunc mathFunc = new MathFunc();
        Assert.assertEquals(expRes, mathFunc.abs(mathFunc.changeSign(a)), DELTA);
    }

    @Test
    public void changeSign() throws Exception {
        int expRes = -1;
        MathFunc mathFunc = new MathFunc();
        Assert.assertEquals(expRes, mathFunc.changeSign(a));
    }
}