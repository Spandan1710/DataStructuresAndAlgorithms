package a2oj.ratinglessthan1300;

import java.util.Scanner;

public class Borze {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String encodedText = in.next();
        System.out.println(decode(encodedText));
    }

    private static String decode(String encodedText) {
        StringBuilder decodedText = new StringBuilder();
        for(int i = 0; i < encodedText.length(); i++) {
            char c = encodedText.charAt(i);
            if(c == '.') {
                decodedText.append('0');
            }
            else if(c == '-') {
                c = encodedText.charAt(++i);
                decodedText.append(c == '.' ? '1' : '2');
            }
        }
        return decodedText.toString();
    }
}
