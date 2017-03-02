package com.sp1r1n.app.homework.lesson10;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Denis on 3/2/2017.
 */
public class StringSortTest {
    String expectedCaseInsens = "dEnZz";
    String expectedCaseSensAsc = "EZdnz";
    String expectedCaseSensDesc = "zndZE";

    String actual = "EZznd";
    StringSort stringSort;

    @Before
    public void init(){
        stringSort = new StringSort();
    }
    @Test
    public void sortCaseIgnore() throws Exception {
        assertEquals(expectedCaseInsens, stringSort.sortCaseIgnore(actual));
    }

    @Test
    public void sortStringAsc() throws Exception {
        assertEquals(expectedCaseSensAsc, stringSort.sortStringAsc(actual));
    }

    @Test
    public void sortStringDesc() throws Exception {
        assertEquals(expectedCaseSensDesc, stringSort.sortStringDesc(actual));
    }

    @Test
    public void main() throws Exception {

    }

}