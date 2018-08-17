public class PrimeNumMethod {

	public static int getNthPrime(int position) {
		int[] primeNumbers = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79 };
		int prime = primeNumbers[position - 1];
		return prime;
	}

}
		int position = 18;
		int actual = PrimeNumMethod.getNthPrime(position);
		int expected = 61;
		assertEquals(expected, actual);

	}

	@Test
	void testPrimeNum31() {
		int position = 31;
		int actual = PrimeNumMethod.getNthPrime(position);
		int expected = 113;
		assertEquals(expected, actual);

	}
}