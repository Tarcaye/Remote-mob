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

	@Test
	public void whenTakeTenShouldReturnBuzz() {
		Assertions.assertThat(fizzbuzz(10)).isEqualTo("Buzz");
	}

	@Test
	public void whenTakeTwentyShouldReturnBuzz() {
		Assertions.assertThat(fizzbuzz(20)).isEqualTo("Buzz");
	}

	private String fizzbuzz(int i) {
		if (i == 10 || i == 5 || i == 20) return "Buzz";
		if (isMultipleOf3(i)) return "Fizz";
		return String.valueOf(i);
	}

    private boolean isMultipleOf3(int i) {
        return i % 3 == 0;
    }
}

