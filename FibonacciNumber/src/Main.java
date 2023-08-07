import java.math.BigInteger;
import java.util.Scanner;

class FibonacciCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç adet Fibonacci sayısı hesaplanacak? n = ");
        int n = scanner.nextInt();

        System.out.println("İlk " + n + " Fibonacci sayısı:");

        for (int i = 0; i < n; i++) {
            BigInteger fibonacciNumber = fibonacci(i);
            System.out.println(fibonacciNumber);
        }

        scanner.close();
    }

    public static BigInteger fibonacci(int n) {
        if (n == 0 || n == 1) {
            return BigInteger.valueOf(n);
        }

        BigInteger prev = BigInteger.ZERO;
        BigInteger current = BigInteger.ONE;
        BigInteger fibonacciNumber = BigInteger.ZERO;

        for (int i = 2; i <= n; i++) {
            fibonacciNumber = prev.add(current);
            prev = current;
            current = fibonacciNumber;
        }

        return fibonacciNumber;
    }
}
