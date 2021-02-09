package SetsAndMapsAdvancedExercises;

import java.util.*;

public class PeriodicTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Set<String> elements = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            for (int j = 0; j <input.length ; j++) {
                String element = input[j];
                elements.add(element);
            }
        }
        for (int i = 0; i <elements.size() ; i++) {
            System.out.print(elements.toArray()[i] + " ");
        }

    }
}

