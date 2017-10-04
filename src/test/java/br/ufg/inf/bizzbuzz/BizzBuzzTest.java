package br.ufg.inf.bizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class BizzBuzzTest {

	private BizzBuzz bizzBuzz;

	public BizzBuzzTest() {
		this.bizzBuzz = new BizzBuzz();
	}

	@Test
	public void testDivisivelPor3() {
		assertEquals("fizz", bizzBuzz.jogarBizzBuzz(3));
	}

	@Test
	public void testDivisivelPor5() {
		assertEquals("buzz", bizzBuzz.jogarBizzBuzz(5));
	}

	@Test
	public void testDivisivelPor15() {
		assertEquals("fizz buzz", bizzBuzz.jogarBizzBuzz(15));
	}
	
	@Test
	public void testNaoDivisivelPor3Nem5() {
		assertEquals("7", bizzBuzz.jogarBizzBuzz(7));
	}
	
	@Test
	public void testNegativo() {
		assertEquals("-7", bizzBuzz.jogarBizzBuzz(-7));
	}
	
	@Test
	public void testNegativoDivisivelPor3() {
		assertEquals("fizz", bizzBuzz.jogarBizzBuzz(-6));
	}
}
