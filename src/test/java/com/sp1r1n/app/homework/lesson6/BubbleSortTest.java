package com.sp1r1n.app.homework.lesson6;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.Assert.*;

/**
 * Created by DELL on 2/9/2017.
 */
public class BubbleSortTest {
    @Test
    public void bubbleSortDescTest() throws Exception {
        int[] expecteds = {20, 18, 16, 14, 12, 10, 8, 6, 4, 2};
        RandomArray randomArray = new RandomArray();
        int[] actuals = randomArray.createArrayRandom(20, true, true);
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSortDesc(actuals);
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void bubbleSortAscTest() throws Exception {
        int[] expecteds = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        RandomArray randomArray = new RandomArray();
        int[] actuals = randomArray.createArrayRandom(20, true, true);
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSortAsc(actuals);
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void bubbleSortAscListTest() throws Exception {
        ArrayList<Integer> arrayList = new ArrayList<>();

    }

    @Test
    public void bubbleSortDescListTest() throws Exception {

    }

}