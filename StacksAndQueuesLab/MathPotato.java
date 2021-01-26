package com.company.StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = scanner.nextLine().split("\\s+");
        int order = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> queue = new ArrayDeque<>();

        for (int i = 0; i < names.length; i++) {
            queue.offer(names[i]);
        }
        int cycle = 1;

        while (queue.size() > 1) {
            for (int i = 1; i < order; i++) {

                String child = queue.remove();
                queue.offer(child);
            }
            String name = queue.peek();
            if (isPrime(cycle)) {
                System.out.println("Prime " + name);
            } else {
                System.out.println("Removed " + name);
                queue.remove(name);
            }
            cycle++;
        }

        System.out.println("Last is " + queue.poll());
    }

    private static boolean isPrime(int number) {
        if (number==1){
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number%i==0){
                return false;
            }
        }
        return true;
    }
}
