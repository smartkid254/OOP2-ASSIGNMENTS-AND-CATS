/*
Name:Ambrose
Reg: CT100/G/15932/22
Description:program to display employee salary
*/

import java.util.Scanner;

class employee {
string name;
double salary;
}

Employee (string name,double salary) {
    this.name=name;
    this.salary=salary;
    }

    void display() {
        system.out.println("Name:" +name);
        system.out.printin("Salary:" +salary);
        }

class salarycalculator {
    double calculatorbonus (double salary) {
        return 0.1 * salary;
        }
    }
class MainApp {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name and salary: ");
        String name = Scanner next line();
        double salary = Scanner next Double 

        employee emp = new employee(name,salary);
        System.out.print("Ambrose de smartkid: ");
        emp displayDetails();
        SalaryCalculator sal = new SalaryCalculator(salary);
        System.out.print("This bonus is" +sal.calculateBonus());

        Scanner.close();
        }
}






