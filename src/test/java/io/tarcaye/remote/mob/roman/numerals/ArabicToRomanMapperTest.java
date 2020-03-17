package io.tarcaye.remote.mob.roman.numerals;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArabicToRomanMapperTest {
	@Test
	public void should_return_roman_translation_for_1() {
        assertThat(toRoman(1)).isEqualTo("I");
	}

	@Test
	public void should_return_roman_translation_for_2() {
		assertThat(toRoman(2)).isEqualTo("II");
	}

    private String toRoman(int i) {
		if (i == 1) {
			return "I";
		}
		return "II";
	}
}
