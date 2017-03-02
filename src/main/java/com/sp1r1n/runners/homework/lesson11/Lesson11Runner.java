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
        FileWorker fileWorker;
        BubbleSort bubbleSort = new BubbleSort();
        Scanner scanner;
        String readLine = "";
        String readText;
        String writeText;
        String path;
        String fileName;
        String[] arrayPath;
        do try {
            scanner = new Scanner(System.in);
            System.out.print("Enter working path: ");
            path = scanner.next();
            arrayPath = arrayParser.arrayParse(path, "");
            if (!arrayPath[1].equals(":")  || !arrayPath[2].equals("\\")) {
                do {
                    System.out.println("Please specify correct path, e.g.: E:\\some_folder\\");
                    path = scanner.next();
                    arrayPath = arrayParser.arrayParse(path, "");
                }
                while (!arrayPath[1].equals(":")  || !arrayPath[2].equals("\\"));
            }
            fileWorker = new FileWorker(path);
            path = fileWorker.pathFix();
            System.out.flush();
            System.out.print("\n___________________________\nPlease select any function:\n" +
                    "1: read numbers from file, sort them, write to another file\n" +
                    "2: read words from file, define if it's palindrome, write to another file\n" +
                    "3: read user input, write to another file\n" +
                    "type 'exit' for exit\n____________________\n");
            readLine = scanner.next();
            switch (readLine) {
                case "1":
                    System.out.print("Please enter filename: ");
                    fileName = path + scanner.next();
                    readText = fileWorker.read(fileName).replaceAll("\\p{Cntrl}", "");
                    listStr = (ArrayList<String>) arrayParser.listParse(readText, ",");
                    writeText = "";
                    for (int i = 0; i < listStr.size(); i++)
                        listInt.add(i, Integer.parseInt(listStr.get(i)));
                    bubbleSort.bubbleSortAsc(listInt);
                    for (int i : listInt)
                        writeText += i + "\n";
                    fileWorker.write(path + "output1.txt", writeText);
                    System.out.println("DONE Check your file!\n_________________");
                    break;
                case "2":
                    System.out.print("Please enter filename: ");
                    fileName = path + scanner.next();
                    Palindrome palindrome = new Palindrome();
                    readText = fileWorker.read(fileName);
                    listStr = (ArrayList<String>) arrayParser.listParse(readText, "\n");
                    writeText = "";
                    for (String s : listStr) {
                        if (palindrome.isPalindromicLoop(s))
                            writeText += s + " is palindrome\n";
                        else writeText += s + " is not palindrome\n";
                    }
                    fileWorker.write(path + "output2.txt", writeText);
                    System.out.println("DONE Check your file!\n_________________");
                    break;
                case "3":
                    System.out.println("Please enter filename: ");
                    fileName = path + scanner.next();
                    writeText = "";
                    System.out.println("Hold entering some words. Press enter to separate them. Enter 'exit' when done: ");
                    do {
                        readLine = scanner.nextLine();
                        writeText += readLine + "\n";
                    }
                    while (!readLine.equals("exit"));
                    fileWorker.write(fileName, writeText);
                    System.out.println("DONE Check your file!\n_________________");
                    break;
                case "exit":
                    break;
                default:
                    System.out.print("No such point here\n");
            }
        } catch (Exception e) {
            System.out.print("Error: Value is not correct. Try again\n" + e);
        }
        while (!readLine.equals("exit"));
    }
}
