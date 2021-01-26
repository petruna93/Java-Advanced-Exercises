package com.company.StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        ArrayDeque<String> stacks = new ArrayDeque<>();
        String currentPages = "";


        while (!input.equals("Home")) {
            if (input.equals("back")) {
                if (stacks.isEmpty()) {
                    System.out.println("no previous URLs");
                    input = scanner.nextLine();
                    continue;

                } else {
                    currentPages = stacks.pop();
                }
            }else {
                if (!currentPages.isEmpty()) {
                    stacks.push(currentPages);
                }
                currentPages = input;
            }
            input = scanner.nextLine();
            System.out.println(currentPages);

        }
    }
}