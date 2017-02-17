package com.sp1r1n.app.classwork.lesson10;

import java.util.Arrays;

/**
 * Created by DELL on 2/16/2017.
 */
public class MyStringBuilder {
    String plainText = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    String cypherText = "DEFGHIGKL012efghijklm3456UVWXYZ7MNOaxyzbcdnopqrstuvwPQRST89ABC";
    StringBuilder stringBuilder;

    public String[] findWords(String input){
        String[] array = input.split(",");
        return array;
    }

    public StringBuilder charArrayToString(char[] inputCharArray){
        stringBuilder = new StringBuilder();
        for (char value : inputCharArray){
            stringBuilder = stringBuilder.append(value);
        }
        return stringBuilder;
    }

    public String stringEncode (String stringToEncode){
        stringBuilder = new StringBuilder(stringToEncode);
        for (int i = 0; i < stringBuilder.length(); i++){
            for (int j = 0; j < plainText.length(); j++){
                if (stringBuilder.charAt(i) == plainText.charAt(j)){
                    stringBuilder.setCharAt(i, cypherText.charAt(j));
                    break;
                }
            }
        }
        return stringBuilder.toString();
    }

    public String stringDecode (String stringToDecode){
        StringBuilder stringBuilder = new StringBuilder(stringToDecode);
        for (int i = 0; i < stringBuilder.length(); i++){
            for (int j = 0; j < plainText.length(); j++){
                if (stringBuilder.charAt(i) == cypherText.charAt(j)){
                    stringBuilder.setCharAt(i, plainText.charAt(j));
                    break;
                }
            }
        }
        return stringBuilder.toString();
    }



    public static void main(String[] args) {
        MyStringBuilder stringBuilder = new MyStringBuilder();
        char[] charArrayToString = {'a','b','c','d'};
        System.out.println("Decoded: " + stringBuilder.stringEncode("hello"));
        System.out.println("Encoded: " + stringBuilder.stringDecode("nbrru"));
        System.out.println("Converted to string: " + stringBuilder.charArrayToString(charArrayToString));
        System.out.print("Find words: " + Arrays.toString(stringBuilder.findWords("dsflkj dsklfsdkf,lkdsfjldskjf,dlskfdkd,dsfjkds")));
    }
}

