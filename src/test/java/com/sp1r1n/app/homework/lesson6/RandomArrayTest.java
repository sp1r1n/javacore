package com.sp1r1n.app.homework.lesson6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Denis on 3/2/2017.
 */
public class RandomArrayTest {
    RandomArray randomArray;
    boolean result = false;
    int[] array;
    int[][] matrix;

    @Before
    public void init(){
        randomArray = new RandomArray();
        array = null;
        matrix = null;
    }

    @Test
    public void createArrayRandom() throws Exception {
        array = randomArray.createArrayRandom();
        assertTrue(array != null);
        array = null;
    }

    @Test
    public void createArrayRandom1() throws Exception {
        array = randomArray.createArrayRandom(10);
        assertTrue(array != null);
        array = null;

    }

    @Test
    public void createArrayRandom2() throws Exception {
        array = randomArray.createArrayRandom(10, 100);
        assertTrue(array != null);
        array = null;
    }

    @Test
    public void createArrayRandom3() throws Exception {
        array = randomArray.createArrayRandom(10, 100, true);
        assertTrue(array != null);
        array = null;
    }

    @Test
    public void createArrayRandom4() throws Exception {
        array = randomArray.createArrayRandom(100, true, true);
        assertTrue(array != null);
        array = null;
    }

    @Test
    public void createMatrixRandom() throws Exception {
        matrix = randomArray.createMatrixRandom(5, 5, 1, 100);
        assertTrue(matrix != null);
    }

}