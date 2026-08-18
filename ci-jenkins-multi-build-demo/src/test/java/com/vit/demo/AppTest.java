package com.vit.demo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testAdd() {
        App app = new App();
        int expected = 5;
        int actual = app.add(2, 3);
        assertEquals("TEST PASSED: App.add(2, 3) returned " + actual + ".", expected, actual);
        System.out.println("TEST PASSED: App.add(2, 3) returned " + actual + ".");
    }
}
