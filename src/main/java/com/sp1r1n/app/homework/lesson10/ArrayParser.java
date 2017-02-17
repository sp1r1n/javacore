package com.sp1r1n.app.homework.lesson10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Denis on 2/17/2017.
 */
public class ArrayParser {
    public String[] arrayParse(String input, String delimiter){
        String[] output = input.split(delimiter);
        return output;
    }

    public List<String> listParse(String input, String delimeter){
        List<String> myList = new ArrayList<>(Arrays.asList(input.split(delimeter)));
        return myList;
    }
}
