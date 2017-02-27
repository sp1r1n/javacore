package com.sp1r1n.runners.homework.lesson6;
import com.sp1r1n.app.classwork.lesson4.EvenOdd;
import com.sp1r1n.app.homework.lesson6.BubbleSort;
import com.sp1r1n.app.homework.lesson6.Computing;
import com.sp1r1n.app.homework.lesson6.RandomArray;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Denis on 08.02.2017.
 */
public class Lesson6Runner {


    public static void main(String[] args) {
        String readline = new String();
        RandomArray randomArray = new RandomArray();
        BubbleSort bubbleSort = new BubbleSort();
        Computing computing = new Computing();
        Scanner scanner;
        ArrayList<String> list = new ArrayList<>();
        int[] array;
        int[][] matrix;
        int columns;
        int rows;
        int max;
        int min;

        do try {
            System.out.print("\n___________________________\nPlease select any function:\n" +
                    "a. Create array with even numbers (2-20)\n" +
                    "b. Create array with odd numbers (1-99)\n" +
                    "c. Create random array (0-15) and calculate only even numbers \n" +
                    "d. Create random array (0-999) and find min & max values \n" +
                    "e. Create matrix with [x] rows and [y] columns and [n-m] boundary values  \n" +
                    "g. Same as 'e' point but with alignment  \n" +
                    "h. Create your own list  \n" +
                    "type 'exit' for exit\n____________________\n");
            scanner = new Scanner(System.in);
            readline = scanner.next();
            switch (readline) {
                case "a":
                    array = randomArray.createArrayRandom(20, true, true);
                    bubbleSort.bubbleSortAsc(array);
                    for (int i = 0; i < array.length; i++)
                        System.out.print(array[i] + " ");
                    System.out.println();
                    for (int i = 0; i < array.length; i++)
                        System.out.println(array[i]);
                    break;
                case "b":
                    array = randomArray.createArrayRandom(99, false, true);
                    bubbleSort.bubbleSortAsc(array);
                    for (int i = 0; i < array.length; i++)
                        System.out.print(array[i] + " ");
                    System.out.println();
                    bubbleSort.bubbleSortDesc(array);
                    for (int i = 0; i < array.length; i++)
                        System.out.print(array[i] + " ");
                    break;
                case "c":
                    int count = 0;
                    array = randomArray.createArrayRandom(15, 9);
                    for (int i = 0; i < array.length; i++) {
                        System.out.print(array[i] + " ");
                        if (EvenOdd.isEven(array[i]))
                            count++;
                    }
                    System.out.print("\nNumber of even numbers: " + count);
                    break;
                case "d":
                    array = randomArray.createArrayRandom(15, 999);
                    for (int i = 0; i < array.length; i++)
                        System.out.print(array[i] + " ");
                    bubbleSort.bubbleSortAsc(array);
                    System.out.print("\nMin value in array: " + array[0]);
                    bubbleSort.bubbleSortDesc(array);
                    System.out.print("\nMax value in array: " + array[0]);
                    break;
                case "e":
                    System.out.println("Please input number of columns: ");
                    columns = scanner.nextInt();
                    System.out.println("Please input number of rows: ");
                    rows = scanner.nextInt();
                    System.out.println("Please input min value: ");
                    min = scanner.nextInt();
                    System.out.println("Please input max value: ");
                    max = scanner.nextInt();
                    matrix = randomArray.createMatrixRandom(columns, rows, min, max);
                    for (int i = 0; i < columns; ++i, System.out.println())
                        for (int j = 0; j < rows; ++j)
                            System.out.print(matrix[i][j] + " ");
                    break;
                case "g":
                    System.out.println("Please input number of columns: ");
                    columns = scanner.nextInt();
                    System.out.println("Please input number of rows: ");
                    rows = scanner.nextInt();
                    System.out.println("Please input min value: ");
                    min = scanner.nextInt();
                    System.out.println("Please input max value: ");
                    max = scanner.nextInt();
                    matrix = randomArray.createMatrixRandom(columns, rows, min, max);
                    int length;
                    int maxspaces;
                    String spaces;
                    for (int i = 0; i < columns; ++i, System.out.println()) {
                        length = computing.numberLength(i);
                        maxspaces = computing.numberLength(rows);
                        System.out.print("Lists " + i + ":" + computing.addSpaces(length, maxspaces));
                        for (int j = 0; j < rows; ++j) {
                            length = computing.numberLength(matrix[i][j]);
                            maxspaces = computing.numberLength(max);
                            spaces = computing.addSpaces(length, maxspaces);
                            System.out.print(spaces + matrix[i][j]);
                        }
                    }
                    break;
                case "h":
                    System.out.println("Hold entering some values. Input 'stop' when done.");
                    do {
                        readline = scanner.nextLine();
                        list.add(readline);
                    }
                    while (!readline.equals("stop"));
                    list.remove(list.size() - 1);
                    System.out.print("Your list: " + list);
                    break;
                case "exit":
                    break;
                default:
                    System.out.print("No such point here\n");
            }
        } catch (Exception e) {
            System.out.print("Error: Value is not correct. Try again\n" + e);
        }
        while (!readline.equals("exit"));
    }
}
