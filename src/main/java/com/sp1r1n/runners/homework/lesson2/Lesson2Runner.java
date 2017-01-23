package com.sp1r1n.runners.homework.lesson2;

import com.sp1r1n.app.homework.lesson2.PrimitiveConvertor;

/**
 * Created by DELL on 1/22/2017.
 */
public class Lesson2Runner {
    public static void main(String[] args) {
        PrimitiveConvertor pc = new PrimitiveConvertor();
        pc.floatToChar(65.5f);
        pc.intToChar(35);
        pc.charToInt('F');
    }
}
