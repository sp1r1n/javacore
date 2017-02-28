package com.sp1r1n.runners.homework.lesson12;

import com.sp1r1n.app.homework.lesson12.Human;
import com.sp1r1n.app.homework.lesson12.WhiteCollar;

import java.util.Scanner;

/**
 * Created by Denis on 2/27/2017.
 */
public class Lesson12Runner {
    public static void main(String[] args) {
        String readLine = "";
        Scanner scanner;
        Human human;
        WhiteCollar whiteCollar;
        int age;
        String name;
        String companyName;
        do try {
            System.out.print("\n___________________________\nPlease select any function:\n" +
                    "1: Create Human\n" +
                    "2: Create WhiteCollar\n" +
                    "type 'exit' for exit\n____________________\n");
            scanner = new Scanner(System.in);
            readLine = scanner.nextLine();
            switch (readLine) {
                case "1":
                    System.out.println("Print age");
                    age = scanner.nextInt();
                    System.out.println("Print name");
                    name = scanner.nextLine();
                    human = new Human(age, name);
                    System.out.println("New human. Name: " + human.getName() + ", age: " + human.getAge());
                    do {
                        System.out.println("Do you want to change something?");
                        readLine = scanner.nextLine();
                        switch (readLine){
                            case "y":
                                System.out.println("Print age");
                                System.out.println(human.setAge(scanner.nextInt()));
                                System.out.println("Print name");
                                System.out.println(human.setName(scanner.nextLine()));
                                System.out.println("Human is changed. Name: " + human.getName() + ", age: " + human.getAge());
                                break;
                            case "n":
                                break;
                            default:
                                System.out.print("Please print 'y' or 'n'\n");
                        }
                    }
                    while (!readLine.equals("n"));
                    break;
                case "2":
                    System.out.println("Print age");
                    age = scanner.nextInt();
                    System.out.println("Print name");
                    name = scanner.nextLine();
                    System.out.println("Print company");
                    companyName = scanner.nextLine();
                    whiteCollar = new WhiteCollar(age, name, companyName);
                    System.out.println("New White Collar. Name: " + whiteCollar.getName() + ", age: " + whiteCollar.getAge()
                            + ", company: " + whiteCollar.getCompanyName());
                    do {
                        System.out.println("Do you want to change something?");
                        readLine = scanner.nextLine();
                        switch (readLine){
                            case "y":
                                System.out.println("Print age");
                                System.out.println(whiteCollar.setAge(scanner.nextInt()));
                                System.out.println("Print name");
                                System.out.println(whiteCollar.setName(scanner.nextLine()));
                                System.out.println("Print company");
                                System.out.println(whiteCollar.setCompanyName(scanner.nextLine()));
                                System.out.println("White Collar is changed. Name: " + whiteCollar.getName() + ", age: " + whiteCollar.getAge()
                                        + ", company: " + whiteCollar.getCompanyName());
                                break;
                            case "n":
                                break;
                            default:
                                System.out.print("Please print 'y' or 'n'\n");
                        }
                    }
                    while (!readLine.equals("n"));

                    break;
                case "exit":
                    break;
                default:
                    System.out.print("No such point here\n");
                    break;
            }
        } catch (Exception e) {
            System.out.print("Error: Value is not correct. Try again\n" + e);
        }
        while (!readLine.equals("exit"));
    }
}
