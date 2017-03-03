package com.sp1r1n.runners.homework.lesson14;

import com.sp1r1n.app.homework.lesson14.Bicycle;
import com.sp1r1n.app.homework.lesson14.BicycleWithRing;
import com.sp1r1n.app.homework.lesson14.BicycleWithRingInterface;
import com.sp1r1n.app.homework.lesson14.CustomBicycle;

/**
 * Created by Denis on 3/3/2017.
 */
public class Lesson14Runner {
    public static void main(String[] args) {
        BicycleWithRingInterface bicycleWithRingInterface = new BicycleWithRing();
        System.out.print("IV: ");
        bicycleWithRingInterface.ring();
        System.out.println();
        Bicycle bicycle = new CustomBicycle();
        bicycle.setGear("V: newgear\n");
        System.out.print("VI: ");
        bicycle.ride();
    }
}
