package com.sp1r1n.runners.homework.Lesson10;

import com.sp1r1n.app.homework.lesson10.ArrayParser;
import com.sp1r1n.app.homework.lesson6.Lists;

import java.util.List;
import java.util.Scanner;

/**
 * Created by Denis on 2/17/2017.
 */
public class Lesson10Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayParser arrayParser = new ArrayParser();
        String readLine = "";
        do {
            try {
                System.out.print("\n___________________________\nPlease select any function:\n");
                readLine = scanner.nextLine();
                switch (readLine) {
                    case "b":
                        System.out.println("Input some delimiter: ");
                        String delimiter = scanner.nextLine();
                        System.out.println("Imput some string using your delimiter: ");
                        String userString = scanner.nextLine();
                        String formattedText = "";
                        List<String> userList = arrayParser.listParse(userString, delimiter);
                        for (String value : userList)
                            formattedText += value + "\n";
                        System.out.println(formattedText);
                        break;
                    default:
                        System.out.print("No such point here\n");
                }
            } catch (Exception e) {
                System.out.print("Error: Value is not correct. Try again\n");
            }
        }
        while (true);
    }
}
