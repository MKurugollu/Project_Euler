package q007_10001stPrime;

/**
 * What is the 10001st prime number?
 */

public class Main_q7 {
	public static void main(String[] args) {
		int countPrime = 1, num = 3;
		boolean equals = false;
		// loop until 10001st prime num found
		while (equals == false) {
			// assume number is a prime at first
			boolean isPrime = true;
			// num not prime if it divides by 2
			// **MUST DO AS FOR LOOP ONLY LOOKS AT ODD DIVISORS**
			if (num % 2 == 0) {
				isPrime = false;
			}
			// loop through all the odd divisors, i until sqroot(num)
			// because if you list out all of the factors of a number,
			// the square root will always be in the middle
			for (int i = 3; i * i <= num; i += 2) {
				// if the odd number divides num it is not a prime
				if (num % i == 0) {
					isPrime = false;
				}
			}
			//if num goes through both previous loops i.e remains true
			// our num is prime
			if (isPrime == true) {
				countPrime += 1;
			}
			// when 10001st prime found exit while loop
			if (countPrime == 10001) {
				equals = true;
			}
			num += 1;
		}
		System.out.println("10001st prime number: " + num);
	}

}