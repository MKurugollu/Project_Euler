package q009_SpecialPythagorean;

import java.math.BigInteger;

public class main_q9 {
	public static void main(String[] args) {
		for(int a = 1; a < 1000; a++) {
				for(int b = a+1; b < 1000; b++) {
				double c = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
				
				if(c % 1 == 0) {
					if ((c+b+a)==1000) {
						System.out.println(a);
						System.out.println(b);
						System.out.println((int)c);
						Integer i = a*b*(int)c;
						System.out.println(new BigInteger("" + i));
						System.exit(0);
						
					}
				}
				}
		
		}
		System.out.println("not found");
	}
}
