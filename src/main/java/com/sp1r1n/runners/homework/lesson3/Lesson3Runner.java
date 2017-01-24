package com.sp1r1n.runners.homework.lesson3;

import com.sp1r1n.app.homework.lesson3.ArraySorting;

/**
 * Created by DELL on 1/24/2017.
 */
public class Lesson3Runner {
    public static void main(String[] args) {
        int[] inputArray = {4,5,3,11,22,4422,124,41,222};
        ArraySorting arraySorting = new ArraySorting();
        //arraySorting.sortInputArray(inputArray);
        boolean b = true;
        for (int i = 0; i < inputArray.length - 1; i++){
            if (inputArray[i + 1] > inputArray[i])
            {
                b = true;
                System.out.println(inputArray[i + 1] + " " + inputArray[i] + " OK");
            }
            else {
                b = true;
                System.out.println(inputArray[i + 1] + " " + inputArray[i] + " KO");
            }
        }
    }
}
