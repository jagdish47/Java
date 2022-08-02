package OOP.BANK;

public class BankEmployee extends Person{

    int employee_id;
    String designation;
    Department department;
    // it's an Object here for Department class
    private int salary;

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
}
