public class Employee {
    
    // attributes name, empID, age
    private String name;
    private int empID;
    private int age;

    // constructor
     Employee(){

    }

    // parametrized constructor 
    Employee(String name, int empID, int age){
        this.name = name;
        this.empID = empID;
        this.age = age;
    }

    // methods
    public void calculateSalary(){ 
        System.out.println("Salary is Calculated here");
    }
    
    public void displayInfo(){
        System.out.println("Name is : "+ name);
        System.out.println("empId is : "+ empID);
        System.out.println("age is : "+ age);
    }
}
