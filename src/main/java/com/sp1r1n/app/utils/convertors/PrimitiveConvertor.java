package com.sp1r1n.app.utils.convertors;

/**
 * Created by DELL on 1/22/2017.
 */
public class PrimitiveConvertor {
    char outputchar = 'F';
    int outputint = 0;

    public void floatToChar(float input){
        outputchar = (char)input;
        System.out.println("Input float value is " + input + ". Output char value is " + outputchar);
    }

    public void intToChar(int input){
        outputchar = (char)input;
        System.out.println("Input int value is " + input + ". Output char value is " + outputchar);
    }

    public void charToInt(char input){
        outputint = input;
        System.out.println("Input float value is " + input + ". Output char value is " + outputint);
    }

}
