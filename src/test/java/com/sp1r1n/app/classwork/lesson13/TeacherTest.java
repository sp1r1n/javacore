package com.sp1r1n.app.classwork.lesson13;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Denis on 3/2/2017.
 */
public class TeacherTest {
    Teacher teacher;

    @Before
    public void init(){
        teacher = new Teacher("Serg", "OOP");
    }

    @Test
    public void getSubject() throws Exception {
        assertEquals("OOP", teacher.getSubject());
    }

    @Test
    public void setSubject() throws Exception {
        teacher.setSubject("FFA");
        assertEquals("FFA", teacher.getSubject());
    }

    @Test
    public void startLesson() throws Exception {
        assertEquals("OOP is started by Serg", teacher.startLesson());
    }

    @Test
    public void walk() throws Exception {
        assertEquals("Teacher Serg walks", teacher.walk());
    }

}