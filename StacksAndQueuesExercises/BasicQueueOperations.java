package com.company.StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int numInStack = Integer.parseInt(input[0]);
        int numElementPop = Integer.parseInt(input[1]);
        int numCheckPresentInStack = Integer.parseInt(input[2]);
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        String[] numbers = scanner.nextLine().split("\\s+");

        for (int i = 0; i <numInStack ; i++) {
            queue.offer(Integer.parseInt(numbers[i]));
        }
        for (int i = 0; i <numElementPop ; i++) {
            queue.poll();
        }
        if (queue.isEmpty()){
            System.out.println(0);
            return;
        }
        if (queue.contains(numCheckPresentInStack)){
            System.out.println("true");
        }else{
            int minElement = Integer.MAX_VALUE;
            while (!queue.isEmpty()){
                int newNums = queue.peek();
                if (newNums<minElement){
                    minElement=queue.peek();
                }
                queue.poll();
            }
            System.out.println(minElement);
        }
    }
}
