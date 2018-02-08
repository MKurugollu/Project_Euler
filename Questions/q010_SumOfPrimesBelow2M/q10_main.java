package q010_SumOfPrimesBelow2M;

public class q10_main {

	public static void main(String[] args) {
		long sum = 2;//careful not to use int
		for (int i = 3; i < 2000000; i+=2){
			boolean isPrime = true;
			double m = Math.sqrt(i);
			for (int j = 2; j <= m; j++) {//need to only check odd numbers and upto and including sqrt(num)
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime == true) {
				System.out.println(i);
				sum += i;
			}
		}
		System.out.println(sum);

	}

}
