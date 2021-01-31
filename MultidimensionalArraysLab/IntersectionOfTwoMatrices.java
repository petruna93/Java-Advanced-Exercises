package com.company.MultidimensionalArraysLab;

import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());
        String[][]firstMatrix = readMatrix(scanner, rows,cols);
        String[][]secondMatrix = readMatrix(scanner, rows, cols);

        for (int row = 0; row < firstMatrix.length ; row++) {
            for (int col = 0; col < firstMatrix[row].length; col++) {
                String num = firstMatrix[row][col];
                if (firstMatrix[row][col].equals(secondMatrix[row][col])){
                    System.out.print(num + " ");
                }else{
                    System.out.print('*' + " ");
                }
            }
            System.out.println();

        }

    }

    private static String[][] readMatrix(Scanner scanner,int row,int col) {

        String[][] matrix = new String[row][col];
        for (int i = 0; i < row ; i++) {
            matrix[i] = scanner.nextLine().split("\\s+");
        }
        return matrix;
    }
}
