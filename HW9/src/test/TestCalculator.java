package test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import main.Calculator;


class TestCalculator {

	Calculator calculator = new Calculator();

	@Test
	public void Should_add_two_numbers_and_return_result() {
		assertEquals(4, calculator.add(3, 1));
	}

	@ParameterizedTest
	@CsvSource(value = {"4,3" , "5,2"})
	public void Should_add_two_numbers_and_return_result_parameterized(int valueOne, int valueTwo) {
		assertEquals(7, calculator.add(valueOne, valueTwo));
	}
	
	@Test
	public void Should_substract_two_numbers_and_return_result() {
		assertEquals(5, calculator.sub(7, 2));
	}
	
	@Test
	public void Should_multiply_two_numbers_and_return_result() {
		assertEquals(9, calculator.multiply(3, 3));
	}
	
	@Test
	public void Should_divide_two_numbers_and_return_result() {
		assertEquals(3, calculator.divide(27, 9));
	}
	
	@Test
	public void Should_throw_an_arithmetic_exception_if_denominator_is_zero() {
		Throwable exception = assertThrows(ArithmeticException.class, () -> calculator.divide(0, 0) );
	}
}
