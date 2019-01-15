package com.stackroute.pe4_test;

import com.stackroute.pe4.SortWords;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortWordsTest {
    SortWords sortWords;
    @Before
    public void setUp()  {
        sortWords = new SortWords();
    }

    @After
    public void tearDown() {
        sortWords = null;
    }

    @Test
    public void sortWordsSuccess1() {
        String []actual = sortWords.sortWords("This is a paragraph");
        String []expected = {"a","is","paragraph","this"};
        assertArrayEquals(expected,actual);
    }
    @Test
    public void sortWordsSuccess2() {
        String []actual = sortWords.sortWords("I cover Java Regular Expressions");
        String []expected = {"cover","expressions","i","java","regular"};
        assertArrayEquals(expected,actual);
    }
}