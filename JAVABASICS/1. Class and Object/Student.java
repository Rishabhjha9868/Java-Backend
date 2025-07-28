public class Student {
// Attributes: roll_number, name, marks (list of 5 subjects)
    private int roll_number;
    private String name;
    private double marks;

    // constructor 
    Student(int roll_number, String name, double marks){
        this.roll_number = roll_number;
        this.name = name;
        this.marks = marks;
    }

    // Method:get_grade()
    //   Grade Logic: A: >80, B: 60–80, C: 40–59, F: <40
    public void get_grade(){
        if(marks>80) {
            System.out.println( "Student Whose name is " + name + " and his roll no is " + roll_number +" his Grade is A");
        }
        else if (marks <= 80 && marks >= 60) {
            System.out.println("Your Grade is B");            
        }
        else if(marks <=59 && marks >= 40) {
            System.out.println("Your Grade is C");
        }
        else{
            System.out.println("Your Grade is F");
        }
    }
}
