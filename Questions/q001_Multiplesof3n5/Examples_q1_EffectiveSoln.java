package q001_Multiplesof3n5;

public class Examples_q1_EffectiveSoln {
	
	public static int SumDivisibleBy(int n) {
		int target = 999999999;
		int p = target/n;
		return (n*(p*(p+1)))/2;
	}
	
	public static void main(String[] args) {
		
		//more effective version
		long startTime = System.nanoTime();
		
		System.out.println(SumDivisibleBy(3)+SumDivisibleBy(5)-SumDivisibleBy(15));
		
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns");
		
		//my version
		long startTime2 = System.nanoTime();
		int sum = 0;
		for(int i = 0; i < 1000000000; i++) 
			if (i%3 == 0 || i%5 == 0) 
				sum = sum + i;
		System.out.println(sum);
		long endTime2 = System.nanoTime();
		System.out.println("Took "+(endTime2 - startTime2) + " ns");
	}

}
