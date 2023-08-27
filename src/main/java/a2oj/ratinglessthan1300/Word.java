package a2oj.ratinglessthan1300;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        System.out.println(changeCase(word));
    }

    private static String changeCase(String word) {
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        for (Character c : word.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upperCaseCount++;
            } else {
                lowerCaseCount++;
            }
        }
        return upperCaseCount>lowerCaseCount?word.toUpperCase():word.toLowerCase();
    }
}
