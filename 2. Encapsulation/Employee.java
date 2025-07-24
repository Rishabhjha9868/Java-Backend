public class Employee {
    // attributes 
    private int empId;
    private String empname;
    private double salary;
    
    public void setempname(String empname){
        this.empname =empname;
    }
     public void setempId(int empId){
        this.empId =empId;
    }
    public void setsalary(double salary){
        this.salary =salary;
    }
    public int getempId(){
        return empId;
    }
     public String empname(){
        return empname;
    }
     public double getsalary(){
        return salary;
    }
}
