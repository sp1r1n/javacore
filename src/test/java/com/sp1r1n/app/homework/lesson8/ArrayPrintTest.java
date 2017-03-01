package com.sp1r1n.app.homework.lesson8;

import org.junit.Test;

/**
 * Created by Denis on 3/1/2017.
 */
public class ArrayPrintTest {
    int[] arrTest = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
    int[][] matrix = { { 0, 0, 0, 0, 0 },
            { 0, 1, 2, 3, 4 },
            { 0, 2, 4, 6, 8 },
            { 0, 3, 6, 9, 12 },
            { 0, 4, 8, 12, 16 } };
    @Test
    public void printlnArray() throws Exception {
        ArrayPrint.printlnArray(arrTest);
    }

    @Test
    public void printMatrix() throws Exception {
        ArrayPrint.printMatrix(matrix, 5,5);
    }

}