public class PartTimeEmployee extends Employee {
    // attributes hourly wage, hours worked
    private double wage;
    private double worked;

    // constructor
    PartTimeEmployee(){

    } 

    // parametrized constructor 
    PartTimeEmployee(double wage, double worked){
        this.wage = wage;
        this.worked = worked;
    }

    // methods
    public void calculateSalary(){
        super.calculateSalary();
        System.out.println("Salary : "+ wage*worked);
    }
    
    public void displayInfo(){
        
    }
    
}
