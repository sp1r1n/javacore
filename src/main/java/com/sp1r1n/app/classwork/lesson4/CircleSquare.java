package com.sp1r1n.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by DELL on 1/26/2017.
 */
public class CircleSquare {
    public static void calculate(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter radius1 of circle: ");
        double radius1 = scanner.nextDouble();
        double circleArea1 = Math.pow(radius1, 2) * Math.PI;
        System.out.print(circleArea1);
        System.out.print("Please enter radius2 of circle: ");
        double radius2 = scanner.nextDouble();
        double circleArea2 = Math.pow(radius1, 2) * Math.PI;
        System.out.print(circleArea2);
        if (circleArea1 > circleArea2)
            System.out.print("Area1 is bigger");
        else if (circleArea1 < circleArea2)
            System.out.print("Area 2 is bigger");
        else
            System.out.print("Area1 equals Area2");
    }

    public static void isTriangleRightAngle(){
        Scanner scanner = new Scanner(System.in);
        double[] array = new double[3];
        for (int i = 0; i < 3; i++)
        {
            System.out.print("Please input side " + i + ": ");
            array[i] = scanner.nextDouble();
        }
        double a = Math.pow(array[0], 2);
        double b = Math.pow(array[1], 2);
        double c = Math.pow(array[2], 2);
        if (c == a + b || b == a + c || a == b + c)
            System.out.print("Triangle is right-angle");
        else
            System.out.print("Triangle is NOT right-angle");
    }

    public static void evenOrOdd(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Even or Odd? Please input something ");
        double something = scanner.nextDouble();
        if (something%2 == 0)
            System.out.print("Even");
        else
            System.out.print("Odd");
    }
}
