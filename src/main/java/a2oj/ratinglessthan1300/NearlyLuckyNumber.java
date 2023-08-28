package a2oj.ratinglessthan1300;

import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long input = in.nextLong();
        System.out.println(isNearlyLucky(input));
    }

    private static String isNearlyLucky(long input) {
        int count = 0;
        while(input != 0) {
            if(isLucky(input%10)) count++;
            input/=10;
        }
        return isLucky(count)?"YES":"NO";
    }

    private static boolean isLucky(long i) {
        return i == 4 || i == 7;
    }
}
