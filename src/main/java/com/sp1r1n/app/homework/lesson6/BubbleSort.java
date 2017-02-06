package com.sp1r1n.app.homework.lesson6;

import java.util.Arrays;

/**
 * Created by DELL on 2/6/2017.
 */
public class BubbleSort {
    public static void bubbleSort(int[] num, boolean sort)
    {
        if (sort = true) {
            int j;
            boolean flag = true;   // set flag to true to begin first pass
            int temp;   //holding variable

            while (flag) {
                flag = false;    //set flag to false awaiting a possible swap
                for (j = 0; j < num.length - 1; j++) {
                    if (num[j] < num[j + 1])   // change to > for ascending sort
                    {
                        temp = num[j];                //swap elements
                        num[j] = num[j + 1];
                        num[j + 1] = temp;
                        flag = true;              //shows a swap occurred
                    }
                }
            }
        }
        else {
            int n = num.length;
            int temp = 0;

            for(int i=0; i < n; i++){
                for(int j=1; j < (n-i); j++){

                    if(num[j-1] > num[j]){
                        //swap the elements!
                        temp = num[j-1];
                        num[j-1] = num[j];
                        num[j] = temp;
                    }

                }
            }
        }
    }
}
