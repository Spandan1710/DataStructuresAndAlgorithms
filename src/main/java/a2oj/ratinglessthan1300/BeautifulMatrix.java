package a2oj.ratinglessthan1300;

import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        int indexOfOne = getIndexOfOne();
        System.out.println(findSteps(indexOfOne));
    }

    private static int findSteps(int indexOfOne) {
        int xIndex = indexOfOne / 5;
        int yIndex = indexOfOne % 5;
        return Math.abs(xIndex - 2) + Math.abs(yIndex - 2);
    }

    private static int getIndexOfOne() {
        int count = -1;
        int input;
        Scanner scanner = new Scanner(System.in);
        do {
            input = scanner.nextInt();
            count++;
        } while(input != 1);
        return count;
    }
}
