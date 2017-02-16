package com.sp1r1n.app.homework.lesson9;

import com.sp1r1n.app.classwork.lesson4.EvenOdd;
import com.sp1r1n.app.homework.lesson6.Lists;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Denis on 2/16/2017.
 */
public class Palyndrom {
    boolean result;

    public boolean isPalindromicFirst(String input){
        String[] array = input.toLowerCase().split("");
        result = false;
        int count = 0;
        int i;
        for (i = 0; i < array.length; i++)
            if (array[i].equals(array[(array.length - 1) - i])) count++;
        if (count == i)
            result = true;
        return result;
    }

    public boolean isPalindromicSecond(String input){
        String[] array = input.toLowerCase().split("");
        boolean result = false;
        String left = "";
        String right = "";
        for (int i = 0; i < array.length/2; i++){
            left += array[i];
            right += array[(array.length-1)-i];
        }
        if (left.equals(right)){
            result = true;
        }
        return result;
    }

    public boolean isPalindromicThird(String input) {
        Lists lists = new Lists();
        String[] inputArray = input.split("");
        ArrayList<String> newList;
        newList = lists.arrayToList(inputArray);
        String before = "";
        for (int i = 0; i < newList.size(); i++){
            before += newList.get(i);
        }
        Collections.reverse(newList);
        String after = "";
        for (int i = 0; i < newList.size(); i++) {
            after += newList.get(i);
        }
        if (before.equals(after)){
            result = true;
        }
        return result;
    }

}
