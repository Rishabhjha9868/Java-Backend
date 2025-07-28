public class Truck extends Vehicle {
    
    // attributes loadCapacity
    private  double loadCapacity;

    // constructor
    Truck(){

    }

    // parametrized constructor
    Truck(double loadCapacity){
        this.loadCapacity = loadCapacity;
    }

    // methods
    public void displayInfo(){
        super.displayInfo();
        System.out.println("loadCapacity :" + loadCapacity);
    }
}
