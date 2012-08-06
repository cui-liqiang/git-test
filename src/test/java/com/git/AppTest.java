package com.git;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test
    public void testName() {
        assertEquals("name", new App().getName());
    }
}