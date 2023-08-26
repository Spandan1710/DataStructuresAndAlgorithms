package a2oj.ratinglessthan1300;

import java.util.Scanner;

public class SchoolQueue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int queueSize = scanner.nextInt();
        int duration = scanner.nextInt();

        scanner.nextLine(); // consume newline left by nextInt

        StringBuilder queue = new StringBuilder(scanner.nextLine());

        System.out.println(showNewQueue(queue,duration));
    }

    private static String showNewQueue(StringBuilder queue, int duration) {
        while(duration-- > 0) {
            int i = 0;
            while ( i < queue.length() - 1) {
                i+= checkSwap(queue,i)?2:1;
            }
        }
        return queue.toString();
    }

    private static boolean checkSwap(StringBuilder queue, int i) {
        if(isBoyBeforeGirl(queue, i)) {
            queue.setCharAt(i, 'G');
            queue.setCharAt(i + 1, 'B');
            return true;
        }
        return false;
    }

    private static boolean isBoyBeforeGirl(StringBuilder queue, int i) {
        return queue.charAt(i) == 'B' && queue.charAt(i + 1) == 'G';
    }
}
