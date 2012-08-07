package com.git;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AppTest {
    @Test
    public void testName() {
        assertEquals("name", new App().getName());

        assertTrue(false);
    }

    @Test
    public void myTest(){
        assertEquals("123","123");

    }

}