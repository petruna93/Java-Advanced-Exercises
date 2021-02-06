package com.company.SetsAndMapsAdvancedLab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Double> studentWithGrades = new TreeMap<>();

        for (int i = 0; i <n ; i++) {

            String name = scanner.nextLine();
            double[] grades = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToDouble(Double::parseDouble).toArray();
            double averageGrade = 0.0;
            for (double grade : grades) {
                averageGrade += grade;
            }
            averageGrade = averageGrade / grades.length;
            studentWithGrades.put(name, averageGrade);
        }
        DecimalFormat df = new DecimalFormat("#.##############################");
        for (Map.Entry<String,Double>value:studentWithGrades.entrySet()){
            System.out.println(value.getKey()+ " is graduated with " + df.format(value.getValue()));
        }
    }
}
