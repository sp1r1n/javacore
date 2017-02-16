package com.sp1r1n.app.homework.lesson6;

import com.sp1r1n.app.classwork.lesson4.EvenOdd;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by DELL on 2/6/2017.
 */
public class RandomArray {
    static int[] outputArray;
    Random random;

    public RandomArray(){
        random = new Random();
    }

    public int[] createArrayRandom() {
        outputArray = new int[20];
        int i = 0;
        do {
            int n = random.nextInt(20);
            outputArray[i] = n;
            i++;
        }
        while (i < 20);
        return outputArray;
    }

    public int[] createArrayRandom (int length) {
        outputArray = new int[length];
        int i = 0;
        do {
            int n = random.nextInt();
            outputArray[i] = n;
            i++;
        }
        while (i < length);
        return outputArray;
    }

    public int[] createArrayRandom (int length, int maxvalue) {
        outputArray = new int[length];
        int i = 0;
        do {
            int n = random.nextInt(maxvalue + 1);
            outputArray[i] = n;
            i++;
        }
        while (i < length);
        return outputArray;
    }

    public int[] createArrayRandom (int length, int maxvalue, boolean iseven) {
        outputArray = new int[length];
        int i = 0;
        do {
            int n = random.nextInt(maxvalue + 1);
            if (EvenOdd.isEven(n) == iseven) {
                outputArray[i] = n;
                i++;
            }
        }
        while (i < length);
        return outputArray;
    }

    public int[] createArrayRandom (int maxvalue, boolean iseven, boolean unique) {
        outputArray = new int[maxvalue/2];
        int i = 0;
        do {
            int n = random.nextInt(maxvalue + 1);
            if (unique == true) {
                boolean contains = IntStream.of(outputArray).anyMatch(x -> x == n);
                if (contains != true && EvenOdd.isEven(n) == iseven) {
                    outputArray[i] = n;
                    i++;
                }
            }
            else {
                if (EvenOdd.isEven(n) == iseven) {
                    outputArray[i] = n;
                    i++;
                }
            }
        }
        while (i < maxvalue/2);
        return outputArray;
    }

    public int[][] createMatrixRandom (int n, int m, int minvalue, int maxvalue) {
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                matrix[i][j] = random.nextInt(maxvalue - minvalue + 1) + minvalue;
        return matrix;
    }

    public static void main(String[] args) {
        /*Random random = new Random();
        int n = 9;
        int m = 9;
        int maxvalue = 9;
        int minvalue = 2;
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                boolean contains = IntStream.of(matrix).(x -> x == n);
                if (contains == true) {
                    matrix[i][j] = random.nextInt(maxvalue - minvalue + 1) + minvalue;
                    System.out.println(matrix[i][j]);
                }
            }
        }*/
    }
}
