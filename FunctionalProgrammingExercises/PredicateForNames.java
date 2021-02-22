package com.company.FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthWord = Integer.parseInt(scanner.nextLine());
        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());


        Predicate<String> predicate = e->e.length()<=lengthWord;

        names.stream().filter(e-> predicate.test(e)).forEach(e-> System.out.println(e + " "));
    }
}
