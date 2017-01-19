package com.sp1r1n.javacore;

/**
 * Created by DELL on 1/19/2017.
 */
public class WideningCasting {
    public static void main(String[] args) {
        WideningCasting wd = new WideningCasting();
        wd.Widening();
    }

    byte byte1 = 127;
    short short1 = 0;
    int int1 = 0;
    long long1 = 0L;
    float float1 = 0.0f;
    double double1 = 0.0d;
    //correct conversion 64f<=32f<=64<=32<=16<=8
    public void Widening(){
        double1 = float1 = long1 = int1 = short1 = byte1;
        System.out.println(double1 + " ( ͡° ͜ʖ ͡°) ");
    }
}
