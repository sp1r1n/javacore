package com.sp1r1n.app.homework.lesson6;

import com.sp1r1n.app.homework.lesson10.StringSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by DELL on 2/6/2017.
 */
public class Lists {
    ArrayList<String> outputList;

    public Lists(){
        outputList = new ArrayList<>();
    }

    public ArrayList<String> createList(int index, String inputvalue){
        outputList.set(index, inputvalue);
        return (outputList);
    }

    public ArrayList<String> createList(String inputvalue){
        outputList.add(inputvalue);
        return (outputList);
    }

    public ArrayList<String> arrayToList(String[] inputArray){
        for (int i = 0; i < inputArray.length; i++){
            outputList.add(inputArray[i]);
        }
        return (outputList);
    }
}
