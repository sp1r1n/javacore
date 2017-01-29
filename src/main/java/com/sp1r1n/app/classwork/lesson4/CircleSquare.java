package com.sp1r1n.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by DELL on 1/26/2017.
 */
public class CircleSquare {
    static double circleArea1;
    static double circleArea2;
    static boolean[] result = {false, false, false};

    public static boolean[] calculateCheck(double circleRadius1, double circleRadius2) {
        circleArea1 = Math.pow(circleRadius1, 2) * Math.PI;
        circleArea2 = Math.pow(circleRadius2, 2) * Math.PI;
        if (circleArea1 > circleArea2) {
            result[0] = true;
            System.out.print("Circle 1 > Circle 2\n________________" );
        }
        else if (circleArea1 < circleArea2) {
            result[1] = true;
            System.out.print("Circle 2 > Circle 1\n________________");
        }
        else {
            result[2] = true;
            System.out.print("Circle 1 = Circle 2\n________________");
        }
        return result;
    }




}
