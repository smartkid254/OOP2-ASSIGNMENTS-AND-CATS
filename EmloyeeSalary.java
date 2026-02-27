/* 
Name: Ambrose Mutinda
Reg: CT100/G/15932/22 
Description: Program to display employee salary 
*/

import java.util.Scanner;

class Employee {
    String name;
    double salary;

    // Constructor
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class SalaryCalculator {
    double calculateBonus(double salary) {
        return 0.1 * salary;  // 10% bonus
    }
}

// Public class (Main class)
public class MainApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();

        // Create Employee object
        Employee emp = new Employee(name, salary);

        System.out.println("\nEmployee Details:");
        emp.displayDetails();

        // Calculate bonus
        SalaryCalculator sal = new SalaryCalculator();
        double bonus = sal.calculateBonus(salary);

        System.out.println("Bonus (10%): " + bonus);

        scanner.close();
    }
}
