package com.company.StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int numInStack = Integer.parseInt(input[0]);
        int numElementPop = Integer.parseInt(input[1]);
        int numCheckPresentInStack = Integer.parseInt(input[2]);
        ArrayDeque<Integer>stacks = new ArrayDeque<>();
        String[] numbers = scanner.nextLine().split("\\s+");

        for (int i = 0; i <numInStack ; i++) {
            stacks.push(Integer.parseInt(numbers[i]));
        }
        for (int i = 0; i <numElementPop ; i++) {
            stacks.pop();
        }
        if (stacks.isEmpty()){
            System.out.println(0);
            return;
        }
        if (stacks.contains(numCheckPresentInStack)){
            System.out.println("true");
        }else{
            int minElement = Integer.MAX_VALUE;
            while (!stacks.isEmpty()){
                int newNums = stacks.peek();
                if (newNums<minElement){
                    minElement=stacks.peek();
                }
                stacks.pop();
            }
            System.out.println(minElement);
        }
    }
}
