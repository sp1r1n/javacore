package com.sp1r1n.app.classwork.lesson10;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Denis on 3/1/2017.
 */
public class MyStringBuilderTest {
    MyStringBuilder builder;
    String wordTest = "test,sequence,with,commas";
    String encoded = "rhNZ9";
    String decoded = "Denis";

    @Before
    public void init(){
        builder = new MyStringBuilder();
    }

    @Test
    public void findWords() throws Exception {
        String[] arrayTest = {"test", "sequence", "with", "commas"};
        Assert.assertArrayEquals(arrayTest, builder.findWords(wordTest));
    }

    @Test
    public void charArrayToString() throws Exception {
        char[] chars = {'D', 'e', 'n', 'i', 's'};
        Assert.assertEquals(decoded, builder.charArrayToString(chars));
    }

    @Test
    public void stringEncode() throws Exception {
        Assert.assertEquals(encoded, builder.stringEncode(decoded));
    }

    @Test
    public void stringDecode() throws Exception {
        Assert.assertEquals(decoded, builder.stringDecode(encoded));
    }

}