package com.sp1r1n.runners.homework.lesson9;

import com.sp1r1n.app.homework.lesson9.Palindrome;

import java.util.Scanner;

/**
 * Created by Denis on 2/16/2017.
 */
public class Lesson9Runner {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input some string: ");
        String input = scanner.nextLine();
        System.out.println("1st method " + palindrome.isPalindromicLoop(input));
        System.out.println("2nd method " + palindrome.isPalindromicHalf(input));
        System.out.println("3rd method " + palindrome.isPalindromicReverse(input));
    }
}
