package chapter12;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	@DisplayName("2の二乗は4になる")
	void test() {
		Calculator calc = new Calculator();
		int result = calc.square(2);
		assertThat(result, is(4));
	}

}
