public class Student extends Structure {

    // attributes
    private double studentId;

    // constructor
    Student(){
        System.out.println("This is Student");
    }
    
    // parametrized constructor
    Student(double studentId){
        this.studentId = studentId;
    }

    // Methods

    public void displayInfo(){
        super.displayInfo();
        System.out.println("StudentId is " + studentId);
    }
}
