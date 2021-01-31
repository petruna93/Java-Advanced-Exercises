package com.company.MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt)
                .toArray();
        int rows = input[0];
        int cols = input[1];
        int maxSum = Integer.MIN_VALUE;
        int[][] subMatrix = new int[2][2];

        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            int[] numbers = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt)
                    .toArray();
            matrix[i] = numbers;
        }



        for (int i = 0; i < matrix.length-1; i++) {
            for (int j = 0; j < matrix[i].length-1; j++) {
                int num = matrix[i][j];
                int sum = num + matrix[i][j+1]+ matrix[i+1][j] + matrix[i+1][j+1];
                if (maxSum<sum){
                    maxSum=sum;
                    subMatrix[0][0]= matrix[i][j];
                    subMatrix[0][1]= matrix[i][j+1];
                    subMatrix[1][0]= matrix[i+1][j];
                    subMatrix[1][1]= matrix[i+1][j+1];
                }
            }
        }
        for (int i = 0; i <subMatrix.length ; i++) {
            for (int j = 0; j <subMatrix[i].length ; j++) {
                System.out.print(subMatrix[i][j] + " ");

            }
            System.out.println();

        }
        System.out.println(maxSum);

    }
}
