public class Bike extends Vehicle {

    // attributes
    private boolean sportMode;

    // constructor
    Bike(){

    }

    // parametrized constructor
    Bike(boolean sportMode){
        this.sportMode = sportMode;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("SportMode :" + sportMode);
    }
    
}
