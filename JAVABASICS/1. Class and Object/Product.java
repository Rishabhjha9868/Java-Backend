public class Product {
    // attribute
    private long productId;
    private String name;
    private long quantity;
    private double price;

    // constructor
    Product(long productId, String name, long quantity, double price){
        this.productId = productId;
        this.name = name;
        this.quantity = quantity;
        this.price =price;
    }

    // Methods
    public double bill(){
        return quantity * price;
    }

}
