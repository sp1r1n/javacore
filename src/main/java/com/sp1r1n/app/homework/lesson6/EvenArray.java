package com.sp1r1n.app.homework.lesson6;

import com.sp1r1n.app.classwork.lesson4.EvenOdd;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * Created by DELL on 2/6/2017.
 */
public class EvenArray {

    public static int[] createEvenRandom (int maxvalue) {
        Random random = new Random();
        int[] outputArray = new int[maxvalue/2];
        int i = 0;
            do {
                int n = random.nextInt(maxvalue);
                boolean contains = IntStream.of(outputArray).anyMatch(x-> x == n);
                if (contains != true && EvenOdd.isEven(n) == true)
                    {
                        outputArray[i] = n;
                        System.out.println(n + " " + i);
                        i++;
                    }
            }
            while (i <= maxvalue/2);
        return outputArray;
    }

    public static void main(String[] args) {
        createEvenRandom(10);
    }
}
