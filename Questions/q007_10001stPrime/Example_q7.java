package q007_10001stPrime;

public class Example_q7 {
    public static void main(String[] args) {
        int count = 10001, i = 1;

        while (count != 0) {
            i++;
            if (isPrime(i))
                count--;
        }

        System.out.println(i);
    }

    private static boolean isPrime(int p) {
        int sqrt = (int) Math.sqrt(p);
        for (int i = 2; i <= sqrt; i++)
            if (p % i == 0) return false;
        return true;
    }
}