package io.tarcaye.remote.mob.paris.mob.programming.fizzbuzz;

import java.util.function.IntPredicate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyTest {
	
	@Test
	public void whenTakeOneShouldReturnOne() {
		Assertions.assertThat(returnOne()).isEqualTo("1");
	}
	
	@Test
	public void whenTakeTwoShouldReturnTwo() {
		Assertions.assertThat(returnOne(2)).isEqualTo("2");
	}

	private IntPredicate returnOne(int i) {

		return null;
	}

	private String returnOne() {
		return "1";
	}
}

