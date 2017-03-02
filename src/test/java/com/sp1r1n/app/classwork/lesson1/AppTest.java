package com.sp1r1n.app.classwork.lesson1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Denis on 3/2/2017.
 */
public class AppTest {
    @Test
    public void AppTest(){
        App app = new App();
        assertEquals("Hello World", app.helloWorld());
    }

}