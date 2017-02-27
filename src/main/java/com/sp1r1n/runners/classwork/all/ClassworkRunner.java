package com.sp1r1n.runners.classwork.all;

import com.sp1r1n.app.classwork.lesson13.Person;
import com.sp1r1n.app.classwork.lesson13.Teacher;

/**
 * Created by DELL on 1/19/2017.
 */
public class ClassworkRunner {
    public static void main(String[] args) {
        Person person = new Person("Den");
        System.out.println(person.walk());

        Teacher teacher = new Teacher("Den", "math");
        System.out.println(teacher.walk());
        System.out.println(teacher.startLesson());
    }
}
