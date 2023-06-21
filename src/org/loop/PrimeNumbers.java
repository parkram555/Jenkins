package org.loop;

public class PrimeNumbers {
	public static PrimeNumbers primeNumbers = new PrimeNumbers();

	public void to_find_the_prime_numbers_between_0_to_100() {
		boolean prime = false;
		int count = 0;
		for (int i = 2; i <= 100; i++) {
			prime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					prime = false;
					break;
				}
			}
			if (prime == true) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("Total number of Prime numbers between 0 to 100: " + count);
	}

	public void to_find_whether_the_given_number_is_prime_number() {
		int given = 0;
		int condition = 1;
		boolean prime = false;
		for (int i = given; i <= given; i++) {
			prime = true;
			if (Integer.signum(given) != 0 && given / given == condition && given / 1 == given
					&& Integer.signum(given) != -1 && given != condition) {
				prime = true;
			} else {
				System.out.println("Given number is not a Prime number");
				break;
			}
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					prime = false;
					break;
				}
			}
			if (prime == true) {
				System.out.println("Given number is Prime number");
			} else {
				System.out.println("Given number is not a Prime number");
			}
		}
	}

	public void to_find_the_non_prime_numbers_between_0_to_100() {
		boolean prime = false;
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (i==1) {
				prime=false;
			}else {
				prime = true;

			}
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					prime = false;
					break;
				}
			}
			if (prime == false) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("Total number of Non prime numbers between 0 to 100: " + count);		
	}
	
	@Override
	public void finalize() throws Throwable {
		super.finalize();
		System.out.println("hello");
	}

	public static void main(String[] args) {
		primeNumbers.to_find_the_non_prime_numbers_between_0_to_100();
		primeNumbers.to_find_the_prime_numbers_between_0_to_100();
		primeNumbers.to_find_whether_the_given_number_is_prime_number();
		System.gc();
		Runtime runtime = Runtime.getRuntime();
		runtime.gc();
		
	}
}
