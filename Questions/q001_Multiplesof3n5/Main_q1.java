package q001_Multiplesof3n5;

public class Main_q1 {
	
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; i < 1000; i++) 
			if (i%3 == 0 || i%5 == 0) 
				sum = sum + i;
		System.out.println(sum);
	}
}
