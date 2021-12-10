package test;

import java.util.GregorianCalendar;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import main.Calendar;

class TestCalendar {

	@ParameterizedTest
	@ValueSource(ints = {2004, 2008, 2012, 2016, 2020})
	public void Should_return_true(int year) {
		Calendar cal = new Calendar(year);
		assertTrue(cal.isLeapYear());
	}

	@ParameterizedTest
	@ValueSource(ints = {1, 2, 3, 6, 7})
	public void Should_return_false(int year) {
		Calendar cal = new Calendar(year);
		assertFalse(cal.isLeapYear());
	}

	@ParameterizedTest
	@ValueSource(ints = {2004, 2008, 2012, 2016, 2020})
	public void Should_return_if_year_is_leap(int year) {
		GregorianCalendar gregCal = new GregorianCalendar();
		assertTrue(gregCal.isLeapYear(year));
	}
	
	@Test
    public void boundary_test() {
        Calendar cal1 = new Calendar(Integer.MAX_VALUE+1);
        Throwable e = assertThrows(IllegalArgumentException.class, () -> cal1.isLeapYear() );
        Throwable e2 = assertThrows(IllegalArgumentException.class, () -> new Calendar(23.7) );
    }
}
