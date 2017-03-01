package com.sp1r1n.app.homework.lesson6;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Denis on 3/1/2017.
 */
public class ComputingTest {
    Computing computing;
    int[] arrTest = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
    ArrayList<Integer> listTest = new ArrayList<>();
    int[][] matrix = { { 0, 0, 0, 0, 0 },
            { 0, 1, 2, 3, 4 },
            { 0, 2, 4, 6, 8 },
            { 0, 3, 6, 9, 12 },
            { 0, 4, 8, 12, 16 } };

    @Before
    public void init(){
        computing = new Computing();
        for (int i = 0; i < 10; i++) {
            listTest.add(i, i);
        }
    }

    @Test
    public void maxValue() throws Exception {
        assertEquals(20, computing.maxValue(arrTest));
    }

    @Test
    public void minValue() throws Exception {
        assertEquals(2, computing.minValue(arrTest));
    }

    @Test
    public void maxValueList() throws Exception {
        assertEquals(9, computing.maxValue(listTest));
    }

    @Test
    public void minValueList() throws Exception {
        assertEquals(0, computing.minValue(listTest));
    }

    @Test
    public void numberLength() throws Exception {
        assertEquals(3, computing.numberLength(333));
    }

    @Test
    public void addSpaces() throws Exception {
        assertEquals("   ", computing.addSpaces(2, 4));
    }

    @Test
    public void maxValueMatrix() throws Exception {
        assertEquals(16, computing.maxValue(matrix));
    }

}