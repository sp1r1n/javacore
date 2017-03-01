package com.sp1r1n.app.classwork.lesson4;

/**
 * Created by DELL on 1/26/2017.
 */
public class CircleSquare {
    double circleArea1;
    double circleArea2;
    boolean[] result = {false, false, false};

    public boolean[] calculateCheck(double circleRadius1, double circleRadius2) {
        circleArea1 = Math.pow(circleRadius1, 2) * Math.PI;
        circleArea2 = Math.pow(circleRadius2, 2) * Math.PI;
        if (circleArea1 > circleArea2) {
            result[0] = true;
        }
        else if (circleArea1 < circleArea2) {
            result[1] = true;
        }
        else {
            result[2] = true;
        }
        return result;
    }




}
