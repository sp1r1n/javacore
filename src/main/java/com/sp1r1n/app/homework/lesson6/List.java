package com.sp1r1n.app.homework.lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by DELL on 2/6/2017.
 */
public class List {
    public static ArrayList<Integer> numbers (int inputNumber){
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(inputNumber);
        return (nums);
    }

    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        int input;
        do {
            input = scanner.nextInt();
            arr = numbers(input);
        }
        while (input != 99);
        for (Object item : arr
             ) {
            System.out.println(item);
        }
    }
}
