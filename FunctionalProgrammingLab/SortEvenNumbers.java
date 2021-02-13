package com.company.FunctionalProgrammingLab;

import java.util.Arrays;
import java.util.Scanner;

public class SortEvenNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt).filter(n -> n % 2 == 0).toArray();
        printNumbers(numbers);

        Arrays.sort(numbers);
        printNumbers(numbers);

    }

    private static void printNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length - 1) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.print(numbers[i]);
            }
        }
        System.out.println();
    }
}