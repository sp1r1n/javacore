package com.sp1r1n.app.classwork.lesson12;

/**
 * Created by DELL on 2/23/2017.
 */
public class Student {
    private String university;
    private String group = "DI-07";

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
