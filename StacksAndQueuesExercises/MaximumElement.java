package com.company.StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer>stacks = new ArrayDeque<>();

        for (int i = 0; i <n; i++) {
            String[]input = scanner.nextLine().split("\\s+");
            switch (input[0]){
                case "1":
                    int num = Integer.parseInt(input[1]);
                    stacks.push(num);
                    break;
                case "2":
                    stacks.pop();
                    break;
                case "3":
                    System.out.println(Collections.max(stacks));
                    break;
            }

        }
    }
}
