/*
Name:Ambrose
Reg: CT100/G/15932/22
Description:program to collect and display user inputs(height,bank balance and phone number)
*/

import java.util.Scanner;

// Program to collect and display user input
public class UserInput {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt user for height
        System.out.print("Enter your height (in meters): ");
        float height = input.nextFloat();

        // Prompt user for bank balance
        System.out.print("Enter your bank balance (in Kenya Shillings): ");
        double bankBalance = input.nextDouble();

        // Prompt user for phone number
        System.out.print("Enter your phone number: ");
        String phoneNumber = input.next();

        // Display the entered details
        System.out.println("\n--- User Details ---");
        System.out.println("Height: " + height + " meters");
        System.out.println("Bank Balance: KES " + bankBalance);
        System.out.println("Phone Number: " + phoneNumber);

        // Close scanner
        input.close();
    }
}