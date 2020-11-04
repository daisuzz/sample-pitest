package com.daisuzz.samplepitest;

public class Application {

    public static void main(String[] args) {

        FizzBuzzGenerator generator = new FizzBuzzGenerator();

        for (int i = 1; i <= 100; i++) {
            System.out.println(generator.generate(i));
        }
    }
}
