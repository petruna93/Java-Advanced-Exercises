package com.company.StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = scanner.nextLine().split("\\s+");
        int order = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> queue = new ArrayDeque<>();

        for (int i = 0; i < names.length; i++) {
            queue.offer(names[i]);
        }

        while (queue.size() > 1) {
            for (int i = 1; i < order; i++) {

                queue.offer(queue.poll());
            }

            System.out.println("Removed " + queue.poll());

        }

        System.out.println("Last is " + queue.poll());
    }
}

