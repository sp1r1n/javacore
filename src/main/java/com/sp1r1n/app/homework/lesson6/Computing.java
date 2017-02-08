package com.sp1r1n.app.homework.lesson6;

import java.util.ArrayList;

import static com.sp1r1n.app.homework.lesson6.RandomArray.createArrayRandom;

/**
 * Created by Denis on 08.02.2017.
 */
public class Computing {
    int outputvalue;
    static BubbleSort bubbleSort;

    public int maxValue(int[] inputArray){
        bubbleSort.bubbleSortDesc(inputArray);
        outputvalue = inputArray[0];
        return outputvalue;
    }

    public int minValue(int[] inputArray){
        bubbleSort.bubbleSortAsc(inputArray);
        outputvalue = inputArray[0];
        return outputvalue;
    }

    public int maxValue(ArrayList<Integer> inputList){
        bubbleSort.bubbleSortDesc(inputList);
        outputvalue = inputList.get(0);
        return outputvalue;
    }

    public int minValue(ArrayList<Integer> inputList){
        bubbleSort.bubbleSortAsc(inputList);
        outputvalue = inputList.get(0);
        return outputvalue;
    }

    public int numberLength(int inputValue){
        String s = Integer.toString(inputValue);
        outputvalue = s.length();
        return outputvalue;
    }

    public String addSpaces(int length, int max){
        String spacesToAdd = " ";
        for (int i = length; i < max; i++) {
            spacesToAdd = spacesToAdd + " ";
        }
        return spacesToAdd;
    }

    public static void main(String[] args) {
        bubbleSort = new BubbleSort();
        int[] array = createArrayRandom();
        Computing computing = new Computing();
        System.out.println(computing.minValue(array));;
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
