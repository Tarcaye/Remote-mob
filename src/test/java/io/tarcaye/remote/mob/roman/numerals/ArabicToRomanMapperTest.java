package io.tarcaye.remote.mob.roman.numerals;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
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

    private String toRoman(int i) {
		return IntStream.range(0, i).mapToObj(x -> ("I")).collect(joining());
	}
}
