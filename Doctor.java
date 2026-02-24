public class Doctor extends Staff implements Payable, Treatable {

    private String specialization;
    private double salary;

    public Doctor(String name, int age, String staffId, String specialization, double salary){
        super(name, age, staffId);
        this.specialization = specialization;
        this.salary = salary;
    }

    public String getSpecialization(){
        return specialization;
    }

    @Override
    public double calculateSalary(){
        return salary;
    }

    @Override
    public double calculatePayment(){
        return salary;
    }

    @Override
    public void treatPatient(){
        System.out.println("Doctor is treating the patient");
    }

    @Override
    public void displayInfo(){
        System.out.println("Doctor Name: " + getName());
        System.out.println("Specialization: " + specialization);
    }
}
