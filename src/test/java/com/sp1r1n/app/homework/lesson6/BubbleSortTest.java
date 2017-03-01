package com.sp1r1n.app.homework.lesson6;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import static org.junit.Assert.*;

/**
 * Created by DELL on 2/9/2017.
 */
public class BubbleSortTest {
    BubbleSort bubbleSort;
    RandomArray randomArray;
    int[] asc = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
    int[] desc = {20, 18, 16, 14, 12, 10, 8, 6, 4, 2};
    ArrayList<Integer> ascList = new ArrayList<>();
    ArrayList<Integer> descList = new ArrayList<>();
    Lists lists = new Lists();
    int[] actArr;

    @Before
    public void init(){
        bubbleSort = new BubbleSort();
        randomArray = new RandomArray();
        int index = 0;
        for (int i = 0; i < 10; i++) {
            ascList.add(i, i);
        }
        for (int j = 9; j >= 0; j--) {
            descList.add(index, j);
            index++;
        }
    }

    @Test
    public void bubbleSortDescTest() throws Exception {
        bubbleSort.bubbleSortDesc(asc);
        assertArrayEquals(desc, asc);
    }

    @Test
    public void bubbleSortAscTest() throws Exception {
        bubbleSort.bubbleSortAsc(desc);
        assertArrayEquals(asc, desc);

    }

    @Test
    public void bubbleSortAscListTest() throws Exception {
        bubbleSort.bubbleSortAsc(descList);
        actArr = lists.listToArray(descList);
        int[] expArr = {0,1,2,3,4,5,6,7,8,9};
        Assert.assertArrayEquals(actArr, actArr);
    }

    @Test
    public void bubbleSortDescListTest() throws Exception {
        bubbleSort.bubbleSortDesc(ascList);
        actArr = lists.listToArray(ascList);
        int[] expArr = {9,8,7,6,5,4,3,2,1,0};
        Assert.assertArrayEquals(expArr, actArr);
    }

}