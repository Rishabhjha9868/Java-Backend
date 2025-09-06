public class Employee {
    // Attributes: name, id, basic_salary
    private String name;
    private int id;
    private long basic_salary;

    //  Constructor
    Employee(String name, int id, long basic_salary){
        this.name = name;
        this.id = id;
        this.basic_salary = basic_salary;
    }

    //Method: calculate_gross_salary() (HRA = 20%, DA = 50% of basic)
    public void calculate_gross_salary(){
        System.out.println("The HRA of the Salary is " + basic_salary/5 + " and The DA is " + basic_salary/2);
    }
}
