package com.sp1r1n.app.homework.lesson12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Denis on 2/27/2017.
 */
public class Human {
    private int age;
    private String name;

    public Human (int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge() { return age; }

    public String getName() { return name; }

    public String setAge(int age){
        if (age > 0 && age < 121){
            this.age = age;
            return "New age is set";
        }
        else return "Age should be between 1 and 120";
    }

    public String setName(String name){
        if (checkName(name)){
            this.name = name;
            return "Name is set";
        }
        else return "Name is not valid. Accepted characters: A-z; point, comma, space, dash";
    }

    public static boolean checkName(String userNameString){
        Pattern p = Pattern.compile("^[A-Za-z-, .]{3,}$");
        Matcher m = p.matcher(userNameString);
        return m.matches();
    }
}
