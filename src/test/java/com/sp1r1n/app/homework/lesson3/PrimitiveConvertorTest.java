package com.sp1r1n.app.homework.lesson3;

import com.sp1r1n.app.homework.lesson2.PrimitiveConvertor;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by DELL on 1/24/2017.
 */
public class PrimitiveConvertorTest {
    @Test
    public void floatToCharSame() throws Exception {
        PrimitiveConvertor primitiveConvertor = new PrimitiveConvertor();
        char b = '#';
        assertSame("Test 1: These variables are not same:", b, primitiveConvertor.floatToChar(35.0f));
    }
    @Test
    public void floatToCharNotSame() throws Exception {
        PrimitiveConvertor primitiveConvertor = new PrimitiveConvertor();
        char b = '$';
        assertNotSame("Test 2: These variables are same:", b, primitiveConvertor.floatToChar(41.0f));
    }

    @Test
    public void intToChar() throws Exception {

    }

    @Test
    public void charToInt() throws Exception {

    }

}