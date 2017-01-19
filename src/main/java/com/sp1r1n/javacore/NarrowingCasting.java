package com.sp1r1n.javacore;

/**
 * Created by DELL on 1/19/2017.
 */
public class NarrowingCasting {
    int int1 = 127;
    float float1 = 0.0f;

    public void narrowing(){
        float1 = int1;
        System.out.println(float1);
    }

    public static void main(String[] args) {
        NarrowingCasting nc = new NarrowingCasting();
        nc.narrowing();
    }
}
