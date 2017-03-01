package com.sp1r1n.app.classwork.lesson7;

import com.sp1r1n.app.homework.lesson11.FileWorker;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Denis on 3/1/2017.
 */
public class CharArrayTest {
    @Test
    public void charArrayFromInts() throws Exception {
        char[] chars = new char[256];
        for (int i = 0; i < 255; i++){
            chars[i] = (char) i;
        }
        CharArray charArray = new CharArray();
        assertArrayEquals(chars, charArray.charArrayFromInts());
    }

}