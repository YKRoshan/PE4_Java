package com.stackroute.pe4_test;

import com.stackroute.pe4.CountOccurrencesOfChar;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountOccurrencesOfCharTest {
    CountOccurrencesOfChar countOccurrencesOfChar;
    @Before
    public void setUp() {
        countOccurrencesOfChar = new CountOccurrencesOfChar();
    }

    @After
    public void tearDown() {
        countOccurrencesOfChar = null;
    }

    @Test
    public void countOccurrencesOfCharSuccess() {
        String input = "This is a string.";
        int actual = countOccurrencesOfChar.countOccurrencesOfChar(input,"i");
        int expected = 3;
        assertEquals(expected,actual);
    }
    @Test
    public void countOccurrencesOfCharFail() {
        String input = "This is an another string.";
        int actual = countOccurrencesOfChar.countOccurrencesOfChar(input,"a");
        int expected = 5;
        assertNotEquals(expected,actual);
    }
}