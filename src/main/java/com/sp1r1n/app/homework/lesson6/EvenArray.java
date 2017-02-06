package com.sp1r1n.app.homework.lesson6;

import com.sp1r1n.app.classwork.lesson4.EvenOdd;
import java.util.*;
import java.util.stream.IntStream;

/**
 * Created by DELL on 2/6/2017.
 */
public class EvenArray {
    static int[] outputArray;

    public static int[] createArrayRandom (int maxvalue, boolean iseven, boolean unique) {
        Random random = new Random();
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

    public static void main(String[] args) {
        int[] array = createArrayRandom(113, false, true);
        BubbleSort.bubbleSort(array, true);
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
