package com.sp1r1n.app.classwork.lesson12;

/**
 * Created by DELL on 2/23/2017.
 */
public class Bicycle {
    private int wheelSize;
    private String color;
    private boolean isBig;
    private double speed;

    public Bicycle(){
        this.color = "red";
        this.isBig = false;
        this.speed = 40.0f;
        this.wheelSize = 5;
    }

    public Bicycle(int wheelSize){
        this();
        this.wheelSize = wheelSize;
    }

    public Bicycle(int wheelSize, String color){
        this();
        this.wheelSize = wheelSize;
        this.color = color;
    }

    public Bicycle(int wheelSize, String color, double speed){
        this();
        this.wheelSize = wheelSize;
        this.color = color;
        this.speed = speed;
    }

    public Bicycle(int wheelSize, String color, double speed, boolean isBig){
        this.wheelSize = wheelSize;
        this.color = color;
        this.speed = speed;
        this.isBig = isBig;
    }

    public String ride(){
        return "\nWroom!";
    }

}
