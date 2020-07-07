package io.tarcaye.remote.mob.paris.mob.programming.fizzbuzz;

import java.util.function.IntPredicate;

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

	private String fizzbuzz(int i) {
        if (i == 4)
    		return String.valueOf(i);
        if (i == 2)
    		return "2";
        return "1";
	}
}

