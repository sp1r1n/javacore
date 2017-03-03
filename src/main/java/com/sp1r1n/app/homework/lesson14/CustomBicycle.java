package com.sp1r1n.app.homework.lesson14;

import java.util.SplittableRandom;

/**
 * Created by Denis on 3/3/2017.
 */
public class CustomBicycle extends Bicycle{

    private int speed;
    private String gear;
    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.print(speed);
    }

    @Override
    public void setGear(String gear) {
        this.gear = gear;
        System.out.print(gear);
    }

    @Override
    public void ride(){
        System.out.print("Wshhhh!");
    }
}
