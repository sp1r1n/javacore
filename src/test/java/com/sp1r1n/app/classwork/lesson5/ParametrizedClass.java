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

    @Before
    public void setupClass(){
        mathFunc = new MathFunc();
    }

    @Test
    @FileParameters(value = "src/test/resources/multiplydata.csv", mapper = CsvWithHeaderMapper.class)
    public void multiplyTest(int a, int b, int expected) {
        Assert.assertEquals(expected, mathFunc.multiply(a, b));
    }
}
