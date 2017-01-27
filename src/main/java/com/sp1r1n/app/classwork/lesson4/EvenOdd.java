package com.sp1r1n.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by Denis on 27.01.2017.
 */
public class EvenOdd {
    static boolean result;

    public static boolean isEven(double something){
        //Scanner scanner = new Scanner(System.in);
        //System.out.print("Even or Odd? Please input something ");
        //double something = scanner.nextDouble();
        if (something%2 == 0) {
            result = true;
            System.out.print(something + " is even\n");
        }
        else {
            result = false;
            System.out.print(something + " is odd\n");
        }
        return result;
    }
}
