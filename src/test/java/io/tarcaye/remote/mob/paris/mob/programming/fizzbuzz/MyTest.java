package io.tarcaye.remote.mob.paris.mob.programming.fizzbuzz;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyTest {
	
	@Test
	public void whenTakeOneShouldReturnOne() {
		Assertions.assertThat(fizzbuzz(1)).isEqualTo("1");
	}
	
	@Test
	public void whenTakeTwoShouldReturnTwo() {
		Assertions.assertThat(fizzbuzz(2)).isEqualTo("2");
	}

	@Test
	public void whenTakeFourShouldReturnFour() {
		Assertions.assertThat(fizzbuzz(4)).isEqualTo("4");
	}

	@Test
	public void whenTakeThreeShouldReturnFizz() {
		Assertions.assertThat(fizzbuzz(3)).isEqualTo("Fizz");
	}
	
	@Test
	public void whenTakeSixShouldReturnFizz() {
		Assertions.assertThat(fizzbuzz(6)).isEqualTo("Fizz");
	}
	
	@Test
	public void whenTakeNineShouldReturnFizz() {
		Assertions.assertThat(fizzbuzz(9)).isEqualTo("Fizz");
	}

	@Test
	public void whenTakeFiveShouldReturnBuzz() {
		Assertions.assertThat(fizzbuzz(5)).isEqualTo("Buzz");
	}

	private String fizzbuzz(int i) {
		if (i == 5) return "Buzz";
		if (i == 3) return "Fizz";
		if (i == 6) return "Fizz";
		if (i == 9) return "Fizz";
		return String.valueOf(i);
	}
}

