package a2oj.ratinglessthan1300;

import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(in.next());
        sb.replace(0,1, sb.substring(0,1).toUpperCase());
        System.out.println(sb);
    }
}
