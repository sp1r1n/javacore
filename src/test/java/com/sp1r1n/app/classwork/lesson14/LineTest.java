package com.sp1r1n.app.classwork.lesson14;

import com.sp1r1n.app.homework.lesson6.Lists;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Denis on 3/2/2017.
 */
public class LineTest {
    Pixel pixel1;
    Pixel pixel2;
    Pixel pixel3;
    Line line;
    int[] expected = {10, 14, 14, 18, 18, 21};

    @Before
    public void init(){
        pixel1 =  new Pixel(10, 14);
        pixel2 =  new Pixel(14, 18);
        pixel3 =  new Pixel(18, 21);
        line = new Line(10, 20);
        line.addPixel(pixel1);
        line.addPixel(pixel2);
        line.addPixel(pixel3);
    }
    @Test
    public void addPixel() throws Exception {
        Pixel pix = new Pixel(4, 2);
        Line line2 = new Line(1, 1);
        line2.addPixel(pix);
        int[] arr = {4 , 2};
        assertArrayEquals(arr, line2.getCoordinates());
    }

    @Test
    public void getCoordinates() throws Exception {
        assertArrayEquals(expected, line.getCoordinates());
    }

}