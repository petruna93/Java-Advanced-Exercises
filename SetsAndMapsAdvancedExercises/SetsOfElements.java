package SetsAndMapsAdvancedExercises;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[]numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        Set<Integer> nSet = new LinkedHashSet<>();
        Set<Integer> mSet = new LinkedHashSet<>();

        for (int i = 0; i <numbers[0] ; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            nSet.add(input);
        }
        for (int i = 0; i <numbers[1] ; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            mSet.add(input);
        }

        nSet.forEach(e -> {
            if (mSet.contains(e)){
                System.out.print(e + " ");
            }
        });
    }
}

