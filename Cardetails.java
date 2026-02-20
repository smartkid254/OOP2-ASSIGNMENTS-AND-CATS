/*
Name:Ambrose
Reg: CT100/G/15932/22
Description:program to display car details
*/

import java.util.Scanner;

class Vehicle {
    String brand;
    String model;
    int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle {
    String fuelType;

    public Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year); 
        this.fuelType = fuelType;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); 
        System.out.println("Fuel Type: " + fuelType);
    }
}

public class Showroom {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Land cruiser: ");
        String brand = input.nextLine();

        System.out.print("prado: ");
        String model = input.nextLine();

        System.out.print("2026: ");
        int year = input.nextInt();
        input.nextLine(); 

        System.out.print("Diesel: ");
        String fuelType = input.nextLine();

        Car car = new Car(brand, model, year, fuelType);

        System.out.println("\nCar Details:");
        car.displayDetails();

        input.close();
    }
}