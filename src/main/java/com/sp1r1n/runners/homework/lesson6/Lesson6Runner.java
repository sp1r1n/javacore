package com.sp1r1n.runners.homework.lesson6;
import com.sp1r1n.app.classwork.lesson4.EvenOdd;
import com.sp1r1n.app.homework.lesson6.BubbleSort;
import com.sp1r1n.app.homework.lesson6.Computing;
import com.sp1r1n.app.homework.lesson6.RandomArray;

import static com.sp1r1n.app.homework.lesson6.List.createList;
import static com.sp1r1n.app.homework.lesson6.RandomArray.createArrayRandom;
import static com.sp1r1n.app.homework.lesson6.RandomArray.createMatrixRandom;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Denis on 08.02.2017.
 */
public class Lesson6Runner {

    static String readline;
    static RandomArray randomArray;
    static BubbleSort bubbleSort;
    static Computing computing;
    static Scanner scanner;
    static ArrayList<String> list;
    static int[] array;
    static int[][] matrix;

    public static void main(String[] args) {
        randomArray = new RandomArray();
        bubbleSort = new BubbleSort();
        computing = new Computing();
        scanner = new Scanner(System.in);
        list = new ArrayList<>();
        do {
            try {
                System.out.print("\nPlease select any function:\n" +
                        "a. Create array with even numbers (2-20)\n" +
                        "b. Check: is number is even or odd?\n" +
                        "c. Check: is triangle rightangle?  \n" +
                        "d. Check: is triangle rightangle?  \n" +
                        "e. Check: is triangle rightangle?  \n" +
                        "f. Check: is triangle rightangle?  \n" +
                        "g. Check: is triangle rightangle?  \n" +
                        "h. Check: is triangle rightangle?  \n" +
                        "exit. Exit\n");
                Scanner scanner = new Scanner(System.in);
                readline = scanner.nextLine();
                switch (readline) {
                    case "a":
                        array = createArrayRandom(20, true, true);
                        bubbleSort.bubbleSortAsc(array);
                        for (int i=0;i<array.length;i++)
                            System.out.print(array[i] + " ");
                        System.out.println();
                        for (int i=0;i<array.length;i++)
                            System.out.println(array[i]);
                        break;
                    case "b":
                        array = createArrayRandom(99, false, true);
                        bubbleSort.bubbleSortAsc(array);
                        for (int i=0;i<array.length;i++)
                            System.out.print(array[i] + " ");
                        System.out.println();
                        bubbleSort.bubbleSortDesc(array);
                        for (int i=0;i<array.length;i++)
                            System.out.print(array[i] + " ");
                        break;
                    case "c":
                        int count = 0;
                        array = createArrayRandom(15, 9);
                        for (int i=0;i<array.length;i++) {
                            System.out.print(array[i] + " ");
                            if (EvenOdd.isEven(array[i]) == true)
                                count++;
                        }
                        System.out.print("\nNumber of even numbers: " + count);
                        break;
                    case "d":
                        array = createArrayRandom(15, 999);
                        for (int i=0;i<array.length;i++)
                            System.out.print(array[i] + " ");
                        bubbleSort.bubbleSortAsc(array);
                        System.out.print("\nMin value in array: " + array[0]);
                        bubbleSort.bubbleSortDesc(array);
                        System.out.print("\nMax value in array: " + array[0]);
                        break;
                    case "e":
                        System.out.println("Please input number of columns: ");
                        int columns = scanner.nextInt();
                        System.out.println("Please input number of rows: ");
                        int rows = scanner.nextInt();
                        System.out.println("Please input min value: ");
                        int min = scanner.nextInt();
                        System.out.println("Please input max value: ");
                        int max = scanner.nextInt();
                        matrix = createMatrixRandom(columns, rows, min, max);
                        for (int i = 0; i < columns; ++i, System.out.println())
                            for (int j = 0; j < rows; ++j)
                                System.out.print(matrix[i][j] + " ");
                        break;
                    case "h":
                        String input;
                        do {
                            input = scanner.nextLine();
                            if (input != "exit")
                                list.add(input);
                            else
                                break;
                        }
                        while (true);
                        System.out.println(list);
                        break;
                    default: System.out.print("No such point here\n");
                }
            }
            catch (Exception e) {
                System.out.print("Error: Please input correct value\n");
            }
        }
        while (readline == "exit");
    }
}
