package com.sp1r1n.app.homework.lesson12;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Denis on 3/2/2017.
 */
public class WhiteCollarTest {

    WhiteCollar whiteCollar;

    @Before
    public void init(){
        whiteCollar = new WhiteCollar(15, "Ricky", "Morion");
    }
    @Test
    public void getCompanyName() throws Exception {
        assertEquals("Morion", whiteCollar.getCompanyName());
    }

    @Test
    public void setCompanyName() throws Exception {
        assertEquals("Company Name is set", whiteCollar.setCompanyName("Bla, .-"));
        assertEquals("Company Name is not valid. Accepted characters: A-z; point, comma, space, dash", whiteCollar.setCompanyName("!@#"));
    }

}