public class Course {

    // attributes
    private String name;
    private double code;
    private double duration;

    // constructor 
    Course(){
        System.out.println("This is COurse");
    }

    // parametrized constructor
    Course(String name, double code, double duration){
        this.name = name;
        this.duration = duration;
        this.code = code;
    }

    // methods 
    public void displayInfo(){
        System.out.println("Name is : " + name);
        System.out.println("duration is "+ duration);
        System.out.println("Code is " + code);
    }
    
}
