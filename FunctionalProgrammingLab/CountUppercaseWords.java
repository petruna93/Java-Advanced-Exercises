package com.company.FunctionalProgrammingLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Predicate<String> startsWithUppercase = str -> str!=null && !str.isEmpty()
                &&Character.isUpperCase(str.charAt(0));

        List<String> collect = Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(startsWithUppercase)
                .collect(Collectors.toList());

        System.out.println(collect.size());
        System.out.println(collect.stream().collect(Collectors.joining(System.lineSeparator())));
    }
}

