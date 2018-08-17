import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PrimeNumber {
	@Test
	void testPrimeNumber1() {
		int position = 1;
		int actual = PrimeNumberMethod.getNthPrime(position);
		int expected = 2;
		assertEquals(expected, actual);

	}

	@Test
	void testPrimeNumber2() {
		int position = 2;
		int actual = PrimeNumberMethod.getNthPrime(position);
		int expected = 3;
		assertEquals(expected, actual);

	}

	@Test
	void testPrimeNumber10() {
		int position = 10;
		int actual = PrimeNumberMethod.getNthPrime(position);
		int expected = 29;
		assertEquals(expected, actual);

	}

	@Test
	void testPrimeNumber11() {
		int position = 18;
		int actual = PrimeNumberMethod.getNthPrime(position);
		int expected = 61;
		assertEquals(expected, actual);

	}

	@Test
	void testPrimeNumber31() {
		int position = 31;
		int actual = PrimeNumberMethod.getNthPrime(position);
		int expected = 113;
		assertEquals(expected, actual);

	}
}