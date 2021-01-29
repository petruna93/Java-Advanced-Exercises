package com.company.StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithAStack {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split("\\s+");
        ArrayDeque<Integer> num = new ArrayDeque<>();

        for (int i = 0; i <numbers.length ; i++) {
            num.push(Integer.parseInt(numbers[i]));
        }
        while (!num.isEmpty()){
            System.out.print(num.pop() + " ");
        }
    }
}
