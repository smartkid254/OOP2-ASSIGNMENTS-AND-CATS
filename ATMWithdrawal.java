/*
Name: Ambrose
Reg: CT100/G/15932/22
Description:program to display balance after each withdrawal from a bank ATM
*/

import java.util.Scanner;
public class Atm_withdrawal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double accountBalance = 3000.00; // starting balance

        System.out.println("Current Account Balance: KES " + accountBalance);

        while (accountBalance > 0) {
            System.out.print("Enter amount to withdraw: ");
            double withdrawalAmount = scanner.nextDouble();

            if (withdrawalAmount > accountBalance) {
                System.out.println("Insufficient funds. Available balance: KES " + accountBalance);
            } else {
                accountBalance -= withdrawalAmount;
                System.out.printf("Withdrawal successful. Account Balance: KES %.2f%n", accountBalance);
            }
        }

        System.out.println("Your account balance is zero. No more withdrawals possible.");
        scanner.close();
    }
}