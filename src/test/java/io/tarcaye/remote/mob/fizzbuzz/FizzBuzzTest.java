package io.tarcaye.remote.mob.fizzbuzz;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void should_fizz_for_a_multiple_of_3() {
        Assertions.assertThat(fizzbuzz(PositiveNumber.of(3))).isEqualTo("Fizz");
    }

    @Test
    public void should_buzz_for_a_multiple_of_5() {
        Assertions.assertThat(fizzbuzz(PositiveNumber.of(5))).isEqualTo("Buzz");
    }

    @Test
    public void should_fizzbuzz_for_a_multiple_of_3_and_5() {
        Assertions.assertThat(fizzbuzz(PositiveNumber.of(15))).isEqualTo("FizzBuzz");
    }

    @Test
    public void should_return_the_number_otherwise() {
        Assertions.assertThat(fizzbuzz(PositiveNumber.of(4))).isEqualTo("4");
    }

    @Test
    public void fail_for_a_negative_number() {
        Assertions.assertThatThrownBy(() -> fizzbuzz(PositiveNumber.of(-1)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    private String fizzbuzz(PositiveNumber number) {
        String fizzBuzz = "";
        if (number.isAMultipleOf3() && isAMultipleOf5(number.getValue())) {
            fizzBuzz = "FizzBuzz";
            return fizzBuzz;
        }
        if (number.isAMultipleOf3()) {
            fizzBuzz += "Fizz";
        }
        if (isAMultipleOf5(number.getValue())) {
            return "Buzz";
        }
        if (fizzBuzz.equals(""))
            return number.getValue() + "";
        return fizzBuzz;
    }

    private boolean isAMultipleOf5(int i) {
        return i % 5 == 0;
    }

}
