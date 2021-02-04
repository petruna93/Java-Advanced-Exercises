package com.company.MultidimensionalArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            matrix[i] = arr;
        }

        int firstSum = 0;
        int secondSum = 0;

        for (int i = 0; i < matrix.length; i++) {
            firstSum += matrix[i][i];
        }
        for (int i = 0; i <matrix.length ; i++) {
            secondSum += matrix[n-i-1][i];
        }

        System.out.println(Math.abs(firstSum-secondSum));
        //0 2
        //1 1
        //2 0

    }

}
