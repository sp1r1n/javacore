package com.sp1r1n.app.homework.lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by DELL on 2/6/2017.
 */
public class List {
    ArrayList<String> outputList;

    public List(){
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
}
