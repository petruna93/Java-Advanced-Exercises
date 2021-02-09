package SetsAndMapsAdvancedExercises;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FixEmails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,String> fixEmail = new LinkedHashMap<>();
        String name = scanner.nextLine();
        String regex = ".[us|com|uk]+$";
        Pattern pattern = Pattern.compile(regex);

        while (!name.equals("stop")){
            String email = scanner.nextLine();
            Matcher matcher = pattern.matcher(email);
            if (!matcher.find()){
                fixEmail.put(name,email);
            }
            name=scanner.nextLine();
        }
        for (Map.Entry<String,String>entry:fixEmail.entrySet()){
            System.out.printf("%s -> %s%n", entry.getKey(),entry.getValue());
        }
    }
}

