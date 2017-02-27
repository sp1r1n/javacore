package com.sp1r1n.runners.homework.lesson8;

import com.sp1r1n.app.homework.lesson6.BubbleSort;
import com.sp1r1n.app.homework.lesson6.Computing;
import com.sp1r1n.app.homework.lesson6.RandomArray;
import com.sp1r1n.app.homework.lesson8.ArrayPrint;
import com.sp1r1n.app.homework.lesson8.SelectionSort;

import java.util.Scanner;

/**
 * Created by Denis on 2/23/2017.
 */
public class Lesson8Runner {


    public static void main(String[] args) {
        String readline = new String();
        Scanner scanner;
        int[] array;
        int[][] matrix;
        RandomArray randomArray = new RandomArray();
        BubbleSort bubbleSort = new BubbleSort();
        SelectionSort selectionSort = new SelectionSort();
        Computing computing = new Computing();
        do try {
            System.out.print("\n___________________________\nLesson8. Please select any function:\n" +
                    "a. bubble sort asc/desc\n" +
                    "b. selection sort\n" +
                    "c. 2d random array + maxvalue\n" +
                    "type 'exit' for exit\n____________________\n");
            scanner = new Scanner(System.in);
            readline = scanner.next();
            switch (readline) {
                case "a":
                    array = randomArray.createArrayRandom(10, 100);
                    bubbleSort.bubbleSortAsc(array);
                    ArrayPrint.printlnArray(array);
                    bubbleSort.bubbleSortDesc(array);
                    System.out.println();
                    ArrayPrint.printlnArray(array);
                    break;
                case "b":
                    array = randomArray.createArrayRandom(10, 100);
                    selectionSort.doSelectionSortAsc(array);
                    ArrayPrint.printlnArray(array);
                    break;
                case "c":
                    matrix = randomArray.createMatrixRandom(5, 8, -99, 99);
                    ArrayPrint.printMatrix(matrix, 5, 8);
                    computing.maxValue(matrix);
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
