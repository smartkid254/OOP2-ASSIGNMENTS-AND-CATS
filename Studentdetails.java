/*
Name: Ambrose Mutinda
Reg: CT100/G/15932/22
Description:program to display student details
*/

import java.util.Scanner;

// StudentRecord class
class StudentRecord {
    
    // Fields
    private String studentID;
    private String name;
    private String course;

    // Constructor
    public StudentRecord(String studentID, String name, String course) {
        this.studentID = studentID;
        this.name = name;
        this.course = course;
    }

    // Method to display student details
    public void displayInfo() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}

// Main class
public class StudentApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter student ID: ");
        String studentID = scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        // Create StudentRecord object
        StudentRecord student = new StudentRecord(studentID, name, course);

        // Display student details
        System.out.println("\nStudent Details:");
        student.displayInfo();

        scanner.close();
    }
}

