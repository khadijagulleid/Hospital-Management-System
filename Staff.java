public abstract class Staff extends Person {

    private String staffId;

    public Staff(String name, int age, String staffId){
        super(name, age);
        this.staffId = staffId;
    }

    public String getStaffId(){
        return staffId;
    }

    public abstract double calculateSalary();
}
