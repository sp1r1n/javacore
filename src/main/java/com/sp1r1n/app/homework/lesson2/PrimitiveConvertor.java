package com.sp1r1n.app.homework.lesson2;

/**
 * Created by DELL on 1/22/2017.
 */
public class PrimitiveConvertor {
    char outputchar;
    int outputint;
    public char floatToChar(float input){
        outputchar = (char)input;
        return outputchar;
    }

    public char intToChar(int input){
        outputchar = (char)input;
        return outputchar;
    }

    public int charToInt(char input) {
        outputint = input;
        return outputint;
    }
}
