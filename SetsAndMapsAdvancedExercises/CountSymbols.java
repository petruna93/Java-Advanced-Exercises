package SetsAndMapsAdvancedExercises;

import java.util.*;

public class CountSymbols {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character,Integer> symbols = new TreeMap<>();
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char alphabetical = input.charAt(i);
            if (!symbols.containsKey(alphabetical)) {
                symbols.putIfAbsent(alphabetical, 1);
            } else {
                symbols.put(alphabetical, symbols.get(alphabetical) + 1);
            }
        }
        for (Map.Entry<Character,Integer> entry:symbols.entrySet()){
            System.out.printf("%c: %d time/s%n", entry.getKey(),entry.getValue());

        }

    }
}

