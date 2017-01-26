package com.sp1r1n.app.homework.lesson3;

import com.sp1r1n.app.homework.lesson2.PrimitiveConvertor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by DELL on 1/24/2017.
 */
public class PrimitiveConvertorTest {

    PrimitiveConvertor primitiveConvertor;
    @Before
    public void init() {
        primitiveConvertor = new PrimitiveConvertor();
    }

    @Test
    public void floatToChar() throws Exception {
        char b = '#';
        assertEquals("Test 1: ", b, primitiveConvertor.floatToChar(35.0f));
    }

    @Test
    public void floatToCharNot() throws Exception {
        char b = '@';
        assertNotEquals("Test 1: ", b, primitiveConvertor.floatToChar(35.0f));
    }

    @Test
    public void intToChar() throws Exception {
        char b = '#';
        assertEquals("Test 2: ", b, primitiveConvertor.intToChar(35));
    }

    @Test
    public void intToCharNot() throws Exception {
        char b = '@';
        assertNotEquals("Test 2: ", b, primitiveConvertor.intToChar(35));
    }

    @Test
    public void charToInt() throws Exception {
        int a = 35;
        assertEquals("Test 3: ", a, primitiveConvertor.charToInt('#'));
    }

    @Test
    public void charToIntNot() throws Exception {
        int a = 36;
        assertNotEquals("Test 4: ", a, primitiveConvertor.charToInt('#'));
    }

}