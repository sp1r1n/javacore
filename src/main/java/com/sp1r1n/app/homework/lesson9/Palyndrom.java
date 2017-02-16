package com.sp1r1n.app.homework.lesson9;

import com.sp1r1n.app.classwork.lesson4.EvenOdd;

/**
 * Created by Denis on 2/16/2017.
 */
public class Palyndrom {
    public boolean isPalindromic(String input){
        String[] array = input.toLowerCase().split("");
        boolean result = false;
        int count = 0;
        int i;
        for (i = 0; i < array.length; i++)
            if (array[i].equals(array[(array.length - 1) - i])) count++;
        if (count == i)
            result = true;
        return result;
    }
}
