public class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(double length,double width) {
        area(length,width);
    }

    // methods
    public void area(double length,double breadth){
        System.out.println(length*breadth);
    }


    
}
