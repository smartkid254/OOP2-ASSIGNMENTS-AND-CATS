/*
Name: Ambrose Mutinda
Reg: CT100/G/15932/22
Description:program to display local mobile service provider inernet data bundle offers
*/

import java.util.Scanner;

public class DataBundlePurchase {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Display menu
        System.out.println("Select data bundle:");
        System.out.println("1. 100MB @ 50 KES");
        System.out.println("2. 500MB @ 200 KES");
        System.out.println("3. 1GB @ 350 KES");
        System.out.println("4. 2GB @ 600 KES");

        // Ask user to enter choice
        System.out.print("Enter your choice (1-4): ");
        int choice = input.nextInt();

        // Switch statement
        switch(choice)
        {
            case 1:
                System.out.println("You selected 100MB. Cost = 50 KES");
                break;

            case 2:
                System.out.println("You selected 500MB. Cost = 200 KES");
                break;

            case 3:
                System.out.println("You selected 1GB. Cost = 350 KES");
                break;

            case 4:
                System.out.println("You selected 2GB. Cost = 600 KES");
                break;

            default:
                System.out.println("Invalid choice");
        }

        // Close scanner
        input.close();
    }
}