package com.company.SetsAndMapsAdvancedLab;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] number = Arrays.stream(scanner.nextLine().split("\\s++"))
                .mapToDouble(Double::parseDouble).toArray();
        Map<Double, Integer> pairs = new LinkedHashMap<>();

        for (int i = 0; i < number.length; i++) {
            double num = number[i];
            if (!pairs.containsKey(num)) {
                pairs.put(num, 1);
            } else {
                pairs.put(num, pairs.get(num) + 1);

            }
        }

        for (Double key : pairs.keySet()){
            System.out.printf("%.1f -> %d%n", key, pairs.get(key));
        }
    }
}
