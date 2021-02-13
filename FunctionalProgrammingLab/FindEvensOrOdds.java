package com.company.FunctionalProgrammingLab;

import java.util.Arrays;
import java.util.Scanner;

public class FindEvensOrOdds {
    public static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int firstNum = numbers[0];
        int secondNum = numbers[1];

        String input = scanner.nextLine();

        if (input.equals("odd")) {
            for (int i = firstNum; i <= secondNum; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        } else if (input.equals("even")) {
            for (int i = firstNum; i <= secondNum; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}

