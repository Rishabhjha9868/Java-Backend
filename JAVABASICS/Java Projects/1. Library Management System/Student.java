public class Student extends Person {
    // attribute studentId, course
    private double studentId;
    private String course;

    // constructor
    public void Student(){

    }

    // getter and setter

     public void setStudentId(double studentId) {
        this.studentId = studentId;
    } 

    public void setCourse(String course) {
        this.course = course;
    }
    public double getStudentId() {
        return studentId;
    }
   
    public String getCourse() {
        return course;
    }
    
    // methods
    public void displayInfo(){
        super.displayInfo();
        System.out.println("StudentId " + studentId);
        System.out.println("Course " + course);
    }
}