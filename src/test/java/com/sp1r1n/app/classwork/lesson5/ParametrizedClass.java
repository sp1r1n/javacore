package com.sp1r1n.app.classwork.lesson5;

import com.sp1r1n.app.classwork.lesson3.MathFunc;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

/**
 * Created by DELL on 1/30/2017.
 */
@RunWith(JUnitParamsRunner.class)
public class ParametrizedClass {
    public MathFunc mathFunc;
    public static final double DELTA = 1e-15;

    @Before
    public void setupClass(){
        mathFunc = new MathFunc();
    }

    @Test
    @FileParameters(value = "src/test/resources/multiplydata.csv", mapper = CsvWithHeaderMapper.class)
    public void multiplyTest(int a, int b, int expected) {
        Assert.assertEquals(expected, mathFunc.multiply(a, b));
    }

    @Test
    @FileParameters(value = "src/test/resources/diffdata.csv", mapper = CsvWithHeaderMapper.class)
    public void diffTest(int a, int b, int expected) {
        Assert.assertEquals(expected, mathFunc.diff(a, b));
    }

    @Test
    @FileParameters(value = "src/test/resources/sumdata.csv", mapper = CsvWithHeaderMapper.class)
    public void sumTest(int a, int b, int expected) {
        Assert.assertEquals(expected, mathFunc.sum(a, b));
    }

    @Test
    @FileParameters(value = "src/test/resources/divdata.csv", mapper = CsvWithHeaderMapper.class)
    public void divTest(int a, int b, int expected) {
        Assert.assertEquals(expected, mathFunc.div(a, b));
    }

    @Test
    @FileParameters(value = "src/test/resources/sqrtdata.csv", mapper = CsvWithHeaderMapper.class)
    public void sqrtTest(double a, double expected) {
        Assert.assertEquals(expected, mathFunc.sqrt(a), DELTA);
    }

    @Test
    @FileParameters(value = "src/test/resources/powdata.csv", mapper = CsvWithHeaderMapper.class)
    public void powTest(double a, double b, double expected) { Assert.assertEquals(expected, mathFunc.pow(a, b), DELTA); }

    @Test
    @FileParameters(value = "src/test/resources/percentdata.csv", mapper = CsvWithHeaderMapper.class)
    public void percentTest(float a, float b, float expected) { Assert.assertEquals(expected, mathFunc.percentage(a, b), DELTA); }

    @Test
    @FileParameters(value = "src/test/resources/incdata.csv", mapper = CsvWithHeaderMapper.class)
    public void incTest(int a, int expected) { Assert.assertEquals(expected, mathFunc.increment(a)); }

    @Test
    @FileParameters(value = "src/test/resources/decdata.csv", mapper = CsvWithHeaderMapper.class)
    public void decTest(int a, int expected) {
        Assert.assertEquals(expected, mathFunc.decrement(a));
    }

    @Test
    @FileParameters(value = "src/test/resources/rounddata.csv", mapper = CsvWithHeaderMapper.class)
    public void roundTest(float a, int expected) {
        Assert.assertEquals(expected, mathFunc.round(a), DELTA);
    }

}
