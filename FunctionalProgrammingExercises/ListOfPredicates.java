package com.company.FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        Set<Integer> numbersSet = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).boxed().collect(Collectors.toSet());

        Predicate<Integer> isDivisible = num -> {
            for (Integer divider : numbersSet) {
                if (num % divider != 0) {
                    return false;
                }
            }
            return true;
        };
        for (int i = 1; i <= number; i++){
            boolean res = isDivisible.test(i);
            if (res){
                System.out.print(i + " ");
            }
        }
    }
}
