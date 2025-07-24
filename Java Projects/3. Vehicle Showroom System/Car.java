public class Car extends Vehicle {

    // attributes
    private double seatCount;

    // constructor
    Car(){

    }

    // parametrized constructor
    Car(double seatCount){
        this.seatCount = seatCount;
    }

    // methods
    public void displayInfo(){
        super.displayInfo();
        System.out.println("SeatCount is : " + seatCount);
    } 
    
}
