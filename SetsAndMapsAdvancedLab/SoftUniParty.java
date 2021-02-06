package com.company.SetsAndMapsAdvancedLab;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Set<String> vipGuest = new TreeSet<>();
        Set<String> regularGuest = new TreeSet<>();


        while (!input.equals("PARTY")) {
            if (Character.isDigit(input.charAt(0))) {
                vipGuest.add(input);
            } else {
                regularGuest.add(input);
            }
            input = scanner.nextLine();
        }
        String leaveGuest = scanner.nextLine();
        while (!leaveGuest.equals("END")) {
            if (vipGuest.contains(leaveGuest)) {
                vipGuest.remove(leaveGuest);
            }
            if (regularGuest.contains(leaveGuest)) {
                regularGuest.remove(leaveGuest);
            }
            leaveGuest = scanner.nextLine();
        }
        int count = vipGuest.size() + regularGuest.size();
        System.out.println(count);
        if (!vipGuest.isEmpty()) {
            for (int i = 0; i < vipGuest.size(); i++) {
                System.out.println(vipGuest.toArray()[i]);
            }
        }
        if (!regularGuest.isEmpty()) {
            for (int i = 0; i < regularGuest.size(); i++) {
                System.out.println(regularGuest.toArray()[i]);
            }
        }
    }
}
