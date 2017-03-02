package com.sp1r1n.app.classwork.lesson14;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Denis on 3/2/2017.
 */
public class PixelTest {
    @Test
    public void getCoordinates() throws Exception {
        Pixel pixel = new Pixel(4, 6);
        int[] expected = {4, 6};
        assertArrayEquals(expected, pixel.getCoordinates());
    }

}