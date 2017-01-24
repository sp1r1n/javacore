package com.sp1r1n.app.homework.lesson2;

/**
 * Created by DELL on 1/22/2017.
 */
public class PrimitiveConvertor {
    char outputchar = 'F';
    int outputint = 0;
    public static void main(String[] args) {

    }

    public char floatToChar(float input){
        outputchar = (char)input;
        System.out.println("Input float value is " + input + ". Output char value is " + outputchar);
        return outputchar;
    }

    public char intToChar(int input){
        outputchar = (char)input;
        System.out.println("Input int value is " + input + ". Output char value is " + outputchar);
        return outputchar;
    }

    public int charToInt(char input) {
        outputint = input;
        System.out.println("Input char value is " + input + ". Output int value is " + outputint);
        return outputint;
    }
}
