package com.sp1r1n.runners.homework.Lesson10;

import com.sp1r1n.app.classwork.lesson10.MyStringBuilder;
import com.sp1r1n.app.homework.lesson10.ArrayParser;
import com.sp1r1n.app.homework.lesson10.Caesar;

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
        String toEncrypt = "";
        Caesar caesar = new Caesar();
        MyStringBuilder stringBuilder = new MyStringBuilder();
        do {
            try {
                System.out.print("\n___________________________\nPlease select any function:\n" +
                        "1: b&c point in homework: arrayparser with delimeter\n" +
                        "2: enigma\n" +
                        "3: caesar\n" +
                        "type 'exit' for exit\n____________________\n");
                readLine = scanner.next();
                switch (readLine) {
                    case "1":
                        System.out.println("Input some delimiter: ");
                        String delimiter = scanner.next();
                        System.out.println("Imput some string using your delimiter: ");
                        String userString = scanner.next();
                        String formattedText = "";
                        List<String> userList = arrayParser.listParse(userString, delimiter);
                        for (String value : userList)
                            formattedText += value + "\n";
                        System.out.println(formattedText);
                        break;
                    case "2":
                        System.out.println("Input some string for encrypt: ");
                        String toEncode = scanner.next();
                        String toDecode = stringBuilder.stringEncode(toEncode);
                        System.out.println("Encrypted word: " + toDecode);
                        System.out.println("Decrypted word: " + stringBuilder.stringDecode(toDecode));
                        break;
                    case "3":
                        System.out.println("Input some string for encrypt: ");
                        toEncrypt = scanner.next();
                        System.out.println("Input key: ");
                        int key = scanner.nextInt();
                        toEncrypt = caesar.doEncrypt(toEncrypt, key);
                        System.out.println("Encrypted word: " + toEncrypt);
                        System.out.println("Decrypted word: " + caesar.doDecrypt(toEncrypt, key));
                        break;
                    case "exit":
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
