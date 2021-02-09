package SetsAndMapsAdvancedExercises;

import java.util.*;

public class Phonebook {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> phonebook = new TreeMap<>();
        String input = scanner.nextLine();

        while (!input.equals("search")) {
            String[] phones = input.split("-");
            String name = phones[0];
            String phoneNumber = phones[1];

            phonebook.put(name, phoneNumber);
            input = scanner.nextLine();
        }
        String name = scanner.nextLine();
        while (!name.equals("stop")) {
            if (!phonebook.containsKey(name)) {
                System.out.printf("Contact %s does not exist.%n", name);
            } else {
                System.out.printf("%s -> %s%n", name, phonebook.get(name));
            }
            name = scanner.nextLine();
        }
    }
}

