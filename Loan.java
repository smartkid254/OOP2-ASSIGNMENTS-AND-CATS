/*
Name: Ambrose Mutinda
Reg: CT100/G/15932/22
Description:program to check loan qualification,calculate simple interest and compound interest 
*/

import java.util.Scanner;

public class BankProgram {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("====== BANK SYSTEM ======");
        System.out.println("1. Check Loan Qualification");
        System.out.println("2. Calculate Simple Interest");
        System.out.println("3. Calculate Compound Interest");
        System.out.print("Enter your choice: ");

        int choice = input.nextInt();

        switch(choice) {

            case 1:
                // Loan qualification
                System.out.print("Enter your age: ");
                int age = input.nextInt();

                System.out.print("Enter your annual income (Sh): ");
                double income = input.nextDouble();

                if(age >= 21 && income >= 21000) {
                    System.out.println("Congratulations you qualify for a loan.");
                } 
                else {
                    System.out.println("Unfortunately, we are unable to offer you a loan at this time.");
                }
                break;

            case 2:
                // Simple Interest
                System.out.print("Enter Principal Amount: ");
                double principal = input.nextDouble();

                System.out.print("Enter Time (years): ");
                double time = input.nextDouble();

                System.out.print("Enter Rate (%): ");
                double rate = input.nextDouble();

                double simpleInterest = (principal * time * rate) / 100;

                System.out.println("Simple Interest = " + simpleInterest);
                break;

            case 3:
                // Compound Interest
                System.out.print("Enter Principal Amount: ");
                double p = input.nextDouble();

                System.out.print("Enter Rate (%): ");
                double r = input.nextDouble();

                System.out.print("Enter Time (years): ");
                int t = input.nextInt();

                double amount = p * Math.pow((1 + r / 100), t);
                double compoundInterest = amount - p;

                System.out.println("Compound Interest = " + compoundInterest);
                break;

            default:
                System.out.println("Invalid choice.");
        }

        input.close();
    }
}