package SetsAndMapsAdvancedExercises;

import java.util.*;

public class AMinerTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> minerTask = new LinkedHashMap<>();
        String resource = scanner.nextLine();

        while (!resource.equals("stop")){
            int quantity = Integer.parseInt(scanner.nextLine());

            if (!minerTask.containsKey(resource)){
                minerTask.put(resource,quantity);
            }else {
                minerTask.put(resource,minerTask.get(resource)+quantity);
            }
            resource=scanner.nextLine();
        }
        for (Map.Entry<String,Integer> entry:minerTask.entrySet()){
            System.out.printf("%s -> %d%n", entry.getKey(),entry.getValue());
        }
    }
}

