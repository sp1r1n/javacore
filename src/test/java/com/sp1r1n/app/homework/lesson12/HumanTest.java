package com.sp1r1n.app.homework.lesson12;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Denis on 3/2/2017.
 */
public class HumanTest {
    Human human;

    @Before
    public void init(){
        human = new Human(12, "Den");
    }

    @Test
    public void getAge() throws Exception {
        assertEquals(12, human.getAge());
    }

    @Test
    public void getName() throws Exception {
        assertEquals("Den", human.getName());
    }

    @Test
    public void setAge() throws Exception {
        assertEquals("New age is set", human.setAge(15));
        assertEquals("Age should be between 1 and 120", human.setAge(0));
    }

    @Test
    public void setName() throws Exception {
        assertEquals("Name is set", human.setName("vava .-"));
        assertEquals("Name is not valid. Accepted characters: A-z; point, comma, space, dash", human.setName("!@#"));
    }

    @Test
    public void checkName() throws Exception {
        assertTrue(Human.checkName("Den"));
        assertFalse(Human.checkName("#@!"));
    }

}