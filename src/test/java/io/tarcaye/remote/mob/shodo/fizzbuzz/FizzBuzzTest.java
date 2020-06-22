package io.tarcaye.remote.mob.shodo.fizzbuzz;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FizzBuzzTest {

    @Test
    public void shouldConvert1to1() {
        Assertions.assertThat(converts(1)).isEqualTo("1");
    }

    @Test
    public void shouldConvert2to2() {
        Assertions.assertThat(converts(2)).isEqualTo("2");
    }

    @ParameterizedTest
    @ValueSource(ints = {6, 9, 12, 42})
    public void shouldReturnFizzFor(final int multipleOf3) {
        Assertions.assertThat(converts(multipleOf3)).isEqualTo("Fizz");
    }

    private String converts(final int i) {
        if (i % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(i);
    }

}
