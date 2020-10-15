package com.example.snippets;

import org.mockito.Mockito;
import org.mockito.internal.verification.VerificationModeFactory;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.testng.Assert.*;

/**
 * Examples taken from
 * https://www.journaldev.com/21822/testng-mockito-example
 */

class AddService {
    public int add(int num1, int num2) {
        System.out.println("**--- AddService add executed ---**");
        return num1 + num2;
    }
}

class CalcService {
    private AddService addService;

    public CalcService(AddService addService) {
        this.addService = addService;
    }

    public int calc(int num1, int num2) {
        System.out.println("**--- CalcService calc executed ---**");
        return addService.add(num1, num2);
    }
}

public class TestNGMockitoExample {
    @Test(dataProvider = "dp")
    public void test_mock_object(int i, int j) {
        System.out.println("**--- Test testCalc executed ---**");

        AddService addService;
        CalcService calcService;

        addService = Mockito.mock(AddService.class);
        calcService = new CalcService(addService);

        int expected = i + j;
        when(addService.add(i, j)).thenReturn(expected);

        int actual = calcService.calc(i, j);

        assertEquals(expected, actual);
    }

    @DataProvider
    public Object[][] dp() {
        return new Object[][] { new Object[] { 1, 1 }, new Object[] { 2, 2 }, };
    }

    @Test
    public void test_mockito_spy() {
        List<String> list = new ArrayList<>();
        List<String> listSpy = spy(list);

        listSpy.add("first-real-element");
        System.out.println(listSpy.get(0));
        listSpy.add("second-real-element");
        System.out.println(listSpy.get(1));

        assertEquals("first-real-element", listSpy.get(0));
        when(listSpy.get(0)).thenReturn("first-mock-element");

        System.out.println(listSpy.get(0));
        assertEquals("first-mock-element", listSpy.get(0));
        System.out.println(listSpy.get(1));
        assertEquals("second-real-element", listSpy.get(1));

        // call the real method on Spied object since it's not stubbed
        assertEquals(2, listSpy.size());

    }

    @Test
    public void test_mockito_verify() {
        @SuppressWarnings("unchecked")
        List<String> mockedList = Mockito.mock(List.class);

        mockedList.add("first-element");
        mockedList.add("second-element");
        mockedList.add("third-element");
        mockedList.add("third-element");
        mockedList.clear();

        verify(mockedList).add("first-element");
        verify(mockedList).add("second-element");
        verify(mockedList, VerificationModeFactory.times(2)).add("third-element");

        verify(mockedList).clear();
    }
}