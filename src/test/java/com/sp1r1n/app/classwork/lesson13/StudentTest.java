package com.sp1r1n.app.classwork.lesson13;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Denis on 3/2/2017.
 */
public class StudentTest {

    Student student;

    @Before
    public void init(){
        student = new Student("Denv", "EU");
    }

    @Test
    public void getGroup() throws Exception {
        assertEquals("DI-07", student.getGroup());
    }

    @Test
    public void setGroup() throws Exception {
        student.setGroup("UE");
        assertEquals("UE", student.getGroup());
    }

    @Test
    public void getUniversity() throws Exception {
        assertEquals("EU", student.getUniversity());
    }

    @Test
    public void setUniversity() throws Exception {
        student.setUniversity("FAFA");
        assertEquals("FAFA", student.getUniversity());
    }

}