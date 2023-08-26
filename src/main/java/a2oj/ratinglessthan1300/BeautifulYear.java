package a2oj.ratinglessthan1300;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BeautifulYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer year = in.nextInt();
        System.out.println(getBeautifulYear(year));
    }

    private static Integer getBeautifulYear(Integer year) {
        do {
            year++;
        }while (!allUnique(year.toString()));
        return year;
    }

    private static boolean allUnique(String yearString) {
        Set<Character> numSet = new HashSet<>();
        for (int i = 0; i< yearString.length(); i++) {
            numSet.add(yearString.charAt(i));
        }
        return numSet.size() == 4;
    }
}
