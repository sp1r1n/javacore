package com.sp1r1n.app.homework.lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;

/**
 * Created by DELL on 2/6/2017.
 */
public class BubbleSort {
    int j, temp;
    boolean flag;

    public void bubbleSortDesc(int[] num)
    {

        flag = true;   // set flag to true to begin first pass

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

    public void bubbleSortAsc(int[] num){
        temp = 0;

        for(int i=0; i < num.length; i++){
            for(int j=1; j < (num.length-i); j++){

                if(num[j-1] > num[j]){
                    //swap the elements!
                    temp = num[j-1];
                    num[j-1] = num[j];
                    num[j] = temp;
                }
            }
        }
    }

    public void bubbleSortAsc(ArrayList<Integer> listNum){
        temp = 0;

        for(int i=0; i < listNum.size(); i++){
            for(int j=1; j < (listNum.size()-i); j++){
                if(listNum.get(j-1) > listNum.get(j)){
                    //swap the elements!
                    temp = listNum.get(j-1);
                    listNum.set(j-1, j);
                    listNum.set(j, temp);
                }
            }
        }
    }

    public void bubbleSortDesc(ArrayList<Integer> listNum)
    {

        flag = true;   // set flag to true to begin first pass

        while (flag) {
            flag = false;    //set flag to false awaiting a possible swap
            for (j = 0; j < listNum.size()-1; j++) {
                if (listNum.get(j) < listNum.get(j+1))   // change to > for ascending sort
                {
                    temp = listNum.get(j);                //swap elements
                    listNum.set(j, listNum.get(j + 1));
                    listNum.set(j + 1, temp);
                    flag = true;              //shows a swap occurred
                }
            }
        }
    }
}
