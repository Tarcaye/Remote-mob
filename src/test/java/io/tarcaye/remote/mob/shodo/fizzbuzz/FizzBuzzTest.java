package io.tarcaye.remote.mob.shodo.fizzbuzz;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void shouldConvert1to1() {
        Assertions.assertThat(converts(1)).isEqualTo("1");
    }

    private String converts(final int i) {
        return null;
    }


}
