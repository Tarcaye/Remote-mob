package io.tarcaye.remote.mob.fizzbuzz;

public class PositiveNumber {
    private final int value;

    private PositiveNumber(int i) {
        value = i;
    }

    public static PositiveNumber of(int i) {
        if (i < 1) {
            throw new IllegalArgumentException();
        }
        return new PositiveNumber(i);
    }

    public int getValue() {
        return value;
    }

    public boolean isAMultipleOf(int number) {
        return value % number == 0;
    }

}
