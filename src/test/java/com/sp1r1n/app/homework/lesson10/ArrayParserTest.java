package com.sp1r1n.app.homework.lesson10;

import com.sp1r1n.app.homework.lesson6.Lists;
import com.sp1r1n.app.homework.lesson8.ArrayPrint;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Denis on 3/1/2017.
 */
public class ArrayParserTest {
    ArrayParser arrayParser;
    Lists lists;
    String[] arr = {"Den", "Spirin", "is", "cool"};
    @Before
    public void init(){
        arrayParser = new ArrayParser();
        lists = new Lists();
    }

    @Test
    public void arrayParse() throws Exception {
        assertArrayEquals(arr, arrayParser.arrayParse("Den Spirin is cool", " "));
    }

    @Test
    public void listParse() throws Exception {
        ArrayList<String> list;
        list = lists.arrayToList(arr);
        assertArrayEquals(list.toArray(), arrayParser.listParse("Den Spirin is cool", " ").toArray());
    }

}