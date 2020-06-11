package io.tarcaye.remote.mob.chanel.fizzbuzz;

public class FizzBuzzNumber {
    private final int value;

    private FizzBuzzNumber(int i) {
        value = i;
    }

    public static FizzBuzzNumber of(int i) {
        if (i < 1) {
            throw new IllegalArgumentException();
        }
        return new FizzBuzzNumber(i);
    }

    public int getValue() {
        return value;
    }

    public boolean isAMultipleOf(int number) {
        return value % number == 0;
    }

    String fizzBuzz() {
        String fizzBuzz = "";
        if (isAMultipleOf(3)) {
            fizzBuzz = "Fizz";
        }
        if (isAMultipleOf(5)) {
            fizzBuzz += "Buzz";
        }
        if (fizzBuzz.isEmpty())
            return String.valueOf(getValue());
        return fizzBuzz;
    }
}
