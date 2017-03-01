package com.sp1r1n.app.classwork.lesson4;


/**
 * Created by Denis on 27.01.2017.
 */
public class RightAngle {
    boolean result;

    public boolean isRightAngle(double a, double b, double c){
        if (Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2) || Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2) || Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)){
            result = true;
        }
        else {
            result = false;
        }
        return result;
    }
}
