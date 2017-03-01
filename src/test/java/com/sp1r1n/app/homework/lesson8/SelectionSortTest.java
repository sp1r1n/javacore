package com.sp1r1n.app.homework.lesson8;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Denis on 3/1/2017.
 */
public class SelectionSortTest {
    int[] asc = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
    int[] desc = {20, 18, 16, 14, 12, 10, 8, 6, 4, 2};;
    SelectionSort selectionSort;

    @Before
    public void init(){
        selectionSort = new SelectionSort();
    }
    @Test
    public void doSelectionSortAsc() throws Exception {
        assertArrayEquals(asc, selectionSort.doSelectionSortAsc(desc));
    }

    @Test
    public void doSelectionSortDesc() throws Exception {
        assertArrayEquals(desc, selectionSort.doSelectionSortDesc(asc));
    }

}