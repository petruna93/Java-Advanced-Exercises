package com.company.MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n ; i++) {
            int[] arrays = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            matrix[i]=arrays;
        }


        for (int i = 0; i < n ; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();

        for (int i = 0; i <n ; i++) {
            System.out.print(matrix[(n-1)-i][i] + " ");
        }
    }
}
