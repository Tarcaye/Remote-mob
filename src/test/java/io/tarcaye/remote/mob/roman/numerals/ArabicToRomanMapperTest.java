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
        assertThat(toRoman(new Arabic(1))).isEqualTo("I");
	}

	@Test
	public void should_return_roman_translation_for_2() {
		assertThat(toRoman(new Arabic(2))).isEqualTo("II");
	}

	@Test
	public void should_return_roman_translation_for_3() {
		assertThat(toRoman(new Arabic(3))).isEqualTo("III");
	}

	@Test
	public void should_return_roman_translation_for_5() {
		assertThat(toRoman(new Arabic(5))).isEqualTo("V");
	}

	@Test
	public void should_return_roman_translation_for_4() {
		assertThat(toRoman(new Arabic(4))).isEqualTo("IV");
	}

    public static class Arabic {
		private int value;

		public Arabic(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}
		
		private String toRoman(Arabic francis) {
			if (francis.getValue() == 5) {
				return "V";
			}
			if (francis.getValue() == 5 - 1) {
				return toRoman(new Arabic(1)) + toRoman(new Arabic(5));
			}
			return range(0, francis.getValue()).mapToObj(x -> ("I")).collect(joining());
		}
	}

	private String toRoman(Arabic francis) {
		if (francis.getValue() == 5) {
			return "V";
		}
		if (francis.getValue() == 5 - 1) {
			return toRoman(new Arabic(1)) + toRoman(new Arabic(5));
		}
		return range(0, francis.getValue()).mapToObj(x -> ("I")).collect(joining());
	}
}
