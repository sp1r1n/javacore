package com.sp1r1n.app.homework.lesson11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by DELL on 2/23/2017.
 */
public class ArrayReader {
    public ArrayList<String> readFile(String inputFile){
        ArrayList<String> outputList = new ArrayList<>();
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String line;
            int index = 0;
            while ((line = reader.readLine()) != null){
                outputList.add(index, line);
                index++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return outputList;
    }

    public static void main(String[] args) {
        ArrayReader arrayReader = new ArrayReader();
        System.out.print(arrayReader.readFile("E:\\input.txt"));
    }
}
