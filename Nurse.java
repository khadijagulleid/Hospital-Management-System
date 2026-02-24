public class Nurse extends Staff {

    private double salary;

    public Nurse(String name, int age, String staffId, double salary){
        super(name, age, staffId);
        this.salary = salary;
    }

    @Override
    public double calculateSalary(){
        return salary;
    }

    @Override
    public void displayInfo(){
        System.out.println("Nurse Name: " + getName());
    }
}
