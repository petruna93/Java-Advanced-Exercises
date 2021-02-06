package com.company.SetsAndMapsAdvancedLab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String input = scanner.nextLine();
            Set<String> carNumber = new LinkedHashSet<>();

            while (!input.equals("END")){
                String[]arr = input.split(", ");
                String command = arr[0];
                String num = arr[1];
                if (command.equals("IN")){
                    carNumber.add(num);
                }else if (command.equals("OUT")){
                    carNumber.remove(num);
                }
                input=scanner.nextLine();
            }
            if (carNumber.isEmpty()){
                System.out.println("Parking Lot is Empty");
            }else{
                for (int i = 0; i <carNumber.size() ; i++) {
                    System.out.println(carNumber.toArray()[i]);
                }
            }
    }
}
