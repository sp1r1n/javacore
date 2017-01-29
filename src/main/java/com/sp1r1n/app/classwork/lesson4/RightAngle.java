package com.sp1r1n.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by Denis on 27.01.2017.
 */
public class RightAngle {
    static boolean result;

    public static boolean isRightAngle(double a, double b, double c){
        if (Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2) || Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2) || Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)){
            result = true;
            System.out.print("Triangle is right-angle\n________________");
        }
        else {
            System.out.print("Triangle is NOT right-angle\n________________");
        }
        return result;
    }
}
