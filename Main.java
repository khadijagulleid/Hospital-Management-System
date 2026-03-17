// OOP Assignment 3
// Hospital Management System

import java.util.Scanner;

// OOP Assignment 3
// Adding user input and exception handling

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            System.out.println("Enter doctor name:");
            String dName = input.nextLine();

            System.out.println("Enter doctor age:");
            int dAge = input.nextInt();
            input.nextLine();

            System.out.println("Enter specialization:");
            String spec = input.nextLine();

            System.out.println("Enter salary:");
            double dSalary = input.nextDouble();
            input.nextLine();

            Doctor doctor1 = new Doctor(dName, dAge, "D01", spec, dSalary);

            System.out.println("Enter patient name:");
            String pName = input.nextLine();

            System.out.println("Enter patient age:");
            int pAge = input.nextInt();
            input.nextLine();

            System.out.println("Enter illness:");
            String illness = input.nextLine();

            Patient patient1 = new Patient(pName, pAge, illness);

            System.out.println();
            doctor1.displayInfo();
            System.out.println();
            patient1.displayInfo();

            doctor1.treatPatient();

        } catch (Exception e) {
            System.out.println("Error: invalid input. Please enter correct data.");
        } finally {
            System.out.println("Program ended.");
        }

        input.close();
    }
}
