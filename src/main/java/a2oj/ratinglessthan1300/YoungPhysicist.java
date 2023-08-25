package a2oj.ratinglessthan1300;

import java.util.Scanner;

public class YoungPhysicist {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int noOfVectors = sc.nextInt();

        int[][] vectorMatrix = readVectors(sc, noOfVectors);
        System.out.println(printState(inEquilibrium(vectorMatrix)));
    }

    private static String printState(boolean inEquilibrium) {
        return inEquilibrium?"YES":"NO";
    }

    private static boolean inEquilibrium(int[][] vectorMatrix) {
        int xDim = calculateDimensionSum(vectorMatrix, 0);
        int yDim = calculateDimensionSum(vectorMatrix, 1);
        int zDim = calculateDimensionSum(vectorMatrix, 2);
        return xDim == 0 && yDim == 0 && zDim == 0;
    }

    private static int calculateDimensionSum(int[][] vectorMatrix, int idx) {
        int sum = 0;
        for (int[] matrix : vectorMatrix) {
            sum += matrix[idx];
        }
        return sum;
    }

    private static int[][] readVectors(Scanner sc, int noOfVectors) {
        int[][] vectorMatrix = new int[noOfVectors][3];

        for(int i = 0; i < noOfVectors; i++) {
            vectorMatrix[i][0] = sc.nextInt();
            vectorMatrix[i][1] = sc.nextInt();
            vectorMatrix[i][2] = sc.nextInt();
        }
        return vectorMatrix;
    }
}
