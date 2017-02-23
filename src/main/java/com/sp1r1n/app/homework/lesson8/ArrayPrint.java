package com.sp1r1n.app.homework.lesson8;

/**
 * Created by Denis on 2/23/2017.
 */
public class ArrayPrint {
    public static void printlnArray(int[] array){
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }

    public static void printclmnArray(int[] array){
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }

    public static void printMatrix(int[][] matrix, int columns, int rows){
        for (int i = 0; i < columns; ++i, System.out.println()) {
            for (int j = 0; j < rows; ++j) {
                System.out.print(" " + matrix[i][j]);
            }
        }
    }

}
