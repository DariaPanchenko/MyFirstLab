package com.example.myfirstlab;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void max1_isCorrect() {
        MainActivity m = new MainActivity();
        assertEquals(m.max(3,8), 8);
    }
    @Test
    public void max2_isCorrect() {
        MainActivity m = new MainActivity();
        assertEquals(m.max(7,-3), 7);
    }

    @Test
    public void max3_isCorrect() {
        MainActivity m = new MainActivity();
        assertEquals(m.max(0,0), 0);
    }

    @Test
    public void max4_isCorrect() {
        MainActivity m = new MainActivity();
        assertEquals(m.max(-7,0), 0);
    }

    @Test
    public void min1_isCorrect() {
        MainActivity m = new MainActivity();
        assertEquals(m.min(2,5), 2);
    }

    @Test
    public void min2_isCorrect() {
        MainActivity m = new MainActivity();
        assertEquals(m.min(4,1), 1);
    }

    @Test
    public void min3_isCorrect() {
        MainActivity m = new MainActivity();
        assertEquals(m.min(0,0), 0);
    }

    @Test
    public void min4_isCorrect() {
        MainActivity m = new MainActivity();
        assertEquals(m.min(-8,0), -8);
    }
}