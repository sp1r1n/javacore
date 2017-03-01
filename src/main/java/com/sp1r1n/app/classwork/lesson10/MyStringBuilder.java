package com.sp1r1n.app.classwork.lesson10;

import java.util.Arrays;

/**
 * Created by DELL on 2/16/2017.
 */
public class MyStringBuilder {
    String plainText = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ";
    String cypherText = "QWERTYUIOPqwertyuiopASDFGHJKL 12345asdfghjklZXCVBNM67890zxcvbnm";
    StringBuilder stringBuilder;

    public String[] findWords(String input){
        String[] array = input.split(",");
        return array;
    }

    public String charArrayToString(char[] inputCharArray){
        stringBuilder = new StringBuilder();
        for (char value : inputCharArray){
            stringBuilder = stringBuilder.append(value);
        }
        return stringBuilder.toString();
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
        stringBuilder = new StringBuilder(stringToDecode);
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
}

