package io.tarcaye.remote.mob.roman.numerals;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.range;
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

	@Test
	public void should_return_roman_translation_for_3() {
		assertThat(toRoman(3)).isEqualTo("III");
	}

	@Test
	public void should_return_roman_translation_for_5() {
		assertThat(toRoman(5)).isEqualTo("V");
	}

	@Test
	public void should_return_roman_translation_for_4() {
		assertThat(toRoman(4)).isEqualTo("IV");
	}

    private String toRoman(int i) {
		if (i == 5) {
			return "V";
		}
		if (i == 5 - 1) {
			return toRoman(1) + toRoman(5);
		}
		return range(0, i).mapToObj(x -> ("I")).collect(joining());
	}
}
