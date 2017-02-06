package com.sp1r1n.app.homework.lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by DELL on 2/6/2017.
 */
public class List {
    static ArrayList<Integer> nums;

    public static ArrayList<Integer> numbers(int inputNumber){
        nums.add(inputNumber);
        return (nums);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        do {
            input = scanner.nextInt();
            numbers(input);
        }
        while (input != 99);
        for (Object item : nums
             ) {
            System.out.println(item);
        }
    }
}
