package com.vit.demo;

public class AppTestRunner {
    public static void main(String[] args) {
        App app = new App();
        int expected = 5;
        int actual = app.add(2, 3);
        if (actual != expected) {
            System.out.println("Test failed: expected " + expected + " but received " + actual);
            System.exit(1);
        }
        System.out.println("TEST PASSED: App.add(2, 3) returned " + actual + ".");
        System.out.println("ANT BUILD SUCCESSFUL");
    }
}
