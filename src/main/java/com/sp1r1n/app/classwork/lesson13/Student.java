package com.sp1r1n.app.classwork.lesson13;

/**
 * Created by DELL on 2/23/2017.
 */
public class Student extends Person{
    private String university;
    private String group = "DI-07";

    public Student(String name, String university){
        super(name);
        this.university = university;
    }

    public String getGroup(){
        return group;
    }

    public void setGroup (String group){
        this.group = group;
    }

    public String getUniversity(){
        return university;
    }

    public void setUniversity(String university){
        this.university = university;
    }
}
