package com.infoshareacademy;

import com.infoshareacademy.kata.StringCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    public StringCalculator sc = new StringCalculator();

    @Test(expected = Exception.class)
    public void addText() throws Exception {
        String s = "abc, 2";

        Integer result = sc.add(s, ",");
    }

    @Test
    public void addStringsCorrectValues() throws Exception {

        Integer one = 1;
        Integer two = 2;
        Integer three = 3;
        Integer four = 4;

        Integer expected = one + two + three + four;

        Integer result = sc.add("1,2,3,4", ",");

        assertEquals(expected, result);
    }

    @Test
    public void addStringsSplittedLineCorrectValues() throws Exception {

        Integer one = 1;
        Integer two = 2;
        Integer three = 3;
        Integer four = 4;

        Integer expected = one + two + three + four;

        Integer result = sc.add("1\n2\n3\n4", "\n");

        assertEquals(expected, result);
    }

    @Test(expected = Exception.class)
    public void throwExceptionWhenNegativeNumber() throws Exception {

        Integer one = 1;
        Integer two = 2;
        Integer three = -3;
        Integer four = 4;

        Integer expected = one + two + three + four;

        Integer result = sc.add("1\n2\n-3\n4", "\n");

        assertEquals(expected, result);
    }

    @Test
    public void ignoreNumbersHigherThanThousand() throws Exception {

        Integer one = 1001;
        Integer two = 2;
        Integer three = 3000;
        Integer four = 4;

        Integer expected = two + four;

        Integer result = sc.add("1001\n2\n3000\n4", "\n");

        assertEquals(expected, result);
    }

}