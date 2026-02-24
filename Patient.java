public class Patient extends Person {

    private String illness;

    public Patient(String name, int age, String illness){
        super(name, age);
        this.illness = illness;
    }

    public String getIllness(){
        return illness;
    }

    @Override
    public void displayInfo(){
        System.out.println("Patient Name: " + getName());
        System.out.println("Illness: " + illness);
    }
}
