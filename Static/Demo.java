 class Mobile {
    String brand;
    String name;
     static int price;

    public void print(){
        System.out.println("Brand name is " + brand + " Type is " + name + " Price is " + price + "$");
    }

    public static void mob (Mobile mob2){
        System.out.println( "Brand name is " + mob2.brand + " Type is " + mob2.name + " Price is " + price + "$");
    }
}

public class Demo {
    public static void main(String[] args) {

        // Object 1
        Mobile mob = new Mobile();
        
        mob.brand = "Apple";
        mob.name = "Smart Phone";
         mob.price = 1500;

        // Object 2
        Mobile mob2 = new Mobile();
            mob2.brand = "Samsung";
            mob2.name = "Smart Phone";
            mob2.price = 1600;

        mob.print();
        mob2.print();
       Mobile.mob(mob2);

    }
}


