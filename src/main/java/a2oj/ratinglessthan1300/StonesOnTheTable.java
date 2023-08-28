package a2oj.ratinglessthan1300;

import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String stones = in.next();
        System.out.println(minMoves(stones, size));
    }

    private static int minMoves(String stones, int size) {
        int index = 0;
        int count = 0;
        for(int i = 1; i<size; i++) {
            if (stones.charAt(i) == stones.charAt(index)) {
                count++;
            } else{
                index = i;
            }
        }
        return count;
    }
}
