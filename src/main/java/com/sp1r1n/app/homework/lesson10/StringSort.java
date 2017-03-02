package com.sp1r1n.app.homework.lesson10;

import java.util.*;

/**
 * Created by Denis on 2/17/2017.
 */
public class StringSort {
    public String sortCaseIgnore(String input){
        ArrayParser arrayParser = new ArrayParser();
        List<String> myList = arrayParser.listParse(input, "");
        Collections.sort(myList, String.CASE_INSENSITIVE_ORDER);
        StringBuilder sb = new StringBuilder();
        for (String s : myList)
        {
            sb.append(s);
        }
        return sb.toString();
    }

    public String sortStringAsc(String input){
        char[] arrayForSort = input.toCharArray();
        Arrays.sort(arrayForSort);
        String sortedOutput = new String(arrayForSort);
        return sortedOutput;
    }

    public String sortStringDesc(String input){
        StringSort stringSort = new StringSort();
        input = stringSort.sortStringAsc(input);
        StringBuilder stringBuilder = new StringBuilder(input);
        return stringBuilder.reverse().toString();
    }
}
