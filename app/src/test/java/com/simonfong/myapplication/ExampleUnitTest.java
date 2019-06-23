package com.simonfong.myapplication;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void getdfd(){

        String d8 = new BigInteger("d8",16).toString(10);
        System.out.print(d8);
    }
}