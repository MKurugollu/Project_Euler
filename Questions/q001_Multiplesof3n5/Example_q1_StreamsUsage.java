package q001_Multiplesof3n5;
import java.util.stream.IntStream;

public class Example_q1_StreamsUsage {
	public static void main(String[] args) {
		int result = IntStream.range(1, 1000).filter(i -> i % 3 == 0 || i % 5 == 0).sum();
		System.out.println(result);
	}
}