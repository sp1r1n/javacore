package com.sp1r1n.app.classwork.lesson7;

import com.sp1r1n.app.homework.lesson11.FileWorker;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by DELL on 2/9/2017.
 */
public class CharArray {

    public char[] charArrayFromInts (){
        char[] charArray = new char[256];
        for (int i = 0; i < 255; i++){
            charArray[i] = (char) i;
        }
        return charArray;
    }
}
