package com.sp1r1n.app.classwork.lesson13;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Denis on 3/2/2017.
 */
public class PersonTest {
    Person person;

    @Before
    public void init(){
        person = new Person("Denv");
    }
    @Test
    public void getName() throws Exception {
        assertEquals("Denv", person.getName());
    }

    @Test
    public void walk() throws Exception {
        assertEquals("Person Denv walks", person.walk());
    }

}