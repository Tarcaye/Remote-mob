package io.tarcaye.remote.mob.shodo.fizzbuzz;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FizzBuzzTest {

    @Test
    public void shouldConvert1to1() {
        Assertions.assertThat(fizzBuzz(1)).isEqualTo("1");
    }

    @Test
    public void shouldConvert2to2() {
        Assertions.assertThat(fizzBuzz(2)).isEqualTo("2");
    }

    @ParameterizedTest
    @ValueSource(ints = {6, 9, 12, 42})
    public void shouldReturnFizzFor(final int multipleOf3) {
        Assertions.assertThat(fizzBuzz(multipleOf3)).isEqualTo("Fizz");
    }

    @ParameterizedTest
    @ValueSource(ints = {10, 20, 40, 70})
    public void shouldReturnBuzzFor(final int multipleOf5) {
        Assertions.assertThat(fizzBuzz(multipleOf5)).isEqualTo("Buzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {60, 120, 90, 180})
    public void shouldReturnFizzBuzzFor(final int multipleOf3And5) {
        Assertions.assertThat(fizzBuzz(multipleOf3And5)).isEqualTo("FizzBuzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {13, 23, 43})
    public void shouldReturnFizzForNumberContaining3(final int numberContaining3) {
        Assertions.assertThat(fizzBuzz(numberContaining3)).isEqualTo("Fizz");
    }

    private String fizzBuzz(final int number) {
        if (String.valueOf(number).contains("3")) {
            return "Fizz";
        }
        if (isAMultipleOf5(number) && isAMultipleOf3(number)) {
            return "FizzBuzz";
        }
        if (isAMultipleOf5(number)) {
            return "Buzz";
        }
        if (isAMultipleOf3(number)) {
            return "Fizz";
        }
        return String.valueOf(number);
    }

    private boolean isAMultipleOf3(int number) {
        return number % 3 == 0;
    }

    private boolean isAMultipleOf5(int number) {
        return number % 5 == 0;
    }


}
