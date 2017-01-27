package com.sp1r1n.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by Denis on 27.01.2017.
 */
public class RightAngle {
    static boolean result;

    public static void isRightAngle(double a, double b, double c){
        /*double[] array = new double[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++)
        {
            System.out.print("Please input side " + i + ": ");
            array[i] = scanner.nextDouble();
        }*/
        if (Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2) || Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2) || Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)){
            result = true;
            System.out.print("Triangle is right-angle");
        }

        else
            System.out.print("Triangle is NOT right-angle");
    }
}
