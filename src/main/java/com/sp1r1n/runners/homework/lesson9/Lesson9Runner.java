package com.sp1r1n.runners.homework.lesson9;

import com.sp1r1n.app.homework.lesson9.Palyndrom;

import java.util.Scanner;

/**
 * Created by Denis on 2/16/2017.
 */
public class Lesson9Runner {
    public static void main(String[] args) {
        Palyndrom palyndrom = new Palyndrom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input some string: ");
        String input = scanner.nextLine();
        System.out.println(palyndrom.isPalindromicFirst(input));
        System.out.println(palyndrom.isPalindromicSecond(input));
        System.out.println(palyndrom.isPalindromicThird(input));
    }
}
