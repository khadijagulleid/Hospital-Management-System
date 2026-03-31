import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

// OOP Assignment 4

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Patient> patients = new ArrayList<>();

        try {

            System.out.println("How many patients do you want to enter?");
            int number = input.nextInt();
            input.nextLine();

            for(int i = 0; i < number; i++){

                System.out.println("Enter patient name:");
                String name = input.nextLine();

                System.out.println("Enter age:");
                int age = input.nextInt();
                input.nextLine();

                System.out.println("Enter illness:");
                String illness = input.nextLine();

                Patient p = new Patient(name, age, illness);
                patients.add(p);
            }

            // save to file
            BufferedWriter writer = new BufferedWriter(new FileWriter("patients.txt"));

            for(Patient p : patients){
                writer.write(p.getName() + "," + p.getAge() + "," + p.getIllness());
                writer.newLine();
            }

            writer.close();
            System.out.println("Saved to file");

            // read from file
            BufferedReader reader = new BufferedReader(new FileReader("patients.txt"));

            String line;

            System.out.println("Data from file:");

            while((line = reader.readLine()) != null){
                System.out.println(line);
            }

            reader.close();

        } catch (Exception e){
            System.out.println("Error happened");
        } finally {
            System.out.println("Program finished");
        }

        input.close();
    }
}
