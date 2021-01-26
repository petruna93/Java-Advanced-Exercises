package com.company.StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<Integer>stacks = new ArrayDeque<>();

        for (int i = 0; i < input.length() ; i++) {
            char symbol = input.charAt(i);
            if (symbol=='('){
                stacks.push(i);
            }else if (symbol==')'){
                int beginningIndex = stacks.pop();
                System.out.println(input.substring(beginningIndex,i+1));
            }
        }
    }
}
