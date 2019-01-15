package com.stackroute.pe4_test;

import com.stackroute.pe4.ReplaceAllDwithFandLwithT;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceAllDwithFandLwithTTest {
    ReplaceAllDwithFandLwithT replaceAllDwithFandLwithT;
    @Before
    public void setUp() {
        replaceAllDwithFandLwithT =new ReplaceAllDwithFandLwithT();
    }

    @After
    public void tearDown()  {
        replaceAllDwithFandLwithT = null;
    }

    @Test
    public void replaceAllDwithFandLwithTSuccess() {
        String actual = replaceAllDwithFandLwithT.replaceAllDwithFandLwithT("daily dry");
        String expected = "faity fry";
        assertEquals(expected,actual);
    }
    @Test
    public void replaceAllDwithFandLwithTFail() {
        String actual = replaceAllDwithFandLwithT.replaceAllDwithFandLwithT("long distance");
        String expected = "long fistance";
        assertNotEquals(expected,actual);
    }
}