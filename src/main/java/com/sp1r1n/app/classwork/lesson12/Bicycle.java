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

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        Bicycle bicycletwo = new Bicycle(2);
        Bicycle bicyclethree = new Bicycle(3, "blue");
        Bicycle bicyclefour = new Bicycle(4, "yellow", 5);
        Bicycle bicyclefive = new Bicycle(5, "black", 33, true);
        System.out.println("First bicycle: " + bicycle.color + " " + bicycle.isBig + " " + bicycle.speed + " " + bicycle.wheelSize + " " + bicycle.ride());
        System.out.println("Second bicycle: " + bicycletwo.color + " " + bicycletwo.isBig + " " + bicycletwo.speed + " " + bicycletwo.wheelSize + " " + bicycletwo.ride());
        System.out.println("Third bicycle: " + bicyclethree.color + " " + bicyclethree.isBig + " " + bicyclethree.speed + " " + bicyclethree.wheelSize + " " + bicyclethree.ride());
        System.out.println("Fourth bicycle: " + bicyclefour.color + " " + bicyclefour.isBig + " " + bicyclefour.speed + " " + bicyclefour.wheelSize + " " + bicyclefour.ride());
        System.out.println("Fifth bicycle: " + bicyclefive.color + " " + bicyclefive.isBig + " " + bicyclefive.speed + " " + bicyclefive.wheelSize + " " + bicyclefive.ride());
    }

}
