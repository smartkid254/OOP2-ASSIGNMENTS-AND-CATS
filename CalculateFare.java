/*
Name: Ambrose
Reg: CT100/G/15932/22
Description:program to calculate fare
*/

import java.util.Scanner;

public class Fare_Calculator {
      public static double calculateFare(double distance) {
        return distance * 50;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance traveled (km): ");
        double distance = scanner.nextDouble();

        double fare = calculateFare(distance);
        System.out.printf("Total Fare: KSh %.2f%n", fare);

        scanner.close();
    }
    
}