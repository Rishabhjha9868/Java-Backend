 public class Mobile {
    String brand;
    String name;
    int price;

    //  Mobile(String brand, String name, int price){
    //     this.brand = brand;
    //     this.name = name;
    //     this.price = price;
    //  }
    Static{
        String name = "Mobile";
    }

    public void print(){
        System.out.println("Brand name is " + brand + " Type is " + name + " Price is " + price + "$");
    }

    public static void mob (Mobile obj3){
        System.out.println( "Brand name is " + obj3.brand + " Type is " +obj3.name + " Price is "  + "$");
    }
}
