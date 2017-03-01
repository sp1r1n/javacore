package com.sp1r1n.runners.homework.lesson4;

import com.sp1r1n.app.classwork.lesson4.CircleSquare;
import com.sp1r1n.app.classwork.lesson4.EvenOdd;
import com.sp1r1n.app.classwork.lesson4.RightAngle;

import java.util.Scanner;

/**
 * Created by DELL on 1/26/2017.
 */
public class Lesson4Runner {

    public static void main(String[] args) throws Exception {
        int i = 0;
        RightAngle rightAngle = new RightAngle();
        CircleSquare circleSquare = new CircleSquare();
        do {
            try {
                System.out.print("\nPlease select any function:\n" +
                        "1. Check bigger circle square by radius\n" +
                        "2. Check: is number is even or odd?\n" +
                        "3. Check: is triangle rightangle?  \n" +
                        "0. Exit\n");
                Scanner scanner = new Scanner(System.in);
                i = scanner.nextInt();
                switch (i) {
                    case 1:
                        System.out.print("Please input radius 1: ");
                        double circleRadius1 = scanner.nextDouble();
                        System.out.print("Please input radius 2: ");
                        double circleRadius2 = scanner.nextDouble();
                        circleSquare.calculateCheck(circleRadius1, circleRadius2);
                        break;
                    case 2:
                        System.out.print("Even or Odd? Please input something: ");
                        double something = scanner.nextDouble();
                        EvenOdd.isEven(something);
                        break;
                    case 3:
                        double[] array = new double[3];
                        for (int j = 0; j < array.length; j++) {
                            System.out.print("Please input side " + j + ": ");
                            array[j] = scanner.nextDouble();
                        }
                        rightAngle.isRightAngle(array[0], array[1], array[2]);
                        break;
                    case 0:
                        break;
                    default: System.out.print("No such point here\n");
                }
            }
            catch (Exception e) {
                System.out.print("Error: Please input correct value\n" + e);
            }
        }
        while (i != 0);
    }
}
