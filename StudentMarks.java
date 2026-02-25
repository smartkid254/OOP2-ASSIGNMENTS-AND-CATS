/*
Name: Ambrose Mutinda
Reg: CT100/G/15932/22
Description:program to implement three java classes(student class,gradecalculator and mainappclass) to calculate student grade
*/

import java.util.Scanner;

class Student {
     String name;
     double marks;

     Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

     void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
    }

   double getMarks() {
        return marks;
    }
}

class GradeCalculator {
     String calculateGrade(double marks) {
        if (marks >= 90 && marks <= 100) {
            return "A";
        } else if (marks >= 75 && marks < 90) {
            return "B";
        } else if (marks >= 50 && marks < 75) {
            return "C";
        } else if (marks < 50) {
            return "D"; 
        } else {           
           return "Invalid marks";
        }
    }
}

 public class MainAPP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student marks: ");
        double marks = scanner.nextDouble();

        Student student = new Student(name, marks);
        GradeCalculator gradeCalculator = new GradeCalculator();
        String grade = gradeCalculator.calculateGrade(student.getMarks());

        student.displayDetails();
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}