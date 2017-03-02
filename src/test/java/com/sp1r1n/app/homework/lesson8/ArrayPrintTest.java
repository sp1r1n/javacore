package com.sp1r1n.app.homework.lesson8;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Denis on 3/1/2017.
 */
public class ArrayPrintTest {

    ArrayPrint arrayPrint;
    int[] arrTest = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
    int[][] matrix = { { 0, 0, 0, 0, 0 },
            { 0, 1, 2, 3, 4 },
            { 0, 2, 4, 6, 8 },
            { 0, 3, 6, 9, 12 },
            { 0, 4, 8, 12, 16 } };
    @Before
    public void init(){
        arrayPrint = new ArrayPrint();
    }

    @Test
    public void printlnArray() throws Exception {
        arrayPrint.printlnArray(arrTest);
    }

    @Test
    public void printMatrix() throws Exception {
        arrayPrint.printMatrix(matrix, 5,5);
    }

}