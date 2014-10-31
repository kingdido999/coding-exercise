import java.util.ArrayList;

public class PrimesImprovement {
	public static void main(String[] args) {

		// This code should print out the prime numbers.
		// task: Fix and improve the algorithm

		System.out.println("Printing primes from 1 to 100");
		boolean prime;

		// an arrayList to store prime numbers
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();

		// 1 is not a prime according to the definition of prime number.
		// Since even numbers (except 2) are not prime numbers, so we start with
		// integer 3 and increment by 2 to check odd numbers only
		primeNumbers.add(2);
		for (int i = 3; i <= 100; i += 2) {
			prime = true;
			double sqrt = Math.sqrt(i); // square root of the potential prime

			// Instead of repeatedly loop through 100 numbers, we can reduce
			// the number of comparisons by testing if the number can be
			// factored by any previously identified primes
			for (int p : primeNumbers) {
				// Only check if the potential prime can be factored by those
				// primes less than or equal to the square root of the potential prime
				if (p > sqrt)
					break;

				if (i % p == 0) {
					prime = false;
					break;
				}
			}

			if (prime)
				primeNumbers.add(i);
		}

		// print out the prime numbers
		for (int p : primeNumbers) {
			System.out.print(p + " ");
		}
	}
}
