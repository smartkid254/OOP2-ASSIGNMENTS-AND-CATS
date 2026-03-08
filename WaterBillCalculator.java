/*
Name: Ambrose Mutinda
Reg: CT100/G/15932/22
Description:program to calculate water bills
*/

import java.util.Scanner;

public class WaterBillCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt user
        System.out.print("Enter water units consumed: ");
        int units = input.nextInt();

        double bill;

        // Calculate bill using if-else-if
        if (units >= 0 && units <= 30) {
            bill = units * 20;
        }
        else if (units >= 31 && units <= 60) {
            bill = units * 25;
        }
        else {
            bill = units * 30;
        }

        // Display result with 2 decimal places
        System.out.printf("Total water bill: %.2f KES", bill);

        input.close();
    }
}