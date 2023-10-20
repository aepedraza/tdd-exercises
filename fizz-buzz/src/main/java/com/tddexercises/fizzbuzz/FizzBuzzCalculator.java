package com.tddexercises.fizzbuzz;

public class FizzBuzzCalculator {

    private static final String FIZZ_VALUE = "Fizz";
    private static final String EMPTY_STRING_DEFAULT_VALUE = "";

    public String fizzBuzz(int input) {
        if (input > 0 && input % 3 == 0) {
            return FIZZ_VALUE;
        }

        return EMPTY_STRING_DEFAULT_VALUE;
    }
}
