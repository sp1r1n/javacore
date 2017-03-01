package com.sp1r1n.app.homework.lesson4;

import com.sp1r1n.app.classwork.lesson4.RightAngle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by DELL on 1/29/2017.
 */
public class RightAngleTest {
    RightAngle rightAngle;
    @Before
    public void init(){
        rightAngle = new RightAngle();
    }

    @Test
    public void isRightAngleTrue() throws Exception {
        Assert.assertTrue(rightAngle.isRightAngle(6, 8, 10));
    }

    @Test
    public void isRightAngleFalse() throws Exception {
        Assert.assertFalse(rightAngle.isRightAngle(7, 9, 11));
    }

}