package com.sp1r1n.app.homework.lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by DELL on 2/6/2017.
 */
public class List {
    static ArrayList<String> outputList;

    public static ArrayList<String> createList(int index, String inputvalue){
        outputList.set(index, inputvalue);
        return (outputList);
    }

    public static ArrayList<String> createList(String inputvalue){
        outputList.add(inputvalue);
        return (outputList);
    }


    public static void main(String[] args) {
        /*outputList = new ArrayList<>();
        int input;
        Scanner scanner = new Scanner(System.in);
        do {
            input = scanner.nextInt();
            createList(input);
            System.out.println(outputList);
        }
        while (input != 333);*/
    }
}
