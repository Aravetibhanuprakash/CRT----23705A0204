import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Memoization test
        long[] memo = new long[100];
        Arrays.fill(memo, -1); // use -1 to mark uninitialized values
        memo[0] = 0;
        memo[1] = 1;

        System.out.println("Fibonacci using Memoization:");
        System.out.println("fib(30) = " + fibMemoization(30, memo));
        System.out.println("fib(50) = " + fibMemoization(50, memo));
        System.out.println("fib(70) = " + fibMemoization(70, memo));
        System.out.println("Memo array: " + Arrays.toString(memo));

        // Tabulation test
        long[] tab = new long[100];
        tab[0] = 0;
        tab[1] = 1;

        System.out.println("\nFibonacci using Tabulation:");
        System.out.println("fib(20) = " + fibTabulation(20, tab));
        System.out.println("Tab array: " + Arrays.toString(tab));
    }

    // Recursive Fibonacci with memoization
    public static long fibMemoization(int n, long[] memo) {
        if (memo[n] != -1) {
            return memo[n];
        }
        memo[n] = fibMemoization(n - 1, memo) + fibMemoization(n - 2, memo);
        return memo[n];
    }

    // Iterative Fibonacci with tabulation
    public static long fibTabulation(int n, long[] memo) {
        for (int i = 2; i <= n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }
        return memo[n];
    }
}
