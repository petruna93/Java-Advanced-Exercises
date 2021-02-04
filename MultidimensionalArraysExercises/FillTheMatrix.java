package com.company.MultidimensionalArraysExercises;

import java.util.Scanner;

public class FillTheMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int num = Integer.parseInt(input[0]);
        char pattern = input[1].charAt(0);

        int[][] matrix = new int[num][num];
        int count = 0;
        if (pattern == 'A') {
            for (int col = 0; col < matrix.length; col++) {
                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][col] = count + 1;
                    count++;
                }
            }
            printMatrix(matrix);
        }else if (pattern=='B'){
            for (int col = 0; col < matrix.length; col++) {
                if (col % 2 == 0) {
                    for (int row = 0; row < matrix.length; row++) {
                        matrix[row][col] = count + 1;
                        count++;
                    }
                } else {
                    for (int row = matrix.length-1; row >= 0; row--) {
                        matrix[row][col] = count + 1;
                        count++;
                    }
                }
            }
            printMatrix(matrix);

        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
    }
}
