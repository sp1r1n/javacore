package com.sp1r1n.app.homework.lesson14;

/**
 * Created by Denis on 3/3/2017.
 */
public abstract class Bicycle {
    private int speed;
    private String gear;
    public void ride(){ System.out.print("Wroom!");}
    public abstract void setSpeed(int speed);
    public abstract void setGear(String gear);
}
