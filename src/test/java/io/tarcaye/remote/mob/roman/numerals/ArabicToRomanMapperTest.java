package io.tarcaye.remote.mob.roman.numerals;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArabicToRomanMapperTest {
    @Test
    public void name() {
        // 1 -> I
        assertThat(getActual()).isEqualTo("I");
    }

    private String getActual() {
        return "I";
    }
}
