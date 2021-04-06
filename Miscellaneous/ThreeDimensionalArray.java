package com.three.dimensional.array;

public class ThreeDimensionalArray {
    public static void main(String[] args) {
        int myArray[][][] = new int[3][4][5];
        int i, j, k;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++) {
                    myArray[i][j][k] = i * j * k;
                }
            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++) {
                    System.out.print(myArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
