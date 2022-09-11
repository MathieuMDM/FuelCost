package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the driving distance: ");
        double distance = scanner.nextDouble();
        System.out.print("Enter the number of liters consumed per 100 km: ");
        double litersConsumed = scanner.nextDouble();
        System.out.print("Enter the cost of fuel per 1 liter (euro): ");
        double costLiter = scanner.nextDouble();

        double costOfDriving = ((distance/100) * litersConsumed) * costLiter;

        System.out.println("The cost of driving is " + costOfDriving + " euro");
    }
}
