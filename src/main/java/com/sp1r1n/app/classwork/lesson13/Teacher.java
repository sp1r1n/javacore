package com.sp1r1n.app.classwork.lesson13;

/**
 * Created by DELL on 2/27/2017.
 */
public class Teacher extends Person{
    private String subject;

    public Teacher(String name, String subject){
        super(name);
        this.subject = subject;
    }

    public String getSubject(){
        return subject;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public final String startLesson(){
        return subject + " is started by " + name;
    }

    @Override
    public String walk(){
        return "Teacher " + name + " walks";
    }
}
