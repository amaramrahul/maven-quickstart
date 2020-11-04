package com.example.project;

import org.testng.annotations.Test;

import org.testng.Assert;

public class HelloWorldTest {
    @Test
    public void testGetWelcomeMessage() {
        HelloWorld helloWorld = new HelloWorld();
        Assert.assertEquals(helloWorld.getWelcomeMessage(), "Hello World!");
    }
}