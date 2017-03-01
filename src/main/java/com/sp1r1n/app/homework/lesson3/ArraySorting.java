package com.sp1r1n.app.homework.lesson3;

import java.util.Arrays;
/**
 * Created by DELL on 1/24/2017.
 */
public class ArraySorting {
    public int[] sortInputArray (int[] inputArray){
        System.out.print("Initial array: ");
        for (int i = 0; i < inputArray.length; i++)
        {
            System.out.print(inputArray[i] + ", ");
        }
       Arrays.sort(inputArray);
        System.out.print("Sorted array: ");
        for (int i = 0; i < inputArray.length; i++)
        {
            System.out.print(inputArray[i] + ", ");
        }
        return inputArray;
    }

}
