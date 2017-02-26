package com.sp1r1n.runners.classwork.all;

import com.sp1r1n.app.classwork.lesson12.Student;

/**
 * Created by DELL on 1/19/2017.
 */
public class ClassworkRunner {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Getter: " + student.getGroup() + " " + student.getUniversity());
        student.setGroup("DI-09");
        student.setUniversity("European");
        System.out.print("Setter: " + student.getGroup() + " " + student.getUniversity());
    }
}
