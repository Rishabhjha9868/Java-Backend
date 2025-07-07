public class Vehicle {

    // attributes model, brand, price
    private String model;
    private String brand;
    private double price;

    // constructor
    Vehicle(){

    }

    // parametrized constructor
    Vehicle(String model, String brand, double price){
        this.model = model;
        this.brand = brand;
        this.price = price;
    }

    // methods
    public void displayInfo() {
        System.out.println("Model : " + model);
        System.out.println("Brand : " + brand);
        System.out.println("Price : " + price);
    }
    
}
