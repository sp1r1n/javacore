package com.sp1r1n.app.homework.lesson3;

import com.sp1r1n.app.homework.lesson2.PrimitiveConvertor;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by DELL on 1/24/2017.
 */
public class PrimitiveConvertorTest {
    @Test
    public void floatToChar() throws Exception {
        PrimitiveConvertor primitiveConvertor = new PrimitiveConvertor();
        char b = '#';
        assertEquals("Test 1: ", b, primitiveConvertor.floatToChar(35.0f));
    }

    @Test
    public void floatToCharNot() throws Exception {
        PrimitiveConvertor primitiveConvertor = new PrimitiveConvertor();
        char b = '@';
        assertNotEquals("Test 1: ", b, primitiveConvertor.floatToChar(35.0f));
    }

    @Test
    public void intToChar() throws Exception {
        PrimitiveConvertor primitiveConvertor = new PrimitiveConvertor();
        char b = '#';
        assertEquals("Test 2: ", b, primitiveConvertor.intToChar(35));
    }

    @Test
    public void intToCharNot() throws Exception {
        PrimitiveConvertor primitiveConvertor = new PrimitiveConvertor();
        char b = '@';
        assertNotEquals("Test 2: ", b, primitiveConvertor.intToChar(35));
    }

    @Test
    public void charToInt() throws Exception {
        PrimitiveConvertor primitiveConvertor = new PrimitiveConvertor();
        int a = 35;
        assertEquals("Test 3: ", a, primitiveConvertor.charToInt('#'));
    }

    @Test
    public void charToIntNot() throws Exception {
        PrimitiveConvertor primitiveConvertor = new PrimitiveConvertor();
        int a = 36;
        assertNotEquals("Test 4: ", a, primitiveConvertor.charToInt('#'));
    }

}