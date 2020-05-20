package io.tarcaye.remote.mob.fizzbuzz;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class ParametrizedFizzBuzzTest {

    @Test
    @Parameters({"3", "6", "9", "99", "333"})
    public void should_fizz_for_a(int multipleOf3) {
        Assertions.assertThat(FizzBuzzNumber.of(multipleOf3).fizzBuzz()).isEqualTo("Fizz");
    }

    @Test
    @Parameters({"5", "10", "25", "2525", "5555"})
    public void should_buzz_for_a(int multipleOf5) {
        Assertions.assertThat(FizzBuzzNumber.of(multipleOf5).fizzBuzz()).isEqualTo("Buzz");
    }

    @Test
    @Parameters({"15", "30", "225", "555", "151515"})
    public void should_fizzbuzz_for_a(int multipleOf3And5) {
        Assertions.assertThat(FizzBuzzNumber.of(multipleOf3And5).fizzBuzz()).isEqualTo("FizzBuzz");
    }

    @Test
    @Parameters({"4", "8", "44", "88", "7"})
    public void return_the_number_otherwise(int number) {
        Assertions.assertThat(FizzBuzzNumber.of(number).fizzBuzz()).isEqualTo(number + "");
    }

    @Test
    @Parameters({"-4", "-8", "-44", "-88", "-7"})
    public void fail_for_a(int negativeNumber) {
        Assertions.assertThatThrownBy(() -> FizzBuzzNumber.of(negativeNumber).fizzBuzz())
                .isInstanceOf(IllegalArgumentException.class);
    }

}
