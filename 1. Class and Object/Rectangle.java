public class Rectangle {
    // Attritubes
    private double length;
    private double width;

    // constructor
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    // method
    public double area(){
        return length * width;
    }
    public double perimeter(){
        return 2* (length + width);
    }

}
