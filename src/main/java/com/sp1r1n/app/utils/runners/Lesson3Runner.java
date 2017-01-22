package com.sp1r1n.app.utils.runners;

import com.sp1r1n.app.utils.convertors.PrimitiveConvertor;

/**
 * Created by DELL on 1/22/2017.
 */
public class Lesson3Runner {
    public static void main(String[] args) {
        PrimitiveConvertor pc = new PrimitiveConvertor();
        pc.floatToChar(65.5f);
        pc.intToChar(35);
        pc.charToInt('F');
    }
}
