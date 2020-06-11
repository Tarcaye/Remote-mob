package io.tarcaye.remote.mob.fizzbuzz;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    public void fizz_for_a_multiple_of_3() {
        Assertions.assertThat(FizzBuzzNumber.of(3).fizzBuzz()).isEqualTo("Fizz");
    }

    @Test
    public void fizz_for_another_multiple_of_3() {
        Assertions.assertThat(FizzBuzzNumber.of(33).fizzBuzz()).isEqualTo("Fizz");
    }

    @Test
    public void buzz_for_a_multiple_of_5() {
        Assertions.assertThat(FizzBuzzNumber.of(5).fizzBuzz()).isEqualTo("Buzz");
    }

    @Test
    public void buzz_for_another_multiple_of_5() {
        Assertions.assertThat(FizzBuzzNumber.of(85).fizzBuzz()).isEqualTo("Buzz");
    }

    @Test
    public void fizzbuzz_for_a_multiple_of_3_and_5() {
        Assertions.assertThat(FizzBuzzNumber.of(15).fizzBuzz()).isEqualTo("FizzBuzz");
    }

    @Test
    public void fizzbuzz_for_another_multiple_of_3_and_5() {
        Assertions.assertThat(FizzBuzzNumber.of(75).fizzBuzz()).isEqualTo("FizzBuzz");
    }

    @Test
    public void return_the_number_otherwise() {
        Assertions.assertThat(FizzBuzzNumber.of(4).fizzBuzz()).isEqualTo("4");
    }
    @Test
    public void return_the_number_otherwise_2() {
        Assertions.assertThat(FizzBuzzNumber.of(8).fizzBuzz()).isEqualTo("8");
    }

    @Test
    public void fail_for_a_negative_number() {
        Assertions.assertThatThrownBy(() -> FizzBuzzNumber.of(-1).fizzBuzz())
                .isInstanceOf(IllegalArgumentException.class);
    }

}
