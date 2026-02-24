// OOP Assignment 2
// Hospital Management System

public class Main {

    public static void main(String[] args) {

        Doctor doctor1 = new Doctor("Ali", 40, "D01", "Cardiology", 50000);
        Nurse nurse1 = new Nurse("Amina", 28, "N02", 30000);
        Patient patient1 = new Patient("John", 22, "Malaria");

        doctor1.displayInfo();
        System.out.println();

        nurse1.displayInfo();
        System.out.println();

        patient1.displayInfo();
        System.out.println();

        doctor1.treatPatient();

        System.out.println("Doctor Salary: " + doctor1.calculateSalary());
        System.out.println("Nurse Salary: " + nurse1.calculateSalary());
    }
}
