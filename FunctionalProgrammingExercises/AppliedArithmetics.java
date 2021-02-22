package com.company.FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        String input = scanner.nextLine();
        Function<int[],int[]> addOne = arr -> Arrays.stream(arr).map(num->num+1).toArray();
        Function<int[],int[]> subtractOne = arr -> Arrays.stream(arr).map(num->num-1).toArray();
        Function<int[],int[]> multiplyOne = arr -> Arrays.stream(arr).map(num->num*2).toArray();
        Consumer<int[]> consumer = arr-> Arrays.stream(arr).forEach(e-> System.out.print(e + " "));
        while (!input.equals("end")) {
            switch (input) {
                case "add":
                    numbers=addOne.apply(numbers);
                    break;
                case "multiply":
                    numbers = multiplyOne.apply(numbers);
                    break;
                case "subtract":
                    numbers = subtractOne.apply(numbers);
                    break;
                case "print":
                    consumer.accept(numbers);
                    System.out.println();
                    break;
            }
            input = scanner.nextLine();
        }
    }
}
