package a2oj.ratinglessthan1300;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PanaromixPrediction {
    private static final List<Integer> primes
            = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        System.out.println(nextPrimeStatus(n, m));
    }

    private static String nextPrimeStatus(int n, int m) {
        return isNextPrime(n, m) ? "YES" : "NO";
    }

    private static boolean isNextPrime(int n, int m) {
        return m == primes.get(primes.indexOf(n) + 1);
    }
}
