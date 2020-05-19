package io.tarcaye.remote.mob.fizzbuzz;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void fizz_for_a_multiple_of_3() {
        Assertions.assertThat(fizzBuzz(PositiveNumber.of(3))).isEqualTo("Fizz");
    }

    @Test
    public void fizz_for_another_multiple_of_3() {
        Assertions.assertThat(fizzBuzz(PositiveNumber.of(33))).isEqualTo("Fizz");
    }

    @Test
    public void buzz_for_a_multiple_of_5() {
        Assertions.assertThat(fizzBuzz(PositiveNumber.of(5))).isEqualTo("Buzz");
    }

    @Test
    public void buzz_for_another_multiple_of_5() {
        Assertions.assertThat(fizzBuzz(PositiveNumber.of(85))).isEqualTo("Buzz");
    }

    @Test
    public void fizzbuzz_for_a_multiple_of_3_and_5() {
        Assertions.assertThat(fizzBuzz(PositiveNumber.of(15))).isEqualTo("FizzBuzz");
    }

    @Test
    public void fizzbuzz_for_another_multiple_of_3_and_5() {
        Assertions.assertThat(fizzBuzz(PositiveNumber.of(75))).isEqualTo("FizzBuzz");
    }

    @Test
    public void return_the_number_otherwise() {
        Assertions.assertThat(fizzBuzz(PositiveNumber.of(4))).isEqualTo("4");
    }
    @Test
    public void return_the_number_otherwise_2() {
        Assertions.assertThat(fizzBuzz(PositiveNumber.of(8))).isEqualTo("8");
    }

    @Test
    public void fail_for_a_negative_number() {
        Assertions.assertThatThrownBy(() -> fizzBuzz(PositiveNumber.of(-1)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    private String fizzBuzz(PositiveNumber number) {
        String fizzBuzz = "";
        if (number.isAMultipleOf(3)) {
            fizzBuzz = "Fizz";
        }
        if (number.isAMultipleOf(5)) {
            fizzBuzz += "Buzz";
        }
        if (fizzBuzz.isEmpty())
            return String.valueOf(number.getValue());
        return fizzBuzz;
    }

}
