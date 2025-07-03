public class Employee {
    private long empId;
    private String name;
    private double salary;
     
    public void setempId(long empId){
        this.empId = empId;
    }
    public void setname(String name){
        this.name = name;
    }
    public void setsalary(double salary){
        this.salary = salary;
    }
    public long getempId(){
        return empId;
    }
    public String getname(){
        return name;
    }
    public double getsalary(){
        return salary;
    }    
}
