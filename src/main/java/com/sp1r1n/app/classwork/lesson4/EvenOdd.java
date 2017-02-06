package com.sp1r1n.app.classwork.lesson4;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Denis on 27.01.2017.
 */
public class EvenOdd {
    public static boolean isEven(double something){
        boolean result;
        if (something%2 == 0) {
            result = true;
        }
        else {
            result = false;
        }
        return result;
    }
}
