package io.tarcaye.remote.mob.roman.numerals;

import org.junit.Test;

import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.range;
import static org.assertj.core.api.Assertions.assertThat;

public class ArabicToRomanMapperTest {
	@Test
	public void should_return_roman_translation_for_1() {
		assertThat(new Arabic(1).toRoman()).isEqualTo("I");
	}

	@Test
	public void should_return_roman_translation_for_2() {
		assertThat(new Arabic(2).toRoman()).isEqualTo("II");
	}

	@Test
	public void should_return_roman_translation_for_3() {
		assertThat(new Arabic(3).toRoman()).isEqualTo("III");
	}

	@Test
	public void should_return_roman_translation_for_5() {
		assertThat(new Arabic(5).toRoman()).isEqualTo("V");
	}

	@Test
	public void should_return_roman_translation_for_4() {
		assertThat(new Arabic(4).toRoman()).isEqualTo("IV");
	}

    public static class Arabic {
		private int value;

		public Arabic(int value) {
			this.value = value;
		}

		private String toRoman() {
			if (value == 5) {
				return "V";
			}
			if (value == 5 - 1) {
				return new Arabic(1).toRoman() + new Arabic(5).toRoman();
			}
			return range(0, value).mapToObj(x -> ("I")).collect(joining());
		}
	}

}
