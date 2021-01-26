package com.company.StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");

        ArrayDeque<Integer> stacks = new ArrayDeque<>();


        for (int i = 0; i < input.length; i++) {
            if (!input[i].equals("+") && !input[i].equals("-")) {
                stacks.push(Integer.parseInt(input[i]));

            } else {
                int num = stacks.peek();
                int nextNum = Integer.parseInt(input[i+1]);
                if (input[i].equals("+")){
                    stacks.push(num+nextNum);
                }else if (input[i].equals("-")){
                    stacks.push(num-nextNum);
                }
                i++;

            }
        }
        System.out.println(stacks.peek());
    }
}
