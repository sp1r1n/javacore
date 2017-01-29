package com.sp1r1n.app.classwork.lesson4;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Denis on 27.01.2017.
 */
public class EvenOdd {
    static boolean result;

    public static boolean isEven(double something){
        if (something%2 == 0) {
            result = true;
            System.out.print(something + " is even\n________________");
        }
        else {
            result = false;
            System.out.print(something + " is odd\n________________");
        }
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
