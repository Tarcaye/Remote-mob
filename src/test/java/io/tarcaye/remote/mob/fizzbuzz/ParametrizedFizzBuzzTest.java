package io.tarcaye.remote.mob.fizzbuzz;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParametrizedFizzBuzzTest {

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 99, 333})
    public void should_fizz_for(int multipleOf3) {
        Assertions.assertThat(FizzBuzzNumber.of(multipleOf3).fizzBuzz()).isEqualTo("Fizz");
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 25, 2525, 5555})
    public void should_buzz_for(int multipleOf5) {
        Assertions.assertThat(FizzBuzzNumber.of(multipleOf5).fizzBuzz()).isEqualTo("Buzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 225, 555, 151515})
    public void should_fizzbuzz_for(int multipleOf3And5) {
        Assertions.assertThat(FizzBuzzNumber.of(multipleOf3And5).fizzBuzz()).isEqualTo("FizzBuzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {4, 8, 44, 88, 7})
    public void return_the_number_otherwise(int number) {
        Assertions.assertThat(FizzBuzzNumber.of(number).fizzBuzz()).isEqualTo(number + "");
    }

    @ParameterizedTest
    @ValueSource(ints = {-4, -8, -44, -88, -7})
    public void fail_for(int negativeNumber) {
        Assertions.assertThatThrownBy(() -> FizzBuzzNumber.of(negativeNumber).fizzBuzz())
                .isInstanceOf(IllegalArgumentException.class);
    }

}
