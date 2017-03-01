package com.sp1r1n.app.homework.lesson10;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Denis on 3/1/2017.
 */
public class CaesarTest {
    String encoded = "Ijsnx";
    String decoded = "Denis";
    Caesar caesar;

    @Before
    public void init(){
        caesar = new Caesar();
    }
    @Test
    public void doEncrypt() throws Exception {
        assertEquals(encoded, caesar.doEncrypt(decoded, 5));
    }

    @Test
    public void doDecrypt() throws Exception {
        assertEquals(decoded, caesar.doDecrypt(encoded, 5));
    }

}