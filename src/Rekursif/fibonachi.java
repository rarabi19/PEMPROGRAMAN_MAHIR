package Rekursif;

public class fibonachi {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("Nilai dari Fibonacci ke- " + n + " adalah " + fibonacci(n));
    }
}
