package com.sp1r1n.app.classwork.lesson7;

/**
 * Created by DELL on 2/9/2017.
 */
public class CharArray {

    public void charArrayFromInts (){
        char[] array = new char[256];
        for (int i = 0; i < 255; i++){
            array[i] = (char) i;
        }

        return;
    }
}
