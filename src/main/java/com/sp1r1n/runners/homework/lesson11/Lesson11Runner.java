package com.sp1r1n.runners.homework.lesson11;

import com.sp1r1n.app.homework.lesson10.ArrayParser;
import com.sp1r1n.app.homework.lesson11.FileWorker;
import com.sp1r1n.app.homework.lesson6.BubbleSort;
import com.sp1r1n.app.homework.lesson9.Palindrome;

import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by DELL on 2/26/2017.
 */
public class Lesson11Runner {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> listStr;
        ArrayList<Integer> listInt = new ArrayList<>();
        ArrayParser arrayParser = new ArrayParser();
        FileWorker fileWorker = new FileWorker();
        BubbleSort bubbleSort = new BubbleSort();
        Scanner scanner = new Scanner(System.in);
        String readLine;
        String readText;
        String writeText = "";
        do try {
            System.out.print("\n___________________________\nPlease select any function:\n" +
                    "1: b&c point in homework: arrayparser with delimeter\n" +
                    "2: enigma\n" +
                    "3: caesar\n" +
                    "type 'exit' for exit\n____________________\n");
            readLine = scanner.next();
            switch (readLine) {
                case "1":
                    readText = fileWorker.read("E:\\test\\test.txt").replaceAll("\\p{Cntrl}", "");
                    listStr = (ArrayList<String>) arrayParser.listParse(readText, ",");
                    for (int i = 0; i < listStr.size(); i++)
                        listInt.add(i, Integer.parseInt(listStr.get(i)));
                    bubbleSort.bubbleSortAsc(listInt);
                    for (int i : listInt)
                        writeText += i + "\n";
                    fileWorker.write("E:\\test\\output.txt", writeText);
                    break;
                case "2":
                    Palindrome palindrome = new Palindrome();
                    readText = fileWorker.read("E:\\test\\task2.txt");
                    listStr = (ArrayList<String>) arrayParser.listParse(readText, "\n");
                    for (String s : listStr){
                        if (palindrome.isPalindromicLoop(s) == true)
                            writeText += s + " is palindrome\n";
                        else writeText += s + " is not palindrome\n";
                    }
                    fileWorker.write("E:\\test\\output2.txt", writeText);
                case "exit":
                    break;
                default:
                    System.out.print("No such point here\n");
            }
        } catch (Exception e) {
            System.out.print("Error: Value is not correct. Try again\n");
        }
        while (true);
    }
}
