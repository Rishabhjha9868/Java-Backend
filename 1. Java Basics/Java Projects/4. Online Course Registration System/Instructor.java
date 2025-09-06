public class Instructor extends Structure {

    // attributes
    private String expertise;

    // construtor 
    Instructor(){
        System.out.println("This is constructor");
    }

    // parametrized constructor
    Instructor(String expertise){
        this.expertise = expertise;
    }

    // methods 
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Expertise is " + expertise);
    }
    
}
