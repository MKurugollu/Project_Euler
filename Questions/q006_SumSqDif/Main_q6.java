package q006_SumSqDif;

/**
 * Difference between the sum of the squares of the first 100 natural numbers
 * and the square of the sum
 */

public class Main_q6 {

	public static void main(String[] args) {
		long sum1 = 0, sum2 = 0;
		for (int i = 1; i <= 100; i++) {
			sum1 = sum1 + i * i;
			sum2 += i;
		}
		System.out.print("Difference: " + ((int) Math.pow(sum2, 2) - sum1));

	}
	
}
