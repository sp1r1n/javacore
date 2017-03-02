package com.sp1r1n.app.homework.lesson10;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Denis on 3/1/2017.
 */
public class CaesarTest {
    String encoded = "BCDbb}";
    String decoded = "ABCxa{";
    Caesar caesar;

    @Before
    public void init(){
        caesar = new Caesar();
    }
    @Test
    public void doEncrypt() throws Exception {
        assertEquals("BCDybb", caesar.doEncrypt(decoded, 1));
    }

    @Test
    public void doDecrypt() throws Exception {
        assertEquals("ABCaa\u0096", caesar.doDecrypt(encoded, 1));
    }

}