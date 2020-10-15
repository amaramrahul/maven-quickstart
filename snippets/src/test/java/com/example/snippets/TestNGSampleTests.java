package com.example.snippets;

import org.testng.annotations.*;
import org.testng.Assert;

public class TestNGSampleTests {
    // test case 1
    @Test(groups = { "functest", "checkintest" }, dependsOnMethods = "testCase3")
    public void testCase1() {
        System.out.println("in test case 1");
        Assert.assertEquals("hello", "hello");
    }

    // test case 2
    @Test(enabled = false)
    public void testCase2() {
        System.out.println("in test case 2");
        Assert.assertEquals("hello", "world");
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testCase3() {
        System.out.println("in test case 3");
        int a = 1/0;
    }

    @DataProvider(name = "test1")
    public static Object[][] numberPairs() {
        return new Object[][] {{2, "2"}, {6, "60"}, {19, "019"}, {22, "21"}, {23, "23"}};
    }

    @Test(dataProvider = "test1")
    public void testCase4(int number, String strNumber) {
        System.out.println("in test case 4");
        Assert.assertEquals(number, Integer.parseInt(strNumber));

    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("in beforeMethod");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("in afterMethod");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("in beforeClass");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("in afterClass");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("in beforeTest");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("in afterTest");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("in beforeSuite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("in afterSuite");
    }

}
