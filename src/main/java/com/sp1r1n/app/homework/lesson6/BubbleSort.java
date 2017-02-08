package com.sp1r1n.app.homework.lesson6;

import java.util.ArrayList;

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
            flag = false;
            for (j = 0; j < num.length - 1; j++) {
                if (num[j] < num[j + 1])
                {
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    flag = true;
                }
            }
        }
    }

    public void bubbleSortAsc(int[] num){
        temp = 0;

        for(int i=0; i < num.length; i++){
            for(int j=1; j < (num.length-i); j++){

                if(num[j-1] > num[j]){
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
                    temp = listNum.get(j-1);
                    listNum.set(j-1, j);
                    listNum.set(j, temp);
                }
            }
        }
    }

    public void bubbleSortDesc(ArrayList<Integer> listNum)
    {

        flag = true;

        while (flag) {
            flag = false;
            for (j = 0; j < listNum.size()-1; j++) {
                if (listNum.get(j) < listNum.get(j+1))
                {
                    temp = listNum.get(j);
                    listNum.set(j, listNum.get(j + 1));
                    listNum.set(j + 1, temp);
                    flag = true;
                }
            }
        }
    }
}
