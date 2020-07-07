package io.tarcaye.remote.mob.paris.mob.programming.fizzbuzz;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyTest {
	
	@Test
	public void whenTakeOneShouldReturnOne() {
		Assertions.assertThat(returnOne()).isEqualTo("1");
	}

	private String returnOne() {
		return "1";
	}
}

