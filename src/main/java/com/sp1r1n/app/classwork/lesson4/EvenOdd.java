package com.sp1r1n.app.classwork.lesson4;

/**
 * Created by Denis on 27.01.2017.
 */
public class EvenOdd {

    public static boolean isEven(double inputValue){
        boolean result;
        if (inputValue%2 == 0) {
            result = true;
        }
        else {
            result = false;
        }
        return result;
    }
}
