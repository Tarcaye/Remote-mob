package io.tarcaye.remote.mob.fa.roman.numerals;

import org.junit.jupiter.api.Test;

import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.range;
import static org.assertj.core.api.Assertions.assertThat;

public class ArabicToRomanMapperTest {
	@Test
	public void should_return_roman_translation_for_1() {
		assertThat(new Arabic(1).toRoman().getValue()).isEqualTo("I");
	}

	@Test
	public void should_return_roman_translation_for_2() {
		assertThat(new Arabic(2).toRoman().getValue()).isEqualTo("II");
	}

	@Test
	public void should_return_roman_translation_for_3() {
		assertThat(new Arabic(3).toRoman().getValue()).isEqualTo("III");
	}

	@Test
	public void should_return_roman_translation_for_5() {
		assertThat(new Arabic(5).toRoman().getValue()).isEqualTo("V");
	}

	@Test
	public void should_return_roman_translation_for_4() {
		assertThat(new Arabic(4).toRoman().getValue()).isEqualTo("IV");
	}

    public static class Arabic {
		private final int value;

		public Arabic(int value) {
			this.value = value;
		}

		private Roman toRoman() {
			if (value == 5) {
				return new Roman("V");
			}
			if (value == 5 - 1) {
				return new Arabic(5).toRoman().substract(new Arabic(1).toRoman());
			}
			return new Roman(range(0, value).mapToObj(x -> ("I")).collect(joining()));
		}


	}
	public static class Roman {
		private final String value;

		public Roman(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		private Roman substract(Roman second) {
			return new Roman(second.getValue() + getValue());
		}
	}


}
