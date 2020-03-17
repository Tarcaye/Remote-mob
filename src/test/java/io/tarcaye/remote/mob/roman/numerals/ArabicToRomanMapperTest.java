package io.tarcaye.remote.mob.roman.numerals;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArabicToRomanMapperTest {
    @Test
    public void should_return_roman_translation_for_1() {
        // 1 -> I
        assertThat(toRoman()).isEqualTo("I");
    }

    private String toRoman() {
        return "I";
    }
}
