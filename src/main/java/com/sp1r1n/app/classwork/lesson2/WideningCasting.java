package com.sp1r1n.app.classwork.lesson2;

/**
 * Created by DELL on 1/19/2017.
 */
public class WideningCasting {

    byte byte1 = 127;
    short short1 = 0;
    int int1 = 0;
    long long1 = 0L;
    float float1 = 0.0f;
    double double1 = 0.0d;
    public double widening(){
        double1 = float1 = long1 = int1 = short1 = byte1;
        return double1;
    }
}
