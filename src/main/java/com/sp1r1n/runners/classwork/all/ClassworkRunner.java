package com.sp1r1n.runners.classwork.all;

import com.sp1r1n.app.classwork.lesson14.Line;
import com.sp1r1n.app.classwork.lesson14.Pixel;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by DELL on 1/19/2017.
 */
public class ClassworkRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        switch (scanner.nextInt()) {
            case 1:
                Pixel pixel1 = new Pixel(10, 14);
                Pixel pixel2 = new Pixel(14, 18);
                Pixel pixel3 = new Pixel(18, 21);
                Pixel pixel4 = new Pixel(12, 51);
                Line line = new Line(10, 20);
                line.addPixel(pixel1);
                line.addPixel(pixel2);
                line.addPixel(pixel3);
                line.addPixel(pixel4);
                System.out.println(Arrays.toString(line.getCoordinates()));
                int[] array = line.getCoordinates();
                int index = 0;
                for (int i = 0; i < array.length / 2; i++) {
                    for (int j = 0; j < array[index]; j++) {
                        System.out.print(" ");
                    }
                    index++;
                    for (int k = 0; k < array[index]; k++) {
                        System.out.print("_");
                    }
                    System.out.println();
                    index++;
                }
                break;
            case 2:
                try {
                    int[] arr = {1, 1, 1, 1, 3, 1, 1, 1, 1, 1};
                    int maxtemp = 1;
                    int max = 1;
                    for (int i = 1; i < arr.length - 1; i++) {
                        while (i < arr.length && arr[i - 1] == arr[i]) {
                            maxtemp++;
                            i++;
                        }
                        if (maxtemp > max) {
                            max = maxtemp;
                            maxtemp = 1;
                        }
                    }
                    System.out.print(max);
                } catch (Exception e) {
                    System.out.print(e);
                }
        }
    }
}
