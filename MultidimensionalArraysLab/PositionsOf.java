package com.company.MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = newMatrix(scanner);
        int number= Integer.parseInt(scanner.nextLine());
        boolean isTrue = false;


        for (int row = 0; row < matrix.length; row++) {
            for (int i = 0; i <matrix[row].length ; i++) {
                if (matrix[row][i]==number){
                    isTrue = true;
                    System.out.println(row + " " + i);
                }

            }

        }
        if (!isTrue){
            System.out.println("not found");
        }

    }

    private static int[][] newMatrix(Scanner scanner) {
        String[] input = scanner.nextLine().split("\\s+");
        int row = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);

        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; i++) {

            int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[i]=numbers;
        }
        return matrix;
    }
}
