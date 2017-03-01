package com.sp1r1n.app.homework.lesson9;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Denis on 3/1/2017.
 */
public class PalindromeTest {
    Palindrome palindrome;

    @Before
    public void init(){
        palindrome = new Palindrome();
    }

    @Test
    public void isPalindromicLoop() throws Exception {
        assertTrue(palindrome.isPalindromicLoop("mooom"));
    }

    @Test
    public void isPalindromicHalf() throws Exception {
        assertTrue(palindrome.isPalindromicHalf("mooom"));
    }

    @Test
    public void isPalindromicReverse() throws Exception {
        assertTrue(palindrome.isPalindromicReverse("mooom"));
    }

}