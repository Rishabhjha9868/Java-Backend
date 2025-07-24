// Demo.java
public class Demo {
    public static void main(String[] args) {

        // Object 1
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.name = "Smart Phone";
        obj1.price = 1500;

        // Object 2
        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.name = "Smart Phone";
        obj2.price = 1600;

        obj1.print();
        obj2.print();
        // Mobile obj3 = new Mobile();
        Mobile.mob(obj1);
    }
}
