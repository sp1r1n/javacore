package com.sp1r1n.app.homework.lesson3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by DELL on 1/24/2017.
 */
public class ArraySortingTest {

    ArraySorting arraySorting;

    @Before
    public void init(){
        arraySorting = new ArraySorting();
    }

    @Test
    public void sortInputArrayMaxElement() throws Exception {
        int[] inputArray = {4,5,3,11,22,4422,124,41,222};
        arraySorting.sortInputArray(inputArray);
        int maxElement = inputArray.length - 1;
        int prevElement = inputArray.length - 2;
        assertTrue("Test Sorting Array: max element is not bigger than previous", inputArray[maxElement]>prevElement);
    }
    @Test
    public void sortInputArrayAssertTrue() throws Exception {
        int[] inputArray = {4,5,3,11,22,4422,124,41,222};
        arraySorting.sortInputArray(inputArray);//comment this row to see failed test
        int check = 0;
        String message = "Failed elements in array: \n";
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i + 1] > inputArray[i]) {
                check++;
            } else {
                message += inputArray[i + 1] + " NOT BIGGER THAN " + inputArray[i] + "\n";
            }
        }
        assertTrue(message,check == inputArray.length - 1);
    }
}