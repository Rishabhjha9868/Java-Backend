public class FullTimeEmployee extends Employee {
    
    // attributes monthly salary
    private double salary;

    // constructor 
    FullTimeEmployee(){

    }

    // parametrized constructor 
    FullTimeEmployee(double salary){
        this.salary = salary;
    }

    // methods
    public void calculateSalary(){
        super.calculateSalary();
        System.out.println("Salary : " + salary);
    }

    public void displayInfo(){

    }
    
}
