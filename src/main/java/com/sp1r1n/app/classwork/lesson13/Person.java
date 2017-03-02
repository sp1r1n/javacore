package com.sp1r1n.app.classwork.lesson13;

/**
 * Created by DELL on 2/27/2017.
 */
public class Person {
    protected final String name;

    public Person (String name){
        this.name = name;
    }

    public String getName() { return name; }

    public String walk(){
        return "Person " + name + " walks";
    }
}
