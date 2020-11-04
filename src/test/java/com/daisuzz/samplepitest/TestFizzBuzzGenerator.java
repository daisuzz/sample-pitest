package com.daisuzz.samplepitest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFizzBuzzGenerator {

    FizzBuzzGenerator fizzBuzzGenerator = new FizzBuzzGenerator();

    @Test
    public void returnFizzBuzzIfInputIsDivisibleByThreeAndFive() {

        int input = 30;

        String actual = fizzBuzzGenerator.generate(input);

//        assertEquals("FizzBuzz", actual);
    }

    @Test
    public void returnFizzIfInputIsDivisibleByThree() {

        int input = 6;

        String actual = fizzBuzzGenerator.generate(input);

        assertEquals("Fizz", actual);
    }

    @Test
    public void returnBuzzIfInputIsDivisibleByFive() {

        int input = 10;

        String actual = fizzBuzzGenerator.generate(input);

        assertEquals("Buzz", actual);
    }

    @Test
    public void returnNumberIfInputIsIndivisibleByThreeOrFive() {

        int input = 13;

        String actual = fizzBuzzGenerator.generate(input);

        assertEquals(String.valueOf(input), actual);
    }
}
