package a2oj.ratinglessthan1300;

import java.util.Scanner;

public class UltraFastMathematician {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        printResult(s1, s2);
    }

    private static void printResult(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        for ( int i = 0; i<s1.length(); i++) {
            int num1 = Integer.parseInt(s1.substring(i, i+1));
            int num2 = Integer.parseInt(s2.substring(i, i+1));
            result.append(num1 ^ num2);
        }
        System.out.println(result);
    }
}
